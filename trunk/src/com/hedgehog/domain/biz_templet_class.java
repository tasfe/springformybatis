package com.hedgehog.domain;

import java.util.List;

public class biz_templet_class {
    private Integer tcid;

    private String tcName;

    private String tcCode;

    private String tcHold;
    
    private List<biz_templet> list_templet;
    
    public List<biz_templet> getList_templet() {
		return list_templet;
	}

	public void setList_templet(List<biz_templet> list_templet) {
		this.list_templet = list_templet;
	}

    public Integer getTcid() {
        return tcid;
    }

    public void setTcid(Integer tcid) {
        this.tcid = tcid;
    }

    public String getTcName() {
        return tcName;
    }

    public void setTcName(String tcName) {
        this.tcName = tcName;
    }

    public String getTcCode() {
        return tcCode;
    }

    public void setTcCode(String tcCode) {
        this.tcCode = tcCode;
    }

    public String getTcHold() {
        return tcHold;
    }

    public void setTcHold(String tcHold) {
        this.tcHold = tcHold;
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
        biz_templet_class other = (biz_templet_class) that;
        return (this.getTcid() == null ? other.getTcid() == null : this.getTcid().equals(other.getTcid()))
            && (this.getTcName() == null ? other.getTcName() == null : this.getTcName().equals(other.getTcName()))
            && (this.getTcCode() == null ? other.getTcCode() == null : this.getTcCode().equals(other.getTcCode()))
            && (this.getTcHold() == null ? other.getTcHold() == null : this.getTcHold().equals(other.getTcHold()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTcid() == null) ? 0 : getTcid().hashCode());
        result = prime * result + ((getTcName() == null) ? 0 : getTcName().hashCode());
        result = prime * result + ((getTcCode() == null) ? 0 : getTcCode().hashCode());
        result = prime * result + ((getTcHold() == null) ? 0 : getTcHold().hashCode());
        return result;
    }

	
}