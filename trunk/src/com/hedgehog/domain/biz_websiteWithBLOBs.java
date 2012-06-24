package com.hedgehog.domain;

public class biz_websiteWithBLOBs extends biz_website {
    private String wFootnote;
    
    private String wFree;

    private String wFreetext;

    public String getwFootnote() {
        return wFootnote;
    }

    public void setwFootnote(String wFootnote) {
        this.wFootnote = wFootnote;
    }
    
    public String getwFree() {
        return wFree;
    }

    public void setwFree(String wFree) {
        this.wFree = wFree;
    }

    public String getwFreetext() {
        return wFreetext;
    }

    public void setwFreetext(String wFreetext) {
        this.wFreetext = wFreetext;
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
        biz_websiteWithBLOBs other = (biz_websiteWithBLOBs) that;
        return (this.getWebsiteid() == null ? other.getWebsiteid() == null : this.getWebsiteid().equals(other.getWebsiteid()))
            && (this.getwMemberid() == null ? other.getwMemberid() == null : this.getwMemberid().equals(other.getwMemberid()))
            && (this.getwTemplet() == null ? other.getwTemplet() == null : this.getwTemplet().equals(other.getwTemplet()))
            && (this.getwBcomtype() == null ? other.getwBcomtype() == null : this.getwBcomtype().equals(other.getwBcomtype()))
            && (this.getwScomtype() == null ? other.getwScomtype() == null : this.getwScomtype().equals(other.getwScomtype()))
            && (this.getwComname() == null ? other.getwComname() == null : this.getwComname().equals(other.getwComname()))
            && (this.getwTitle() == null ? other.getwTitle() == null : this.getwTitle().equals(other.getwTitle()))
            && (this.getEcomname() == null ? other.getEcomname() == null : this.getEcomname().equals(other.getEcomname()))
            && (this.getwCity() == null ? other.getwCity() == null : this.getwCity().equals(other.getwCity()))
            && (this.getwProperty() == null ? other.getwProperty() == null : this.getwProperty().equals(other.getwProperty()))
            && (this.getwAddress() == null ? other.getwAddress() == null : this.getwAddress().equals(other.getwAddress()))
            && (this.getwMail() == null ? other.getwMail() == null : this.getwMail().equals(other.getwMail()))
            && (this.getwTel() == null ? other.getwTel() == null : this.getwTel().equals(other.getwTel()))
            && (this.getwFax() == null ? other.getwFax() == null : this.getwFax().equals(other.getwFax()))
            && (this.getwZip() == null ? other.getwZip() == null : this.getwZip().equals(other.getwZip()))
            && (this.getwCalling() == null ? other.getwCalling() == null : this.getwCalling().equals(other.getwCalling()))
            && (this.getwContacts() == null ? other.getwContacts() == null : this.getwContacts().equals(other.getwContacts()))
            && (this.getwProvince() == null ? other.getwProvince() == null : this.getwProvince().equals(other.getwProvince()))
            && (this.getwLogo() == null ? other.getwLogo() == null : this.getwLogo().equals(other.getwLogo()))
            && (this.getwLogohref() == null ? other.getwLogohref() == null : this.getwLogohref().equals(other.getwLogohref()))
            && (this.getwLogotitle() == null ? other.getwLogotitle() == null : this.getwLogotitle().equals(other.getwLogotitle()))
            && (this.getwCompany() == null ? other.getwCompany() == null : this.getwCompany().equals(other.getwCompany()))
            && (this.getwCompanytext() == null ? other.getwCompanytext() == null : this.getwCompanytext().equals(other.getwCompanytext()))
            && (this.getwUsercomtext() == null ? other.getwUsercomtext() == null : this.getwUsercomtext().equals(other.getwUsercomtext()))
            && (this.getwBanner() == null ? other.getwBanner() == null : this.getwBanner().equals(other.getwBanner()))
            && (this.getwCounter() == null ? other.getwCounter() == null : this.getwCounter().equals(other.getwCounter()))
            && (this.getwDomain() == null ? other.getwDomain() == null : this.getwDomain().equals(other.getwDomain()))
            && (this.getwIcp() == null ? other.getwIcp() == null : this.getwIcp().equals(other.getwIcp()))
            && (this.getwIcphref() == null ? other.getwIcphref() == null : this.getwIcphref().equals(other.getwIcphref()))
            && (this.getwFree() == null ? other.getwFree() == null : this.getwFree().equals(other.getwFree()))
            && (this.getwFootnote() == null ? other.getwFootnote() == null : this.getwFootnote().equals(other.getwFootnote()))
            && (this.getwFreetext() == null ? other.getwFreetext() == null : this.getwFreetext().equals(other.getwFreetext()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWebsiteid() == null) ? 0 : getWebsiteid().hashCode());
        result = prime * result + ((getwMemberid() == null) ? 0 : getwMemberid().hashCode());
        result = prime * result + ((getwTemplet() == null) ? 0 : getwTemplet().hashCode());
        result = prime * result + ((getwBcomtype() == null) ? 0 : getwBcomtype().hashCode());
        result = prime * result + ((getwScomtype() == null) ? 0 : getwScomtype().hashCode());
        result = prime * result + ((getwComname() == null) ? 0 : getwComname().hashCode());
        result = prime * result + ((getwTitle() == null) ? 0 : getwTitle().hashCode());
        result = prime * result + ((getEcomname() == null) ? 0 : getEcomname().hashCode());
        result = prime * result + ((getwCity() == null) ? 0 : getwCity().hashCode());
        result = prime * result + ((getwProperty() == null) ? 0 : getwProperty().hashCode());
        result = prime * result + ((getwAddress() == null) ? 0 : getwAddress().hashCode());
        result = prime * result + ((getwMail() == null) ? 0 : getwMail().hashCode());
        result = prime * result + ((getwTel() == null) ? 0 : getwTel().hashCode());
        result = prime * result + ((getwFax() == null) ? 0 : getwFax().hashCode());
        result = prime * result + ((getwZip() == null) ? 0 : getwZip().hashCode());
        result = prime * result + ((getwCalling() == null) ? 0 : getwCalling().hashCode());
        result = prime * result + ((getwContacts() == null) ? 0 : getwContacts().hashCode());
        result = prime * result + ((getwProvince() == null) ? 0 : getwProvince().hashCode());
        result = prime * result + ((getwLogo() == null) ? 0 : getwLogo().hashCode());
        result = prime * result + ((getwLogohref() == null) ? 0 : getwLogohref().hashCode());
        result = prime * result + ((getwLogotitle() == null) ? 0 : getwLogotitle().hashCode());
        result = prime * result + ((getwCompany() == null) ? 0 : getwCompany().hashCode());
        result = prime * result + ((getwCompanytext() == null) ? 0 : getwCompanytext().hashCode());
        result = prime * result + ((getwUsercomtext() == null) ? 0 : getwUsercomtext().hashCode());
        result = prime * result + ((getwBanner() == null) ? 0 : getwBanner().hashCode());
        result = prime * result + ((getwCounter() == null) ? 0 : getwCounter().hashCode());
        result = prime * result + ((getwDomain() == null) ? 0 : getwDomain().hashCode());
        result = prime * result + ((getwIcp() == null) ? 0 : getwIcp().hashCode());
        result = prime * result + ((getwIcphref() == null) ? 0 : getwIcphref().hashCode());
        result = prime * result + ((getwFree() == null) ? 0 : getwFree().hashCode());
        result = prime * result + ((getwFootnote() == null) ? 0 : getwFootnote().hashCode());
        result = prime * result + ((getwFreetext() == null) ? 0 : getwFreetext().hashCode());
        return result;
    }
}