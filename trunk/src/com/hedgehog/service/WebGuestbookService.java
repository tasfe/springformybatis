package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_guestbook;

public interface WebGuestbookService {
	
	int deleteByPrimaryKey(Integer guestbookid);
	int insertSelective(web_guestbook record);
	web_guestbook selectByPrimaryKey(Integer guestbookid);
	int updateByPrimaryKeySelective(web_guestbook record);
	List<web_guestbook> selectwebGuestbookInPager(QueryParam qp);

}
