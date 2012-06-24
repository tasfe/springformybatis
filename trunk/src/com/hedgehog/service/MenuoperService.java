package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.biz_menuoper;

public interface MenuoperService {
	biz_menuoper selectByAppKey(Integer appid);
	
	biz_menuoper selectByAppcode(String appcode);

}
