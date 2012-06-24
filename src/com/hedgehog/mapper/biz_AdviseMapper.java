package com.hedgehog.mapper;

import com.hedgehog.domain.biz_Advise;
import com.hedgehog.domain.biz_AdviseExample;
import com.hedgehog.domain.biz_AdviseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_AdviseMapper {
    int countByExample(biz_AdviseExample example);

    int deleteByExample(biz_AdviseExample example);

    int deleteByPrimaryKey(Integer adviseid);

    int insert(biz_AdviseWithBLOBs record);

    int insertSelective(biz_AdviseWithBLOBs record);

    List<biz_AdviseWithBLOBs> selectByExampleWithBLOBs(biz_AdviseExample example);

    List<biz_Advise> selectByExample(biz_AdviseExample example);

    biz_AdviseWithBLOBs selectByPrimaryKey(Integer adviseid);

    int updateByExampleSelective(@Param("record") biz_AdviseWithBLOBs record, @Param("example") biz_AdviseExample example);

    int updateByExampleWithBLOBs(@Param("record") biz_AdviseWithBLOBs record, @Param("example") biz_AdviseExample example);

    int updateByExample(@Param("record") biz_Advise record, @Param("example") biz_AdviseExample example);

    int updateByPrimaryKeySelective(biz_AdviseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(biz_AdviseWithBLOBs record);

    int updateByPrimaryKey(biz_Advise record);
}