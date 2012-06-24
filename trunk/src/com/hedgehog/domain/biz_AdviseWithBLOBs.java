package com.hedgehog.domain;

public class biz_AdviseWithBLOBs extends biz_Advise {
    private String adviseOntent;

    private String adviseReply;

    public String getAdviseOntent() {
        return adviseOntent;
    }

    public void setAdviseOntent(String adviseOntent) {
        this.adviseOntent = adviseOntent;
    }

    public String getAdviseReply() {
        return adviseReply;
    }

    public void setAdviseReply(String adviseReply) {
        this.adviseReply = adviseReply;
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
        biz_AdviseWithBLOBs other = (biz_AdviseWithBLOBs) that;
        return (this.getAdviseid() == null ? other.getAdviseid() == null : this.getAdviseid().equals(other.getAdviseid()))
            && (this.getAdviseName() == null ? other.getAdviseName() == null : this.getAdviseName().equals(other.getAdviseName()))
            && (this.getAdviseAdminflag() == null ? other.getAdviseAdminflag() == null : this.getAdviseAdminflag().equals(other.getAdviseAdminflag()))
            && (this.getAdviseTitle() == null ? other.getAdviseTitle() == null : this.getAdviseTitle().equals(other.getAdviseTitle()))
            && (this.getAdviseAddate() == null ? other.getAdviseAddate() == null : this.getAdviseAddate().equals(other.getAdviseAddate()))
            && (this.getAdviseIsread() == null ? other.getAdviseIsread() == null : this.getAdviseIsread().equals(other.getAdviseIsread()))
            && (this.getAdviseOntent() == null ? other.getAdviseOntent() == null : this.getAdviseOntent().equals(other.getAdviseOntent()))
            && (this.getAdviseReply() == null ? other.getAdviseReply() == null : this.getAdviseReply().equals(other.getAdviseReply()));
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
        result = prime * result + ((getAdviseOntent() == null) ? 0 : getAdviseOntent().hashCode());
        result = prime * result + ((getAdviseReply() == null) ? 0 : getAdviseReply().hashCode());
        return result;
    }
}