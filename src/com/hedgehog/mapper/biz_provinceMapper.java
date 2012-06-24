package com.hedgehog.mapper;

import com.hedgehog.domain.biz_province;
import com.hedgehog.domain.biz_provinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_provinceMapper {
    int countByExample(biz_provinceExample example);

    int deleteByExample(biz_provinceExample example);

    int deleteByPrimaryKey(Integer provinceid);

    int insert(biz_province record);

    int insertSelective(biz_province record);

    List<biz_province> selectByExample(biz_provinceExample example);

    biz_province selectByPrimaryKey(Integer provinceid);

    int updateByExampleSelective(@Param("record") biz_province record, @Param("example") biz_provinceExample example);

    int updateByExample(@Param("record") biz_province record, @Param("example") biz_provinceExample example);

    int updateByPrimaryKeySelective(biz_province record);

    int updateByPrimaryKey(biz_province record);
    
    List<biz_province> selectAllRecord();
}