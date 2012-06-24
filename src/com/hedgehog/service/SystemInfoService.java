package com.hedgehog.service;

import com.hedgehog.domain.sys_SystemInfo;


public interface SystemInfoService {
	sys_SystemInfo selectByPrimaryKey(Integer systemid);
	
	int updateByPrimaryKeySelective(sys_SystemInfo record);

}
