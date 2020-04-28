package com.example.demo.mapper;

import com.example.demo.po.Log;
import com.example.demo.po.LogExample;
import java.util.List;

public interface LogMapper {
    int deleteByPrimaryKey(String LOGID);

    int insert(Log record);

    int insertSelective(Log record);

    List<Log> selectByExample(LogExample example);

    Log selectByPrimaryKey(String LOGID);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);
}