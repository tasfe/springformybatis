package com.hedgehog.domain;

import javax.validation.constraints.Size;

public class biz_channel {
    private Integer channelid;
    
    private String chName;
    
    private String chCode;

    private String chUrl;

    private String chEditor;

    private Byte chReadonly;

    private String chHavesub;

    public Integer getChannelid() {
        return channelid;
    }

    public void setChannelid(Integer channelid) {
        this.channelid = channelid;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public String getChCode() {
        return chCode;
    }

    public void setChCode(String chCode) {
        this.chCode = chCode;
    }

    public String getChUrl() {
        return chUrl;
    }

    public void setChUrl(String chUrl) {
        this.chUrl = chUrl;
    }

    public String getChEditor() {
        return chEditor;
    }

    public void setChEditor(String chEditor) {
        this.chEditor = chEditor;
    }

    public Byte getChReadonly() {
        return chReadonly;
    }

    public void setChReadonly(Byte chReadonly) {
        this.chReadonly = chReadonly;
    }

    public String getChHavesub() {
        return chHavesub;
    }

    public void setChHavesub(String chHavesub) {
        this.chHavesub = chHavesub;
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
        biz_channel other = (biz_channel) that;
        return (this.getChannelid() == null ? other.getChannelid() == null : this.getChannelid().equals(other.getChannelid()))
            && (this.getChName() == null ? other.getChName() == null : this.getChName().equals(other.getChName()))
            && (this.getChCode() == null ? other.getChCode() == null : this.getChCode().equals(other.getChCode()))
            && (this.getChUrl() == null ? other.getChUrl() == null : this.getChUrl().equals(other.getChUrl()))
            && (this.getChEditor() == null ? other.getChEditor() == null : this.getChEditor().equals(other.getChEditor()))
            && (this.getChReadonly() == null ? other.getChReadonly() == null : this.getChReadonly().equals(other.getChReadonly()))
            && (this.getChHavesub() == null ? other.getChHavesub() == null : this.getChHavesub().equals(other.getChHavesub()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelid() == null) ? 0 : getChannelid().hashCode());
        result = prime * result + ((getChName() == null) ? 0 : getChName().hashCode());
        result = prime * result + ((getChCode() == null) ? 0 : getChCode().hashCode());
        result = prime * result + ((getChUrl() == null) ? 0 : getChUrl().hashCode());
        result = prime * result + ((getChEditor() == null) ? 0 : getChEditor().hashCode());
        result = prime * result + ((getChReadonly() == null) ? 0 : getChReadonly().hashCode());
        result = prime * result + ((getChHavesub() == null) ? 0 : getChHavesub().hashCode());
        return result;
    }
}