package com.example.demo.mapper;

import java.util.List;

import com.example.demo.po.Robot;
import com.example.demo.po.RobotExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RobotMapper {
	int deleteByPrimaryKey(String ROBOTID);

	int insert(Robot record);

	int insertSelective(Robot record);

	List<Robot> selectByExample(RobotExample example);

	Robot selectByPrimaryKey(String ROBOTID);

	int updateByPrimaryKeySelective(Robot record);

	int updateByPrimaryKey(Robot record);

	// robot_ajax获取机器人信息
	List<Robot> robotinfo();
}