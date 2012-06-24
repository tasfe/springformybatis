package com.hedgehog.domain;

import java.util.Date;

public class web_ad {
    private Integer id;

    private String aName;

    private Date aTime;

    private Integer mId;

    private String aContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public Date getaTime() {
        return aTime;
    }

    public void setaTime(Date aTime) {
        this.aTime = aTime;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent;
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
        web_ad other = (web_ad) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getaName() == null ? other.getaName() == null : this.getaName().equals(other.getaName()))
            && (this.getaTime() == null ? other.getaTime() == null : this.getaTime().equals(other.getaTime()))
            && (this.getmId() == null ? other.getmId() == null : this.getmId().equals(other.getmId()))
            && (this.getaContent() == null ? other.getaContent() == null : this.getaContent().equals(other.getaContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getaName() == null) ? 0 : getaName().hashCode());
        result = prime * result + ((getaTime() == null) ? 0 : getaTime().hashCode());
        result = prime * result + ((getmId() == null) ? 0 : getmId().hashCode());
        result = prime * result + ((getaContent() == null) ? 0 : getaContent().hashCode());
        return result;
    }
}