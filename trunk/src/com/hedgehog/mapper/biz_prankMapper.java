package com.hedgehog.mapper;

import com.hedgehog.domain.biz_prank;
import com.hedgehog.domain.biz_prankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_prankMapper {
    int countByExample(biz_prankExample example);

    int deleteByExample(biz_prankExample example);

    int deleteByPrimaryKey(Integer prankid);

    int insert(biz_prank record);

    int insertSelective(biz_prank record);

    List<biz_prank> selectByExample(biz_prankExample example);

    biz_prank selectByPrimaryKey(Integer prankid);

    int updateByExampleSelective(@Param("record") biz_prank record, @Param("example") biz_prankExample example);

    int updateByExample(@Param("record") biz_prank record, @Param("example") biz_prankExample example);

    int updateByPrimaryKeySelective(biz_prank record);

    int updateByPrimaryKey(biz_prank record);
    
    List<biz_prank> selectAllRecord();
}