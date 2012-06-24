package com.hedgehog.domain;

public class sys_Group implements java.io.Serializable{
    private Integer groupid;

    private String gCname;

    private Integer gParentid;

    private Integer gShoworder;

    private Integer gLevel;

    private Integer gChildcount;

    private Byte gDelete;

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getgCname() {
        return gCname;
    }

    public void setgCname(String gCname) {
        this.gCname = gCname;
    }

    public Integer getgParentid() {
        return gParentid;
    }

    public void setgParentid(Integer gParentid) {
        this.gParentid = gParentid;
    }

    public Integer getgShoworder() {
        return gShoworder;
    }

    public void setgShoworder(Integer gShoworder) {
        this.gShoworder = gShoworder;
    }

    public Integer getgLevel() {
        return gLevel;
    }

    public void setgLevel(Integer gLevel) {
        this.gLevel = gLevel;
    }

    public Integer getgChildcount() {
        return gChildcount;
    }

    public void setgChildcount(Integer gChildcount) {
        this.gChildcount = gChildcount;
    }

    public Byte getgDelete() {
        return gDelete;
    }

    public void setgDelete(Byte gDelete) {
        this.gDelete = gDelete;
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
        sys_Group other = (sys_Group) that;
        return (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getgCname() == null ? other.getgCname() == null : this.getgCname().equals(other.getgCname()))
            && (this.getgParentid() == null ? other.getgParentid() == null : this.getgParentid().equals(other.getgParentid()))
            && (this.getgShoworder() == null ? other.getgShoworder() == null : this.getgShoworder().equals(other.getgShoworder()))
            && (this.getgLevel() == null ? other.getgLevel() == null : this.getgLevel().equals(other.getgLevel()))
            && (this.getgChildcount() == null ? other.getgChildcount() == null : this.getgChildcount().equals(other.getgChildcount()))
            && (this.getgDelete() == null ? other.getgDelete() == null : this.getgDelete().equals(other.getgDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getgCname() == null) ? 0 : getgCname().hashCode());
        result = prime * result + ((getgParentid() == null) ? 0 : getgParentid().hashCode());
        result = prime * result + ((getgShoworder() == null) ? 0 : getgShoworder().hashCode());
        result = prime * result + ((getgLevel() == null) ? 0 : getgLevel().hashCode());
        result = prime * result + ((getgChildcount() == null) ? 0 : getgChildcount().hashCode());
        result = prime * result + ((getgDelete() == null) ? 0 : getgDelete().hashCode());
        return result;
    }
}