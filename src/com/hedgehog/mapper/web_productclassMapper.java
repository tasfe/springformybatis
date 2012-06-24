package com.hedgehog.mapper;

import com.hedgehog.domain.web_productclass;
import com.hedgehog.domain.web_productclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_productclassMapper {
    int countByExample(web_productclassExample example);

    int deleteByExample(web_productclassExample example);

    int deleteByPrimaryKey(Integer pcid);

    int insert(web_productclass record);

    int insertSelective(web_productclass record);

    List<web_productclass> selectByExample(web_productclassExample example);
    List<web_productclass> selectByMenuID(Integer pcMenuid);

    web_productclass selectByPrimaryKey(Integer pcid);

    int updateByExampleSelective(@Param("record") web_productclass record, @Param("example") web_productclassExample example);

    int updateByExample(@Param("record") web_productclass record, @Param("example") web_productclassExample example);

    int updateByPrimaryKeySelective(web_productclass record);

    int updateByPrimaryKey(web_productclass record);
}