package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_commoninfo;
import com.hedgehog.mapper.web_commoninfoMapper;

@Service("webCommoninfoService")
public class WebCommoninfoServiceMapperImpl implements WebCommoninfoService{
	
	private web_commoninfoMapper commoninfoMapper;
	@Autowired
	public void setCommoninfoMapper(web_commoninfoMapper commoninfoMapper) {
		this.commoninfoMapper = commoninfoMapper;
	}

	public int deleteByPrimaryKey(Integer commoninfoid) {
		// TODO Auto-generated method stub
		return this.commoninfoMapper.deleteByPrimaryKey(commoninfoid);
	}

	public int insertSelective(web_commoninfo record) {
		// TODO Auto-generated method stub
		return this.commoninfoMapper.insertSelective(record);
	}

	public web_commoninfo selectByPrimaryKey(Integer commoninfoid) {
		// TODO Auto-generated method stub
		return this.commoninfoMapper.selectByPrimaryKey(commoninfoid);
	}

	public List<web_commoninfo> selectWebCommoninfoInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.commoninfoMapper.selectWebCommoninfoInPager(qp);
	}

	public int updateByPrimaryKeySelective(web_commoninfo record) {
		// TODO Auto-generated method stub
		return this.commoninfoMapper.updateByPrimaryKeySelective(record);
	}

	

}
