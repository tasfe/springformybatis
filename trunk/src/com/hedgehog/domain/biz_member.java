package com.hedgehog.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class biz_member implements Serializable{
    private Integer memberid;
    
    @Size(min=1, max=100, message="用户名不能为空")
    @Pattern(regexp="^[0-9a-zA-Z]*$",message="用户名必须为字母或数字")
    private String memberName;
    
    
    @Size(min=1, max=100, message="密码不能为空")
    private String memberPwd;
    
    
    @Size(min=1, max=100, message="真实姓名不能为空")
    private String memberRealname;
    
    
    @Size(min=1, max=100, message="联系电话不能为空")
    private String memberTel;

    private String memberCname;

    private String memberQq;

    @Email(message="邮箱格式不正确")
    private String memberEmail;

    private Integer memberRank;

    private Date memberRegdate;

    private Byte memberLock;

    private Date memberExpire;

    private Integer memberAgentname;

    private Date memberLandlogin;

    private String memberLanguage;

    private String memberLamu;

    private Integer memberLamucount;

    private String memberTemplet;

    private BigDecimal memberMoney;

    private BigDecimal memberWebprice;

    private String memberWebserver;

    private String memberAdminserver;

    private Byte memberTplock;
    
    private biz_website website;
    
    private Integer memberPrank;
    
    private biz_rank rank;
    
    public biz_rank getRank() {
		return rank;
	}

	public void setRank(biz_rank rank) {
		this.rank = rank;
	}

	public Integer getMemberPrank() {
        return memberPrank;
    }

    public void setMemberPrank(Integer memberPrank) {
        this.memberPrank = memberPrank;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public String getMemberRealname() {
        return memberRealname;
    }

    public void setMemberRealname(String memberRealname) {
        this.memberRealname = memberRealname;
    }

    public String getMemberTel() {
        return memberTel;
    }

    public void setMemberTel(String memberTel) {
        this.memberTel = memberTel;
    }

    public String getMemberCname() {
        return memberCname;
    }

    public void setMemberCname(String memberCname) {
        this.memberCname = memberCname;
    }

    public String getMemberQq() {
        return memberQq;
    }

    public void setMemberQq(String memberQq) {
        this.memberQq = memberQq;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public Integer getMemberRank() {
        return memberRank;
    }

    public void setMemberRank(Integer memberRank) {
        this.memberRank = memberRank;
    }

    public Date getMemberRegdate() {
        return memberRegdate;
    }

    public void setMemberRegdate(Date memberRegdate) {
        this.memberRegdate = memberRegdate;
    }

    public Byte getMemberLock() {
        return memberLock;
    }

    public void setMemberLock(Byte memberLock) {
        this.memberLock = memberLock;
    }

    public Date getMemberExpire() {
        return memberExpire;
    }

    public void setMemberExpire(Date memberExpire) {
        this.memberExpire = memberExpire;
    }

    public Integer getMemberAgentname() {
        return memberAgentname;
    }

    public void setMemberAgentname(Integer memberAgentname) {
        this.memberAgentname = memberAgentname;
    }

    public Date getMemberLandlogin() {
        return memberLandlogin;
    }

    public void setMemberLandlogin(Date memberLandlogin) {
        this.memberLandlogin = memberLandlogin;
    }

    public String getMemberLanguage() {
        return memberLanguage;
    }

    public void setMemberLanguage(String memberLanguage) {
        this.memberLanguage = memberLanguage;
    }

    public String getMemberLamu() {
        return memberLamu;
    }

    public void setMemberLamu(String memberLamu) {
        this.memberLamu = memberLamu;
    }

    public Integer getMemberLamucount() {
        return memberLamucount;
    }

    public void setMemberLamucount(Integer memberLamucount) {
        this.memberLamucount = memberLamucount;
    }

    public String getMemberTemplet() {
        return memberTemplet;
    }

    public void setMemberTemplet(String memberTemplet) {
        this.memberTemplet = memberTemplet;
    }

    public BigDecimal getMemberMoney() {
        return memberMoney;
    }

    public void setMemberMoney(BigDecimal memberMoney) {
        this.memberMoney = memberMoney;
    }

    public BigDecimal getMemberWebprice() {
        return memberWebprice;
    }

    public void setMemberWebprice(BigDecimal memberWebprice) {
        this.memberWebprice = memberWebprice;
    }

    public String getMemberWebserver() {
        return memberWebserver;
    }

    public void setMemberWebserver(String memberWebserver) {
        this.memberWebserver = memberWebserver;
    }

    public String getMemberAdminserver() {
        return memberAdminserver;
    }

    public void setMemberAdminserver(String memberAdminserver) {
        this.memberAdminserver = memberAdminserver;
    }

    public Byte getMemberTplock() {
        return memberTplock;
    }

    public void setMemberTplock(Byte memberTplock) {
        this.memberTplock = memberTplock;
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
        biz_member other = (biz_member) that;
        return (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getMemberPwd() == null ? other.getMemberPwd() == null : this.getMemberPwd().equals(other.getMemberPwd()))
            && (this.getMemberRealname() == null ? other.getMemberRealname() == null : this.getMemberRealname().equals(other.getMemberRealname()))
            && (this.getMemberTel() == null ? other.getMemberTel() == null : this.getMemberTel().equals(other.getMemberTel()))
            && (this.getMemberCname() == null ? other.getMemberCname() == null : this.getMemberCname().equals(other.getMemberCname()))
            && (this.getMemberQq() == null ? other.getMemberQq() == null : this.getMemberQq().equals(other.getMemberQq()))
            && (this.getMemberEmail() == null ? other.getMemberEmail() == null : this.getMemberEmail().equals(other.getMemberEmail()))
            && (this.getMemberRank() == null ? other.getMemberRank() == null : this.getMemberRank().equals(other.getMemberRank()))
            && (this.getMemberRegdate() == null ? other.getMemberRegdate() == null : this.getMemberRegdate().equals(other.getMemberRegdate()))
            && (this.getMemberLock() == null ? other.getMemberLock() == null : this.getMemberLock().equals(other.getMemberLock()))
            && (this.getMemberExpire() == null ? other.getMemberExpire() == null : this.getMemberExpire().equals(other.getMemberExpire()))
            && (this.getMemberAgentname() == null ? other.getMemberAgentname() == null : this.getMemberAgentname().equals(other.getMemberAgentname()))
            && (this.getMemberLandlogin() == null ? other.getMemberLandlogin() == null : this.getMemberLandlogin().equals(other.getMemberLandlogin()))
            && (this.getMemberLanguage() == null ? other.getMemberLanguage() == null : this.getMemberLanguage().equals(other.getMemberLanguage()))
            && (this.getMemberLamu() == null ? other.getMemberLamu() == null : this.getMemberLamu().equals(other.getMemberLamu()))
            && (this.getMemberLamucount() == null ? other.getMemberLamucount() == null : this.getMemberLamucount().equals(other.getMemberLamucount()))
            && (this.getMemberTemplet() == null ? other.getMemberTemplet() == null : this.getMemberTemplet().equals(other.getMemberTemplet()))
            && (this.getMemberMoney() == null ? other.getMemberMoney() == null : this.getMemberMoney().equals(other.getMemberMoney()))
            && (this.getMemberWebprice() == null ? other.getMemberWebprice() == null : this.getMemberWebprice().equals(other.getMemberWebprice()))
            && (this.getMemberWebserver() == null ? other.getMemberWebserver() == null : this.getMemberWebserver().equals(other.getMemberWebserver()))
            && (this.getMemberAdminserver() == null ? other.getMemberAdminserver() == null : this.getMemberAdminserver().equals(other.getMemberAdminserver()))
            && (this.getMemberTplock() == null ? other.getMemberTplock() == null : this.getMemberTplock().equals(other.getMemberTplock()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getMemberPwd() == null) ? 0 : getMemberPwd().hashCode());
        result = prime * result + ((getMemberRealname() == null) ? 0 : getMemberRealname().hashCode());
        result = prime * result + ((getMemberTel() == null) ? 0 : getMemberTel().hashCode());
        result = prime * result + ((getMemberCname() == null) ? 0 : getMemberCname().hashCode());
        result = prime * result + ((getMemberQq() == null) ? 0 : getMemberQq().hashCode());
        result = prime * result + ((getMemberEmail() == null) ? 0 : getMemberEmail().hashCode());
        result = prime * result + ((getMemberRank() == null) ? 0 : getMemberRank().hashCode());
        result = prime * result + ((getMemberRegdate() == null) ? 0 : getMemberRegdate().hashCode());
        result = prime * result + ((getMemberLock() == null) ? 0 : getMemberLock().hashCode());
        result = prime * result + ((getMemberExpire() == null) ? 0 : getMemberExpire().hashCode());
        result = prime * result + ((getMemberAgentname() == null) ? 0 : getMemberAgentname().hashCode());
        result = prime * result + ((getMemberLandlogin() == null) ? 0 : getMemberLandlogin().hashCode());
        result = prime * result + ((getMemberLanguage() == null) ? 0 : getMemberLanguage().hashCode());
        result = prime * result + ((getMemberLamu() == null) ? 0 : getMemberLamu().hashCode());
        result = prime * result + ((getMemberLamucount() == null) ? 0 : getMemberLamucount().hashCode());
        result = prime * result + ((getMemberTemplet() == null) ? 0 : getMemberTemplet().hashCode());
        result = prime * result + ((getMemberMoney() == null) ? 0 : getMemberMoney().hashCode());
        result = prime * result + ((getMemberWebprice() == null) ? 0 : getMemberWebprice().hashCode());
        result = prime * result + ((getMemberWebserver() == null) ? 0 : getMemberWebserver().hashCode());
        result = prime * result + ((getMemberAdminserver() == null) ? 0 : getMemberAdminserver().hashCode());
        result = prime * result + ((getMemberTplock() == null) ? 0 : getMemberTplock().hashCode());
        return result;
    }

	public biz_website getWebsite() {
		return website;
	}

	public void setWebsite(biz_website website) {
		this.website = website;
	}
}