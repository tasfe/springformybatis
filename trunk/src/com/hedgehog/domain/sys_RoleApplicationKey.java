package com.hedgehog.domain;

public class sys_RoleApplicationKey {
    private Integer aRoleid;

    private Integer aApplicationid;

    public Integer getaRoleid() {
        return aRoleid;
    }

    public void setaRoleid(Integer aRoleid) {
        this.aRoleid = aRoleid;
    }

    public Integer getaApplicationid() {
        return aApplicationid;
    }

    public void setaApplicationid(Integer aApplicationid) {
        this.aApplicationid = aApplicationid;
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
        sys_RoleApplicationKey other = (sys_RoleApplicationKey) that;
        return (this.getaRoleid() == null ? other.getaRoleid() == null : this.getaRoleid().equals(other.getaRoleid()))
            && (this.getaApplicationid() == null ? other.getaApplicationid() == null : this.getaApplicationid().equals(other.getaApplicationid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getaRoleid() == null) ? 0 : getaRoleid().hashCode());
        result = prime * result + ((getaApplicationid() == null) ? 0 : getaApplicationid().hashCode());
        return result;
    }
}