package com.example.demo.storage;
//import com.meituan.ai.crawler.config.MysqlConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.*;

@Controller
public class MysqlStorage {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    Logger logger = LoggerFactory.getLogger(MysqlStorage.class);

    public boolean insert(List<Map<String,String>> data,String tableName) throws SQLException {
        if(!data.isEmpty()){
            for(int i = 0;i < data.size();i++){
                insert(data.get(i),tableName);
            }
            return  true;
        }else{
            return false;
        }
    }


    public boolean insert(Map<String,String> row,String tableName)throws SQLException{
        //爬取数据一条一条的存入mysql数据库

        if(!row.isEmpty()) {

            Set set = row.entrySet();
            Iterator it = set.iterator();

            List<String> key_list = new ArrayList<String>(); //key表示：字段
            List<String> value_list = new ArrayList<>();    //value表示：字段值
           // System.out.println(row);
            //将爬取到所有字段值返回给value_list列表中
            while (it.hasNext()){
                Map.Entry mapentry = (Map.Entry) it.next();
                key_list.add(mapentry.getKey().toString());
               // System.out.println(mapentry.getKey().toString()+":"+mapentry.getValue().toString());
                if(mapentry.getValue() != null) {
                    value_list.add(mapentry.getValue().toString());
                }
            }


            //拼接sql语句
            String sql = "insert into " + tableName + "(";
            int i;
            for (i = 0; i < key_list.size() - 1; i++) {
                sql = sql + key_list.get(i) + ",";
            }
            sql = sql + key_list.get(i) + ") value('";

            for (i = 0; i < value_list.size() - 1; i++) {
                sql = sql + value_list.get(i) + "','";
            }
            sql = sql + value_list.get(i) + "')";
            //System.out.println(sql);
            //执行sql语句
            if(!sql.isEmpty()){
                if(jdbcTemplate.update(sql) == 0){
                    return false;
                }
            }


            key_list.clear();
            value_list.clear();
            return true;
        }else{
            return false;
        }
    }

    public int count(String tableName,Map<String,String> condition){
        String sql = "select * from "+tableName+" where ";
        Iterator<String> key_locate = condition.keySet().iterator();
        while(key_locate.hasNext()){                                           //获取where条件字段名对应的字段值
            String key = key_locate.next();
            String value = condition.get(key);
            if(key_locate.hasNext()){
                sql = sql  + key + " = '" + value +"' and ";
            }else{
                sql = sql  + key + " = '" + value +"'";
            }

        }

        List<Map<String,Object>> rs = jdbcTemplate.queryForList(sql);
        int count = rs.size();
        return count;
    }

    public int count(String tableName,String condition){
        String sql = "select * from "+tableName+condition;
        List<Map<String,Object>> rs = jdbcTemplate.queryForList(sql);
        int count = rs.size();
        return count;
    }

    public List<Map<String,Object>> select(String tableName)throws SQLException{
        //查询某张表的爬取数据结果集
        String sql = "select * from "+tableName;
        logger.info("sql: "+sql);
        List<Map<String,Object>> rs = jdbcTemplate.queryForList(sql);
        logger.info("select sql's result's length: "+String.valueOf(rs.size()));
        return rs;
    }

    public List<Map<String,Object>> select(String tableName,Map<String,String> condition)throws SQLException{
        //查询某张表的爬取数据结果集
        String sql = "select * from "+tableName +" where ";
        Iterator<String> key_locate = condition.keySet().iterator();
        while(key_locate.hasNext()){                                           //获取where条件字段名对应的字段值
            String key = key_locate.next();
            String value = condition.get(key);
            if(key_locate.hasNext()){
                sql = sql  + key + " = '" + value +"' and ";
            }else{
                sql = sql  + key + " = '" + value +"'";
            }
        }
        List<Map<String,Object>> rs = jdbcTemplate.queryForList(sql);
        return rs;
    }

    public List<Map<String,Object>> select(String tableName,Map<String,String> condition,String order)throws SQLException{
        //查询某张表的爬取数据结果集
        String sql = "select * from "+tableName +" where ";
        Iterator<String> key_locate = condition.keySet().iterator();
        while(key_locate.hasNext()){                                           //获取where条件字段名对应的字段值
            String key = key_locate.next();
            String value = condition.get(key);
            sql = sql  + key + " = '" + value+"'";
        }
        sql = sql + " order by "+order+" asc ";
        List<Map<String,Object>> rs = jdbcTemplate.queryForList(sql);
        return rs;
    }

    public List<Map<String,Object>> select(String tableName,List<String> row,Map<String,String> condition){
        String sql = "select ";
        int i;
        for(i = 0;i < row.size()-1;i++){
            sql = sql + row.get(i)+",";
        }
        sql = sql + row.get(i) + " from "+tableName;
        Iterator<String> key_locate = condition.keySet().iterator();
        while(key_locate.hasNext()){                                           //获取where条件字段名对应的字段值
            String key = key_locate.next();
            String value = condition.get(key);
            sql = sql + " where " + key + " = '" + value+"'";
        }
        List<Map<String,Object>> rs = jdbcTemplate.queryForList(sql);
        return rs;
    }
    public List<Map<String,Object>> select(String tableName,List<String> row,Map<String,String> condition,String order){
        String sql = "select ";
        int i;
        for(i = 0;i < row.size()-1;i++){
            sql = sql + row.get(i)+",";
        }
        sql = sql + row.get(i) + " from "+tableName;
        Iterator<String> key_locate = condition.keySet().iterator();
        while(key_locate.hasNext()){                                           //获取where条件字段名对应的字段值
            String key = key_locate.next();
            String value = condition.get(key);
            sql = sql + " where " + key + " = '" + value+"'";
        }
        sql = sql + "order by "+order +" asc";
        List<Map<String,Object>> rs = jdbcTemplate.queryForList(sql);
        return rs;
    }

