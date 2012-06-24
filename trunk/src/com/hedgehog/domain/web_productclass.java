package com.hedgehog.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class web_productclass {
    private Integer pcid;

    private Integer pcParentid;
    @Size(min=1, max=50, message="类名不能为空")
    private String pcName;

    private String pcCode;

    private Integer pcMenuid;
    @Min(0)
    private Integer pcOrder;

    private String pcDes;

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public Integer getPcParentid() {
        return pcParentid;
    }

    public void setPcParentid(Integer pcParentid) {
        this.pcParentid = pcParentid;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public String getPcCode() {
        return pcCode;
    }

    public void setPcCode(String pcCode) {
        this.pcCode = pcCode;
    }

    public Integer getPcMenuid() {
        return pcMenuid;
    }

    public void setPcMenuid(Integer pcMenuid) {
        this.pcMenuid = pcMenuid;
    }

    public Integer getPcOrder() {
        return pcOrder;
    }

    public void setPcOrder(Integer pcOrder) {
        this.pcOrder = pcOrder;
    }

    public String getPcDes() {
        return pcDes;
    }

    public void setPcDes(String pcDes) {
        this.pcDes = pcDes;
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
        web_productclass other = (web_productclass) that;
        return (this.getPcid() == null ? other.getPcid() == null : this.getPcid().equals(other.getPcid()))
            && (this.getPcParentid() == null ? other.getPcParentid() == null : this.getPcParentid().equals(other.getPcParentid()))
            && (this.getPcName() == null ? other.getPcName() == null : this.getPcName().equals(other.getPcName()))
            && (this.getPcCode() == null ? other.getPcCode() == null : this.getPcCode().equals(other.getPcCode()))
            && (this.getPcMenuid() == null ? other.getPcMenuid() == null : this.getPcMenuid().equals(other.getPcMenuid()))
            && (this.getPcOrder() == null ? other.getPcOrder() == null : this.getPcOrder().equals(other.getPcOrder()))
            && (this.getPcDes() == null ? other.getPcDes() == null : this.getPcDes().equals(other.getPcDes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPcid() == null) ? 0 : getPcid().hashCode());
        result = prime * result + ((getPcParentid() == null) ? 0 : getPcParentid().hashCode());
        result = prime * result + ((getPcName() == null) ? 0 : getPcName().hashCode());
        result = prime * result + ((getPcCode() == null) ? 0 : getPcCode().hashCode());
        result = prime * result + ((getPcMenuid() == null) ? 0 : getPcMenuid().hashCode());
        result = prime * result + ((getPcOrder() == null) ? 0 : getPcOrder().hashCode());
        result = prime * result + ((getPcDes() == null) ? 0 : getPcDes().hashCode());
        return result;
    }
}