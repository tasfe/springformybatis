package com.hedgehog.mapper;

import com.hedgehog.domain.ProNew;
import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_news;
import com.hedgehog.domain.web_newsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_newsMapper {
    int countByExample(web_newsExample example);

    int deleteByExample(web_newsExample example);

    int deleteByPrimaryKey(Integer newsid);

    int insert(web_news record);

    int insertSelective(web_news record);

    List<web_news> selectByExampleWithBLOBs(web_newsExample example);

    List<web_news> selectByExample(web_newsExample example);

    web_news selectByPrimaryKey(Integer newsid);

    int updateByExampleSelective(@Param("record") web_news record, @Param("example") web_newsExample example);

    int updateByExampleWithBLOBs(@Param("record") web_news record, @Param("example") web_newsExample example);

    int updateByExample(@Param("record") web_news record, @Param("example") web_newsExample example);

    int updateByPrimaryKeySelective(web_news record);

    int updateByPrimaryKeyWithBLOBs(web_news record);

    int updateByPrimaryKey(web_news record);
    
    List<web_news> selectWebNewsInPager(QueryParam qp);
    
    int selectCountByClass(Integer classid);
}