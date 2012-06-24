package com.hedgehog.mapper;

//import com.hedgehog.domain.sys_UserRolesExample;
import com.hedgehog.domain.sys_UserRolesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_UserRolesMapper {
//    int countByExample(sys_UserRolesExample example);
//
//    int deleteByExample(sys_UserRolesExample example);

    int deleteByPrimaryKey(sys_UserRolesKey key);

    int insert(sys_UserRolesKey record);

    int insertSelective(sys_UserRolesKey record);

//    List<sys_UserRolesKey> selectByExample(sys_UserRolesExample example);
//
//    int updateByExampleSelective(@Param("record") sys_UserRolesKey record, @Param("example") sys_UserRolesExample example);
//
//    int updateByExample(@Param("record") sys_UserRolesKey record, @Param("example") sys_UserRolesExample example);
}