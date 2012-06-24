package com.hedgehog.mapper;

import com.hedgehog.domain.biz_rank;
import com.hedgehog.domain.biz_rankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_rankMapper {
    int countByExample(biz_rankExample example);

    int deleteByExample(biz_rankExample example);

    int deleteByPrimaryKey(Integer rankid);

    int insert(biz_rank record);

    int insertSelective(biz_rank record);

    List<biz_rank> selectByExample(biz_rankExample example);

    biz_rank selectByPrimaryKey(Integer rankid);

    int updateByExampleSelective(@Param("record") biz_rank record, @Param("example") biz_rankExample example);

    int updateByExample(@Param("record") biz_rank record, @Param("example") biz_rankExample example);

    int updateByPrimaryKeySelective(biz_rank record);

    int updateByPrimaryKey(biz_rank record);
    
    List<biz_rank> selectByParentid(Integer prankid);
}