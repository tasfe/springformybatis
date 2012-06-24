package com.hedgehog.mapper;

import com.hedgehog.domain.sys_FieldValue;
//import com.hedgehog.domain.sys_FieldValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_FieldValueMapper {
//    int countByExample(sys_FieldValueExample example);
//
//    int deleteByExample(sys_FieldValueExample example);

    int deleteByPrimaryKey(Integer valueid);

    int insert(sys_FieldValue record);

    int insertSelective(sys_FieldValue record);

//    List<sys_FieldValue> selectByExample(sys_FieldValueExample example);

    sys_FieldValue selectByPrimaryKey(Integer valueid);

//    int updateByExampleSelective(@Param("record") sys_FieldValue record, @Param("example") sys_FieldValueExample example);
//
//    int updateByExample(@Param("record") sys_FieldValue record, @Param("example") sys_FieldValueExample example);

    int updateByPrimaryKeySelective(sys_FieldValue record);

    int updateByPrimaryKey(sys_FieldValue record);
}