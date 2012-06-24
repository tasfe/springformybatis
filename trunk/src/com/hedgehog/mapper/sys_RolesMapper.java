package com.hedgehog.mapper;

import com.hedgehog.domain.sys_Roles;
//import com.hedgehog.domain.sys_RolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_RolesMapper {
//    int countByExample(sys_RolesExample example);
//
//    int deleteByExample(sys_RolesExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(sys_Roles record);

    int insertSelective(sys_Roles record);

//    List<sys_Roles> selectByExample(sys_RolesExample example);

    sys_Roles selectByPrimaryKey(Integer roleid);

//    int updateByExampleSelective(@Param("record") sys_Roles record, @Param("example") sys_RolesExample example);
//
//    int updateByExample(@Param("record") sys_Roles record, @Param("example") sys_RolesExample example);

    int updateByPrimaryKeySelective(sys_Roles record);

    int updateByPrimaryKey(sys_Roles record);
}