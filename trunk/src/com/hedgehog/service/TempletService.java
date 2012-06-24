package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_templet;
import com.hedgehog.domain.biz_templet_class;

public interface TempletService {
	
	List<biz_templet_class> selectTempletclassAllRecord();	
	biz_templet_class selectTempletclassByArray(Integer arraylist);
	
	int deleteByPrimaryKey(Integer templetid);
	int insertSelective(biz_templet record);
	biz_templet selectByPrimaryKey(Integer templetid);
	int updateByPrimaryKeySelective(biz_templet record);
    //int updateByPrimaryKey(biz_templet record);
    List<biz_templet> selectRecordInPager(QueryParam qp);    
    biz_templet selectByCode(String templetCode);
}
