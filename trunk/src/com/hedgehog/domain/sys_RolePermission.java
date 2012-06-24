package com.hedgehog.domain;

public class sys_RolePermission extends sys_RolePermissionKey {
    private Integer permissionid;

    private Integer pValue;

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public Integer getpValue() {
        return pValue;
    }

    public void setpValue(Integer pValue) {
        this.pValue = pValue;
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
        sys_RolePermission other = (sys_RolePermission) that;
        return (this.getpRoleid() == null ? other.getpRoleid() == null : this.getpRoleid().equals(other.getpRoleid()))
            && (this.getpApplicationid() == null ? other.getpApplicationid() == null : this.getpApplicationid().equals(other.getpApplicationid()))
            && (this.getpPagecode() == null ? other.getpPagecode() == null : this.getpPagecode().equals(other.getpPagecode()))
            && (this.getPermissionid() == null ? other.getPermissionid() == null : this.getPermissionid().equals(other.getPermissionid()))
            && (this.getpValue() == null ? other.getpValue() == null : this.getpValue().equals(other.getpValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpRoleid() == null) ? 0 : getpRoleid().hashCode());
        result = prime * result + ((getpApplicationid() == null) ? 0 : getpApplicationid().hashCode());
        result = prime * result + ((getpPagecode() == null) ? 0 : getpPagecode().hashCode());
        result = prime * result + ((getPermissionid() == null) ? 0 : getPermissionid().hashCode());
        result = prime * result + ((getpValue() == null) ? 0 : getpValue().hashCode());
        return result;
    }
}