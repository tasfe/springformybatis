package com.hedgehog.mapper;

import com.hedgehog.domain.web_freeweb;
import com.hedgehog.domain.web_freewebExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_freewebMapper {
    int countByExample(web_freewebExample example);

    int deleteByExample(web_freewebExample example);

    int deleteByPrimaryKey(Integer freewebid);

    int insert(web_freeweb record);

    int insertSelective(web_freeweb record);

    List<web_freeweb> selectByExampleWithBLOBs(web_freewebExample example);

    List<web_freeweb> selectByExample(web_freewebExample example);

    web_freeweb selectByPrimaryKey(Integer freewebid);

    int updateByExampleSelective(@Param("record") web_freeweb record, @Param("example") web_freewebExample example);

    int updateByExampleWithBLOBs(@Param("record") web_freeweb record, @Param("example") web_freewebExample example);

    int updateByExample(@Param("record") web_freeweb record, @Param("example") web_freewebExample example);

    int updateByPrimaryKeySelective(web_freeweb record);

    int updateByPrimaryKeyWithBLOBs(web_freeweb record);

    int updateByPrimaryKey(web_freeweb record);
    
    web_freeweb selectByMenuid(Integer menuid);
}