package com.hedgehog.mapper;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_classinfo;
import com.hedgehog.domain.biz_classinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_classinfoMapper {
    int countByExample(biz_classinfoExample example);

    int deleteByExample(biz_classinfoExample example);

    int deleteByPrimaryKey(Integer classinfoid);

    int insert(biz_classinfo record);

    int insertSelective(biz_classinfo record);

    List<biz_classinfo> selectByExample(biz_classinfoExample example);

    biz_classinfo selectByPrimaryKey(Integer classinfoid);

    int updateByExampleSelective(@Param("record") biz_classinfo record, @Param("example") biz_classinfoExample example);

    int updateByExample(@Param("record") biz_classinfo record, @Param("example") biz_classinfoExample example);

    int updateByPrimaryKeySelective(biz_classinfo record);

    int updateByPrimaryKey(biz_classinfo record);
    
    List<biz_classinfo> selectRecordInPager(QueryParam qp);
}