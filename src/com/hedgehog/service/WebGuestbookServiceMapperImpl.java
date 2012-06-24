package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_guestbook;
import com.hedgehog.mapper.web_guestbookMapper;

@Service("webGuestbookService")
public class WebGuestbookServiceMapperImpl implements WebGuestbookService{
	
	private web_guestbookMapper guestbookMapper;
	@Autowired
	public void setGuestbookMapper(web_guestbookMapper guestbookMapper) {
		this.guestbookMapper = guestbookMapper;
	}

	public int deleteByPrimaryKey(Integer guestbookid) {
		// TODO Auto-generated method stub
		return this.guestbookMapper.deleteByPrimaryKey(guestbookid);
	}

	public int insertSelective(web_guestbook record) {
		// TODO Auto-generated method stub
		return this.guestbookMapper.insertSelective(record);
	}

	public web_guestbook selectByPrimaryKey(Integer guestbookid) {
		// TODO Auto-generated method stub
		return this.guestbookMapper.selectByPrimaryKey(guestbookid);
	}

	public List<web_guestbook> selectwebGuestbookInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.guestbookMapper.selectwebGuestbookInPager(qp);
	}

	public int updateByPrimaryKeySelective(web_guestbook record) {
		// TODO Auto-generated method stub
		return this.guestbookMapper.updateByPrimaryKeySelective(record);
	}

	

}