    public List<Map<String,Object>> select(String tableName,List<String> row){
        String sql = "select ";
        int i;
        for(i = 0;i < row.size()-1;i++){
            sql = sql + row.get(i)+",";
        }
        sql = sql + row.get(i) + " from "+tableName;

        System.out.println(sql);

        List<Map<String,Object>> rs = jdbcTemplate.queryForList(sql);
        return rs;
    }
    public List<Map<String,Object>> select(String tableName,List<String> row,String condition){
        String sql = "select ";
        int i;
        for(i = 0;i < row.size()-1;i++){
            sql = sql + row.get(i)+",";
        }
        sql = sql + row.get(i) + " from "+tableName;
        sql = sql + condition;
        List<Map<String,Object>> rs = jdbcTemplate.queryForList(sql);
        return rs;
    }


    public List<Map<String,Object>> select(String tableName,String condition){
        String sql = "select * from "+tableName;
        sql = sql + condition;
        System.out.println(sql);
        List<Map<String,Object>> rs = jdbcTemplate.queryForList(sql);
        return rs;
    }

    public List<Map<String,Object>> select(String sql,boolean isDis){

        List<Map<String,Object>> rs = jdbcTemplate.queryForList(sql);
        return rs;
    }

    public boolean update(Map<String,String> row,String tableName,Map<String,String> location) throws SQLException{
        //爬取的数据更新到mysql数据库中
        System.out.println(row+":"+location);
        if((!row.isEmpty()) && (!location.isEmpty())) {

            Set set = row.entrySet();
            Iterator it = set.iterator();

            List<String> key_list = new ArrayList<String>();      //key表示：字段
            List<String> value_list = new ArrayList<>();     //value表示：字段值


            while (it.hasNext()) {
                Map.Entry mapentry = (Map.Entry) it.next();
                key_list.add(mapentry.getKey().toString());        //取出需要更新的字段名，放入key_list列表
                value_list.add(mapentry.getValue().toString());    //取出需要更新的字段值，放入value_list列表
            }

            //拼接sql语句
            String sql = "update " + tableName + " set ";
            int i;
            String ptr;
            for (i = 0; i < key_list.size() - 1; i++) {
                ptr = key_list.get(i) + " = '" + value_list.get(i) + "',";
                sql = sql + ptr;
            }
            ptr = key_list.get(i) + " = '" + value_list.get(i)+"'";
            sql = sql + ptr;
            sql = sql + " where ";




            Iterator<String> key_locate = location.keySet().iterator();//获取where条件的字段名

            while(key_locate.hasNext()){                                           //获取where条件字段名对应的字段值
                String key = key_locate.next();
                String value = location.get(key);
                sql = sql + key + " = '" + value+"'";
            }



            //执行sql语句
            //System.out.println(sql);

            if(jdbcTemplate.update(sql) == 0){
                return false;
            }
            key_list.clear();
            value_list.clear();

            return true;
        }else{
            return false;
        }
    }

    public boolean update(Map<String,String> row,String tableName,String location) throws SQLException{
        //爬取的数据更新到mysql数据库中
        System.out.println(row+":"+location);
        if((!row.isEmpty()) && (!location.isEmpty())) {

            Set set = row.entrySet();
            Iterator it = set.iterator();

            List<String> key_list = new ArrayList<String>();      //key表示：字段
            List<String> value_list = new ArrayList<>();     //value表示：字段值


            while (it.hasNext()) {
                Map.Entry mapentry = (Map.Entry) it.next();
                key_list.add(mapentry.getKey().toString());        //取出需要更新的字段名，放入key_list列表
                value_list.add(mapentry.getValue().toString());    //取出需要更新的字段值，放入value_list列表
            }

            //拼接sql语句
            String sql = "update " + tableName + " set ";
            int i;
            String ptr;
            for (i = 0; i < key_list.size() - 1; i++) {
                ptr = key_list.get(i) + " = '" + value_list.get(i) + "',";
                sql = sql + ptr;
            }
            ptr = key_list.get(i) + " = '" + value_list.get(i)+"'";
            sql = sql + ptr;
            sql = sql + location;

            //执行sql语句
            System.out.println(sql);

            if(jdbcTemplate.update(sql) == 0){
                return false;
            }
            key_list.clear();
            value_list.clear();

            return true;
        }else{
            return false;
        }
    }


    public String delete(String tableName)throws SQLException{
        String sql = "delete from "+tableName;
        jdbcTemplate.update(sql);
        return "删除数据成功！";
    }

    public boolean delete(String tableName,Map<String,String> condition)throws SQLException{
        String sql = "delete from "+tableName +" where ";
        Iterator<String> key_locate = condition.keySet().iterator();
        int num = 0;
        while(key_locate.hasNext()){                                           //获取where条件字段名对应的字段值
            String key = key_locate.next();
            String value = condition.get(key);
            if(num > 0 && num <= (condition.size()-1)){
                sql = sql + " and ";
            }
            sql = sql + key + " = '" + value+"'";
            num++;
        }
        if(jdbcTemplate.update(sql) > 0){
            return true;
        }else {
            return false;
        }
    }
}
