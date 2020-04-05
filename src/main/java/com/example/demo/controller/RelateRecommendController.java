package com.example.demo.controller;

import com.example.demo.entity.Alert;
import com.example.demo.service.RelateRecommendServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class RelateRecommendController {

    RelateRecommendServer relateRecommendServer;


    public List<Alert> getRelateRecommend(Alert alert){

        List<Alert> alertList = relateRecommendServer.getRelateRecommendAlert(alert);

        return alertList;
    }

}
