package com.hedgehog.domain;

public class biz_prank {
    private Integer prankid;

    private String prankName;

    private String prankCode;

    private Integer prankOrder;

    private String prankDes;

    private String prankHonor;

    public Integer getPrankid() {
        return prankid;
    }

    public void setPrankid(Integer prankid) {
        this.prankid = prankid;
    }

    public String getPrankName() {
        return prankName;
    }

    public void setPrankName(String prankName) {
        this.prankName = prankName;
    }

    public String getPrankCode() {
        return prankCode;
    }

    public void setPrankCode(String prankCode) {
        this.prankCode = prankCode;
    }

    public Integer getPrankOrder() {
        return prankOrder;
    }

    public void setPrankOrder(Integer prankOrder) {
        this.prankOrder = prankOrder;
    }

    public String getPrankDes() {
        return prankDes;
    }

    public void setPrankDes(String prankDes) {
        this.prankDes = prankDes;
    }

    public String getPrankHonor() {
        return prankHonor;
    }

    public void setPrankHonor(String prankHonor) {
        this.prankHonor = prankHonor;
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
        biz_prank other = (biz_prank) that;
        return (this.getPrankid() == null ? other.getPrankid() == null : this.getPrankid().equals(other.getPrankid()))
            && (this.getPrankName() == null ? other.getPrankName() == null : this.getPrankName().equals(other.getPrankName()))
            && (this.getPrankCode() == null ? other.getPrankCode() == null : this.getPrankCode().equals(other.getPrankCode()))
            && (this.getPrankOrder() == null ? other.getPrankOrder() == null : this.getPrankOrder().equals(other.getPrankOrder()))
            && (this.getPrankDes() == null ? other.getPrankDes() == null : this.getPrankDes().equals(other.getPrankDes()))
            && (this.getPrankHonor() == null ? other.getPrankHonor() == null : this.getPrankHonor().equals(other.getPrankHonor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrankid() == null) ? 0 : getPrankid().hashCode());
        result = prime * result + ((getPrankName() == null) ? 0 : getPrankName().hashCode());
        result = prime * result + ((getPrankCode() == null) ? 0 : getPrankCode().hashCode());
        result = prime * result + ((getPrankOrder() == null) ? 0 : getPrankOrder().hashCode());
        result = prime * result + ((getPrankDes() == null) ? 0 : getPrankDes().hashCode());
        result = prime * result + ((getPrankHonor() == null) ? 0 : getPrankHonor().hashCode());
        return result;
    }
}