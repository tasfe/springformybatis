package com.hedgehog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.sys_SystemInfo;
import com.hedgehog.mapper.NewsMapper;
import com.hedgehog.mapper.sys_SystemInfoMapper;

@Service("systemInfoService")
public class SystemInfoServiceMapperImpl implements SystemInfoService {

	private sys_SystemInfoMapper systemInfoMapper;

    @Autowired
    public void setNewsMapper(sys_SystemInfoMapper systemInfoMapper) {
        this.systemInfoMapper = systemInfoMapper;
    }
	public sys_SystemInfo selectByPrimaryKey(Integer systemid) {
		// TODO Auto-generated method stub
		return this.systemInfoMapper.selectByPrimaryKey(systemid);
	}
	public int updateByPrimaryKeySelective(sys_SystemInfo record) {
		// TODO Auto-generated method stub
		return this.systemInfoMapper.updateByPrimaryKeySelective(record);
	}

}
