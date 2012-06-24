package com.hedgehog.mapper;

import com.hedgehog.domain.biz_attrib;
import com.hedgehog.domain.biz_attribExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_attribMapper {
    int countByExample(biz_attribExample example);

    int deleteByExample(biz_attribExample example);

    int deleteByPrimaryKey(Integer attribid);

    int insert(biz_attrib record);

    int insertSelective(biz_attrib record);

    List<biz_attrib> selectByExample(biz_attribExample example);

    biz_attrib selectByPrimaryKey(Integer attribid);

    int updateByExampleSelective(@Param("record") biz_attrib record, @Param("example") biz_attribExample example);

    int updateByExample(@Param("record") biz_attrib record, @Param("example") biz_attribExample example);

    int updateByPrimaryKeySelective(biz_attrib record);

    int updateByPrimaryKey(biz_attrib record);
}