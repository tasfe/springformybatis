package com.hedgehog.domain;

import java.util.Date;

public class web_admin {
    private Integer adminid;

    private String loginname;

    private String realname;

    private String password;

    private String limit;

    private Date regtime;

    private Integer mId;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
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
        web_admin other = (web_admin) that;
        return (this.getAdminid() == null ? other.getAdminid() == null : this.getAdminid().equals(other.getAdminid()))
            && (this.getLoginname() == null ? other.getLoginname() == null : this.getLoginname().equals(other.getLoginname()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getLimit() == null ? other.getLimit() == null : this.getLimit().equals(other.getLimit()))
            && (this.getRegtime() == null ? other.getRegtime() == null : this.getRegtime().equals(other.getRegtime()))
            && (this.getmId() == null ? other.getmId() == null : this.getmId().equals(other.getmId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdminid() == null) ? 0 : getAdminid().hashCode());
        result = prime * result + ((getLoginname() == null) ? 0 : getLoginname().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getLimit() == null) ? 0 : getLimit().hashCode());
        result = prime * result + ((getRegtime() == null) ? 0 : getRegtime().hashCode());
        result = prime * result + ((getmId() == null) ? 0 : getmId().hashCode());
        return result;
    }
}