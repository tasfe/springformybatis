package com.hedgehog.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.biz_menuoper;
import com.hedgehog.mapper.biz_menuoperMapper;


@Service("menuoperService")
public class MenuoperServiceMapperImpl implements MenuoperService{
	
	private static final Log log = LogFactory.getLog(MenuoperService.class);
	
	private biz_menuoperMapper menuoperMapper;
	
	@Autowired
	public void setMenuoperMapper(biz_menuoperMapper menuoperMapper) {
		this.menuoperMapper = menuoperMapper;
	}

	public biz_menuoper selectByAppKey(Integer appid) {
		// TODO Auto-generated method stub
		return this.menuoperMapper.selectByAppKey(appid);
	}

	public biz_menuoper selectByAppcode(String appcode) {
		// TODO Auto-generated method stub
		log.info("Ö´ÐÐselectByAppcode·½·¨");
		return this.menuoperMapper.selectByAppcode(appcode);
	}

	

}
