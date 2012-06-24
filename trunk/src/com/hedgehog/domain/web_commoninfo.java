package com.hedgehog.domain;

import javax.validation.constraints.Size;

public class web_commoninfo {
    private Integer commoninfoid;

    @Size(min=1, max=100, message="名称不能为空")
    private String cmmName;

    private Integer cmmMenuid;
    @Size(min=1,message="内容不能为空")
    private String cmmVallue;

    public Integer getCommoninfoid() {
        return commoninfoid;
    }

    public void setCommoninfoid(Integer commoninfoid) {
        this.commoninfoid = commoninfoid;
    }

    public String getCmmName() {
        return cmmName;
    }

    public void setCmmName(String cmmName) {
        this.cmmName = cmmName;
    }

    public Integer getCmmMenuid() {
        return cmmMenuid;
    }

    public void setCmmMenuid(Integer cmmMenuid) {
        this.cmmMenuid = cmmMenuid;
    }

    public String getCmmVallue() {
        return cmmVallue;
    }

    public void setCmmVallue(String cmmVallue) {
        this.cmmVallue = cmmVallue;
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
        web_commoninfo other = (web_commoninfo) that;
        return (this.getCommoninfoid() == null ? other.getCommoninfoid() == null : this.getCommoninfoid().equals(other.getCommoninfoid()))
            && (this.getCmmName() == null ? other.getCmmName() == null : this.getCmmName().equals(other.getCmmName()))
            && (this.getCmmMenuid() == null ? other.getCmmMenuid() == null : this.getCmmMenuid().equals(other.getCmmMenuid()))
            && (this.getCmmVallue() == null ? other.getCmmVallue() == null : this.getCmmVallue().equals(other.getCmmVallue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommoninfoid() == null) ? 0 : getCommoninfoid().hashCode());
        result = prime * result + ((getCmmName() == null) ? 0 : getCmmName().hashCode());
        result = prime * result + ((getCmmMenuid() == null) ? 0 : getCmmMenuid().hashCode());
        result = prime * result + ((getCmmVallue() == null) ? 0 : getCmmVallue().hashCode());
        return result;
    }
}