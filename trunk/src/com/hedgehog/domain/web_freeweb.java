package com.hedgehog.domain;

import javax.validation.constraints.Size;

public class web_freeweb {
    private Integer freewebid;

    private Integer freewebMenuid;

    private String freewebSummery;

    private String freewebKeywords;
    @Size(min=1, message="内容不能为空")
    private String freewebContent;

    public Integer getFreewebid() {
        return freewebid;
    }

    public void setFreewebid(Integer freewebid) {
        this.freewebid = freewebid;
    }

    public Integer getFreewebMenuid() {
        return freewebMenuid;
    }

    public void setFreewebMenuid(Integer freewebMenuid) {
        this.freewebMenuid = freewebMenuid;
    }

    public String getFreewebSummery() {
        return freewebSummery;
    }

    public void setFreewebSummery(String freewebSummery) {
        this.freewebSummery = freewebSummery;
    }

    public String getFreewebKeywords() {
        return freewebKeywords;
    }

    public void setFreewebKeywords(String freewebKeywords) {
        this.freewebKeywords = freewebKeywords;
    }

    public String getFreewebContent() {
        return freewebContent;
    }

    public void setFreewebContent(String freewebContent) {
        this.freewebContent = freewebContent;
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
        web_freeweb other = (web_freeweb) that;
        return (this.getFreewebid() == null ? other.getFreewebid() == null : this.getFreewebid().equals(other.getFreewebid()))
            && (this.getFreewebMenuid() == null ? other.getFreewebMenuid() == null : this.getFreewebMenuid().equals(other.getFreewebMenuid()))
            && (this.getFreewebSummery() == null ? other.getFreewebSummery() == null : this.getFreewebSummery().equals(other.getFreewebSummery()))
            && (this.getFreewebKeywords() == null ? other.getFreewebKeywords() == null : this.getFreewebKeywords().equals(other.getFreewebKeywords()))
            && (this.getFreewebContent() == null ? other.getFreewebContent() == null : this.getFreewebContent().equals(other.getFreewebContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFreewebid() == null) ? 0 : getFreewebid().hashCode());
        result = prime * result + ((getFreewebMenuid() == null) ? 0 : getFreewebMenuid().hashCode());
        result = prime * result + ((getFreewebSummery() == null) ? 0 : getFreewebSummery().hashCode());
        result = prime * result + ((getFreewebKeywords() == null) ? 0 : getFreewebKeywords().hashCode());
        result = prime * result + ((getFreewebContent() == null) ? 0 : getFreewebContent().hashCode());
        return result;
    }
}