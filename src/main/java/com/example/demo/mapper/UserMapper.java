package com.example.demo.mapper;

import com.example.demo.po.User;
import com.example.demo.po.UserExample;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String USERID);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String USERID);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
 // zyq_login_ajax_注册
 	public void login_register(String userid, String name, String password, int userstate, String createTime,
                               String userimage);

 	// 判断用户是否登录
 	public Boolean isLogin(String username, String password);

 	// 判断用户名是否已存在
 	public Boolean getUserInfoByName(String name);

 	// message_ajax_获得用户基本信息
 	public User getUserInfo(String username);

 	// 通过username找userID
 	public String getUserIdByName(String username);

 	// 修改用户信息
 	public void updateUserInfo2(String userid, String usersex, String userbirthday, String address, String userbrief);

 	// 修改密码
 	public void updateUserPassword(String userid, String password);

 	// zzl_获取指定用户信息_2017年11月10日11:46:39
 	public User getUserInfoById(String userId);

 	// 通过用户Id获取用户名
 	public String getUserNameById(String userId);

 	// 获取用户角色名
 	public String getRoleNameByUserId(String userId);

 	// zzl_获取所有待审核用户_2017年11月9日21:29:09
 	public List<User> getAllUsers(int userState);

 	// 获取所有待审核用户_限定数量
 	public List<User> getAllUsers_limit(int userState, int num);

 	// zzl_获取所有普通用户信息 -- 即USERSTATE = 2 且 角色名是普通用户_2017年11月9日22:34:22
 	public List<User> getUserLists(int userState, String roleName);

 	// zzl_更改用户状态_2017年11月10日10:33:30
 	public void updateUserState(String userId, int userState);

 	// zyq_上传图片
 	public void updateUserImage(String username, String path);

 	// Excel导入用户信息
 	public void login_register2(String userid, String password, String username, int userstate, String userimage,
                                String roleid);

 	// 更新员工角色
 	public void updateUserRole(String userId, String roleId);

 	// 重置密码
 	public void resetPass(String userid, String password);

 	// 获取各类员工总数量(带角色名，所有用户状态都是2)
 	public int getUserCount(int userState, String roleName);

 	// 获取各类员工总数量(不带角色名，用户状态是0或1)
 	public int getPendingUserCount(int userState);
}