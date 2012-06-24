package com.hedgehog.mapper;

import com.hedgehog.domain.web_contract;
import com.hedgehog.domain.web_contractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_contractMapper {
    int countByExample(web_contractExample example);

    int deleteByExample(web_contractExample example);

    int insert(web_contract record);

    int insertSelective(web_contract record);

    List<web_contract> selectByExampleWithBLOBs(web_contractExample example);

    List<web_contract> selectByExample(web_contractExample example);

    int updateByExampleSelective(@Param("record") web_contract record, @Param("example") web_contractExample example);

    int updateByExampleWithBLOBs(@Param("record") web_contract record, @Param("example") web_contractExample example);

    int updateByExample(@Param("record") web_contract record, @Param("example") web_contractExample example);
}