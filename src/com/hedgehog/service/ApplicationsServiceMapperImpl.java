package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.sys_Applications;
import com.hedgehog.mapper.NewsMapper;
import com.hedgehog.mapper.sys_ApplicationsMapper;

@Service("applicationsService")
public class ApplicationsServiceMapperImpl implements ApplicationsService{

	private sys_ApplicationsMapper applicationsMapperMapper;
	@Autowired
	public void setApplicationsMapperMapper(sys_ApplicationsMapper applicationsMapperMapper) {
		this.applicationsMapperMapper = applicationsMapperMapper;
	}

    
	public List<sys_Applications> selectRecordInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.applicationsMapperMapper.selectRecordInPager(qp);
	}
	public sys_Applications selectByPrimaryKey(Integer applicationid)
	{
		return this.applicationsMapperMapper.selectByPrimaryKey(applicationid);		
		
	}


	public int updateByPrimaryKeySelective(sys_Applications record) {
		// TODO Auto-generated method stub
		System.out.println("有没有执行到这里service"+record.getApplicationid());
		return this.applicationsMapperMapper.updateByPrimaryKeySelective(record);
	}


	public int insertSelective(sys_Applications record) {
		// TODO Auto-generated method stub
		return this.applicationsMapperMapper.insertSelective(record);
	}


	public int deleteByPrimaryKey(Integer applicationid) {
		// TODO Auto-generated method stub
		return this.applicationsMapperMapper.deleteByPrimaryKey(applicationid);
	}


	

	

}
