package com.hedgehog.domain;

public class web_contract {
    private Integer contractid;

    private Integer mId;

    private Integer cCode;

    private String cContent;

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getcCode() {
        return cCode;
    }

    public void setcCode(Integer cCode) {
        this.cCode = cCode;
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent;
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
        web_contract other = (web_contract) that;
        return (this.getContractid() == null ? other.getContractid() == null : this.getContractid().equals(other.getContractid()))
            && (this.getmId() == null ? other.getmId() == null : this.getmId().equals(other.getmId()))
            && (this.getcCode() == null ? other.getcCode() == null : this.getcCode().equals(other.getcCode()))
            && (this.getcContent() == null ? other.getcContent() == null : this.getcContent().equals(other.getcContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContractid() == null) ? 0 : getContractid().hashCode());
        result = prime * result + ((getmId() == null) ? 0 : getmId().hashCode());
        result = prime * result + ((getcCode() == null) ? 0 : getcCode().hashCode());
        result = prime * result + ((getcContent() == null) ? 0 : getcContent().hashCode());
        return result;
    }
}