package com.hedgehog.domain;

public class sys_ModuleExtPermissionsKey {
    private Integer moduleid;

    private Integer permissionvalue;

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public Integer getPermissionvalue() {
        return permissionvalue;
    }

    public void setPermissionvalue(Integer permissionvalue) {
        this.permissionvalue = permissionvalue;
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
        sys_ModuleExtPermissionsKey other = (sys_ModuleExtPermissionsKey) that;
        return (this.getModuleid() == null ? other.getModuleid() == null : this.getModuleid().equals(other.getModuleid()))
            && (this.getPermissionvalue() == null ? other.getPermissionvalue() == null : this.getPermissionvalue().equals(other.getPermissionvalue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModuleid() == null) ? 0 : getModuleid().hashCode());
        result = prime * result + ((getPermissionvalue() == null) ? 0 : getPermissionvalue().hashCode());
        return result;
    }
}