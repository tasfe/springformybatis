package com.hedgehog.mapper;

import com.hedgehog.domain.web_ad;
import com.hedgehog.domain.web_adExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_adMapper {
    int countByExample(web_adExample example);

    int deleteByExample(web_adExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(web_ad record);

    int insertSelective(web_ad record);

    List<web_ad> selectByExampleWithBLOBs(web_adExample example);

    List<web_ad> selectByExample(web_adExample example);

    web_ad selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") web_ad record, @Param("example") web_adExample example);

    int updateByExampleWithBLOBs(@Param("record") web_ad record, @Param("example") web_adExample example);

    int updateByExample(@Param("record") web_ad record, @Param("example") web_adExample example);

    int updateByPrimaryKeySelective(web_ad record);

    int updateByPrimaryKeyWithBLOBs(web_ad record);

    int updateByPrimaryKey(web_ad record);
}