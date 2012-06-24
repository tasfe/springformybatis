package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.biz_websiteWithBLOBs;
import com.hedgehog.mapper.biz_websiteMapper;

@Service("websiteService")
public class WebsiteServiceMapperImpl implements WebsiteService{
	
	private biz_websiteMapper websiteMapper;
	
	@Autowired
	public void setWebsiteMapper(biz_websiteMapper websiteMapper) {
		this.websiteMapper = websiteMapper;
	}

	public biz_website selectByMember(Integer memberid) {
		// TODO Auto-generated method stub
		return this.websiteMapper.selectByMember(memberid);
	}

	public int updateByPrimaryKey(biz_website record) {
		// TODO Auto-generated method stub
		return this.websiteMapper.updateByPrimaryKey(record);
	}

	public int updateByPrimaryKeySelective(biz_website record) {
		// TODO Auto-generated method stub
		return this.websiteMapper.updateByPrimaryKeySelective(record);
	}

	public List<biz_website> selectRecordInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.websiteMapper.selectRecordInPager(qp);
	}

	public biz_website selectByPrimaryKey(Integer websiteid) {
		// TODO Auto-generated method stub
		return this.websiteMapper.selectByPrimaryKey(websiteid);
	}

	public biz_websiteWithBLOBs selectByPrimaryKeyWrap(Integer websiteid) {
		// TODO Auto-generated method stub
		return this.websiteMapper.selectByPrimaryKeyWrap(websiteid);
	}

	public int updateByPrimaryKeySelectiveWrap(biz_websiteWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.websiteMapper.updateByPrimaryKeySelectiveWrap(record);
	}

	

}
