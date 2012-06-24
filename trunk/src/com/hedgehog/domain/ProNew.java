package com.hedgehog.domain;
// Generated 2011-10-18 23:30:49 by Hibernate Tools 3.2.2.GA


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class ProNew implements java.io.Serializable{


 
     private Integer NewsID;

     private Integer News_NesortID;
     
     
     @Size(min=1, max=200, message="标题不能为空")
     private String News_Title;
     
     @NotNull(message="laiyuan not null")
     private String News_From;

     private String News_Summery;

     private String News_Content;

     private Integer News_Hits;

     private Timestamp News_UpdateTime;

     private String News_Keywords;

     private String News_Tempstr;

     private Integer News_Tempint;

	public Integer getNewsID() {
		return NewsID;
	}

	public void setNewsID(Integer newsID) {
		NewsID = newsID;
	}

	public Integer getNews_NesortID() {
		return News_NesortID;
	}

	public void setNews_NesortID(Integer news_NesortID) {
		News_NesortID = news_NesortID;
	}
	@NotNull(message="title not null")     
	public String getNews_Title() {
		return News_Title;
	}

	public void setNews_Title(String news_Title) {
		News_Title = news_Title;
	}

	public String getNews_From() {
		return News_From;
	}

	public void setNews_From(String news_From) {
		News_From = news_From;
	}

	public String getNews_Summery() {
		return News_Summery;
	}

	public void setNews_Summery(String news_Summery) {
		News_Summery = news_Summery;
	}

	public String getNews_Content() {
		return News_Content;
	}

	public void setNews_Content(String news_Content) {
		News_Content = news_Content;
	}

	public Integer getNews_Hits() {
		return News_Hits;
	}

	public void setNews_Hits(Integer news_Hits) {
		News_Hits = news_Hits;
	}

	public Timestamp getNews_UpdateTime() {
		return News_UpdateTime;
	}

	public void setNews_UpdateTime(Timestamp news_UpdateTime) {
		News_UpdateTime = news_UpdateTime;
	}

	public String getNews_Keywords() {
		return News_Keywords;
	}

	public void setNews_Keywords(String news_Keywords) {
		News_Keywords = news_Keywords;
	}

	public String getNews_Tempstr() {
		return News_Tempstr;
	}

	public void setNews_Tempstr(String news_Tempstr) {
		News_Tempstr = news_Tempstr;
	}

	public Integer getNews_Tempint() {
		return News_Tempint;
	}

	public void setNews_Tempint(Integer news_Tempint) {
		News_Tempint = news_Tempint;
	}

     

}


