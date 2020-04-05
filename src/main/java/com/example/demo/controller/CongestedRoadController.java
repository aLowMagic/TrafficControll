package com.example.demo.controller;

import com.example.demo.entity.Alert;
import com.example.demo.entity.IllegalVehicle;
import com.example.demo.entity.Road;
import com.example.demo.service.CongestionRoadServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class CongestedRoadController {
    @Autowired
    CongestionRoadServer congestionRoadServer;



    @GetMapping("Accident")
    @ResponseBody
    public ModelAndView Accident(){     //

        //List<Road> roadList = congestionRoadServer.getCongestedRoad();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Traffic _Accident");
        //mav.addObject("roadList",roadList);
        return mav;
    }


}
