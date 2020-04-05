package com.example.demo.controller;

import com.example.demo.entity.Illegal;
import com.example.demo.entity.IllegalVehicle;
import com.example.demo.service.IllegalVehicleBehaviorService;
import com.example.demo.service.IllegalVehicleDataAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IllegalVehicleBehaviorController {
    @Autowired
    IllegalVehicleBehaviorService illegalVehicleBehaviorService;
    @Autowired
    IllegalVehicleDataAnalysisService illegalVehicleDataAnalysisService;

    @GetMapping("personAnalytics")
    @ResponseBody
    public ModelAndView index(){     //

        List<IllegalVehicle> res = illegalVehicleBehaviorService.illegalVehicleListTop();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("person-analytics");
        mav.addObject("top_res_list",res);
        return mav;
    }


    @GetMapping("illegalVehicle")
    @ResponseBody
    public ModelAndView illegalVehicle(){     //违法车辆分析

        List<IllegalVehicle> res = illegalVehicleBehaviorService.illegalVehicleList();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("illegal_vehicle");
        mav.addObject("reslist",res);
        return mav;
    }

    @GetMapping("illegalVehicleAnalysis")
    @ResponseBody
    public ModelAndView illegalVehicleAnalysis(HttpServletRequest request){     //违法车辆分析
       // String carNo = request.getParameter("carNo");
        String carNo = "鲁BL3158";
        List<Illegal> illegalList = illegalVehicleBehaviorService.vehicleToIllegalList(carNo);  //获取到违法车辆的所有违法记录
        //对违法车辆的所有违法记录进行分析
        IllegalVehicle illegalVehicle = illegalVehicleDataAnalysisService.dataAnalysis(illegalList);

        List<IllegalVehicle> res = illegalVehicleBehaviorService.illegalVehicleList();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("illegal_vehicle");
        mav.addObject("reslist",res);
        mav.addObject("illegal_Vehicle",illegalVehicle);
        return mav;
    }
}
