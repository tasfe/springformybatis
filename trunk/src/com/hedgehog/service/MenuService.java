package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.biz_menu;

public interface MenuService {
	List<biz_menu> selectByMember(int memberid);
	
	List<biz_menu> selectByMemberEnable(int memberid);
	
	biz_menu selectByPrimaryKey(Integer menuid);
	int updateByPrimaryKeySelective(biz_menu record);
	int insertSelective(biz_menu record);
	int deleteByPrimaryKey(Integer menuid);

}
