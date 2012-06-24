package com.hedgehog.domain;

public class sys_UserRolesKey {
    private Integer rUserid;

    private Integer rRoleid;

    public Integer getrUserid() {
        return rUserid;
    }

    public void setrUserid(Integer rUserid) {
        this.rUserid = rUserid;
    }

    public Integer getrRoleid() {
        return rRoleid;
    }

    public void setrRoleid(Integer rRoleid) {
        this.rRoleid = rRoleid;
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
        sys_UserRolesKey other = (sys_UserRolesKey) that;
        return (this.getrUserid() == null ? other.getrUserid() == null : this.getrUserid().equals(other.getrUserid()))
            && (this.getrRoleid() == null ? other.getrRoleid() == null : this.getrRoleid().equals(other.getrRoleid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getrUserid() == null) ? 0 : getrUserid().hashCode());
        result = prime * result + ((getrRoleid() == null) ? 0 : getrRoleid().hashCode());
        return result;
    }
}