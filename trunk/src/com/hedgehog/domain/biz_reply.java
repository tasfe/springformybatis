package com.hedgehog.domain;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class biz_reply {
    private Integer replyid;

    private Integer replyInfoid;

    private String replyNikename;
    @Email(message="邮箱格式不正确")
    private String replyEmail;

    private Date replyDatetime;

    private String replyClientip;
    @Size(min=1, message="回复内容不能为空")
    private String replyContent;
    
    private biz_classinfo classinfo;

    public Integer getReplyid() {
        return replyid;
    }

    public void setReplyid(Integer replyid) {
        this.replyid = replyid;
    }

    public Integer getReplyInfoid() {
        return replyInfoid;
    }

    public void setReplyInfoid(Integer replyInfoid) {
        this.replyInfoid = replyInfoid;
    }

    public String getReplyNikename() {
        return replyNikename;
    }

    public void setReplyNikename(String replyNikename) {
        this.replyNikename = replyNikename;
    }

    public String getReplyEmail() {
        return replyEmail;
    }

    public void setReplyEmail(String replyEmail) {
        this.replyEmail = replyEmail;
    }

    public Date getReplyDatetime() {
        return replyDatetime;
    }

    public void setReplyDatetime(Date replyDatetime) {
        this.replyDatetime = replyDatetime;
    }

    public String getReplyClientip() {
        return replyClientip;
    }

    public void setReplyClientip(String replyClientip) {
        this.replyClientip = replyClientip;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
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
        biz_reply other = (biz_reply) that;
        return (this.getReplyid() == null ? other.getReplyid() == null : this.getReplyid().equals(other.getReplyid()))
            && (this.getReplyInfoid() == null ? other.getReplyInfoid() == null : this.getReplyInfoid().equals(other.getReplyInfoid()))
            && (this.getReplyNikename() == null ? other.getReplyNikename() == null : this.getReplyNikename().equals(other.getReplyNikename()))
            && (this.getReplyEmail() == null ? other.getReplyEmail() == null : this.getReplyEmail().equals(other.getReplyEmail()))
            && (this.getReplyDatetime() == null ? other.getReplyDatetime() == null : this.getReplyDatetime().equals(other.getReplyDatetime()))
            && (this.getReplyClientip() == null ? other.getReplyClientip() == null : this.getReplyClientip().equals(other.getReplyClientip()))
            && (this.getReplyContent() == null ? other.getReplyContent() == null : this.getReplyContent().equals(other.getReplyContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReplyid() == null) ? 0 : getReplyid().hashCode());
        result = prime * result + ((getReplyInfoid() == null) ? 0 : getReplyInfoid().hashCode());
        result = prime * result + ((getReplyNikename() == null) ? 0 : getReplyNikename().hashCode());
        result = prime * result + ((getReplyEmail() == null) ? 0 : getReplyEmail().hashCode());
        result = prime * result + ((getReplyDatetime() == null) ? 0 : getReplyDatetime().hashCode());
        result = prime * result + ((getReplyClientip() == null) ? 0 : getReplyClientip().hashCode());
        result = prime * result + ((getReplyContent() == null) ? 0 : getReplyContent().hashCode());
        return result;
    }

	public biz_classinfo getClassinfo() {
		return classinfo;
	}

	public void setClassinfo(biz_classinfo classinfo) {
		this.classinfo = classinfo;
	}
}