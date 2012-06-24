package com.hedgehog.domain;

public class sys_SystemInfo implements java.io.Serializable{
    private Integer systemid;

    private String sName;

    private String sVersion;

    private String sLicensed;

    private byte[] sSystemconfigdata;

    public Integer getSystemid() {
        return systemid;
    }

    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsVersion() {
        return sVersion;
    }

    public void setsVersion(String sVersion) {
        this.sVersion = sVersion;
    }

    public String getsLicensed() {
        return sLicensed;
    }

    public void setsLicensed(String sLicensed) {
        this.sLicensed = sLicensed;
    }

    public byte[] getsSystemconfigdata() {
        return sSystemconfigdata;
    }

    public void setsSystemconfigdata(byte[] sSystemconfigdata) {
        this.sSystemconfigdata = sSystemconfigdata;
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
        sys_SystemInfo other = (sys_SystemInfo) that;
        return (this.getSystemid() == null ? other.getSystemid() == null : this.getSystemid().equals(other.getSystemid()))
            && (this.getsName() == null ? other.getsName() == null : this.getsName().equals(other.getsName()))
            && (this.getsVersion() == null ? other.getsVersion() == null : this.getsVersion().equals(other.getsVersion()))
            && (this.getsLicensed() == null ? other.getsLicensed() == null : this.getsLicensed().equals(other.getsLicensed()))
            && (this.getsSystemconfigdata() == null ? other.getsSystemconfigdata() == null : this.getsSystemconfigdata().equals(other.getsSystemconfigdata()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSystemid() == null) ? 0 : getSystemid().hashCode());
        result = prime * result + ((getsName() == null) ? 0 : getsName().hashCode());
        result = prime * result + ((getsVersion() == null) ? 0 : getsVersion().hashCode());
        result = prime * result + ((getsLicensed() == null) ? 0 : getsLicensed().hashCode());
        result = prime * result + ((getsSystemconfigdata() == null) ? 0 : getsSystemconfigdata().hashCode());
        return result;
    }
}