package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class traffic_accident {

    @RequestMapping("Illegal")
    public String Illegal(){
        return "Illegal";
    }


    @RequestMapping("Police_case")
    public String Police_case(){
        return "Police_case";
    }

    @RequestMapping("avaParkLot")
    public String avaParkLot(){
        return "avaParkLot";
    }

    @RequestMapping("Traffic_Accident")
    public String Traffic_Accident(){
        return "Traffic_Accident";
    }





}
