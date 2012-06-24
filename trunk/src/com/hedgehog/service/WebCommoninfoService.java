package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_commoninfo;


public interface WebCommoninfoService {
	
	int deleteByPrimaryKey(Integer commoninfoid);
	int insertSelective(web_commoninfo record);
	web_commoninfo selectByPrimaryKey(Integer commoninfoid);
	int updateByPrimaryKeySelective(web_commoninfo record);
	List<web_commoninfo> selectWebCommoninfoInPager(QueryParam qp);	
	
    

}
