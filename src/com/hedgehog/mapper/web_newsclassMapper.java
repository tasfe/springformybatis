package com.hedgehog.mapper;

import com.hedgehog.domain.web_newsclass;
import com.hedgehog.domain.web_newsclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_newsclassMapper {
    int countByExample(web_newsclassExample example);

    int deleteByExample(web_newsclassExample example);

    int deleteByPrimaryKey(Integer newsclassid);

    int insert(web_newsclass record);

    int insertSelective(web_newsclass record);

    List<web_newsclass> selectByExample(web_newsclassExample example);
    
    List<web_newsclass> selectByMenuID(Integer ncMenuid);

    web_newsclass selectByPrimaryKey(Integer newsclassid);

    int updateByExampleSelective(@Param("record") web_newsclass record, @Param("example") web_newsclassExample example);

    int updateByExample(@Param("record") web_newsclass record, @Param("example") web_newsclassExample example);

    int updateByPrimaryKeySelective(web_newsclass record);

    int updateByPrimaryKey(web_newsclass record);
}