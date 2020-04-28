package com.example.demo.mapper;

import com.example.demo.po.FaqQuestion;
import com.example.demo.po.FaqQuestionExample;
import java.util.List;

public interface FaqQuestionMapper {
	int deleteByPrimaryKey(String FAQQUESTIONID);

	int insert(FaqQuestion record);

	int insertSelective(FaqQuestion record);

	List<FaqQuestion> selectByExampleWithBLOBs(FaqQuestionExample example);

	List<FaqQuestion> selectByExample(FaqQuestionExample example);

	FaqQuestion selectByPrimaryKey(String FAQQUESTIONID);

	int updateByPrimaryKeySelective(FaqQuestion record);

	int updateByPrimaryKeyWithBLOBs(FaqQuestion record);

	int updateByPrimaryKey(FaqQuestion record);

	// robot-根据二级分类号获取faq问题信息_根据收藏量取前三
	List<FaqQuestion> SecondClassify_robot(String ClassifyId);

	// 获取该分类下faq信息的总数
	int pageTotal(String ClassifyId);

	// 获取已审核faq
	List<FaqQuestion> faqAudited(String classifyId, int faqState, int startnum, int number);

	// 根据分类号和浏览量获取一条数据
	FaqQuestion faq1_faqPersistences(String ClassifyId, int faqState, int startNumber);

	// 根据分类号获取数据
	List<FaqQuestion> faq1_faqPersistences2(String faqClassify, int faqState, int startNumber, int number);

	// faq2_知识列表
	List<FaqQuestion> faq2_faqlist(String ClassifyId, int faqState, int pagenow, int number);

	// 记录用户提问记录_查看用户提问是否为faq中的内容_2017年10月22日11:43:43
	boolean getFaqQuestion(String comment);

	// faq_查看用户动态
	List<FaqQuestion> faq_userDynamics(int faqState, int number);

	// 获取待审核faq_2017年11月6日20:02:27
	List<FaqQuestion> faqPendingAudits(int faqState);

	// faq_未登录用户推荐_2017年9月14日21:16:18
	List<FaqQuestion> faq_recommend_Limit(int faqstate, int startnum, int number);

	// 查看自己的知识库_每次查看5条
	List<FaqQuestion> personal2_faq_Limit(String userId, int faqstate, int startNumber, int number);

	// 判断是创建知识还是修改知识
	boolean personal2_Ismodify(String faqquestionid, String modifynumber);

	// faq3_根据知识ID找类型classify
	String faq3_faqclassifyId(String QuestionId);

	// 根据faq问题id获取用户id
	String findUserIdByQuestionId(String QuestionId);

	// 获取faqquestionId对应faq问题
	List<FaqQuestion> getFaqQuestionInfo(String faqQuestionId);

	// 获取faq浏览量
	String getFaqScan(String questionId);

	// faq3_知识内容
	List<FaqQuestion> faq3_faqcontent(String QuestionId, int faqstate);

	// 删除待审核faq
	void deleteFAQ(String questionId, int faqstate);

	// 对访问FAQ页面的浏览量进行增加
	void updateFAQScan(String faqquestionId, String faqScan);

	// 更新faq信息1
	void updateFaqInfo1(String questionId, String modifyNum, int faqState);

	// 更新faq信息
	void updateFaqInfo(String questionId, String keywords, String description, String modifyNum, int faqState);

	// 获取分类下faq具体信息
	List<FaqQuestion> questionView(String parentId, int state, int startnum, int num);

	// 推荐知识_根据收藏量推荐前4个
	List<FaqQuestion> faqInfo_limit(String faqParentId);

	// faqadd_校验知识是否重复增添
	String faqadd_iscurrent(String faqtitle, String userid);

	// 查看知识库信息
	List<FaqQuestion> personal2_faq_Limit_Time(String userId, int startNumber, int number, String time);

	// 查看username发表的title faq的信息
	List<FaqQuestion> titleIsExist(String title, String userId);

	// 获取前200条faq !!!未使用
	List<FaqQuestion> getFaq();

	// robot_查看所以的faq信息 !!!未使用
	List<FaqQuestion> getFaqTotal();

	// 获取一级分类名及各分类数量
	int getQuestionCount(String faqclassifyid);

	// 获取待审核FAQ总数
	int getCount(int faqState);

	// 获取该分类下且faqState=2的总条数
	int faqAuditedCount(String classifyId, int faqState);
	
	/**
	 * 模糊搜索，用于机器人对话
	 */
//	List<FaqQuestion> chatWithRobotEasy();
}