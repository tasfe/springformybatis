package com.hedgehog.domain;

public class web_limit {
    private Integer limitid;

    private String limitname;

    public Integer getLimitid() {
        return limitid;
    }

    public void setLimitid(Integer limitid) {
        this.limitid = limitid;
    }

    public String getLimitname() {
        return limitname;
    }

    public void setLimitname(String limitname) {
        this.limitname = limitname;
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
        web_limit other = (web_limit) that;
        return (this.getLimitid() == null ? other.getLimitid() == null : this.getLimitid().equals(other.getLimitid()))
            && (this.getLimitname() == null ? other.getLimitname() == null : this.getLimitname().equals(other.getLimitname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLimitid() == null) ? 0 : getLimitid().hashCode());
        result = prime * result + ((getLimitname() == null) ? 0 : getLimitname().hashCode());
        return result;
    }
}