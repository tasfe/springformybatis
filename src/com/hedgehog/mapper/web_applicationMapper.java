package com.hedgehog.mapper;

import com.hedgehog.domain.web_application;
import com.hedgehog.domain.web_applicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_applicationMapper {
    int countByExample(web_applicationExample example);

    int deleteByExample(web_applicationExample example);

    int deleteByPrimaryKey(Integer appid);

    int insert(web_application record);

    int insertSelective(web_application record);

    List<web_application> selectByExample(web_applicationExample example);

    web_application selectByPrimaryKey(Integer appid);

    int updateByExampleSelective(@Param("record") web_application record, @Param("example") web_applicationExample example);

    int updateByExample(@Param("record") web_application record, @Param("example") web_applicationExample example);

    int updateByPrimaryKeySelective(web_application record);

    int updateByPrimaryKey(web_application record);
}