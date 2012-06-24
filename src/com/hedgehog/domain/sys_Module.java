package com.hedgehog.domain;

import java.util.List;

public class sys_Module extends sys_ModuleKey {
    private Integer moduleid;

    private Integer mParentid;

    private String mCname;

    private String mDirectory;

    private String mOrderlevel;

    private Byte mIssystem;

    private Byte mClose;

    private String mIcon;
    private List<sys_Module> list_submodule;

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public Integer getmParentid() {
        return mParentid;
    }

    public void setmParentid(Integer mParentid) {
        this.mParentid = mParentid;
    }

    public String getmCname() {
        return mCname;
    }

    public void setmCname(String mCname) {
        this.mCname = mCname;
    }

    public String getmDirectory() {
        return mDirectory;
    }

    public void setmDirectory(String mDirectory) {
        this.mDirectory = mDirectory;
    }

    public String getmOrderlevel() {
        return mOrderlevel;
    }

    public void setmOrderlevel(String mOrderlevel) {
        this.mOrderlevel = mOrderlevel;
    }

    public Byte getmIssystem() {
        return mIssystem;
    }

    public void setmIssystem(Byte mIssystem) {
        this.mIssystem = mIssystem;
    }

    public Byte getmClose() {
        return mClose;
    }

    public void setmClose(Byte mClose) {
        this.mClose = mClose;
    }

    public String getmIcon() {
        return mIcon;
    }

    public void setmIcon(String mIcon) {
        this.mIcon = mIcon;
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
        sys_Module other = (sys_Module) that;
        return (this.getmPagecode() == null ? other.getmPagecode() == null : this.getmPagecode().equals(other.getmPagecode()))
            && (this.getmApplicationid() == null ? other.getmApplicationid() == null : this.getmApplicationid().equals(other.getmApplicationid()))
            && (this.getModuleid() == null ? other.getModuleid() == null : this.getModuleid().equals(other.getModuleid()))
            && (this.getmParentid() == null ? other.getmParentid() == null : this.getmParentid().equals(other.getmParentid()))
            && (this.getmCname() == null ? other.getmCname() == null : this.getmCname().equals(other.getmCname()))
            && (this.getmDirectory() == null ? other.getmDirectory() == null : this.getmDirectory().equals(other.getmDirectory()))
            && (this.getmOrderlevel() == null ? other.getmOrderlevel() == null : this.getmOrderlevel().equals(other.getmOrderlevel()))
            && (this.getmIssystem() == null ? other.getmIssystem() == null : this.getmIssystem().equals(other.getmIssystem()))
            && (this.getmClose() == null ? other.getmClose() == null : this.getmClose().equals(other.getmClose()))
            && (this.getmIcon() == null ? other.getmIcon() == null : this.getmIcon().equals(other.getmIcon()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getmPagecode() == null) ? 0 : getmPagecode().hashCode());
        result = prime * result + ((getmApplicationid() == null) ? 0 : getmApplicationid().hashCode());
        result = prime * result + ((getModuleid() == null) ? 0 : getModuleid().hashCode());
        result = prime * result + ((getmParentid() == null) ? 0 : getmParentid().hashCode());
        result = prime * result + ((getmCname() == null) ? 0 : getmCname().hashCode());
        result = prime * result + ((getmDirectory() == null) ? 0 : getmDirectory().hashCode());
        result = prime * result + ((getmOrderlevel() == null) ? 0 : getmOrderlevel().hashCode());
        result = prime * result + ((getmIssystem() == null) ? 0 : getmIssystem().hashCode());
        result = prime * result + ((getmClose() == null) ? 0 : getmClose().hashCode());
        result = prime * result + ((getmIcon() == null) ? 0 : getmIcon().hashCode());
        return result;
    }

	public List<sys_Module> getList_submodule() {
		return list_submodule;
	}

	public void setList_submodule(List<sys_Module> list_submodule) {
		this.list_submodule = list_submodule;
	}
}