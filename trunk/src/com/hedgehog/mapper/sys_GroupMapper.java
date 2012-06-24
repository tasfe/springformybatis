package com.hedgehog.mapper;

import com.hedgehog.domain.sys_Group;
//import com.hedgehog.domain.sys_GroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_GroupMapper {
//    int countByExample(sys_GroupExample example);
//
//    int deleteByExample(sys_GroupExample example);

    int deleteByPrimaryKey(Integer groupid);

    int insert(sys_Group record);

    int insertSelective(sys_Group record);

//    List<sys_Group> selectByExample(sys_GroupExample example);

    sys_Group selectByPrimaryKey(Integer groupid);

//    int updateByExampleSelective(@Param("record") sys_Group record, @Param("example") sys_GroupExample example);
//
//    int updateByExample(@Param("record") sys_Group record, @Param("example") sys_GroupExample example);

    int updateByPrimaryKeySelective(sys_Group record);

    int updateByPrimaryKey(sys_Group record);
}