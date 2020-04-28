package com.example.demo.mapper;

import java.util.List;

import com.example.demo.po.Comment;
import com.example.demo.po.CommentExample;

public interface CommentMapper {
	int deleteByPrimaryKey(String COMMENTID);

	int insert(Comment record);

	int insertSelective(Comment record);

	List<Comment> selectByExample(CommentExample example);

	Comment selectByPrimaryKey(String COMMENTID);

	int updateByPrimaryKeySelective(Comment record);

	int updateByPrimaryKey(Comment record);

	// question2_查看回复_前五条
	List<Comment> question2_getComment_Limit(String questionid, String parentId);

	// faq3_查看评论的数量
	int getComment2(String faqquestionid, String parentId);

	// question2_查看回复总数
	int question2_getComment(String questionid, String parentId);

	// question2_获得更多的回复
	List<Comment> question2_getMoreComment(String questionId, String answerId, int startnumber);

	// 获取评论数
	int commentInfo(String faqquestionId);

	// faq1_查看活跃用户
	List<Comment> faq1_userActive(String time);

	// faq1_查看活跃用户_按周查询
	List<Comment> faq1_userActiveWeek(String time, String time2);

	// faq3_查看评论_查看更多
	List<Comment> getCommentMore(String faqquestionid, int startnumber, String parentId);

	// faq3_ajax_添加评论
	void saveComment(String commentid, String faqquestionid, String communityquestionid, String userid,
                     String commentcont, String commenttime, String commentparentid, int isnotice, String touserid);

	// question2_查看回复
	String question2_getComment2(String answerId, String userId, String content, String questionId);

	// faq3_查看回复是否存在
	String faq3_getComment(String commentId, String userId, String content, String questionId);

	// faq3_根据评论ID查找用户Id
	String faq3_getUserIdByCommentId(String commentId);

	// 根据评论ID查找评论详情
	List<Comment> faq3_getCommentInfoById(String commentId);

	// faq3_ajax_删除自己的回复
	void deleteReply(String commentId);

	// faq3_查看子评论下的回复_更多回复
	List<Comment> faq3_getCommentReply_Limit(String parentId, int startnumber);

	// 查看评论数
	int faq3_getCommentCountById(String commentparentid);

	// faq3_查看子评论下的回复
	int faq3_getCommentReply(String parentId);

	// personal2_查看评论的FAQ
	List<Comment> personal2_getFaqComment_Limit(String userId, String parentId, int startNumber, int number);

	// notice_pushlet_查看评论的回复 !!!未使用
	List<Comment> notice_getComment(String communityquestionId, String commentId, int isnotice);

	// notice_查看FAQ的评论 !!!未使用
	List<Comment> notice_getFaqComment(String faqquestionId, String parentId, int isnotice);

	// !!!未使用
	List<Comment> notice_getFaqComment2(String userId, String parentId);

	// notice_pushlet_查看评论的回复的回复 !!!未使用
	List<Comment> notice_getReply(String communityquestionId, String commentId, int isnotice);

	// notice_查看FAQ评论的回复 !!!未使用
	List<Comment> notice_getFaqReply(String parentId, int isnotice);

	List<Comment> notice_getFaqReply2(String parentId, int isnotice);

	// 更改知识库的评论、回复、回复的回复以及问吧的回复、回复的回复
	void updateNotice(int isnotice, String id);

	// 更改问吧的评论
	void updateNotice2(int isnotice, String id);

	// 删除消息通知
	void deleteNotice(int i, String id);

	void deleteNotice2(int i, String id);
}