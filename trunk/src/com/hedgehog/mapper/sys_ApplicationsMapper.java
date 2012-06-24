package com.hedgehog.mapper;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.sys_Applications;
//import com.hedgehog.domain.sys_ApplicationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_ApplicationsMapper {
//    int countByExample(sys_ApplicationsExample example);
//
//    int deleteByExample(sys_ApplicationsExample example);

    int deleteByPrimaryKey(Integer applicationid);

    int insert(sys_Applications record);

    int insertSelective(sys_Applications record);

//    List<sys_Applications> selectByExample(sys_ApplicationsExample example);

    sys_Applications selectByPrimaryKey(Integer applicationid);

//    int updateByExampleSelective(@Param("record") sys_Applications record, @Param("example") sys_ApplicationsExample example);

//    int updateByExample(@Param("record") sys_Applications record, @Param("example") sys_ApplicationsExample example);

    int updateByPrimaryKeySelective(sys_Applications record);

    int updateByPrimaryKey(sys_Applications record);
    //List<sys_Applications> selectAllRecord(QueryParam qp);
    List<sys_Applications> selectRecordInPager(QueryParam qp);
}