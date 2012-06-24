package com.hedgehog.mapper;

import com.hedgehog.domain.web_limit;
import com.hedgehog.domain.web_limitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_limitMapper {
    int countByExample(web_limitExample example);

    int deleteByExample(web_limitExample example);

    int insert(web_limit record);

    int insertSelective(web_limit record);

    List<web_limit> selectByExample(web_limitExample example);

    int updateByExampleSelective(@Param("record") web_limit record, @Param("example") web_limitExample example);

    int updateByExample(@Param("record") web_limit record, @Param("example") web_limitExample example);
}