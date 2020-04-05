package com.example.demo.service;

import com.example.demo.entity.Illegal;
import com.example.demo.entity.IllegalVehicle;
import com.example.demo.storage.MysqlStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IllegalVehicleBehaviorService {
    @Autowired
    MysqlStorage mysqlStorage;

    public List<IllegalVehicle> illegalVehicleListTop(){
        List<IllegalVehicle> illegalVehicleList = new ArrayList<>();
        String sql = "select DISTINCT car_no,driver from majorcar_ill";
        List<Map<String,Object>> res = mysqlStorage.select(sql,true);
        if(res != null){
            for(int i = 0;i < res.size();i++){
                String carNo = res.get(i).get("car_no").toString();
                String driver = res.get(i).get("driver").toString();
                IllegalVehicle illegalVehicle = new IllegalVehicle();
                illegalVehicle.setCarNo(carNo);
                illegalVehicle.setDriver(driver);
                Map<String,String> illegalVehicleCon = new HashMap<>();
                illegalVehicleCon.put("ccarnumber",carNo);
                int illegalVehicleNum = mysqlStorage.count("illegal_data",illegalVehicleCon);
                if(illegalVehicleNum >= 5 &&illegalVehicleList.size() < 10){
                    System.out.println(carNo+" | "+driver+" | "+illegalVehicleNum);
                    illegalVehicle.setIllegalBehaviorNum(illegalVehicleNum);
                    illegalVehicleList.add(illegalVehicle);
                }
            }
        }

        return illegalVehicleList;
    }

    public List<IllegalVehicle> illegalVehicleList(){
        List<IllegalVehicle> illegalVehicleList = new ArrayList<>();
        String sql = "select DISTINCT car_no,driver from majorcar_ill";
        List<Map<String,Object>> res = mysqlStorage.select(sql,true);
        if(res != null){
            for(int i = 0;i < res.size();i++){
                String carNo = res.get(i).get("car_no").toString();
                String driver = res.get(i).get("driver").toString();
                IllegalVehicle illegalVehicle = new IllegalVehicle();
                illegalVehicle.setCarNo(carNo);
                illegalVehicle.setDriver(driver);
                Map<String,String> illegalVehicleCon = new HashMap<>();
                illegalVehicleCon.put("ccarnumber",carNo);
                int illegalVehicleNum = mysqlStorage.count("illegal_data",illegalVehicleCon);
                if(illegalVehicleNum >= 5){
                    System.out.println(carNo+" | "+driver+" | "+illegalVehicleNum);
                    illegalVehicle.setIllegalBehaviorNum(illegalVehicleNum);
                    illegalVehicleList.add(illegalVehicle);
                }
            }
        }

        return illegalVehicleList;
    }

    public List<Illegal> vehicleToIllegalList(String carNo){
        List<Illegal> illegalList = new ArrayList<>();
        String sql = "select ccarnumber,clicensetype,dillegaldate,coffense,cillegaladdress,nvehiclespeed from illegal_data where ccarnumber='"+carNo+"'";
        List<Map<String,Object>> res = mysqlStorage.select(sql,true);
        if(res != null){
            for(int i = 0;i < res.size();i++){
                Illegal illegal = new Illegal();
                if(res.get(i).get("ccarnumber") != null){
                    illegal.setCarNo(res.get(i).get("ccarnumber").toString());
                }else {
                    illegal.setCarNo("0000000");
                }

                if(res.get(i).get("clicensetype") != null){
                    illegal.setClicensetype(res.get(i).get("clicensetype").toString());
                }else {
                    illegal.setClicensetype("0000000");
                }
                if(res.get(i).get("dillegaldate") != null){
                    illegal.setIllegalTime(res.get(i).get("dillegaldate").toString());
                }else {
                    illegal.setIllegalTime("0000000");
                }

                if(res.get(i).get("coffense") != null){
                    illegal.setIllegalBehavior(res.get(i).get("coffense").toString());
                }else {
                    illegal.setIllegalBehavior("0000000");
                }

                if(res.get(i).get("cillegaladdress") != null){
                    illegal.setIllegalAddress(res.get(i).get("cillegaladdress").toString());
                }else {
                    illegal.setIllegalAddress("0000000");
                }

                if(res.get(i).get("nvehiclespeed") != null){
                    illegal.setSpeed(res.get(i).get("nvehiclespeed").toString());
                }else {
                    illegal.setSpeed("0000000");
                }
                illegalList.add(illegal);
            }
        }
        return illegalList;

    }


}
