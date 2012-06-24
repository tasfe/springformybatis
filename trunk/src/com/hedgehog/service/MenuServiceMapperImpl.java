package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.biz_menu;
import com.hedgehog.mapper.biz_menuMapper;

@Service("menuService")
public class MenuServiceMapperImpl implements MenuService{
	
	private biz_menuMapper menuMapper;
	@Autowired
	public void setMenuMapper(biz_menuMapper menuMapper) {
		this.menuMapper = menuMapper;
	}

	public List<biz_menu> selectByMember(int memberid) {
		// TODO Auto-generated method stub
		return this.menuMapper.selectByMember(memberid);
	}

	public List<biz_menu> selectByMemberEnable(int memberid) {
		// TODO Auto-generated method stub
		return this.menuMapper.selectByMemberEnable(memberid);
	}

	public biz_menu selectByPrimaryKey(Integer menuid) {
		// TODO Auto-generated method stub
		return this.menuMapper.selectByPrimaryKey(menuid);
	}

	public int updateByPrimaryKeySelective(biz_menu record) {
		// TODO Auto-generated method stub
		return this.menuMapper.updateByPrimaryKeySelective(record);
	}

	public int insertSelective(biz_menu record) {
		// TODO Auto-generated method stub
		return this.menuMapper.insertSelective(record);
	}

	public int deleteByPrimaryKey(Integer menuid) {
		// TODO Auto-generated method stub
		return this.menuMapper.deleteByPrimaryKey(menuid);
	}

	

}
