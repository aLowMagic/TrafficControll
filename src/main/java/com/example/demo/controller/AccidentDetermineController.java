package com.example.demo.controller;

import com.example.demo.entity.Accident;
import com.example.demo.entity.Alert;
import com.example.demo.entity.Area;
import com.example.demo.service.AccidentDetermineService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AccidentDetermineController {

    @Autowired
    AccidentDetermineService accidentDetermineService;

    RelateRecommendController relateRecommendController;

    @RequestMapping("/situation_index")
    public String situationIndex(){               //青岛时空路况态势研判分析-首页
        return "situation_index";
    }

    @GetMapping("/getAccidentNum")
    @ResponseBody
    public String index(){
        List<Area> res = null;
        try {
            res = accidentDetermineService.total();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res.toString();              //调用index返回各个区事故、违法数
    }

    @GetMapping("/Accident_illegal")
    @ResponseBody
    public ModelAndView accidentIllegajl(HttpServletRequest request){                  //事故信息列表
        //HttpServletRequest request
        String areaId = request.getParameter("areaId");
        //String areaId = "370200";
        List<Accident> res = accidentDetermineService.accidentList(areaId);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Accident_illegal");
        mav.addObject("accidentList",res);
        return mav;
    }

    @GetMapping("/videoAtt")
    @ResponseBody
    public ModelAndView playVideo(HttpServletRequest request){
        String videoUrl = "../static/assets/video/video/3广州路费县路路口.mp4";
//        String videoUrl = request.getParameter("videoUrl");
//        String alertId = request.getParameter("alertId");
//        String areaId = request.getParameter("areaId");
//        String caseCategory = request.getParameter("category");
//        String occurTime = request.getParameter("occurTime");


      /*  Alert alert = new Alert();
        alert.setAlertId(alertId);
        alert.setAreaId(areaId);
        alert.setCaseCategory(caseCategory);
        alert.setOccurTime(occurTime);
        alert.setVideoUrl(videoUrl);*/

        //List<Alert> alertList = relateRecommendController.getRelateRecommend(alert);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("card_att1");
        mav.addObject("videoUrl",videoUrl);
        //mav.addObject("alertList",alertList);
        return mav;
    }

    @GetMapping("/updateDetermine")
    @ResponseBody
    public String updateDetermine(HttpServletRequest request){
        String accId = request.getParameter("accId");
        String accDetermineRes = request.getParameter("accDetermineRes");
        if(accidentDetermineService.updateDetermine(accId,accDetermineRes)){
            return "责任判定结果更新成功！";
        }else{
            return "责任判定结果更新失败！";
        }
    }
}
