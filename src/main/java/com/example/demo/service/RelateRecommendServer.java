package com.example.demo.service;

import com.example.demo.entity.Alert;
import com.example.demo.entity.Road;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class RelateRecommendServer {
    public List<Alert> getRelateRecommendAlert(Alert alert) {
        List<Alert> alertList = new ArrayList<>();

        String areaId = alert.getAreaId();
        String caseCategory = alert.getCaseCategory();
        String queryString = "PREFIX db: <file:///D:/d2rq-0.8.1/qdhx_congestion_res.nt#> \n " +
                "SELECT ?t ?nl ?dt ?rd ?url ?ct where { ?x rdf:type police_case." +
                "                     ?x :areaId '" + areaId + "'." +
                "                     ?x :caseCategory ?t." +
                "                     ?x :nlevel ?nl" +
                "                     ?x :detail ?dt" +
                "                     ?x :roadName ?rd" +
                "                     ?x :videoUrl ?url" +
                "                     ?x :createTime ?ct" +
                "                     FILTER (?t = '"+caseCategory+"')}";
        ResultSet res = queryRDF(queryString);
        while(res.hasNext()){
            Alert resAlert = new Alert();
            QuerySolution querySolution = res.next();
            caseCategory = querySolution.getLiteral("t").toString();
            String nlevel = querySolution.getLiteral("nl").toString();
            String detail = querySolution.getLiteral("dt").toString();
            String roadName = querySolution.getLiteral("rd").toString();
            String videoUrl = querySolution.getLiteral("url").toString();
            String createTime = querySolution.getLiteral("ct").toString();
            resAlert.setAreaId(areaId);
            resAlert.setCaseCategory(caseCategory);
            resAlert.setLevel(nlevel);
            resAlert.setDetail(detail);
            resAlert.setRoadName(roadName);
            resAlert.setVideoUrl(videoUrl);
            resAlert.setOccurTime(createTime);
            alertList.add(resAlert);
        }
        alertList.sort(new Comparator<Alert>() {
            @Override
            public int compare(Alert o1, Alert o2) {
                if(o1.getOccurTime() == null||o2.getOccurTime() == null) return 0;
                int res = o1.getOccurTime().compareTo(o2.getOccurTime());
                if(res > 0){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        return alertList;
    }

    public ResultSet queryRDF(String queryString){
        Model model = loadModel("","N3");     //加载知识图谱数据模型
        //利用sparql从RDF文件中查询出相应的结果

        Query query = QueryFactory.create(queryString);
        QueryExecution qe = QueryExecutionFactory.create(query, model);
        ResultSet results = qe.execSelect();
        return results;
    }
    public Model loadModel(String fileName,String fileType){
        String inputFileName = fileName;
        Model model = ModelFactory.createDefaultModel();
        InputStream in = FileManager.get().open(inputFileName);
        if (in == null)
        {
            throw new IllegalArgumentException("File: " + inputFileName + " not found");
        }
        //model.read(in, "","RDF/XML");//根据文件格式选用参数即可解析不同类型
        model.read(in, "",fileType);
        // model.read(in, "","TTL");
        // model.read(in, "","N3");
        return model;
    }
}
