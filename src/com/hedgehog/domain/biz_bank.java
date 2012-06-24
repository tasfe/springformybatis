package com.hedgehog.domain;

import java.math.BigDecimal;
import java.util.Date;

public class biz_bank {
    private Long bankid;

    private Integer mId;

    private String bType;

    private BigDecimal bMoney;

    private String bNote;

    private Date bCreatetime;

    private Integer bAdminid;

    public Long getBankid() {
        return bankid;
    }

    public void setBankid(Long bankid) {
        this.bankid = bankid;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public BigDecimal getbMoney() {
        return bMoney;
    }

    public void setbMoney(BigDecimal bMoney) {
        this.bMoney = bMoney;
    }

    public String getbNote() {
        return bNote;
    }

    public void setbNote(String bNote) {
        this.bNote = bNote;
    }

    public Date getbCreatetime() {
        return bCreatetime;
    }

    public void setbCreatetime(Date bCreatetime) {
        this.bCreatetime = bCreatetime;
    }

    public Integer getbAdminid() {
        return bAdminid;
    }

    public void setbAdminid(Integer bAdminid) {
        this.bAdminid = bAdminid;
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
        biz_bank other = (biz_bank) that;
        return (this.getBankid() == null ? other.getBankid() == null : this.getBankid().equals(other.getBankid()))
            && (this.getmId() == null ? other.getmId() == null : this.getmId().equals(other.getmId()))
            && (this.getbType() == null ? other.getbType() == null : this.getbType().equals(other.getbType()))
            && (this.getbMoney() == null ? other.getbMoney() == null : this.getbMoney().equals(other.getbMoney()))
            && (this.getbNote() == null ? other.getbNote() == null : this.getbNote().equals(other.getbNote()))
            && (this.getbCreatetime() == null ? other.getbCreatetime() == null : this.getbCreatetime().equals(other.getbCreatetime()))
            && (this.getbAdminid() == null ? other.getbAdminid() == null : this.getbAdminid().equals(other.getbAdminid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBankid() == null) ? 0 : getBankid().hashCode());
        result = prime * result + ((getmId() == null) ? 0 : getmId().hashCode());
        result = prime * result + ((getbType() == null) ? 0 : getbType().hashCode());
        result = prime * result + ((getbMoney() == null) ? 0 : getbMoney().hashCode());
        result = prime * result + ((getbNote() == null) ? 0 : getbNote().hashCode());
        result = prime * result + ((getbCreatetime() == null) ? 0 : getbCreatetime().hashCode());
        result = prime * result + ((getbAdminid() == null) ? 0 : getbAdminid().hashCode());
        return result;
    }
}