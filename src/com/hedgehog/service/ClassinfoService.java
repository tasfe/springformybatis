package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_classinfo;
import com.hedgehog.domain.biz_classinfoclass;
import com.hedgehog.domain.biz_reply;
import com.hedgehog.domain.biz_templet;

public interface ClassinfoService {
	
	List<biz_classinfoclass> selectcicAllRecord();
	List<biz_classinfoclass> selectcicAllParentRecord();
    List<biz_classinfoclass> selectcicByParentID(Integer cicid);
    biz_classinfoclass selectcicByPrimaryKey(Integer cicid);
	
	int insertSelective(biz_classinfo record);
	int deleteByPrimaryKey(Integer classinfoid);
	biz_classinfo selectByPrimaryKey(Integer classinfoid);
	int updateByPrimaryKeySelective(biz_classinfo record);
	List<biz_classinfo> selectRecordInPager(QueryParam qp);
	
	List<biz_reply> selectReplyRecordInPager(QueryParam qp);//·ÖÒ³
	int insertReplySelective(biz_reply record);
	int deleteReplyByPrimaryKey(Integer replyid);
	int deleteReplyByClassinfoid(Integer classinfoid);//ÅúÁ¿É¾³ý

}
