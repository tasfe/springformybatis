package com.hedgehog.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class web_news {
    private Integer newsid;

    @Size(min=1, max=200, message="标题不能为空")
    private String newsTitle;

    @NotNull(message="请选择类别")
	@NumberFormat(style = Style.NUMBER)
    private Integer newsClass;

    private String newsSource;

    private String newsProperties;
    
    private String[] newsFlag;

    private String newsSummery;

    private String newsKeywords;

    private Integer newsHits;

    private Date newsUpdatetime;

    private Integer newsMenuid;

    @Size(min=1, message="内容不能为空")
    private String newsContent;
    
    private web_newsclass newsclass;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public Integer getNewsClass() {
        return newsClass;
    }

    public void setNewsClass(Integer newsClass) {
        this.newsClass = newsClass;
    }

    public String getNewsSource() {
        return newsSource;
    }

    public void setNewsSource(String newsSource) {
        this.newsSource = newsSource;
    }

    public String getNewsProperties() {
        return newsProperties;
    }

    public void setNewsProperties(String newsProperties) {
        this.newsProperties = newsProperties;
    }

    public String getNewsSummery() {
        return newsSummery;
    }

    public void setNewsSummery(String newsSummery) {
        this.newsSummery = newsSummery;
    }

    public String getNewsKeywords() {
        return newsKeywords;
    }

    public void setNewsKeywords(String newsKeywords) {
        this.newsKeywords = newsKeywords;
    }

    public Integer getNewsHits() {
        return newsHits;
    }

    public void setNewsHits(Integer newsHits) {
        this.newsHits = newsHits;
    }

    public Date getNewsUpdatetime() {
        return newsUpdatetime;
    }

    public void setNewsUpdatetime(Date newsUpdatetime) {
        this.newsUpdatetime = newsUpdatetime;
    }

    public Integer getNewsMenuid() {
        return newsMenuid;
    }

    public void setNewsMenuid(Integer newsMenuid) {
        this.newsMenuid = newsMenuid;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        web_news other = (web_news) that;
        return (this.getNewsid() == null ? other.getNewsid() == null : this.getNewsid().equals(other.getNewsid()))
            && (this.getNewsTitle() == null ? other.getNewsTitle() == null : this.getNewsTitle().equals(other.getNewsTitle()))
            && (this.getNewsClass() == null ? other.getNewsClass() == null : this.getNewsClass().equals(other.getNewsClass()))
            && (this.getNewsSource() == null ? other.getNewsSource() == null : this.getNewsSource().equals(other.getNewsSource()))
            && (this.getNewsProperties() == null ? other.getNewsProperties() == null : this.getNewsProperties().equals(other.getNewsProperties()))
            && (this.getNewsSummery() == null ? other.getNewsSummery() == null : this.getNewsSummery().equals(other.getNewsSummery()))
            && (this.getNewsKeywords() == null ? other.getNewsKeywords() == null : this.getNewsKeywords().equals(other.getNewsKeywords()))
            && (this.getNewsHits() == null ? other.getNewsHits() == null : this.getNewsHits().equals(other.getNewsHits()))
            && (this.getNewsUpdatetime() == null ? other.getNewsUpdatetime() == null : this.getNewsUpdatetime().equals(other.getNewsUpdatetime()))
            && (this.getNewsMenuid() == null ? other.getNewsMenuid() == null : this.getNewsMenuid().equals(other.getNewsMenuid()))
            && (this.getNewsContent() == null ? other.getNewsContent() == null : this.getNewsContent().equals(other.getNewsContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNewsid() == null) ? 0 : getNewsid().hashCode());
        result = prime * result + ((getNewsTitle() == null) ? 0 : getNewsTitle().hashCode());
        result = prime * result + ((getNewsClass() == null) ? 0 : getNewsClass().hashCode());
        result = prime * result + ((getNewsSource() == null) ? 0 : getNewsSource().hashCode());
        result = prime * result + ((getNewsProperties() == null) ? 0 : getNewsProperties().hashCode());
        result = prime * result + ((getNewsSummery() == null) ? 0 : getNewsSummery().hashCode());
        result = prime * result + ((getNewsKeywords() == null) ? 0 : getNewsKeywords().hashCode());
        result = prime * result + ((getNewsHits() == null) ? 0 : getNewsHits().hashCode());
        result = prime * result + ((getNewsUpdatetime() == null) ? 0 : getNewsUpdatetime().hashCode());
        result = prime * result + ((getNewsMenuid() == null) ? 0 : getNewsMenuid().hashCode());
        result = prime * result + ((getNewsContent() == null) ? 0 : getNewsContent().hashCode());
        return result;
    }

	public web_newsclass getNewsclass() {
		return newsclass;
	}

	public void setNewsclass(web_newsclass newsclass) {
		this.newsclass = newsclass;
	}

//	public String[] getNewsFlag() {
//		return newsFlag;
//	}
//
//	public void setNewsFlag(String[] newsFlag) {
//		this.newsFlag = newsFlag;
//	}

	public String[] getNewsFlag() {
		if(this.newsProperties!=null)
		{
				return this.newsProperties.split(",");
		}
		return null;
	}

	public void setNewsFlag(String[] newsFlag) {
		//this.newsFlag = newsFlag;
		//System.out.println("设置属性值:"+newsFlag);
		if(newsFlag!=null)
		{
			if(newsFlag.length>0)
			{
				//this.newsProperties=newsFlag.toString();
				StringBuffer buf  = new StringBuffer();
				for(String str:newsFlag)
					{
						//System.out.println(str);
						buf.append(str+",");
					}
				String oldStr=buf.toString();
				if(oldStr!="")
				{
					this.newsProperties=oldStr.substring(0,oldStr.length() - 1); 
				}
				
			}
			
			
		}
		
	}
}