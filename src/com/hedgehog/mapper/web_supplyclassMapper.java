package com.hedgehog.mapper;

import com.hedgehog.domain.web_supplyclass;
import com.hedgehog.domain.web_supplyclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_supplyclassMapper {
    int countByExample(web_supplyclassExample example);

    int deleteByExample(web_supplyclassExample example);

    int deleteByPrimaryKey(Integer scid);

    int insert(web_supplyclass record);

    int insertSelective(web_supplyclass record);

    List<web_supplyclass> selectByExample(web_supplyclassExample example);
    
    List<web_supplyclass> selectByMenuID(Integer scMenuid);

    web_supplyclass selectByPrimaryKey(Integer scid);

    int updateByExampleSelective(@Param("record") web_supplyclass record, @Param("example") web_supplyclassExample example);

    int updateByExample(@Param("record") web_supplyclass record, @Param("example") web_supplyclassExample example);

    int updateByPrimaryKeySelective(web_supplyclass record);

    int updateByPrimaryKey(web_supplyclass record);
}