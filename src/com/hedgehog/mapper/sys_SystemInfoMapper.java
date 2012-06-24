package com.hedgehog.mapper;

import com.hedgehog.domain.sys_SystemInfo;
//import com.hedgehog.domain.sys_SystemInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_SystemInfoMapper {
//    int countByExample(sys_SystemInfoExample example);
//
//    int deleteByExample(sys_SystemInfoExample example);

    int deleteByPrimaryKey(Integer systemid);

    int insert(sys_SystemInfo record);

    int insertSelective(sys_SystemInfo record);

//    List<sys_SystemInfo> selectByExampleWithBLOBs(sys_SystemInfoExample example);
//
//    List<sys_SystemInfo> selectByExample(sys_SystemInfoExample example);

    sys_SystemInfo selectByPrimaryKey(Integer systemid);

//    int updateByExampleSelective(@Param("record") sys_SystemInfo record, @Param("example") sys_SystemInfoExample example);
//
//    int updateByExampleWithBLOBs(@Param("record") sys_SystemInfo record, @Param("example") sys_SystemInfoExample example);
//
//    int updateByExample(@Param("record") sys_SystemInfo record, @Param("example") sys_SystemInfoExample example);

    int updateByPrimaryKeySelective(sys_SystemInfo record);

    int updateByPrimaryKeyWithBLOBs(sys_SystemInfo record);

    int updateByPrimaryKey(sys_SystemInfo record);
}