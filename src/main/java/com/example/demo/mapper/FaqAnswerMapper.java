package com.example.demo.mapper;

import java.util.List;

import com.example.demo.po.FaqAnswer;
import com.example.demo.po.FaqAnswerExample;

public interface FaqAnswerMapper {
	int deleteByPrimaryKey(String FAQANSWERID);

	int insert(FaqAnswer record);

	int insertSelective(FaqAnswer record);

	List<FaqAnswer> selectByExampleWithBLOBs(FaqAnswerExample example);

	List<FaqAnswer> selectByExample(FaqAnswerExample example);

	FaqAnswer selectByPrimaryKey(String FAQANSWERID);

	int updateByPrimaryKeySelective(FaqAnswer record);

	int updateByPrimaryKeyWithBLOBs(FaqAnswer record);

	int updateByPrimaryKey(FaqAnswer record);

	// faq3_知识内容
	List<FaqAnswer> getAnswerByQuestionId(String QuestionId);

	// 根据faq问题id查找用户id
	String findUserIdByFAQQuestionId(String faqquestionid);

}