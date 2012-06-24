package com.hedgehog.domain;

public class biz_ComType {
    private Integer comtypeid;

    private String comtypeName;

    private String comtypeCode;

    public Integer getComtypeid() {
        return comtypeid;
    }

    public void setComtypeid(Integer comtypeid) {
        this.comtypeid = comtypeid;
    }

    public String getComtypeName() {
        return comtypeName;
    }

    public void setComtypeName(String comtypeName) {
        this.comtypeName = comtypeName;
    }

    public String getComtypeCode() {
        return comtypeCode;
    }

    public void setComtypeCode(String comtypeCode) {
        this.comtypeCode = comtypeCode;
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
        biz_ComType other = (biz_ComType) that;
        return (this.getComtypeid() == null ? other.getComtypeid() == null : this.getComtypeid().equals(other.getComtypeid()))
            && (this.getComtypeName() == null ? other.getComtypeName() == null : this.getComtypeName().equals(other.getComtypeName()))
            && (this.getComtypeCode() == null ? other.getComtypeCode() == null : this.getComtypeCode().equals(other.getComtypeCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getComtypeid() == null) ? 0 : getComtypeid().hashCode());
        result = prime * result + ((getComtypeName() == null) ? 0 : getComtypeName().hashCode());
        result = prime * result + ((getComtypeCode() == null) ? 0 : getComtypeCode().hashCode());
        return result;
    }
}