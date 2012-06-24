package com.hedgehog.domain;

public class sys_ModuleExtPermissions extends sys_ModuleExtPermissionsKey {
    private Integer extpermissionid;

    private String permissionname;

    public Integer getExtpermissionid() {
        return extpermissionid;
    }

    public void setExtpermissionid(Integer extpermissionid) {
        this.extpermissionid = extpermissionid;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
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
        sys_ModuleExtPermissions other = (sys_ModuleExtPermissions) that;
        return (this.getModuleid() == null ? other.getModuleid() == null : this.getModuleid().equals(other.getModuleid()))
            && (this.getPermissionvalue() == null ? other.getPermissionvalue() == null : this.getPermissionvalue().equals(other.getPermissionvalue()))
            && (this.getExtpermissionid() == null ? other.getExtpermissionid() == null : this.getExtpermissionid().equals(other.getExtpermissionid()))
            && (this.getPermissionname() == null ? other.getPermissionname() == null : this.getPermissionname().equals(other.getPermissionname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModuleid() == null) ? 0 : getModuleid().hashCode());
        result = prime * result + ((getPermissionvalue() == null) ? 0 : getPermissionvalue().hashCode());
        result = prime * result + ((getExtpermissionid() == null) ? 0 : getExtpermissionid().hashCode());
        result = prime * result + ((getPermissionname() == null) ? 0 : getPermissionname().hashCode());
        return result;
    }
}