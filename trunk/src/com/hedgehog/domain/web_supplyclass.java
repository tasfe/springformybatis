package com.hedgehog.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class web_supplyclass {
    private Integer scid;

    private Integer scParentid;
    @Size(min=1, max=50, message="类名不能为空")
    private String scName;

    private String scCode;

    private Integer scMenuid;
    @Min(0)
    private Integer scOrder;

    private String scDes;

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getScParentid() {
        return scParentid;
    }

    public void setScParentid(Integer scParentid) {
        this.scParentid = scParentid;
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName;
    }

    public String getScCode() {
        return scCode;
    }

    public void setScCode(String scCode) {
        this.scCode = scCode;
    }

    public Integer getScMenuid() {
        return scMenuid;
    }

    public void setScMenuid(Integer scMenuid) {
        this.scMenuid = scMenuid;
    }

    public Integer getScOrder() {
        return scOrder;
    }

    public void setScOrder(Integer scOrder) {
        this.scOrder = scOrder;
    }

    public String getScDes() {
        return scDes;
    }

    public void setScDes(String scDes) {
        this.scDes = scDes;
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
        web_supplyclass other = (web_supplyclass) that;
        return (this.getScid() == null ? other.getScid() == null : this.getScid().equals(other.getScid()))
            && (this.getScParentid() == null ? other.getScParentid() == null : this.getScParentid().equals(other.getScParentid()))
            && (this.getScName() == null ? other.getScName() == null : this.getScName().equals(other.getScName()))
            && (this.getScCode() == null ? other.getScCode() == null : this.getScCode().equals(other.getScCode()))
            && (this.getScMenuid() == null ? other.getScMenuid() == null : this.getScMenuid().equals(other.getScMenuid()))
            && (this.getScOrder() == null ? other.getScOrder() == null : this.getScOrder().equals(other.getScOrder()))
            && (this.getScDes() == null ? other.getScDes() == null : this.getScDes().equals(other.getScDes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScid() == null) ? 0 : getScid().hashCode());
        result = prime * result + ((getScParentid() == null) ? 0 : getScParentid().hashCode());
        result = prime * result + ((getScName() == null) ? 0 : getScName().hashCode());
        result = prime * result + ((getScCode() == null) ? 0 : getScCode().hashCode());
        result = prime * result + ((getScMenuid() == null) ? 0 : getScMenuid().hashCode());
        result = prime * result + ((getScOrder() == null) ? 0 : getScOrder().hashCode());
        result = prime * result + ((getScDes() == null) ? 0 : getScDes().hashCode());
        return result;
    }
}