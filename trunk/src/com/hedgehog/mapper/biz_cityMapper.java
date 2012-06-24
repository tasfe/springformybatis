package com.hedgehog.mapper;

import com.hedgehog.domain.biz_city;
import com.hedgehog.domain.biz_cityExample;
import com.hedgehog.domain.biz_province;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_cityMapper {
    int countByExample(biz_cityExample example);

    int deleteByExample(biz_cityExample example);

    int deleteByPrimaryKey(Integer cityid);

    int insert(biz_city record);

    int insertSelective(biz_city record);

    List<biz_city> selectByExample(biz_cityExample example);

    biz_city selectByPrimaryKey(Integer cityid);
    
    biz_city selectByCode(String cityCode);

    int updateByExampleSelective(@Param("record") biz_city record, @Param("example") biz_cityExample example);

    int updateByExample(@Param("record") biz_city record, @Param("example") biz_cityExample example);

    int updateByPrimaryKeySelective(biz_city record);

    int updateByPrimaryKey(biz_city record);
    
    List<biz_city> selectAllRecord();
    List<biz_city> selectAllRecordBypro(Integer proid);
}