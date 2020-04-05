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
public class IllegalVehicleDataAnalysisService {

    @Autowired
    MysqlStorage mysqlStorage;

    public IllegalVehicle dataAnalysis(List<Illegal> illegalList){
        IllegalVehicle illegalVehicle = new IllegalVehicle();
        Illegal illegal = illegalList.get(0);
        illegalVehicle.setCarNo(illegal.getCarNo());
        illegalVehicle.setCarType(illegal.getClicensetype());
        String carNo = illegal.getCarNo();
        String sql = "select driver,company from majorcar_ill where car_no='"+carNo+"'";
        List<Map<String,Object>> res = mysqlStorage.select(sql,true);
        illegalVehicle.setDriver(res.get(0).get("driver").toString());
        illegalVehicle.setCompany(res.get(0).get("company").toString());
        List<String> illegalRecord = new ArrayList<>();
        for(int i = 0;i < illegalList.size();i++){
            String illegal_behavior = illegalList.get(i).getIllegalBehavior();
            illegalRecord.add(illegal_behavior);
        }
        Map<String,Double> analysisRes = new HashMap<>();

        for(int i = 0;i < illegalRecord.size();i++){
            double total = illegalRecord.size();
            int count = 0;
            for(int j = 0;j < illegalRecord.size();j++){
                if(illegalRecord.get(i).equalsIgnoreCase(illegalRecord.get(j))){
                    count++;
                }
            }
            double dbcount = count;
            double dbres = dbcount/total;
            String illsql = "select illegal_behavior from illegal_behavior where nid ='"+illegalRecord.get(i)+"'";
            List<Map<String,Object>> illegalBahevior = mysqlStorage.select(illsql,true);
            analysisRes.put(illegalBahevior.get(0).get("illegal_behavior").toString(),dbres);
        }
        System.out.println(analysisRes.toString());
        illegalVehicle.setIllegalBehaviorType(analysisRes.toString());
        return illegalVehicle;
    }
}
