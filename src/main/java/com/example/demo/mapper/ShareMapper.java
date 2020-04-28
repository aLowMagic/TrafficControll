package com.example.demo.mapper;

import java.util.List;

import com.example.demo.po.Share;
import com.example.demo.po.ShareExample;

public interface ShareMapper {
    int deleteByPrimaryKey(String SHAREID);

    int insert(Share record);

    int insertSelective(Share record);

    List<Share> selectByExample(ShareExample example);

    Share selectByPrimaryKey(String SHAREID);

    int updateByPrimaryKeySelective(Share record);

    int updateByPrimaryKey(Share record);
    
  //faq3_ajax_查看分享byID
  	String getShareList_ID(String userId, String faqquestionId);
  	
  	//社区中心IT人员分享
  	String getShareList_ID2(String userId, String communityquestionId);
  	
  	// faq3 and communityQuestion_ajax_删除分享byID	 
  	void deleteShare(String shareid);
  	
  	// faq3_ajax_分享的增加
  	void saveShare(String shareId, String userId, String time, String faqquestionId);
  	
  	//查看用户分享的FAQ信息
  	List<Share> getShareList_FAQ_Limit(String userId, int startNumber, int number);
  	
  	// 查看用户分享的FAQ信息_time_Limit
  	List<Share> getShareList_FAQ_Limit_Time(String userId, int startNumber, int number, String time);
  	
  	//查看用户分享的Community信息
  	List<Share> getShareList_community_Limit(String userId, int startNumber, int number);
  	
  	//查看分享的Community信息
  	List<Share> getShareList_community_Limit_Time(String userId, int startNumber, int number, String time);
  	
  	//有权限的角色分享社区问题
  	void saveShare2(String shareId, String userId, String time, String faqquestionId);
}