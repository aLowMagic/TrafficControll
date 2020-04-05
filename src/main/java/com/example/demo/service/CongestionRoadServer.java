package com.example.demo.service;

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
public class CongestionRoadServer {
    public List<Road> getCongestedRoad(){
        List<Road> roadList = new ArrayList<>();

        String roadName = "";

        String queryString1 = "PREFIX db: <file:///D:/d2rq-0.8.1/qdhx_congestion_res.nt#> \n " +
                "SELECT ?r where { ?x rdf:type vio_coderoad." +
                "                     ?x :dlmc ?r." +
                "                      ";
        ResultSet roadRes = queryRDF(queryString1);
        while(roadRes.hasNext()){
            QuerySolution querySolution = roadRes.next();
            roadName = querySolution.getLiteral("r").toString();
            Road road = new Road();
            road.setRoadName(roadName);
            String queryString2 = "PREFIX db: <file:///D:/d2rq-0.8.1/qdhx_congestion_res.nt#> \n " +
                    "SELECT * where { ?x rdf:type police_case." +
                    "                     ?x :roadName '"+roadName+"'." +
                    "                     ?x :caseCategory ?t." +
                    "                     FILTER (?t = '01')}";
            ResultSet roadCongestionRes = queryRDF(queryString2);
            road.setCongestionNum(roadCongestionRes.getRowNumber());
            roadList.add(road);
        }

        roadList.sort(new Comparator<Road>() {
            @Override
            public int compare(Road o1, Road o2) {
                if(o1.getCongestionNum() == 0||o2.getCongestionNum() == 0)  return 0;
                if(o1.getCongestionNum() > o2.getCongestionNum()){
                    return -1;
                }else{
                    return  1;
                }
            }
        });
        return roadList;
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
