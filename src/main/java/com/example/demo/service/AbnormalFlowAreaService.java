package com.example.demo.service;

import com.example.demo.entity.Accident;
import com.example.demo.entity.Area;
import com.example.demo.entity.KeyArea;
import com.example.demo.storage.MysqlStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AbnormalFlowAreaService {

    @Autowired
    MysqlStorage mysqlStorage;

    public List<Area> total()  {
        List<Area> areaList = new ArrayList<>();
        List<Map<String,Object>> res = null;

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

                    //从数据库中查询出某个行政区的异常重点区域数
                    String keyAreaCon = " where areaid = '"+areaNo+"' and congestion_index >= 3";
                    int keyAreaNum = mysqlStorage.count("focusarea",keyAreaCon);
                    System.out.println(areaName+" | "+keyAreaNum);
                    area.setKeyAreaNum(keyAreaNum);
                    areaList.add(area);
                }

            }
        }


        return areaList;
    }

    public List<KeyArea> keyAreaList(String areaNo){
        List<KeyArea> keyAreaList = new ArrayList<>();
        String keyAreaCon = " where areaid = '"+areaNo+"' and congestion_index >= 3";
        List<Map<String,Object>> res = null;

        res = mysqlStorage.select("focusarea",keyAreaCon);
        if(res != null){
            for(int i = 0;i < res.size();i++){
                KeyArea keyArea = new KeyArea();
                if(res.get(i).get("key_areaname") != null){
                    keyArea.setKeyAreaName(res.get(i).get("key_areaname").toString());
                }else {
                    keyArea.setKeyAreaName("0000000");
                }
                if(res.get(i).get("key_areatype") != null){
                    if(res.get(i).get("key_areatype").toString().equals("1")){
                        keyArea.setKeyAreaType("商圈");
                    }
                    if(res.get(i).get("key_areatype").toString().equals("2")){
                        keyArea.setKeyAreaType("医院");
                    }
                    if(res.get(i).get("key_areatype").toString().equals("3")){
                        keyArea.setKeyAreaType("学校");
                    }
                    if(res.get(i).get("key_areatype").toString().equals("4")){
                        keyArea.setKeyAreaType("景区");
                    }
                    if(res.get(i).get("key_areatype").toString().equals("5")){
                        keyArea.setKeyAreaType("办公区");
                    }

                }else {
                    keyArea.setKeyAreaType("0000000");
                }
                if(res.get(i).get("key_areaaddress") != null){
                    keyArea.setKeyAreaAdress(res.get(i).get("key_areaaddress").toString());
                }else {
                    keyArea.setKeyAreaAdress("0000000");
                }
                if(res.get(i).get("flow_rate") != null){
                    keyArea.setFlowRate(res.get(i).get("flow_rate").toString());
                }else {
                    keyArea.setFlowRate("0");
                }
                if(res.get(i).get("car_flow_rate") != null){
                    keyArea.setVehicleRate(res.get(i).get("car_flow_rate").toString());
                }else {
                    keyArea.setVehicleRate("0");
                }
                if(res.get(i).get("ava_parklot") != null){
                    keyArea.setAvaParklot(res.get(i).get("ava_parklot").toString());
                }else {
                    keyArea.setAvaParklot("0");
                }
                if(res.get(i).get("congestion_index") != null){
                    keyArea.setCongestion_index(res.get(i).get("congestion_index").toString());
                }else {
                    keyArea.setCongestion_index("0");
                }
                System.out.println(keyArea.getKeyAreaName()+"|"+keyArea.getKeyAreaType()+"|"+keyArea.getKeyAreaAdress());
                keyAreaList.add(keyArea);
            }
        }

        return keyAreaList;
    }

    public boolean updateDirectSchema(String keyAreaId,String trafficConSchema){
        Map<String,String> row = new HashMap<>();
        row.put("traffic_control",trafficConSchema);
        Map<String,String> location = new HashMap<>();
        location.put("key_areaid",keyAreaId);
        try {
            if(!mysqlStorage.update(row,"focusarea",location)){
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
