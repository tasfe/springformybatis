package com.hedgehog.mapper;

//import com.hedgehog.domain.sys_RoleApplicationExample;
import com.hedgehog.domain.sys_RoleApplicationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_RoleApplicationMapper {
//    int countByExample(sys_RoleApplicationExample example);
//
//    int deleteByExample(sys_RoleApplicationExample example);

    int deleteByPrimaryKey(sys_RoleApplicationKey key);

    int insert(sys_RoleApplicationKey record);

    int insertSelective(sys_RoleApplicationKey record);

//    List<sys_RoleApplicationKey> selectByExample(sys_RoleApplicationExample example);
//
//    int updateByExampleSelective(@Param("record") sys_RoleApplicationKey record, @Param("example") sys_RoleApplicationExample example);
//
//    int updateByExample(@Param("record") sys_RoleApplicationKey record, @Param("example") sys_RoleApplicationExample example);
}