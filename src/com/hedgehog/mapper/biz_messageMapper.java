package com.hedgehog.mapper;

import com.hedgehog.domain.biz_message;
import com.hedgehog.domain.biz_messageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_messageMapper {
    int countByExample(biz_messageExample example);

    int deleteByExample(biz_messageExample example);

    int deleteByPrimaryKey(Integer messageid);

    int insert(biz_message record);

    int insertSelective(biz_message record);

    List<biz_message> selectByExampleWithBLOBs(biz_messageExample example);

    List<biz_message> selectByExample(biz_messageExample example);

    biz_message selectByPrimaryKey(Integer messageid);

    int updateByExampleSelective(@Param("record") biz_message record, @Param("example") biz_messageExample example);

    int updateByExampleWithBLOBs(@Param("record") biz_message record, @Param("example") biz_messageExample example);

    int updateByExample(@Param("record") biz_message record, @Param("example") biz_messageExample example);

    int updateByPrimaryKeySelective(biz_message record);

    int updateByPrimaryKeyWithBLOBs(biz_message record);

    int updateByPrimaryKey(biz_message record);
}