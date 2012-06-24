package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_product;
import com.hedgehog.domain.web_productclass;

public interface WebProductService {
	List<web_productclass> selectByMenuID(Integer pcMenuid);
	
	int insertSelective(web_productclass record);
	web_productclass selectByPrimaryKey(Integer productclassid);	
	int updateByPrimaryKeySelective(web_productclass record);
	int deleteByPrimaryKey(Integer productclassid);
	
	int deleteProductByPrimaryKey(Integer productid);
    int insertProductSelective(web_product record);
    web_product selectProductByPrimaryKey(Integer productid);
    int updateProductByPrimaryKeySelective(web_product record);
    List<web_product> selectWebProductInPager(QueryParam qp);
    int selectCountByClass(Integer classid);

}
