package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.sys_Applications;

public interface ApplicationsService {
	List<sys_Applications> selectRecordInPager(QueryParam qp);
	sys_Applications selectByPrimaryKey(Integer applicationid);
	int updateByPrimaryKeySelective(sys_Applications record);
	int insertSelective(sys_Applications record);
	int deleteByPrimaryKey(Integer applicationid);

}
