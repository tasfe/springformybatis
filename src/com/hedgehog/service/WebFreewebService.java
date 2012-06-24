package com.hedgehog.service;

import com.hedgehog.domain.web_freeweb;

public interface WebFreewebService {
	int insertSelective(web_freeweb record);	
	web_freeweb selectByMenuid(Integer menuid);
	int saveorupdate(web_freeweb record);
	

}
