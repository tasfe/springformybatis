package com.hedgehog.mapper;

import com.hedgehog.domain.biz_templet_class;
import com.hedgehog.domain.biz_templet_classExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_templet_classMapper {
    int countByExample(biz_templet_classExample example);

    int deleteByExample(biz_templet_classExample example);

    int deleteByPrimaryKey(Integer tcid);

    int insert(biz_templet_class record);

    int insertSelective(biz_templet_class record);

    List<biz_templet_class> selectByExample(biz_templet_classExample example);

    biz_templet_class selectByPrimaryKey(Integer tcid);
    
    List<biz_templet_class> selectTempletclassAllRecord();
    
    biz_templet_class selectTempletclassByArray(Integer arraylist);

    int updateByExampleSelective(@Param("record") biz_templet_class record, @Param("example") biz_templet_classExample example);

    int updateByExample(@Param("record") biz_templet_class record, @Param("example") biz_templet_classExample example);

    int updateByPrimaryKeySelective(biz_templet_class record);

    int updateByPrimaryKey(biz_templet_class record);
}