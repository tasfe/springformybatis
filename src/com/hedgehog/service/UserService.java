package com.hedgehog.service;

import java.util.List;


import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.sys_User;

public interface UserService {
	int deleteByPrimaryKey(Integer userid);
	int insertSelective(sys_User record);
	sys_User selectByPrimaryKey(Integer userid); 
	int updateByPrimaryKeySelective(sys_User record);
	List<sys_User> selectUserInPager(QueryParam qp);
	
	boolean authenticate(String username,String password);
	sys_User getUser(String username);

}
