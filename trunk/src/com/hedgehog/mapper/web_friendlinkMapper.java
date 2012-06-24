package com.hedgehog.mapper;

import com.hedgehog.domain.web_friendlink;
import com.hedgehog.domain.web_friendlinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_friendlinkMapper {
    int countByExample(web_friendlinkExample example);

    int deleteByExample(web_friendlinkExample example);

    int deleteByPrimaryKey(Integer friendlinkId);

    int insert(web_friendlink record);

    int insertSelective(web_friendlink record);

    List<web_friendlink> selectByExample(web_friendlinkExample example);

    web_friendlink selectByPrimaryKey(Integer friendlinkId);

    int updateByExampleSelective(@Param("record") web_friendlink record, @Param("example") web_friendlinkExample example);

    int updateByExample(@Param("record") web_friendlink record, @Param("example") web_friendlinkExample example);

    int updateByPrimaryKeySelective(web_friendlink record);

    int updateByPrimaryKey(web_friendlink record);
    
    List<web_friendlink> selectAllRecord();
    List<web_friendlink> selectRecordByWebsiteid(Integer friendlinkMenuid);
}