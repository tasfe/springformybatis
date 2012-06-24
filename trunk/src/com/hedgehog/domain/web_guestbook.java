package com.hedgehog.domain;

import java.util.Date;

import javax.validation.constraints.Size;

public class web_guestbook {
    private Integer guestbookid;
    @Size(min=1, max=200, message="昵称不能为空")
    private String gbNikename;
    @Size(min=1, max=600, message="留言内容不能为空")
    private String gbContent;

    private Date gbDatetime;

    private String gbClientip;

    private Integer gbMenuid;
    
    @Size(min=1, max=50, message="验证码不能为空")
    private String checkcode;

    public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	public Integer getGuestbookid() {
        return guestbookid;
    }

    public void setGuestbookid(Integer guestbookid) {
        this.guestbookid = guestbookid;
    }

    public String getGbNikename() {
        return gbNikename;
    }

    public void setGbNikename(String gbNikename) {
        this.gbNikename = gbNikename;
    }

    public String getGbContent() {
        return gbContent;
    }

    public void setGbContent(String gbContent) {
        this.gbContent = gbContent;
    }

    public Date getGbDatetime() {
        return gbDatetime;
    }

    public void setGbDatetime(Date gbDatetime) {
        this.gbDatetime = gbDatetime;
    }

    public String getGbClientip() {
        return gbClientip;
    }

    public void setGbClientip(String gbClientip) {
        this.gbClientip = gbClientip;
    }

    public Integer getGbMenuid() {
        return gbMenuid;
    }

    public void setGbMenuid(Integer gbMenuid) {
        this.gbMenuid = gbMenuid;
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
        web_guestbook other = (web_guestbook) that;
        return (this.getGuestbookid() == null ? other.getGuestbookid() == null : this.getGuestbookid().equals(other.getGuestbookid()))
            && (this.getGbNikename() == null ? other.getGbNikename() == null : this.getGbNikename().equals(other.getGbNikename()))
            && (this.getGbContent() == null ? other.getGbContent() == null : this.getGbContent().equals(other.getGbContent()))
            && (this.getGbDatetime() == null ? other.getGbDatetime() == null : this.getGbDatetime().equals(other.getGbDatetime()))
            && (this.getGbClientip() == null ? other.getGbClientip() == null : this.getGbClientip().equals(other.getGbClientip()))
            && (this.getGbMenuid() == null ? other.getGbMenuid() == null : this.getGbMenuid().equals(other.getGbMenuid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGuestbookid() == null) ? 0 : getGuestbookid().hashCode());
        result = prime * result + ((getGbNikename() == null) ? 0 : getGbNikename().hashCode());
        result = prime * result + ((getGbContent() == null) ? 0 : getGbContent().hashCode());
        result = prime * result + ((getGbDatetime() == null) ? 0 : getGbDatetime().hashCode());
        result = prime * result + ((getGbClientip() == null) ? 0 : getGbClientip().hashCode());
        result = prime * result + ((getGbMenuid() == null) ? 0 : getGbMenuid().hashCode());
        return result;
    }
}