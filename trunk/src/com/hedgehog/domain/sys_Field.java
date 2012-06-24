package com.hedgehog.domain;

public class sys_Field implements java.io.Serializable{
    private Integer fieldid;

    private String fKey;

    private String fCname;

    private String fRemark;

    public Integer getFieldid() {
        return fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public String getfKey() {
        return fKey;
    }

    public void setfKey(String fKey) {
        this.fKey = fKey;
    }

    public String getfCname() {
        return fCname;
    }

    public void setfCname(String fCname) {
        this.fCname = fCname;
    }

    public String getfRemark() {
        return fRemark;
    }

    public void setfRemark(String fRemark) {
        this.fRemark = fRemark;
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
        sys_Field other = (sys_Field) that;
        return (this.getFieldid() == null ? other.getFieldid() == null : this.getFieldid().equals(other.getFieldid()))
            && (this.getfKey() == null ? other.getfKey() == null : this.getfKey().equals(other.getfKey()))
            && (this.getfCname() == null ? other.getfCname() == null : this.getfCname().equals(other.getfCname()))
            && (this.getfRemark() == null ? other.getfRemark() == null : this.getfRemark().equals(other.getfRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFieldid() == null) ? 0 : getFieldid().hashCode());
        result = prime * result + ((getfKey() == null) ? 0 : getfKey().hashCode());
        result = prime * result + ((getfCname() == null) ? 0 : getfCname().hashCode());
        result = prime * result + ((getfRemark() == null) ? 0 : getfRemark().hashCode());
        return result;
    }
}