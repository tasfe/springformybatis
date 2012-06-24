package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_product;
import com.hedgehog.domain.web_supplyclass;
import com.hedgehog.domain.web_supplyinfo;

public interface WebPurveyService {
    List<web_supplyclass> selectByMenuID(Integer pcMenuid);
	
	int insertSelective(web_supplyclass record);
	web_supplyclass selectByPrimaryKey(Integer supplyclassid);	
	int updateByPrimaryKeySelective(web_supplyclass record);
	int deleteByPrimaryKey(Integer supplyclassid);
	
	int deleteSupplyinfoByPrimaryKey(Integer Supplyinfoid);
    int insertSupplyinfoSelective(web_supplyinfo record);
    web_supplyinfo selectSupplyinfoByPrimaryKey(Integer Supplyinfoid);
    int updateSupplyinfoByPrimaryKeySelective(web_supplyinfo record);
    List<web_supplyinfo> selectWebSupplyinfoInPager(QueryParam qp);
    int selectCountByClass(Integer classid);

}
