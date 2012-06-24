package com.hedgehog.domain;

import java.util.Date;

public class biz_Advise {
    private Integer adviseid;

    private String adviseName;

    private Integer adviseAdminflag;

    private String adviseTitle;

    private Date adviseAddate;

    private Byte adviseIsread;

    public Integer getAdviseid() {
        return adviseid;
    }

    public void setAdviseid(Integer adviseid) {
        this.adviseid = adviseid;
    }

    public String getAdviseName() {
        return adviseName;
    }

    public void setAdviseName(String adviseName) {
        this.adviseName = adviseName;
    }

    public Integer getAdviseAdminflag() {
        return adviseAdminflag;
    }

    public void setAdviseAdminflag(Integer adviseAdminflag) {
        this.adviseAdminflag = adviseAdminflag;
    }

    public String getAdviseTitle() {
        return adviseTitle;
    }

    public void setAdviseTitle(String adviseTitle) {
        this.adviseTitle = adviseTitle;
    }

    public Date getAdviseAddate() {
        return adviseAddate;
    }

    public void setAdviseAddate(Date adviseAddate) {
        this.adviseAddate = adviseAddate;
    }

    public Byte getAdviseIsread() {
        return adviseIsread;
    }

    public void setAdviseIsread(Byte adviseIsread) {
        this.adviseIsread = adviseIsread;
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
        biz_Advise other = (biz_Advise) that;
        return (this.getAdviseid() == null ? other.getAdviseid() == null : this.getAdviseid().equals(other.getAdviseid()))
            && (this.getAdviseName() == null ? other.getAdviseName() == null : this.getAdviseName().equals(other.getAdviseName()))
            && (this.getAdviseAdminflag() == null ? other.getAdviseAdminflag() == null : this.getAdviseAdminflag().equals(other.getAdviseAdminflag()))
            && (this.getAdviseTitle() == null ? other.getAdviseTitle() == null : this.getAdviseTitle().equals(other.getAdviseTitle()))
            && (this.getAdviseAddate() == null ? other.getAdviseAddate() == null : this.getAdviseAddate().equals(other.getAdviseAddate()))
            && (this.getAdviseIsread() == null ? other.getAdviseIsread() == null : this.getAdviseIsread().equals(other.getAdviseIsread()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdviseid() == null) ? 0 : getAdviseid().hashCode());
        result = prime * result + ((getAdviseName() == null) ? 0 : getAdviseName().hashCode());
        result = prime * result + ((getAdviseAdminflag() == null) ? 0 : getAdviseAdminflag().hashCode());
        result = prime * result + ((getAdviseTitle() == null) ? 0 : getAdviseTitle().hashCode());
        result = prime * result + ((getAdviseAddate() == null) ? 0 : getAdviseAddate().hashCode());
        result = prime * result + ((getAdviseIsread() == null) ? 0 : getAdviseIsread().hashCode());
        return result;
    }
}