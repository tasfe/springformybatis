package com.hedgehog.mapper;

import com.hedgehog.domain.sys_Field;
//import com.hedgehog.domain.sys_FieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_FieldMapper {
//    int countByExample(sys_FieldExample example);
//
//    int deleteByExample(sys_FieldExample example);

    int deleteByPrimaryKey(Integer fieldid);

    int insert(sys_Field record);

    int insertSelective(sys_Field record);

//    List<sys_Field> selectByExample(sys_FieldExample example);

    sys_Field selectByPrimaryKey(Integer fieldid);

//    int updateByExampleSelective(@Param("record") sys_Field record, @Param("example") sys_FieldExample example);
//
//    int updateByExample(@Param("record") sys_Field record, @Param("example") sys_FieldExample example);

    int updateByPrimaryKeySelective(sys_Field record);

    int updateByPrimaryKey(sys_Field record);
}