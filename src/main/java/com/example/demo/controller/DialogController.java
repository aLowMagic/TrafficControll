package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.mapper.RobotMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.po.Robot;
import com.example.demo.po.User;
import com.example.demo.service.chatService.RobotService;
import com.example.demo.service.chatService.iService.RobotServiceImpl;
import com.example.demo.util.JsonUtil;
import com.example.demo.vo.robot_Chat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class DialogController {
    private Logger logger = LoggerFactory.getLogger(DialogController.class);
    @Autowired
    private RobotService robotService;


    @RequestMapping("robot")
    public String dialogueInit(){return "robot";}
    @RequestMapping("dialogInit")
    public String chatInit(){return "dialogInit";}

    @ResponseBody
    @RequestMapping(value={"/chatWithRobot"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
    public String ChatWithRobot(HttpServletRequest request, HttpSession session) throws Exception{
        String path = request.getServletPath();

        //记录前台用户提问
        String comment = request.getParameter("comment");
        String from = request.getParameter("from");
        String username = (String) session.getAttribute("UserName");
        String questionId = UUID.randomUUID().toString();
        logger.info("=============comment: "+comment);
//        //zzl_记录用户提问记录_2017年10月22日11:23:00
//        userQuestionService.addUserQuestion(questionId,username,comment,from);

        JSONObject jsonObject = new JSONObject();

        //获取问题的答案
        List<robot_Chat> robot_Chats = robotService.getRobotAnswer(comment);
        logger.info("=============answer: "+robot_Chats.toString());
        String answerId;
        if (robot_Chats.size()==0) {
            answerId = "00000000-0000-0000-0000-000000000000";
        }else {
            answerId = robot_Chats.get(0).getAnswerId();
        }

        //获取机器人信息，如欢迎语及不理解时的话语
        List<Robot> robotPersistences = robotService.robotinfo();
        logger.info("=============robotPersistences.size(): "+robotPersistences.size());
        jsonObject.put("value", "1");
        //robotChat为推荐问题答案
        jsonObject.put("robotChat", robot_Chats);
        jsonObject.put("robotInfo", robotPersistences);
        jsonObject.put("questionId", questionId);
        jsonObject.put("answerId", answerId);
        //logger.info("=====answer: "+robot_Chats.get(0).getAnswer());
        String result = JsonUtil.toJsonString(jsonObject);
        return result;
    }

//    @ResponseBody
//    @RequestMapping(value={"/getRobotInfo"},method={org.springframework.web.bind.annotation.RequestMethod.GET},produces="text/plain;charset=UTF-8")
//    public String RobotInfo(HttpServletResponse response, HttpServletRequest request){
//        String path = request.getServletPath();
//        response.setContentType("application/json");
//        response.setCharacterEncoding("utf-8");
//        //获得机器人信息
//        List<Robot> list = robotService.robotinfo();
//        String result = JsonUtil.toJsonString(list);
//        //记录运行时间
//        return result;
//    }

}
