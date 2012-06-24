package com.hedgehog.mapper;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_commoninfo;
import com.hedgehog.domain.web_guestbook;
import com.hedgehog.domain.web_guestbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_guestbookMapper {
    int countByExample(web_guestbookExample example);

    int deleteByExample(web_guestbookExample example);

    int deleteByPrimaryKey(Integer guestbookid);

    int insert(web_guestbook record);

    int insertSelective(web_guestbook record);

    List<web_guestbook> selectByExample(web_guestbookExample example);

    web_guestbook selectByPrimaryKey(Integer guestbookid);

    int updateByExampleSelective(@Param("record") web_guestbook record, @Param("example") web_guestbookExample example);

    int updateByExample(@Param("record") web_guestbook record, @Param("example") web_guestbookExample example);

    int updateByPrimaryKeySelective(web_guestbook record);

    int updateByPrimaryKey(web_guestbook record);
    
    List<web_guestbook> selectwebGuestbookInPager(QueryParam qp);	
}