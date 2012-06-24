package com.hedgehog.mapper;

import com.hedgehog.domain.sys_Online;
//import com.hedgehog.domain.sys_OnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_OnlineMapper {
//    int countByExample(sys_OnlineExample example);
//
//    int deleteByExample(sys_OnlineExample example);

    int deleteByPrimaryKey(String oSessionid);

    int insert(sys_Online record);

    int insertSelective(sys_Online record);

//    List<sys_Online> selectByExample(sys_OnlineExample example);

    sys_Online selectByPrimaryKey(String oSessionid);

//    int updateByExampleSelective(@Param("record") sys_Online record, @Param("example") sys_OnlineExample example);
//
//    int updateByExample(@Param("record") sys_Online record, @Param("example") sys_OnlineExample example);

    int updateByPrimaryKeySelective(sys_Online record);

    int updateByPrimaryKey(sys_Online record);
}