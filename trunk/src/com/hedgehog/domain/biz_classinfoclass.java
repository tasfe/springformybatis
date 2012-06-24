package com.hedgehog.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class biz_classinfoclass implements Serializable{
	private Integer cicid;

    private Integer cicParentid;

    private String cicName;

    private String cicCode;

    private Integer cicOrder;
    public Integer getCicid() {
        return cicid;
    }

    public void setCicid(Integer cicid) {
        this.cicid = cicid;
    }

    public Integer getCicParentid() {
        return cicParentid;
    }

    public void setCicParentid(Integer cicParentid) {
        this.cicParentid = cicParentid;
    }

    public String getCicName() {
        return cicName;
    }

    public void setCicName(String cicName) {
        this.cicName = cicName;
    }

    public String getCicCode() {
        return cicCode;
    }

    public void setCicCode(String cicCode) {
        this.cicCode = cicCode;
    }

    public Integer getCicOrder() {
        return cicOrder;
    }

    public void setCicOrder(Integer cicOrder) {
        this.cicOrder = cicOrder;
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
        biz_classinfoclass other = (biz_classinfoclass) that;
        return (this.getCicid() == null ? other.getCicid() == null : this.getCicid().equals(other.getCicid()))
            && (this.getCicParentid() == null ? other.getCicParentid() == null : this.getCicParentid().equals(other.getCicParentid()))
            && (this.getCicName() == null ? other.getCicName() == null : this.getCicName().equals(other.getCicName()))
            && (this.getCicCode() == null ? other.getCicCode() == null : this.getCicCode().equals(other.getCicCode()))
            && (this.getCicOrder() == null ? other.getCicOrder() == null : this.getCicOrder().equals(other.getCicOrder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCicid() == null) ? 0 : getCicid().hashCode());
        result = prime * result + ((getCicParentid() == null) ? 0 : getCicParentid().hashCode());
        result = prime * result + ((getCicName() == null) ? 0 : getCicName().hashCode());
        result = prime * result + ((getCicCode() == null) ? 0 : getCicCode().hashCode());
        result = prime * result + ((getCicOrder() == null) ? 0 : getCicOrder().hashCode());
        return result;
    }
    
    private biz_classinfoclass parentclassinfoclass;
	
	public biz_classinfoclass getParentclassinfoclass() {
		return parentclassinfoclass;
	}

	public void setParentclassinfoclass(biz_classinfoclass parentclassinfoclass) {
		this.parentclassinfoclass = parentclassinfoclass;
	}
	private List<biz_classinfoclass> listchildclassinfoclass;
	public List<biz_classinfoclass> getListchildclassinfoclass() {
		return listchildclassinfoclass;
	}

	public void setListchildclassinfoclass(
			List<biz_classinfoclass> listchildclassinfoclass) {
		this.listchildclassinfoclass = listchildclassinfoclass;
	}
	private List<biz_classinfo> list_parent_classinfo;
	public List<biz_classinfo> getList_parent_classinfo() {
		return list_parent_classinfo;
	}

	public void setList_parent_classinfo(List<biz_classinfo> list_parent_classinfo) {
		this.list_parent_classinfo = list_parent_classinfo;
	}
}