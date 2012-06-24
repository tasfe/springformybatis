package com.hedgehog.domain;

public class biz_attrib {
    private Integer attribid;

    private String kName;

    private String kValue;

    private Integer mId;

    private String kType;

    public Integer getAttribid() {
        return attribid;
    }

    public void setAttribid(Integer attribid) {
        this.attribid = attribid;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    public String getkValue() {
        return kValue;
    }

    public void setkValue(String kValue) {
        this.kValue = kValue;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getkType() {
        return kType;
    }

    public void setkType(String kType) {
        this.kType = kType;
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
        biz_attrib other = (biz_attrib) that;
        return (this.getAttribid() == null ? other.getAttribid() == null : this.getAttribid().equals(other.getAttribid()))
            && (this.getkName() == null ? other.getkName() == null : this.getkName().equals(other.getkName()))
            && (this.getkValue() == null ? other.getkValue() == null : this.getkValue().equals(other.getkValue()))
            && (this.getmId() == null ? other.getmId() == null : this.getmId().equals(other.getmId()))
            && (this.getkType() == null ? other.getkType() == null : this.getkType().equals(other.getkType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAttribid() == null) ? 0 : getAttribid().hashCode());
        result = prime * result + ((getkName() == null) ? 0 : getkName().hashCode());
        result = prime * result + ((getkValue() == null) ? 0 : getkValue().hashCode());
        result = prime * result + ((getmId() == null) ? 0 : getmId().hashCode());
        result = prime * result + ((getkType() == null) ? 0 : getkType().hashCode());
        return result;
    }
}