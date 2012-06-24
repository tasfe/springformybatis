package com.hedgehog.domain;

import java.util.Date;

public class sys_Online implements java.io.Serializable{
    private String oSessionid;

    private Integer onlineid;

    private String oUsername;

    private String oIp;

    private Date oLogintime;

    private Date oLasttime;

    private String oLasturl;

    public String getoSessionid() {
        return oSessionid;
    }

    public void setoSessionid(String oSessionid) {
        this.oSessionid = oSessionid;
    }

    public Integer getOnlineid() {
        return onlineid;
    }

    public void setOnlineid(Integer onlineid) {
        this.onlineid = onlineid;
    }

    public String getoUsername() {
        return oUsername;
    }

    public void setoUsername(String oUsername) {
        this.oUsername = oUsername;
    }

    public String getoIp() {
        return oIp;
    }

    public void setoIp(String oIp) {
        this.oIp = oIp;
    }

    public Date getoLogintime() {
        return oLogintime;
    }

    public void setoLogintime(Date oLogintime) {
        this.oLogintime = oLogintime;
    }

    public Date getoLasttime() {
        return oLasttime;
    }

    public void setoLasttime(Date oLasttime) {
        this.oLasttime = oLasttime;
    }

    public String getoLasturl() {
        return oLasturl;
    }

    public void setoLasturl(String oLasturl) {
        this.oLasturl = oLasturl;
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
        sys_Online other = (sys_Online) that;
        return (this.getoSessionid() == null ? other.getoSessionid() == null : this.getoSessionid().equals(other.getoSessionid()))
            && (this.getOnlineid() == null ? other.getOnlineid() == null : this.getOnlineid().equals(other.getOnlineid()))
            && (this.getoUsername() == null ? other.getoUsername() == null : this.getoUsername().equals(other.getoUsername()))
            && (this.getoIp() == null ? other.getoIp() == null : this.getoIp().equals(other.getoIp()))
            && (this.getoLogintime() == null ? other.getoLogintime() == null : this.getoLogintime().equals(other.getoLogintime()))
            && (this.getoLasttime() == null ? other.getoLasttime() == null : this.getoLasttime().equals(other.getoLasttime()))
            && (this.getoLasturl() == null ? other.getoLasturl() == null : this.getoLasturl().equals(other.getoLasturl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getoSessionid() == null) ? 0 : getoSessionid().hashCode());
        result = prime * result + ((getOnlineid() == null) ? 0 : getOnlineid().hashCode());
        result = prime * result + ((getoUsername() == null) ? 0 : getoUsername().hashCode());
        result = prime * result + ((getoIp() == null) ? 0 : getoIp().hashCode());
        result = prime * result + ((getoLogintime() == null) ? 0 : getoLogintime().hashCode());
        result = prime * result + ((getoLasttime() == null) ? 0 : getoLasttime().hashCode());
        result = prime * result + ((getoLasturl() == null) ? 0 : getoLasturl().hashCode());
        return result;
    }
}