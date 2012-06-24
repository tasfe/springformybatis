package com.hedgehog.mapper;

import com.hedgehog.domain.biz_ComType;
import com.hedgehog.domain.biz_ComTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_ComTypeMapper {
    int countByExample(biz_ComTypeExample example);

    int deleteByExample(biz_ComTypeExample example);

    int deleteByPrimaryKey(Integer comtypeid);

    int insert(biz_ComType record);

    int insertSelective(biz_ComType record);

    List<biz_ComType> selectByExample(biz_ComTypeExample example);

    biz_ComType selectByPrimaryKey(Integer comtypeid);

    int updateByExampleSelective(@Param("record") biz_ComType record, @Param("example") biz_ComTypeExample example);

    int updateByExample(@Param("record") biz_ComType record, @Param("example") biz_ComTypeExample example);

    int updateByPrimaryKeySelective(biz_ComType record);

    int updateByPrimaryKey(biz_ComType record);
}