package com.hedgehog.mapper;

import com.hedgehog.domain.sys_ModuleExtPermissions;
//import com.hedgehog.domain.sys_ModuleExtPermissionsExample;
import com.hedgehog.domain.sys_ModuleExtPermissionsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_ModuleExtPermissionsMapper {
//    int countByExample(sys_ModuleExtPermissionsExample example);
//
//    int deleteByExample(sys_ModuleExtPermissionsExample example);

    int deleteByPrimaryKey(sys_ModuleExtPermissionsKey key);

    int insert(sys_ModuleExtPermissions record);

    int insertSelective(sys_ModuleExtPermissions record);

//    List<sys_ModuleExtPermissions> selectByExample(sys_ModuleExtPermissionsExample example);

    sys_ModuleExtPermissions selectByPrimaryKey(sys_ModuleExtPermissionsKey key);

//    int updateByExampleSelective(@Param("record") sys_ModuleExtPermissions record, @Param("example") sys_ModuleExtPermissionsExample example);
//
//    int updateByExample(@Param("record") sys_ModuleExtPermissions record, @Param("example") sys_ModuleExtPermissionsExample example);

    int updateByPrimaryKeySelective(sys_ModuleExtPermissions record);

    int updateByPrimaryKey(sys_ModuleExtPermissions record);
}