package com.hedgehog.mapper;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_commoninfo;
import com.hedgehog.domain.web_commoninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_commoninfoMapper {
    int countByExample(web_commoninfoExample example);

    int deleteByExample(web_commoninfoExample example);

    int deleteByPrimaryKey(Integer commoninfoid);

    int insert(web_commoninfo record);

    int insertSelective(web_commoninfo record);

    List<web_commoninfo> selectByExampleWithBLOBs(web_commoninfoExample example);

    List<web_commoninfo> selectByExample(web_commoninfoExample example);

    web_commoninfo selectByPrimaryKey(Integer commoninfoid);

    int updateByExampleSelective(@Param("record") web_commoninfo record, @Param("example") web_commoninfoExample example);

    int updateByExampleWithBLOBs(@Param("record") web_commoninfo record, @Param("example") web_commoninfoExample example);

    int updateByExample(@Param("record") web_commoninfo record, @Param("example") web_commoninfoExample example);

    int updateByPrimaryKeySelective(web_commoninfo record);

    int updateByPrimaryKeyWithBLOBs(web_commoninfo record);

    int updateByPrimaryKey(web_commoninfo record);
    
    List<web_commoninfo> selectWebCommoninfoInPager(QueryParam qp);	
}