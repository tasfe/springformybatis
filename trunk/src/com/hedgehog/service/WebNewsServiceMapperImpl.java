package com.hedgehog.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_news;
import com.hedgehog.domain.web_newsclass;
import com.hedgehog.mapper.web_newsMapper;
import com.hedgehog.mapper.web_newsclassMapper;

@Service("webNewsService")
public class WebNewsServiceMapperImpl implements WebNewsService{
	
	private static final Log log = LogFactory.getLog(WebNewsService.class);
	private web_newsclassMapper newsclassMapper;
	
	@Autowired
	public void setNewsclassMapper(web_newsclassMapper newsclassMapper) {
		this.newsclassMapper = newsclassMapper;
	}

	public List<web_newsclass> selectByMenuID(Integer ncMenuid) {
		// TODO Auto-generated method stub
		return this.newsclassMapper.selectByMenuID(ncMenuid);
	}

	public int insertSelective(web_newsclass record) {
		// TODO Auto-generated method stub
		return this.newsclassMapper.insertSelective(record);
	}

	public web_newsclass selectByPrimaryKey(Integer newsclassid) {
		// TODO Auto-generated method stub
		return this.newsclassMapper.selectByPrimaryKey(newsclassid);
	}

	public int updateByPrimaryKeySelective(web_newsclass record) {
		// TODO Auto-generated method stub
		log.info("执行类别更新方法:"+record.getNewsclassid()+record.getNcName());
		return this.newsclassMapper.updateByPrimaryKeySelective(record);
	}

	public int deleteByPrimaryKey(Integer newsclassid) {
		// TODO Auto-generated method stub
		return this.newsclassMapper.deleteByPrimaryKey(newsclassid);
	}
	
	private web_newsMapper newsMapper;
	
	@Autowired
	public void setNewsMapper(web_newsMapper newsMapper) {
		this.newsMapper = newsMapper;
	}

	public int deleteNewsByPrimaryKey(Integer newsid) {
		// TODO Auto-generated method stub
		return this.newsMapper.deleteByPrimaryKey(newsid);
	}

	public int insertNewsSelective(web_news record) {
		// TODO Auto-generated method stub
		return this.newsMapper.insertSelective(record);
	}

	public web_news selectNewsByPrimaryKey(Integer newsid) {
		// TODO Auto-generated method stub
		return this.newsMapper.selectByPrimaryKey(newsid);
	}

	public List<web_news> selectWebNewsInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.newsMapper.selectWebNewsInPager(qp);
	}

	public int updateNewsByPrimaryKeySelective(web_news record) {
		// TODO Auto-generated method stub
		return this.newsMapper.updateByPrimaryKeySelective(record);
	}

	public int selectCountByClass(Integer classid) {
		// TODO Auto-generated method stub
		return this.newsMapper.selectCountByClass(classid);
	}

	

	

}
