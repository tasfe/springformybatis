package com.hedgehog.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.hedgehog.domain.ProNew;
import com.hedgehog.domain.QueryParam;

public interface NewsMapper {
	//PageSupport getListForPage(final QueryPara qp)throws DataAccessException;
	List<ProNew> getNewsList();
	//void updateNews(final ProNew md);
	void updateNews(ProNew md);
	ProNew getNews(String newsid);	
	void deleteNews(String newsid);
	void addNews(ProNew news);
//	List<ProNew> selectNewsInPager(Map<String, Object> hm);
	List<ProNew> selectNewsInPager(QueryParam qp);
	

}
