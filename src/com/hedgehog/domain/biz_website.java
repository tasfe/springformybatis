package com.hedgehog.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class biz_website {
    private Integer websiteid;

    private Integer wMemberid;

    private String wTemplet;
    
    
    @Size(min=1, max=50, message="请选择行业")
    private String wBcomtype;

    private Integer wScomtype;

    @Size(min=1, max=250, message="企业名称不能为空")
    private String wComname;

    private String wTitle;

    private String ecomname;

    @NotNull(message="请选择城市")
    @NumberFormat(style = Style.NUMBER)
    private Integer wCity;

    
    private String wProperty;

    @Size(min=1, max=250, message="地址不能为空")
    private String wAddress;

    @Size(min=1, max=50, message="邮件地址不能为空")
    @Email(message="邮箱格式不正确")
    private String wMail;
    @Size(min=1, max=50, message="电话不能为空")
    private String wTel;

    private String wFax;
    @Size(min=1, max=50, message="邮编不能为空")
    private String wZip;

    private String wCalling;

    private String wContacts;
    
    @NotNull(message="请选择省份")
    @NumberFormat(style = Style.NUMBER)
    private Integer wProvince;
    
    private biz_province province;

    private String wLogo;
    
    private CommonsMultipartFile wLogofileData;

    private String wLogohref;

    private String wLogotitle;
    @Size(max=250, message="网站名称不能为空")
    private String wCompany;
    
    private CommonsMultipartFile wCompanyfileData;

    private String wCompanytext;

    private Integer wUsercomtext;

    private String wBanner;
    
    private CommonsMultipartFile wBannerfileData;

    private Long wCounter;

    private String wDomain;

    private String wIcp;

    private String wIcphref;

    //private String wFootnote;
    
    private biz_member member;
    private biz_city city;
    
    private String[] websiteFlag;

    public String[] getWebsiteFlag() {
    	if(this.wProperty!=null)
		{
				return this.wProperty.split(",");
		}
		return null;
		//return websiteFlag;
	}

	public void setWebsiteFlag(String[] websiteFlag) {
		if(websiteFlag!=null)
		{
			if(websiteFlag.length>0)
			{
				//this.newsProperties=newsFlag.toString();
				StringBuffer buf  = new StringBuffer();
				for(String str:websiteFlag)
					{
						//System.out.println(str);
						buf.append(str+",");
					}
				String oldStr=buf.toString();
				if(oldStr!="")
				{
					this.wProperty=oldStr.substring(0,oldStr.length() - 1); 
				}
				
			}
			
			
		}
		//this.websiteFlag = websiteFlag;
	}

	public biz_member getMember() {
		return member;
	}

	public void setMember(biz_member member) {
		this.member = member;
	}

	public biz_city getCity() {
		return city;
	}

	public void setCity(biz_city city) {
		this.city = city;
	}

	public Integer getWebsiteid() {
        return websiteid;
    }

    public void setWebsiteid(Integer websiteid) {
        this.websiteid = websiteid;
    }

    public Integer getwMemberid() {
        return wMemberid;
    }

    public void setwMemberid(Integer wMemberid) {
        this.wMemberid = wMemberid;
    }

    public String getwTemplet() {
        return wTemplet;
    }

    public void setwTemplet(String wTemplet) {
        this.wTemplet = wTemplet;
    }

    public String getwBcomtype() {
        return wBcomtype;
    }

    public void setwBcomtype(String wBcomtype) {
        this.wBcomtype = wBcomtype;
    }

    public Integer getwScomtype() {
        return wScomtype;
    }

    public void setwScomtype(Integer wScomtype) {
        this.wScomtype = wScomtype;
    }

    public String getwComname() {
        return wComname;
    }

    public void setwComname(String wComname) {
        this.wComname = wComname;
    }

    public String getwTitle() {
        return wTitle;
    }

    public void setwTitle(String wTitle) {
        this.wTitle = wTitle;
    }

    public String getEcomname() {
        return ecomname;
    }

    public void setEcomname(String ecomname) {
        this.ecomname = ecomname;
    }

    public Integer getwCity() {
        return wCity;
    }

    public void setwCity(Integer wCity) {
        this.wCity = wCity;
    }

    public String getwProperty() {
        return wProperty;
    }

    public void setwProperty(String wProperty) {
        this.wProperty = wProperty;
    }

    public String getwAddress() {
        return wAddress;
    }

    public void setwAddress(String wAddress) {
        this.wAddress = wAddress;
    }

    public String getwMail() {
        return wMail;
    }

    public void setwMail(String wMail) {
        this.wMail = wMail;
    }

    public String getwTel() {
        return wTel;
    }

    public void setwTel(String wTel) {
        this.wTel = wTel;
    }

    public String getwFax() {
        return wFax;
    }

    public void setwFax(String wFax) {
        this.wFax = wFax;
    }

    public String getwZip() {
        return wZip;
    }

    public void setwZip(String wZip) {
        this.wZip = wZip;
    }

    public String getwCalling() {
        return wCalling;
    }

    public void setwCalling(String wCalling) {
        this.wCalling = wCalling;
    }

    public String getwContacts() {
        return wContacts;
    }

    public void setwContacts(String wContacts) {
        this.wContacts = wContacts;
    }

    public Integer getwProvince() {
        return wProvince;
    }

    public void setwProvince(Integer wProvince) {
        this.wProvince = wProvince;
    }

    public String getwLogo() {
        return wLogo;
    }

    public void setwLogo(String wLogo) {
        this.wLogo = wLogo;
    }

    public String getwLogohref() {
        return wLogohref;
    }

    public void setwLogohref(String wLogohref) {
        this.wLogohref = wLogohref;
    }

    public String getwLogotitle() {
        return wLogotitle;
    }

    public void setwLogotitle(String wLogotitle) {
        this.wLogotitle = wLogotitle;
    }

    public String getwCompany() {
        return wCompany;
    }

    public void setwCompany(String wCompany) {
        this.wCompany = wCompany;
    }

    public String getwCompanytext() {
        return wCompanytext;
    }

    public void setwCompanytext(String wCompanytext) {
        this.wCompanytext = wCompanytext;
    }

    public Integer getwUsercomtext() {
        return wUsercomtext;
    }

    public void setwUsercomtext(Integer wUsercomtext) {
        this.wUsercomtext = wUsercomtext;
    }

    public String getwBanner() {
        return wBanner;
    }

    public void setwBanner(String wBanner) {
        this.wBanner = wBanner;
    }

    public Long getwCounter() {
        return wCounter;
    }

    public void setwCounter(Long wCounter) {
        this.wCounter = wCounter;
    }

    public String getwDomain() {
        return wDomain;
    }

    public void setwDomain(String wDomain) {
        this.wDomain = wDomain;
    }

    public String getwIcp() {
        return wIcp;
    }

    public void setwIcp(String wIcp) {
        this.wIcp = wIcp;
    }

    public String getwIcphref() {
        return wIcphref;
    }

    public void setwIcphref(String wIcphref) {
        this.wIcphref = wIcphref;
    }

//    public String getwFootnote() {
//        return wFootnote;
//    }
//
//    public void setwFootnote(String wFootnote) {
//        this.wFootnote = wFootnote;
//    }

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
        biz_website other = (biz_website) that;
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
            && (this.getwIcphref() == null ? other.getwIcphref() == null : this.getwIcphref().equals(other.getwIcphref()));
            //&& (this.getwFootnote() == null ? other.getwFootnote() == null : this.getwFootnote().equals(other.getwFootnote()));
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
        //result = prime * result + ((getwFootnote() == null) ? 0 : getwFootnote().hashCode());
        return result;
    }

	public CommonsMultipartFile getWLogofileData() {
		return wLogofileData;
	}

	public void setWLogofileData(CommonsMultipartFile logofileData) {
		wLogofileData = logofileData;
	}

	public CommonsMultipartFile getWCompanyfileData() {
		return wCompanyfileData;
	}

	public void setWCompanyfileData(CommonsMultipartFile companyfileData) {
		wCompanyfileData = companyfileData;
	}

	public CommonsMultipartFile getWBannerfileData() {
		return wBannerfileData;
	}

	public void setWBannerfileData(CommonsMultipartFile bannerfileData) {
		wBannerfileData = bannerfileData;
	}

	public biz_province getProvince() {
		return province;
	}

	public void setProvince(biz_province province) {
		this.province = province;
	}
}