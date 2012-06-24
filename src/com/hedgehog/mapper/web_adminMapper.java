package com.hedgehog.mapper;

import com.hedgehog.domain.web_admin;
import com.hedgehog.domain.web_adminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_adminMapper {
    int countByExample(web_adminExample example);

    int deleteByExample(web_adminExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(web_admin record);

    int insertSelective(web_admin record);

    List<web_admin> selectByExample(web_adminExample example);

    web_admin selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") web_admin record, @Param("example") web_adminExample example);

    int updateByExample(@Param("record") web_admin record, @Param("example") web_adminExample example);

    int updateByPrimaryKeySelective(web_admin record);

    int updateByPrimaryKey(web_admin record);
}