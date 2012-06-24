package com.hedgehog.domain;

public class sys_ModuleKey {
    private String mPagecode;

    private Integer mApplicationid;

    public String getmPagecode() {
        return mPagecode;
    }

    public void setmPagecode(String mPagecode) {
        this.mPagecode = mPagecode;
    }

    public Integer getmApplicationid() {
        return mApplicationid;
    }

    public void setmApplicationid(Integer mApplicationid) {
        this.mApplicationid = mApplicationid;
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
        sys_ModuleKey other = (sys_ModuleKey) that;
        return (this.getmPagecode() == null ? other.getmPagecode() == null : this.getmPagecode().equals(other.getmPagecode()))
            && (this.getmApplicationid() == null ? other.getmApplicationid() == null : this.getmApplicationid().equals(other.getmApplicationid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getmPagecode() == null) ? 0 : getmPagecode().hashCode());
        result = prime * result + ((getmApplicationid() == null) ? 0 : getmApplicationid().hashCode());
        return result;
    }
}