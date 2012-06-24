package com.hedgehog.domain;

public class biz_submenuoper {
    private Integer submenuoperid;

    private Integer submenuoperParentid;

    private String submenuoperName;

    private String submenuoperLink;

    private Integer submenuoperOrder;

    private String submenuoperClass;

    private String submenuoperTarget;

    public Integer getSubmenuoperid() {
        return submenuoperid;
    }

    public void setSubmenuoperid(Integer submenuoperid) {
        this.submenuoperid = submenuoperid;
    }

    public Integer getSubmenuoperParentid() {
        return submenuoperParentid;
    }

    public void setSubmenuoperParentid(Integer submenuoperParentid) {
        this.submenuoperParentid = submenuoperParentid;
    }

    public String getSubmenuoperName() {
        return submenuoperName;
    }

    public void setSubmenuoperName(String submenuoperName) {
        this.submenuoperName = submenuoperName;
    }

    public String getSubmenuoperLink() {
        return submenuoperLink;
    }

    public void setSubmenuoperLink(String submenuoperLink) {
        this.submenuoperLink = submenuoperLink;
    }

    public Integer getSubmenuoperOrder() {
        return submenuoperOrder;
    }

    public void setSubmenuoperOrder(Integer submenuoperOrder) {
        this.submenuoperOrder = submenuoperOrder;
    }

    public String getSubmenuoperClass() {
        return submenuoperClass;
    }

    public void setSubmenuoperClass(String submenuoperClass) {
        this.submenuoperClass = submenuoperClass;
    }

    public String getSubmenuoperTarget() {
        return submenuoperTarget;
    }

    public void setSubmenuoperTarget(String submenuoperTarget) {
        this.submenuoperTarget = submenuoperTarget;
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
        biz_submenuoper other = (biz_submenuoper) that;
        return (this.getSubmenuoperid() == null ? other.getSubmenuoperid() == null : this.getSubmenuoperid().equals(other.getSubmenuoperid()))
            && (this.getSubmenuoperParentid() == null ? other.getSubmenuoperParentid() == null : this.getSubmenuoperParentid().equals(other.getSubmenuoperParentid()))
            && (this.getSubmenuoperName() == null ? other.getSubmenuoperName() == null : this.getSubmenuoperName().equals(other.getSubmenuoperName()))
            && (this.getSubmenuoperLink() == null ? other.getSubmenuoperLink() == null : this.getSubmenuoperLink().equals(other.getSubmenuoperLink()))
            && (this.getSubmenuoperOrder() == null ? other.getSubmenuoperOrder() == null : this.getSubmenuoperOrder().equals(other.getSubmenuoperOrder()))
            && (this.getSubmenuoperClass() == null ? other.getSubmenuoperClass() == null : this.getSubmenuoperClass().equals(other.getSubmenuoperClass()))
            && (this.getSubmenuoperTarget() == null ? other.getSubmenuoperTarget() == null : this.getSubmenuoperTarget().equals(other.getSubmenuoperTarget()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSubmenuoperid() == null) ? 0 : getSubmenuoperid().hashCode());
        result = prime * result + ((getSubmenuoperParentid() == null) ? 0 : getSubmenuoperParentid().hashCode());
        result = prime * result + ((getSubmenuoperName() == null) ? 0 : getSubmenuoperName().hashCode());
        result = prime * result + ((getSubmenuoperLink() == null) ? 0 : getSubmenuoperLink().hashCode());
        result = prime * result + ((getSubmenuoperOrder() == null) ? 0 : getSubmenuoperOrder().hashCode());
        result = prime * result + ((getSubmenuoperClass() == null) ? 0 : getSubmenuoperClass().hashCode());
        result = prime * result + ((getSubmenuoperTarget() == null) ? 0 : getSubmenuoperTarget().hashCode());
        return result;
    }
}