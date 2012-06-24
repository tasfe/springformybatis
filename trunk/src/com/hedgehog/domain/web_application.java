package com.hedgehog.domain;

import java.util.Date;

public class web_application {
    private Integer appid;

    private Integer mId;

    private Date aCreatetime;

    private String aNote;

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Date getaCreatetime() {
        return aCreatetime;
    }

    public void setaCreatetime(Date aCreatetime) {
        this.aCreatetime = aCreatetime;
    }

    public String getaNote() {
        return aNote;
    }

    public void setaNote(String aNote) {
        this.aNote = aNote;
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
        web_application other = (web_application) that;
        return (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid()))
            && (this.getmId() == null ? other.getmId() == null : this.getmId().equals(other.getmId()))
            && (this.getaCreatetime() == null ? other.getaCreatetime() == null : this.getaCreatetime().equals(other.getaCreatetime()))
            && (this.getaNote() == null ? other.getaNote() == null : this.getaNote().equals(other.getaNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
        result = prime * result + ((getmId() == null) ? 0 : getmId().hashCode());
        result = prime * result + ((getaCreatetime() == null) ? 0 : getaCreatetime().hashCode());
        result = prime * result + ((getaNote() == null) ? 0 : getaNote().hashCode());
        return result;
    }
}