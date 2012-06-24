package com.hedgehog.domain;

public class biz_templet_menu {
    private Integer tmid;

    private String tmTCode;

    private String tmChCode;

    private Integer tmIndex;

    private String tmName;

    private String tmView;

    private String tmTarget;

    private String tmClass;

    private Integer tmEnable;

    private String tmContent;

    public Integer getTmid() {
        return tmid;
    }

    public void setTmid(Integer tmid) {
        this.tmid = tmid;
    }

    public String getTmTCode() {
        return tmTCode;
    }

    public void setTmTCode(String tmTCode) {
        this.tmTCode = tmTCode;
    }

    public String getTmChCode() {
        return tmChCode;
    }

    public void setTmChCode(String tmChCode) {
        this.tmChCode = tmChCode;
    }

    public Integer getTmIndex() {
        return tmIndex;
    }

    public void setTmIndex(Integer tmIndex) {
        this.tmIndex = tmIndex;
    }

    public String getTmName() {
        return tmName;
    }

    public void setTmName(String tmName) {
        this.tmName = tmName;
    }

    public String getTmView() {
        return tmView;
    }

    public void setTmView(String tmView) {
        this.tmView = tmView;
    }

    public String getTmTarget() {
        return tmTarget;
    }

    public void setTmTarget(String tmTarget) {
        this.tmTarget = tmTarget;
    }

    public String getTmClass() {
        return tmClass;
    }

    public void setTmClass(String tmClass) {
        this.tmClass = tmClass;
    }

    public Integer getTmEnable() {
        return tmEnable;
    }

    public void setTmEnable(Integer tmEnable) {
        this.tmEnable = tmEnable;
    }

    public String getTmContent() {
        return tmContent;
    }

    public void setTmContent(String tmContent) {
        this.tmContent = tmContent;
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
        biz_templet_menu other = (biz_templet_menu) that;
        return (this.getTmid() == null ? other.getTmid() == null : this.getTmid().equals(other.getTmid()))
            && (this.getTmTCode() == null ? other.getTmTCode() == null : this.getTmTCode().equals(other.getTmTCode()))
            && (this.getTmChCode() == null ? other.getTmChCode() == null : this.getTmChCode().equals(other.getTmChCode()))
            && (this.getTmIndex() == null ? other.getTmIndex() == null : this.getTmIndex().equals(other.getTmIndex()))
            && (this.getTmName() == null ? other.getTmName() == null : this.getTmName().equals(other.getTmName()))
            && (this.getTmView() == null ? other.getTmView() == null : this.getTmView().equals(other.getTmView()))
            && (this.getTmTarget() == null ? other.getTmTarget() == null : this.getTmTarget().equals(other.getTmTarget()))
            && (this.getTmClass() == null ? other.getTmClass() == null : this.getTmClass().equals(other.getTmClass()))
            && (this.getTmEnable() == null ? other.getTmEnable() == null : this.getTmEnable().equals(other.getTmEnable()))
            && (this.getTmContent() == null ? other.getTmContent() == null : this.getTmContent().equals(other.getTmContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTmid() == null) ? 0 : getTmid().hashCode());
        result = prime * result + ((getTmTCode() == null) ? 0 : getTmTCode().hashCode());
        result = prime * result + ((getTmChCode() == null) ? 0 : getTmChCode().hashCode());
        result = prime * result + ((getTmIndex() == null) ? 0 : getTmIndex().hashCode());
        result = prime * result + ((getTmName() == null) ? 0 : getTmName().hashCode());
        result = prime * result + ((getTmView() == null) ? 0 : getTmView().hashCode());
        result = prime * result + ((getTmTarget() == null) ? 0 : getTmTarget().hashCode());
        result = prime * result + ((getTmClass() == null) ? 0 : getTmClass().hashCode());
        result = prime * result + ((getTmEnable() == null) ? 0 : getTmEnable().hashCode());
        result = prime * result + ((getTmContent() == null) ? 0 : getTmContent().hashCode());
        return result;
    }
}