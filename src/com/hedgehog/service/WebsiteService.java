package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.biz_websiteWithBLOBs;

public interface WebsiteService {
	biz_website selectByPrimaryKey(Integer websiteid);
	biz_website selectByMember(Integer memberid);
	int updateByPrimaryKey(biz_website record);
	
	int updateByPrimaryKeySelective(biz_website record);
	
	List<biz_website> selectRecordInPager(QueryParam qp);
	
	biz_websiteWithBLOBs selectByPrimaryKeyWrap(Integer websiteid);
	
	int updateByPrimaryKeySelectiveWrap(biz_websiteWithBLOBs record);

}
