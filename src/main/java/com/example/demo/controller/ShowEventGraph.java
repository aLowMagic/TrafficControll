package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowEventGraph {
    @RequestMapping("showEvent")
    public String hello(){
        return "police_case";
    }

    @RequestMapping("showVideo")
    public String showVideo(){
        return "card";
    }


}
