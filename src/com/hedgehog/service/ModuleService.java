package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.sys_Module;
import com.hedgehog.domain.sys_ModuleKey;

public interface ModuleService {
	List<sys_Module> selectRecordInPager(QueryParam qp);

}
