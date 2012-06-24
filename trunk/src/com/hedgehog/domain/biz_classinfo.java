package com.hedgehog.domain;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class biz_classinfo {
    private Integer classinfoid;
    @Size(min=1, max=200, message="标题不能为空")
    private String classinfoTitle;
    @NotNull(message="请选择子类")
	@NumberFormat(style = Style.NUMBER)
    private Integer classinfoClass;

    private String classinfoProperties;
    @Size(min=1, max=3000, message="描述不能为空")
    private String classinfoDes;
    @Size(max=100, message="图片超过100字符")
    private String classinfoPic;
   
    private String classinfoPrice;
    @Email(message="邮箱格式不正确")
    private String classinfoEmail;

    private String classinfoName;
    @Size(min=1, max=100, message="地址不能为空")
    private String classinfoAddr;

    private String classinfoCode;
    @Size(min=1, max=50, message="电话不能为空")
    private String classinfoTel;

    private String classinfoIcq;

    private Integer classinfoHits;

    private String classinfoClientip;

    private Date classinfoPublishdate;
    
    private String checkcode;
    
    @NotNull(message="请选择大类")
	@NumberFormat(style = Style.NUMBER)
    private Integer classinfoParentclass;
    
    private biz_classinfoclass classinfoclass;
    
    private CommonsMultipartFile fileData;
    
    private List<biz_reply> list_reply;

    public biz_classinfoclass getClassinfoclass() {
		return classinfoclass;
	}

	public void setClassinfoclass(biz_classinfoclass classinfoclass) {
		this.classinfoclass = classinfoclass;
	}

	public Integer getClassinfoid() {
        return classinfoid;
    }

    public void setClassinfoid(Integer classinfoid) {
        this.classinfoid = classinfoid;
    }

    public String getClassinfoTitle() {
        return classinfoTitle;
    }

    public void setClassinfoTitle(String classinfoTitle) {
        this.classinfoTitle = classinfoTitle;
    }

    public Integer getClassinfoClass() {
        return classinfoClass;
    }

    public void setClassinfoClass(Integer classinfoClass) {
        this.classinfoClass = classinfoClass;
    }

    public String getClassinfoProperties() {
        return classinfoProperties;
    }

    public void setClassinfoProperties(String classinfoProperties) {
        this.classinfoProperties = classinfoProperties;
    }

    public String getClassinfoDes() {
        return classinfoDes;
    }

    public void setClassinfoDes(String classinfoDes) {
        this.classinfoDes = classinfoDes;
    }

    public String getClassinfoPic() {
        return classinfoPic;
    }

    public void setClassinfoPic(String classinfoPic) {
        this.classinfoPic = classinfoPic;
    }

    public String getClassinfoPrice() {
        return classinfoPrice;
    }

    public void setClassinfoPrice(String classinfoPrice) {
        this.classinfoPrice = classinfoPrice;
    }

    public String getClassinfoEmail() {
        return classinfoEmail;
    }

    public void setClassinfoEmail(String classinfoEmail) {
        this.classinfoEmail = classinfoEmail;
    }

    public String getClassinfoName() {
        return classinfoName;
    }

    public void setClassinfoName(String classinfoName) {
        this.classinfoName = classinfoName;
    }

    public String getClassinfoAddr() {
        return classinfoAddr;
    }

    public void setClassinfoAddr(String classinfoAddr) {
        this.classinfoAddr = classinfoAddr;
    }

    public String getClassinfoCode() {
        return classinfoCode;
    }

    public void setClassinfoCode(String classinfoCode) {
        this.classinfoCode = classinfoCode;
    }

    public String getClassinfoTel() {
        return classinfoTel;
    }

    public void setClassinfoTel(String classinfoTel) {
        this.classinfoTel = classinfoTel;
    }

    public String getClassinfoIcq() {
        return classinfoIcq;
    }

    public void setClassinfoIcq(String classinfoIcq) {
        this.classinfoIcq = classinfoIcq;
    }

    public Integer getClassinfoHits() {
        return classinfoHits;
    }

    public void setClassinfoHits(Integer classinfoHits) {
        this.classinfoHits = classinfoHits;
    }

    public String getClassinfoClientip() {
        return classinfoClientip;
    }

    public void setClassinfoClientip(String classinfoClientip) {
        this.classinfoClientip = classinfoClientip;
    }

    public Date getClassinfoPublishdate() {
        return classinfoPublishdate;
    }

    public void setClassinfoPublishdate(Date classinfoPublishdate) {
        this.classinfoPublishdate = classinfoPublishdate;
    }

    public Integer getClassinfoParentclass() {
        return classinfoParentclass;
    }

    public void setClassinfoParentclass(Integer classinfoParentclass) {
        this.classinfoParentclass = classinfoParentclass;
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
        biz_classinfo other = (biz_classinfo) that;
        return (this.getClassinfoid() == null ? other.getClassinfoid() == null : this.getClassinfoid().equals(other.getClassinfoid()))
            && (this.getClassinfoTitle() == null ? other.getClassinfoTitle() == null : this.getClassinfoTitle().equals(other.getClassinfoTitle()))
            && (this.getClassinfoClass() == null ? other.getClassinfoClass() == null : this.getClassinfoClass().equals(other.getClassinfoClass()))
            && (this.getClassinfoProperties() == null ? other.getClassinfoProperties() == null : this.getClassinfoProperties().equals(other.getClassinfoProperties()))
            && (this.getClassinfoDes() == null ? other.getClassinfoDes() == null : this.getClassinfoDes().equals(other.getClassinfoDes()))
            && (this.getClassinfoPic() == null ? other.getClassinfoPic() == null : this.getClassinfoPic().equals(other.getClassinfoPic()))
            && (this.getClassinfoPrice() == null ? other.getClassinfoPrice() == null : this.getClassinfoPrice().equals(other.getClassinfoPrice()))
            && (this.getClassinfoEmail() == null ? other.getClassinfoEmail() == null : this.getClassinfoEmail().equals(other.getClassinfoEmail()))
            && (this.getClassinfoName() == null ? other.getClassinfoName() == null : this.getClassinfoName().equals(other.getClassinfoName()))
            && (this.getClassinfoAddr() == null ? other.getClassinfoAddr() == null : this.getClassinfoAddr().equals(other.getClassinfoAddr()))
            && (this.getClassinfoCode() == null ? other.getClassinfoCode() == null : this.getClassinfoCode().equals(other.getClassinfoCode()))
            && (this.getClassinfoTel() == null ? other.getClassinfoTel() == null : this.getClassinfoTel().equals(other.getClassinfoTel()))
            && (this.getClassinfoIcq() == null ? other.getClassinfoIcq() == null : this.getClassinfoIcq().equals(other.getClassinfoIcq()))
            && (this.getClassinfoHits() == null ? other.getClassinfoHits() == null : this.getClassinfoHits().equals(other.getClassinfoHits()))
            && (this.getClassinfoClientip() == null ? other.getClassinfoClientip() == null : this.getClassinfoClientip().equals(other.getClassinfoClientip()))
            && (this.getClassinfoPublishdate() == null ? other.getClassinfoPublishdate() == null : this.getClassinfoPublishdate().equals(other.getClassinfoPublishdate()))
            && (this.getClassinfoParentclass() == null ? other.getClassinfoParentclass() == null : this.getClassinfoParentclass().equals(other.getClassinfoParentclass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClassinfoid() == null) ? 0 : getClassinfoid().hashCode());
        result = prime * result + ((getClassinfoTitle() == null) ? 0 : getClassinfoTitle().hashCode());
        result = prime * result + ((getClassinfoClass() == null) ? 0 : getClassinfoClass().hashCode());
        result = prime * result + ((getClassinfoProperties() == null) ? 0 : getClassinfoProperties().hashCode());
        result = prime * result + ((getClassinfoDes() == null) ? 0 : getClassinfoDes().hashCode());
        result = prime * result + ((getClassinfoPic() == null) ? 0 : getClassinfoPic().hashCode());
        result = prime * result + ((getClassinfoPrice() == null) ? 0 : getClassinfoPrice().hashCode());
        result = prime * result + ((getClassinfoEmail() == null) ? 0 : getClassinfoEmail().hashCode());
        result = prime * result + ((getClassinfoName() == null) ? 0 : getClassinfoName().hashCode());
        result = prime * result + ((getClassinfoAddr() == null) ? 0 : getClassinfoAddr().hashCode());
        result = prime * result + ((getClassinfoCode() == null) ? 0 : getClassinfoCode().hashCode());
        result = prime * result + ((getClassinfoTel() == null) ? 0 : getClassinfoTel().hashCode());
        result = prime * result + ((getClassinfoIcq() == null) ? 0 : getClassinfoIcq().hashCode());
        result = prime * result + ((getClassinfoHits() == null) ? 0 : getClassinfoHits().hashCode());
        result = prime * result + ((getClassinfoClientip() == null) ? 0 : getClassinfoClientip().hashCode());
        result = prime * result + ((getClassinfoPublishdate() == null) ? 0 : getClassinfoPublishdate().hashCode());
        result = prime * result + ((getClassinfoParentclass() == null) ? 0 : getClassinfoParentclass().hashCode());
        return result;
    }

	public CommonsMultipartFile getFileData() {
		return fileData;
	}

	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}

	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	public List<biz_reply> getList_reply() {
		return list_reply;
	}

	public void setList_reply(List<biz_reply> list_reply) {
		this.list_reply = list_reply;
	}
}