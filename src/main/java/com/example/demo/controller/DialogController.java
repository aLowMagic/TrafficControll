package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DialogController {

    @RequestMapping("dialogInit")
    public String dialogueInit(){return "dialogInit";}
}
