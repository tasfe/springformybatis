package com.hedgehog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.web_freeweb;
import com.hedgehog.mapper.web_freewebMapper;

@Service("webFreewebService")
public class WebFreewebServiceMapperImpl implements WebFreewebService{
	private web_freewebMapper freewebMapper;
	@Autowired
	public void setFreewebMapper(web_freewebMapper freewebMapper) {
		this.freewebMapper = freewebMapper;
	}

	public int insertSelective(web_freeweb record) {
		// TODO Auto-generated method stub
		return this.freewebMapper.insertSelective(record);
	}

	public web_freeweb selectByMenuid(Integer menuid) {
		// TODO Auto-generated method stub
		return this.freewebMapper.selectByMenuid(menuid);
	}

	public int saveorupdate(web_freeweb record) {
		// TODO Auto-generated method stub
		int tag;
		System.out.println("id:"+record.getFreewebid());
		if(record.getFreewebid()==null)
		{	
			System.out.println("Ìí¼Ó");
			tag=this.freewebMapper.insertSelective(record);
		}
		else
		{
			System.out.println("¸üÐÂ");
			tag=this.freewebMapper.updateByPrimaryKeySelective(record);
		}
		return tag;
	}

	

}
