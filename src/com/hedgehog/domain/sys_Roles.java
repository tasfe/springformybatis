package com.hedgehog.domain;

public class sys_Roles implements java.io.Serializable{
    private Integer roleid;

    private Integer rUserid;

    private String rRolename;

    private String rDescription;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getrUserid() {
        return rUserid;
    }

    public void setrUserid(Integer rUserid) {
        this.rUserid = rUserid;
    }

    public String getrRolename() {
        return rRolename;
    }

    public void setrRolename(String rRolename) {
        this.rRolename = rRolename;
    }

    public String getrDescription() {
        return rDescription;
    }

    public void setrDescription(String rDescription) {
        this.rDescription = rDescription;
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
        sys_Roles other = (sys_Roles) that;
        return (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getrUserid() == null ? other.getrUserid() == null : this.getrUserid().equals(other.getrUserid()))
            && (this.getrRolename() == null ? other.getrRolename() == null : this.getrRolename().equals(other.getrRolename()))
            && (this.getrDescription() == null ? other.getrDescription() == null : this.getrDescription().equals(other.getrDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getrUserid() == null) ? 0 : getrUserid().hashCode());
        result = prime * result + ((getrRolename() == null) ? 0 : getrRolename().hashCode());
        result = prime * result + ((getrDescription() == null) ? 0 : getrDescription().hashCode());
        return result;
    }
}