package com.example.demo.mapper;

import com.example.demo.po.FaqClassify;
import com.example.demo.po.FaqClassifyExample;
import java.util.List;

public interface FaqClassifyMapper {
	int deleteByPrimaryKey(String FAQCLASSIFYID);

	int insert(FaqClassify record);

	int insertSelective(FaqClassify record);

	List<FaqClassify> selectByExample(FaqClassifyExample example);

	FaqClassify selectByPrimaryKey(String FAQCLASSIFYID);

	int updateByPrimaryKeySelective(FaqClassify record);

	int updateByPrimaryKey(FaqClassify record);

	// robot_分类_获取一级分类
	List<FaqClassify> FirstClassify_robot();

	// question_查看问答模块的分类
	String question_ClassifyListByName(String ClassifyName, String faqParentId);

	// 通过分类id查找分类名
	String getClassifyNameById(String classifyId);

	// abstract:获取当前问题分类的上一级分类
	String faq_parentId(String faq_classifyId);

	// 根据分类号查找分类信息
	List<FaqClassify> getInfoById(String classifyId);

	// zyq_robot_分类_获取二级分类_按照收藏量
	List<FaqClassify> SecondClassify_robot(String ParentId);

	// 获取parentId的下一级分类信息_按照浏览量和收藏量的加权
	List<FaqClassify> SecondClassify_robot2(String ParentId);

	// faq1_下面4栏推荐_按照浏览量
	List<FaqClassify> faq1_SecondClassify(String ParentId);

	// spider_按照分类名称查找
	List<FaqClassify> spider_ClassifyListByName(String ClassifyName, String parentId);

	// 根据parentId获取二级分类信息
	int secondClassifyCount(String parentId);

	String getClassifyIdByName(String classifyname, String parentId);
}