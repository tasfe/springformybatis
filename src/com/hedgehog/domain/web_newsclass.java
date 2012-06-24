package com.hedgehog.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class web_newsclass {
    private Integer newsclassid;

    private Integer ncParentid;
    
    @Size(min=1, max=50, message="类名不能为空")
    private String ncName;

    private String ncCode;

    private Integer ncMenuid;
    
    @Min(0)
    private Integer ncOrder;

    private String ncDes;

    public Integer getNewsclassid() {
        return newsclassid;
    }

    public void setNewsclassid(Integer newsclassid) {
        this.newsclassid = newsclassid;
    }

    public Integer getNcParentid() {
        return ncParentid;
    }

    public void setNcParentid(Integer ncParentid) {
        this.ncParentid = ncParentid;
    }

    public String getNcName() {
        return ncName;
    }

    public void setNcName(String ncName) {
        this.ncName = ncName;
    }

    public String getNcCode() {
        return ncCode;
    }

    public void setNcCode(String ncCode) {
        this.ncCode = ncCode;
    }

    public Integer getNcMenuid() {
        return ncMenuid;
    }

    public void setNcMenuid(Integer ncMenuid) {
        this.ncMenuid = ncMenuid;
    }

    public Integer getNcOrder() {
        return ncOrder;
    }

    public void setNcOrder(Integer ncOrder) {
        this.ncOrder = ncOrder;
    }

    public String getNcDes() {
        return ncDes;
    }

    public void setNcDes(String ncDes) {
        this.ncDes = ncDes;
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
        web_newsclass other = (web_newsclass) that;
        return (this.getNewsclassid() == null ? other.getNewsclassid() == null : this.getNewsclassid().equals(other.getNewsclassid()))
            && (this.getNcParentid() == null ? other.getNcParentid() == null : this.getNcParentid().equals(other.getNcParentid()))
            && (this.getNcName() == null ? other.getNcName() == null : this.getNcName().equals(other.getNcName()))
            && (this.getNcCode() == null ? other.getNcCode() == null : this.getNcCode().equals(other.getNcCode()))
            && (this.getNcMenuid() == null ? other.getNcMenuid() == null : this.getNcMenuid().equals(other.getNcMenuid()))
            && (this.getNcOrder() == null ? other.getNcOrder() == null : this.getNcOrder().equals(other.getNcOrder()))
            && (this.getNcDes() == null ? other.getNcDes() == null : this.getNcDes().equals(other.getNcDes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNewsclassid() == null) ? 0 : getNewsclassid().hashCode());
        result = prime * result + ((getNcParentid() == null) ? 0 : getNcParentid().hashCode());
        result = prime * result + ((getNcName() == null) ? 0 : getNcName().hashCode());
        result = prime * result + ((getNcCode() == null) ? 0 : getNcCode().hashCode());
        result = prime * result + ((getNcMenuid() == null) ? 0 : getNcMenuid().hashCode());
        result = prime * result + ((getNcOrder() == null) ? 0 : getNcOrder().hashCode());
        result = prime * result + ((getNcDes() == null) ? 0 : getNcDes().hashCode());
        return result;
    }
}