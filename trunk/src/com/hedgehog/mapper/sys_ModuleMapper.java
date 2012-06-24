package com.hedgehog.mapper;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.sys_Applications;
import com.hedgehog.domain.sys_Module;
//import com.hedgehog.domain.sys_ModuleExample;
import com.hedgehog.domain.sys_ModuleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_ModuleMapper {
//    int countByExample(sys_ModuleExample example);
//
//    int deleteByExample(sys_ModuleExample example);

    int deleteByPrimaryKey(sys_ModuleKey key);

    int insert(sys_Module record);

    int insertSelective(sys_Module record);

//    List<sys_Module> selectByExample(sys_ModuleExample example);

    sys_Module selectByPrimaryKey(sys_ModuleKey key);

//    int updateByExampleSelective(@Param("record") sys_Module record, @Param("example") sys_ModuleExample example);
//
//    int updateByExample(@Param("record") sys_Module record, @Param("example") sys_ModuleExample example);

    int updateByPrimaryKeySelective(sys_Module record);

    int updateByPrimaryKey(sys_Module record);
    
    List<sys_Module> selectRecordInPager(QueryParam qp);
}