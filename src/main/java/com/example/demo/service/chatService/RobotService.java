package com.example.demo.service.chatService;

import java.util.List;

import com.example.demo.po.Robot;
import com.example.demo.vo.robot_Chat;

public interface RobotService {

	/**
	 * robot_ajax获取机器人信息
	 */
	public List<Robot> robotinfo();
	
	/**
	 * robot_ajax_和机器人聊天
	 * @throws Exception 
	 */
	public List<robot_Chat> getRobotAnswer(String comment) throws Exception;

	
	
}
