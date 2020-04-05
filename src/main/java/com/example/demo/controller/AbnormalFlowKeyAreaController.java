package com.example.demo.controller;

import com.example.demo.entity.Accident;
import com.example.demo.entity.Area;
import com.example.demo.entity.KeyArea;
import com.example.demo.service.AbnormalFlowAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AbnormalFlowKeyAreaController {
    @Autowired
    AbnormalFlowAreaService abnormalFlowAreaService;

    @GetMapping("/getkeyAreaCount")
    @ResponseBody
    public String index(){
        List<Area> res =  abnormalFlowAreaService.total();
        return res.toString();
    }

    @GetMapping("/keyArea")
    @ResponseBody
    public ModelAndView keyArea(HttpServletRequest request){                  //流量检测异常的重点区域列表
        //HttpServletRequest request
        //String areaId = request.getParameter("areaId");
        String areaId = "370200";
        List<KeyArea> res = abnormalFlowAreaService.keyAreaList(areaId);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("keyArea");
        mav.addObject("keyAreaList",res);
        return mav;
    }
    @GetMapping("/updateSchema")
    @ResponseBody
    public String updateSchema(HttpServletRequest request){
        //HttpServletRequest request
        String keyAreaId = request.getParameter("keyAreaId");
        String trafficConSchema = request.getParameter("trafficConSchema");
       // String keyAreaId = "1";
       // String trafficConSchema = "hhhhhhhhhhh";
        if(abnormalFlowAreaService.updateDirectSchema(keyAreaId,trafficConSchema)){
            return "交通指挥疏导方案更新成功！";
        }else{
            return "交通指挥疏导方案更新失败！";
        }
    }


}

