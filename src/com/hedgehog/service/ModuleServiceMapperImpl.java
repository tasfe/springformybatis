package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.sys_Module;
import com.hedgehog.domain.sys_ModuleKey;
import com.hedgehog.mapper.sys_ModuleMapper;

@Service("moduleService")
public class ModuleServiceMapperImpl implements ModuleService{

	private sys_ModuleMapper sys_moduleMapper;
	@Autowired
	public void setsys_ModuleMapper(sys_ModuleMapper sys_moduleMapper) {
		this.sys_moduleMapper = sys_moduleMapper;
	}
	public List<sys_Module> selectRecordInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.sys_moduleMapper.selectRecordInPager(qp);
	}

}
