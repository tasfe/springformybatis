package com.hedgehog.domain;

import java.util.List;

import javax.validation.constraints.Size;



public class sys_Applications implements java.io.Serializable{
    private Integer applicationid;
    @Size(min=1, max=200, message="应用名称不能为空")
    private String aAppname;

    private String aAppdescription;

    private String aAppurl;

    private Integer aOrder;
    
    private List<sys_Module> list_module;

    public Integer getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(Integer applicationid) {
        this.applicationid = applicationid;
    }

    public String getaAppname() {
        return aAppname;
    }

    public void setaAppname(String aAppname) {
        this.aAppname = aAppname;
    }

    public String getaAppdescription() {
        return aAppdescription;
    }

    public void setaAppdescription(String aAppdescription) {
        this.aAppdescription = aAppdescription;
    }

    public String getaAppurl() {
        return aAppurl;
    }

    public void setaAppurl(String aAppurl) {
        this.aAppurl = aAppurl;
    }

    public Integer getaOrder() {
        return aOrder;
    }

    public void setaOrder(Integer aOrder) {
        this.aOrder = aOrder;
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
        sys_Applications other = (sys_Applications) that;
        return (this.getApplicationid() == null ? other.getApplicationid() == null : this.getApplicationid().equals(other.getApplicationid()))
            && (this.getaAppname() == null ? other.getaAppname() == null : this.getaAppname().equals(other.getaAppname()))
            && (this.getaAppdescription() == null ? other.getaAppdescription() == null : this.getaAppdescription().equals(other.getaAppdescription()))
            && (this.getaAppurl() == null ? other.getaAppurl() == null : this.getaAppurl().equals(other.getaAppurl()))
            && (this.getaOrder() == null ? other.getaOrder() == null : this.getaOrder().equals(other.getaOrder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApplicationid() == null) ? 0 : getApplicationid().hashCode());
        result = prime * result + ((getaAppname() == null) ? 0 : getaAppname().hashCode());
        result = prime * result + ((getaAppdescription() == null) ? 0 : getaAppdescription().hashCode());
        result = prime * result + ((getaAppurl() == null) ? 0 : getaAppurl().hashCode());
        result = prime * result + ((getaOrder() == null) ? 0 : getaOrder().hashCode());
        return result;
    }

	public List<sys_Module> getList_module() {
		return list_module;
	}

	public void setList_module(List<sys_Module> list_module) {
		this.list_module = list_module;
	}
}