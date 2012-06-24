package com.hedgehog.mapper;

import com.hedgehog.domain.biz_submenuoper;
import com.hedgehog.domain.biz_submenuoperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_submenuoperMapper {
    int countByExample(biz_submenuoperExample example);

    int deleteByExample(biz_submenuoperExample example);

    int deleteByPrimaryKey(Integer submenuoperid);

    int insert(biz_submenuoper record);

    int insertSelective(biz_submenuoper record);

    List<biz_submenuoper> selectByExample(biz_submenuoperExample example);

    biz_submenuoper selectByPrimaryKey(Integer submenuoperid);

    int updateByExampleSelective(@Param("record") biz_submenuoper record, @Param("example") biz_submenuoperExample example);

    int updateByExample(@Param("record") biz_submenuoper record, @Param("example") biz_submenuoperExample example);

    int updateByPrimaryKeySelective(biz_submenuoper record);

    int updateByPrimaryKey(biz_submenuoper record);
}