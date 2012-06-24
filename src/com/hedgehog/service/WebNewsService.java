package com.hedgehog.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_news;
import com.hedgehog.domain.web_newsExample;
import com.hedgehog.domain.web_newsclass;

public interface WebNewsService {
	List<web_newsclass> selectByMenuID(Integer ncMenuid);
	int insertSelective(web_newsclass record);
	web_newsclass selectByPrimaryKey(Integer newsclassid);	
	int updateByPrimaryKeySelective(web_newsclass record);
	int deleteByPrimaryKey(Integer newsclassid);
	
    int deleteNewsByPrimaryKey(Integer newsid);
    int insertNewsSelective(web_news record);
    web_news selectNewsByPrimaryKey(Integer newsid);
    int updateNewsByPrimaryKeySelective(web_news record);
    List<web_news> selectWebNewsInPager(QueryParam qp);
    int selectCountByClass(Integer classid);
    
    //int selectNCCountByMenuid(Integer ncMenuid);
}
