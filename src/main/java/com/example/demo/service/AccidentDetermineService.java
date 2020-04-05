package com.example.demo.service;


import com.example.demo.entity.Accident;
import com.example.demo.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.demo.storage.MysqlStorage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Service
public class AccidentDetermineService {
    @Autowired
    MysqlStorage mysqlStorage;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Area> total()  {
        List<Area> areaList = new ArrayList<>();
        List<Map<String,Object>> res = null;
        System.out.println(jdbcTemplate);
        try {
            res = mysqlStorage.select("area");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(res != null){

            for(int i = 0;i < res.size();i++){
                Map<String,Object> obj2v = res.get(i);
                if(obj2v != null){
                    String areaNo  = obj2v.get("area_id").toString();  //获取到区域的名称
                    String areaName = obj2v.get("area_name").toString();
                    Area area = new Area();
                    area.setAreaNo(areaNo);

                    //从数据库中查询出某个行政区的事故数、违法数
                    Map<String,String> accidentCon = new HashMap<>();
                    accidentCon.put("case_category" ,"03");
                    accidentCon.put("area_id",areaNo);
                    int accidentNum = mysqlStorage.count("police_case",accidentCon);

                    Map<String,String> illegalCon = new HashMap<>();
                    illegalCon.put("case_category","02");
                    illegalCon.put("area_id",areaNo);
                    int illegalNum = mysqlStorage.count("police_case",illegalCon);
                    System.out.println(areaName+"|"+accidentNum+"|"+illegalNum);
                    area.setAccidentNum(accidentNum);
                    area.setIllegalNum(illegalNum);
                    areaList.add(area);
                }

            }
        }


        return areaList;
    }

    public List<Accident> accidentList(String areaNo){
        List<Accident> accidentList = new ArrayList<>();
        Map<String,String> accidentCon = new HashMap<>();
        accidentCon.put("case_category" ,"03");
        accidentCon.put("area_id",areaNo);
        List<Map<String,Object>> res = null;
        try {
            res = mysqlStorage.select("police_case",accidentCon);
            if(res != null){
                for(int i = 0;i < res.size();i++){
                    Accident accident = new Accident();
                    if(res.get(i).get("carnumber") != null){
                        accident.setVehicleNo(res.get(i).get("carnumber").toString());
                    }else {
                        accident.setVehicleNo("00000");
                    }
                    if(res.get(i).get("case_id") != null){
                        accident.setAccId(res.get(i).get("case_id").toString());
                    }else{
                        accident.setAccId("00000");
                    }
                    if(res.get(i).get("road_name") != null){
                        accident.setOccurRoad(res.get(i).get("road_name").toString());
                    }else{
                        accident.setOccurRoad("00000");
                    }
                    if(res.get(i).get("source") != null){
                        accident.setSource(res.get(i).get("source").toString());
                    }else{
                        accident.setSource("00000");
                    }
                    if(res.get(i).get("detail") != null){
                        accident.setAccReason(res.get(i).get("detail").toString());
                    }else{
                        accident.setAccReason("000000");
                    }
                    if(res.get(i).get("concrete_type") != null){
                        accident.setAccType(res.get(i).get("concrete_type").toString());
                    }else{
                        accident.setAccType("000000");
                    }
                    if(res.get(i).get("video_url") != null){
                        accident.setVideoUrl(res.get(i).get("video_url").toString());
                    }else{
                        accident.setVideoUrl("00000");
                    }
                    if(res.get(i).get("create_time") != null){
                        accident.setAccTime(res.get(i).get("create_time").toString());
                    }else{
                        accident.setAccTime("00000");
                    }
                    System.out.println(accident.getVehicleNo()+"|"+accident.getOccurRoad()+"|"+accident.getSource()+"|"+accident.getAccReason());
                    if(accidentList.size() < 10){
                        accidentList.add(accident);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accidentList;
    }

    public boolean updateDetermine(String accId,String accDetermineRes){
        Map<String,String> row = new HashMap<>();
        row.put("res_determine",accDetermineRes);
        Map<String,String> location = new HashMap<>();
        location.put("case_id",accId);
        try {
            if(!mysqlStorage.update(row,"police_case",location)){
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
