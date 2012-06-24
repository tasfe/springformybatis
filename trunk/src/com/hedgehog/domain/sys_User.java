package com.hedgehog.domain;

import java.util.Date;

import javax.validation.constraints.Size;

public class sys_User implements java.io.Serializable{
    private Integer userid;
    @Size(min=1, max=20, message="用户名不能为空")
    private String uLoginname;    
    private String uPassword;
    @Size(max=20, message="中文名超过20字符")
    private String uCname;

    private String uEname;

    private Integer uGroupid;

    private String uEmail;

    private Byte uType;

    private Byte uStatus;

    private String uLicence;

    private String uMac;

    private String uRemark;

    private String uIdcard;

    private Byte uSex;

    private Date uBirthday;

    private String uMobileno;

    private String uUserno;

    private Date uWorkstartdate;

    private Date uWorkenddate;

    private String uCompanymail;

    private Integer uTitle;

    private String uExtension;

    private String uHometel;

    private String uPhotourl;

    private Date uDatetime;

    private String uLastip;

    private Date uLastdatetime;

    private String uExtendfield;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getuLoginname() {
        return uLoginname;
    }

    public void setuLoginname(String uLoginname) {
        this.uLoginname = uLoginname;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuCname() {
        return uCname;
    }

    public void setuCname(String uCname) {
        this.uCname = uCname;
    }

    public String getuEname() {
        return uEname;
    }

    public void setuEname(String uEname) {
        this.uEname = uEname;
    }

    public Integer getuGroupid() {
        return uGroupid;
    }

    public void setuGroupid(Integer uGroupid) {
        this.uGroupid = uGroupid;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public Byte getuType() {
        return uType;
    }

    public void setuType(Byte uType) {
        this.uType = uType;
    }

    public Byte getuStatus() {
        return uStatus;
    }

    public void setuStatus(Byte uStatus) {
        this.uStatus = uStatus;
    }

    public String getuLicence() {
        return uLicence;
    }

    public void setuLicence(String uLicence) {
        this.uLicence = uLicence;
    }

    public String getuMac() {
        return uMac;
    }

    public void setuMac(String uMac) {
        this.uMac = uMac;
    }

    public String getuRemark() {
        return uRemark;
    }

    public void setuRemark(String uRemark) {
        this.uRemark = uRemark;
    }

    public String getuIdcard() {
        return uIdcard;
    }

    public void setuIdcard(String uIdcard) {
        this.uIdcard = uIdcard;
    }

    public Byte getuSex() {
        return uSex;
    }

    public void setuSex(Byte uSex) {
        this.uSex = uSex;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    public String getuMobileno() {
        return uMobileno;
    }

    public void setuMobileno(String uMobileno) {
        this.uMobileno = uMobileno;
    }

    public String getuUserno() {
        return uUserno;
    }

    public void setuUserno(String uUserno) {
        this.uUserno = uUserno;
    }

    public Date getuWorkstartdate() {
        return uWorkstartdate;
    }

    public void setuWorkstartdate(Date uWorkstartdate) {
        this.uWorkstartdate = uWorkstartdate;
    }

    public Date getuWorkenddate() {
        return uWorkenddate;
    }

    public void setuWorkenddate(Date uWorkenddate) {
        this.uWorkenddate = uWorkenddate;
    }

    public String getuCompanymail() {
        return uCompanymail;
    }

    public void setuCompanymail(String uCompanymail) {
        this.uCompanymail = uCompanymail;
    }

    public Integer getuTitle() {
        return uTitle;
    }

    public void setuTitle(Integer uTitle) {
        this.uTitle = uTitle;
    }

    public String getuExtension() {
        return uExtension;
    }

    public void setuExtension(String uExtension) {
        this.uExtension = uExtension;
    }

    public String getuHometel() {
        return uHometel;
    }

    public void setuHometel(String uHometel) {
        this.uHometel = uHometel;
    }

    public String getuPhotourl() {
        return uPhotourl;
    }

    public void setuPhotourl(String uPhotourl) {
        this.uPhotourl = uPhotourl;
    }

    public Date getuDatetime() {
        return uDatetime;
    }

    public void setuDatetime(Date uDatetime) {
        this.uDatetime = uDatetime;
    }

    public String getuLastip() {
        return uLastip;
    }

    public void setuLastip(String uLastip) {
        this.uLastip = uLastip;
    }

    public Date getuLastdatetime() {
        return uLastdatetime;
    }

    public void setuLastdatetime(Date uLastdatetime) {
        this.uLastdatetime = uLastdatetime;
    }

    public String getuExtendfield() {
        return uExtendfield;
    }

    public void setuExtendfield(String uExtendfield) {
        this.uExtendfield = uExtendfield;
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
        sys_User other = (sys_User) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getuLoginname() == null ? other.getuLoginname() == null : this.getuLoginname().equals(other.getuLoginname()))
            && (this.getuPassword() == null ? other.getuPassword() == null : this.getuPassword().equals(other.getuPassword()))
            && (this.getuCname() == null ? other.getuCname() == null : this.getuCname().equals(other.getuCname()))
            && (this.getuEname() == null ? other.getuEname() == null : this.getuEname().equals(other.getuEname()))
            && (this.getuGroupid() == null ? other.getuGroupid() == null : this.getuGroupid().equals(other.getuGroupid()))
            && (this.getuEmail() == null ? other.getuEmail() == null : this.getuEmail().equals(other.getuEmail()))
            && (this.getuType() == null ? other.getuType() == null : this.getuType().equals(other.getuType()))
            && (this.getuStatus() == null ? other.getuStatus() == null : this.getuStatus().equals(other.getuStatus()))
            && (this.getuLicence() == null ? other.getuLicence() == null : this.getuLicence().equals(other.getuLicence()))
            && (this.getuMac() == null ? other.getuMac() == null : this.getuMac().equals(other.getuMac()))
            && (this.getuRemark() == null ? other.getuRemark() == null : this.getuRemark().equals(other.getuRemark()))
            && (this.getuIdcard() == null ? other.getuIdcard() == null : this.getuIdcard().equals(other.getuIdcard()))
            && (this.getuSex() == null ? other.getuSex() == null : this.getuSex().equals(other.getuSex()))
            && (this.getuBirthday() == null ? other.getuBirthday() == null : this.getuBirthday().equals(other.getuBirthday()))
            && (this.getuMobileno() == null ? other.getuMobileno() == null : this.getuMobileno().equals(other.getuMobileno()))
            && (this.getuUserno() == null ? other.getuUserno() == null : this.getuUserno().equals(other.getuUserno()))
            && (this.getuWorkstartdate() == null ? other.getuWorkstartdate() == null : this.getuWorkstartdate().equals(other.getuWorkstartdate()))
            && (this.getuWorkenddate() == null ? other.getuWorkenddate() == null : this.getuWorkenddate().equals(other.getuWorkenddate()))
            && (this.getuCompanymail() == null ? other.getuCompanymail() == null : this.getuCompanymail().equals(other.getuCompanymail()))
            && (this.getuTitle() == null ? other.getuTitle() == null : this.getuTitle().equals(other.getuTitle()))
            && (this.getuExtension() == null ? other.getuExtension() == null : this.getuExtension().equals(other.getuExtension()))
            && (this.getuHometel() == null ? other.getuHometel() == null : this.getuHometel().equals(other.getuHometel()))
            && (this.getuPhotourl() == null ? other.getuPhotourl() == null : this.getuPhotourl().equals(other.getuPhotourl()))
            && (this.getuDatetime() == null ? other.getuDatetime() == null : this.getuDatetime().equals(other.getuDatetime()))
            && (this.getuLastip() == null ? other.getuLastip() == null : this.getuLastip().equals(other.getuLastip()))
            && (this.getuLastdatetime() == null ? other.getuLastdatetime() == null : this.getuLastdatetime().equals(other.getuLastdatetime()))
            && (this.getuExtendfield() == null ? other.getuExtendfield() == null : this.getuExtendfield().equals(other.getuExtendfield()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getuLoginname() == null) ? 0 : getuLoginname().hashCode());
        result = prime * result + ((getuPassword() == null) ? 0 : getuPassword().hashCode());
        result = prime * result + ((getuCname() == null) ? 0 : getuCname().hashCode());
        result = prime * result + ((getuEname() == null) ? 0 : getuEname().hashCode());
        result = prime * result + ((getuGroupid() == null) ? 0 : getuGroupid().hashCode());
        result = prime * result + ((getuEmail() == null) ? 0 : getuEmail().hashCode());
        result = prime * result + ((getuType() == null) ? 0 : getuType().hashCode());
        result = prime * result + ((getuStatus() == null) ? 0 : getuStatus().hashCode());
        result = prime * result + ((getuLicence() == null) ? 0 : getuLicence().hashCode());
        result = prime * result + ((getuMac() == null) ? 0 : getuMac().hashCode());
        result = prime * result + ((getuRemark() == null) ? 0 : getuRemark().hashCode());
        result = prime * result + ((getuIdcard() == null) ? 0 : getuIdcard().hashCode());
        result = prime * result + ((getuSex() == null) ? 0 : getuSex().hashCode());
        result = prime * result + ((getuBirthday() == null) ? 0 : getuBirthday().hashCode());
        result = prime * result + ((getuMobileno() == null) ? 0 : getuMobileno().hashCode());
        result = prime * result + ((getuUserno() == null) ? 0 : getuUserno().hashCode());
        result = prime * result + ((getuWorkstartdate() == null) ? 0 : getuWorkstartdate().hashCode());
        result = prime * result + ((getuWorkenddate() == null) ? 0 : getuWorkenddate().hashCode());
        result = prime * result + ((getuCompanymail() == null) ? 0 : getuCompanymail().hashCode());
        result = prime * result + ((getuTitle() == null) ? 0 : getuTitle().hashCode());
        result = prime * result + ((getuExtension() == null) ? 0 : getuExtension().hashCode());
        result = prime * result + ((getuHometel() == null) ? 0 : getuHometel().hashCode());
        result = prime * result + ((getuPhotourl() == null) ? 0 : getuPhotourl().hashCode());
        result = prime * result + ((getuDatetime() == null) ? 0 : getuDatetime().hashCode());
        result = prime * result + ((getuLastip() == null) ? 0 : getuLastip().hashCode());
        result = prime * result + ((getuLastdatetime() == null) ? 0 : getuLastdatetime().hashCode());
        result = prime * result + ((getuExtendfield() == null) ? 0 : getuExtendfield().hashCode());
        return result;
    }
}