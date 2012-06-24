package com.hedgehog.mapper;

import com.hedgehog.domain.sys_Event;
//import com.hedgehog.domain.sys_EventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_EventMapper {
//    int countByExample(sys_EventExample example);
//
//    int deleteByExample(sys_EventExample example);

    int deleteByPrimaryKey(Integer eventid);

    int insert(sys_Event record);

    int insertSelective(sys_Event record);

//    List<sys_Event> selectByExample(sys_EventExample example);

    sys_Event selectByPrimaryKey(Integer eventid);

//    int updateByExampleSelective(@Param("record") sys_Event record, @Param("example") sys_EventExample example);
//
//    int updateByExample(@Param("record") sys_Event record, @Param("example") sys_EventExample example);

    int updateByPrimaryKeySelective(sys_Event record);

    int updateByPrimaryKey(sys_Event record);
}