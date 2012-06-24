package com.hedgehog.domain;

public class sys_RolePermissionKey {
    private Integer pRoleid;

    private Integer pApplicationid;

    private String pPagecode;

    public Integer getpRoleid() {
        return pRoleid;
    }

    public void setpRoleid(Integer pRoleid) {
        this.pRoleid = pRoleid;
    }

    public Integer getpApplicationid() {
        return pApplicationid;
    }

    public void setpApplicationid(Integer pApplicationid) {
        this.pApplicationid = pApplicationid;
    }

    public String getpPagecode() {
        return pPagecode;
    }

    public void setpPagecode(String pPagecode) {
        this.pPagecode = pPagecode;
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
        sys_RolePermissionKey other = (sys_RolePermissionKey) that;
        return (this.getpRoleid() == null ? other.getpRoleid() == null : this.getpRoleid().equals(other.getpRoleid()))
            && (this.getpApplicationid() == null ? other.getpApplicationid() == null : this.getpApplicationid().equals(other.getpApplicationid()))
            && (this.getpPagecode() == null ? other.getpPagecode() == null : this.getpPagecode().equals(other.getpPagecode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpRoleid() == null) ? 0 : getpRoleid().hashCode());
        result = prime * result + ((getpApplicationid() == null) ? 0 : getpApplicationid().hashCode());
        result = prime * result + ((getpPagecode() == null) ? 0 : getpPagecode().hashCode());
        return result;
    }
}