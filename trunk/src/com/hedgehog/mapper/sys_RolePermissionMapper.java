package com.hedgehog.mapper;

import com.hedgehog.domain.sys_RolePermission;
//import com.hedgehog.domain.sys_RolePermissionExample;
import com.hedgehog.domain.sys_RolePermissionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_RolePermissionMapper {
//    int countByExample(sys_RolePermissionExample example);
//
//    int deleteByExample(sys_RolePermissionExample example);

    int deleteByPrimaryKey(sys_RolePermissionKey key);

    int insert(sys_RolePermission record);

    int insertSelective(sys_RolePermission record);

//    List<sys_RolePermission> selectByExample(sys_RolePermissionExample example);

    sys_RolePermission selectByPrimaryKey(sys_RolePermissionKey key);

//    int updateByExampleSelective(@Param("record") sys_RolePermission record, @Param("example") sys_RolePermissionExample example);
//
//    int updateByExample(@Param("record") sys_RolePermission record, @Param("example") sys_RolePermissionExample example);

    int updateByPrimaryKeySelective(sys_RolePermission record);

    int updateByPrimaryKey(sys_RolePermission record);
}