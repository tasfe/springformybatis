package com.hedgehog.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.hedgehog.Utils.PageSupport;
import com.hedgehog.Utils.QueryPara;
import com.hedgehog.domain.ProNew;
import com.hedgehog.domain.QueryParam;

@Transactional
public interface NewsService {	
	List<ProNew> getNewsList();
	void updateNews(ProNew md);	
	ProNew getNews(String newsid);	
	void deleteNews(String newsid);
	void addNews(ProNew news);
	List<ProNew> selectNewsInPager(QueryParam qp);
	
}
