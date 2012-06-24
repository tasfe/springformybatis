package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_prank;
import com.hedgehog.domain.biz_rank;
import com.hedgehog.domain.biz_website;

public interface MemberService {
	int insert(biz_member record);
	int insertmemberpro(biz_member record,biz_website record2);
	int insertSelective(biz_member record);
	List<biz_member> selectRecordInPager(QueryParam qp);
	int deleteByPrimaryKey(Integer memberid);	
	boolean isExist(String username);
	boolean authenticate(biz_member record);
	biz_member selectByUsername(String username);
	biz_member selectByPrimaryKey(Integer memberid);
	
	int updateByPrimaryKeySelective(biz_member record);
	
	biz_prank selectPrankByPrimaryKey(Integer prankid);
	
	List<biz_prank> selectPrankAllRecord();
	
	biz_rank selectRankByPrimaryKey(Integer rankid);
	
	List<biz_rank> selectRankByParentid(Integer prankid);
}
