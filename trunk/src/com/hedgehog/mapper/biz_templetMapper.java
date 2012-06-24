package com.hedgehog.mapper;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_templet;
import com.hedgehog.domain.biz_templetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_templetMapper {
    int countByExample(biz_templetExample example);

    int deleteByExample(biz_templetExample example);

    int deleteByPrimaryKey(Integer templetid);

    int insert(biz_templet record);

    int insertSelective(biz_templet record);

    List<biz_templet> selectByExample(biz_templetExample example);

    biz_templet selectByPrimaryKey(Integer templetid);

    int updateByExampleSelective(@Param("record") biz_templet record, @Param("example") biz_templetExample example);

    int updateByExample(@Param("record") biz_templet record, @Param("example") biz_templetExample example);

    int updateByPrimaryKeySelective(biz_templet record);

    int updateByPrimaryKey(biz_templet record);
    List<biz_templet> selectRecordInPager(QueryParam qp);
    
    biz_templet selectByCode(String templetCode);
}