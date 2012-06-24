package com.hedgehog.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.ProNew;
import com.hedgehog.domain.QueryParam;
import com.hedgehog.mapper.NewsMapper;

@Service("newsService")
public class NewsServiceMapperImpl implements NewsService{

	private NewsMapper newsMapper;

    @Autowired
    public void setNewsMapper(NewsMapper newsMapper) {
        this.newsMapper = newsMapper;
    }
	public ProNew getNews(String newsid) {
		// TODO Auto-generated method stub
		return this.newsMapper.getNews(newsid);
	}

	public List<ProNew> getNewsList() {
		// TODO Auto-generated method stub
		return this.newsMapper.getNewsList();
	}
	public void addNews(ProNew news) {
		// TODO Auto-generated method stub
		this.newsMapper.addNews(news);
		
	}
	public void updateNews(ProNew md) {
		// TODO Auto-generated method stub
		
		this.newsMapper.updateNews(md);
	}
	public void deleteNews(String newsid) {
		// TODO Auto-generated method stub
		this.newsMapper.deleteNews(newsid);
		
	}
	public List<ProNew> selectNewsInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.newsMapper.selectNewsInPager(qp);
	}
	

}
