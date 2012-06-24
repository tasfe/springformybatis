package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.sys_User;
import com.hedgehog.mapper.sys_UserMapper;

@Service("userService")
public class UserServiceMapperImpl implements UserService{
	
	private sys_UserMapper userMapper;
	@Autowired
	public void setUserMapper(sys_UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	

	public int deleteByPrimaryKey(Integer userid) {
		// TODO Auto-generated method stub
		return this.userMapper.deleteByPrimaryKey(userid);
	}

	public int insertSelective(sys_User record) {
		// TODO Auto-generated method stub
		return this.userMapper.insertSelective(record);
	}

	public sys_User selectByPrimaryKey(Integer userid) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(userid);
	}

	public List<sys_User> selectUserInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.userMapper.selectUserInPager(qp);
	}

	public int updateByPrimaryKeySelective(sys_User record) {
		// TODO Auto-generated method stub
		return this.userMapper.updateByPrimaryKeySelective(record);
	}



	public boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		boolean isexist=false;
		sys_User record=new sys_User();
		record.setuLoginname(username);
		record.setuPassword(password);
		if(this.userMapper.authenticate(record)>0)
		{
			isexist=true;
		}
		return isexist;
	}



	public sys_User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userMapper.getUser(username);
	}

	

	

}
