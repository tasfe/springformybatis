package com.hedgehog.domain;

import java.util.List;

public class biz_menuoper {
    private Integer menuoperid;

    private String menuoperName;

    private String menuoperLink;

    private Integer menuoperOrder;

    private Integer menuoperAppid;

    private String menuoperClass;

    private String menuoperTarget;

    private String menuoperAppcode;
    
    private List<biz_submenuoper> list_submenuoper;

    public Integer getMenuoperid() {
        return menuoperid;
    }

    public void setMenuoperid(Integer menuoperid) {
        this.menuoperid = menuoperid;
    }

    public String getMenuoperName() {
        return menuoperName;
    }

    public void setMenuoperName(String menuoperName) {
        this.menuoperName = menuoperName;
    }

    public String getMenuoperLink() {
        return menuoperLink;
    }

    public void setMenuoperLink(String menuoperLink) {
        this.menuoperLink = menuoperLink;
    }

    public Integer getMenuoperOrder() {
        return menuoperOrder;
    }

    public void setMenuoperOrder(Integer menuoperOrder) {
        this.menuoperOrder = menuoperOrder;
    }

    public Integer getMenuoperAppid() {
        return menuoperAppid;
    }

    public void setMenuoperAppid(Integer menuoperAppid) {
        this.menuoperAppid = menuoperAppid;
    }

    public String getMenuoperClass() {
        return menuoperClass;
    }

    public void setMenuoperClass(String menuoperClass) {
        this.menuoperClass = menuoperClass;
    }

    public String getMenuoperTarget() {
        return menuoperTarget;
    }

    public void setMenuoperTarget(String menuoperTarget) {
        this.menuoperTarget = menuoperTarget;
    }

    public String getMenuoperAppcode() {
        return menuoperAppcode;
    }

    public void setMenuoperAppcode(String menuoperAppcode) {
        this.menuoperAppcode = menuoperAppcode;
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
        biz_menuoper other = (biz_menuoper) that;
        return (this.getMenuoperid() == null ? other.getMenuoperid() == null : this.getMenuoperid().equals(other.getMenuoperid()))
            && (this.getMenuoperName() == null ? other.getMenuoperName() == null : this.getMenuoperName().equals(other.getMenuoperName()))
            && (this.getMenuoperLink() == null ? other.getMenuoperLink() == null : this.getMenuoperLink().equals(other.getMenuoperLink()))
            && (this.getMenuoperOrder() == null ? other.getMenuoperOrder() == null : this.getMenuoperOrder().equals(other.getMenuoperOrder()))
            && (this.getMenuoperAppid() == null ? other.getMenuoperAppid() == null : this.getMenuoperAppid().equals(other.getMenuoperAppid()))
            && (this.getMenuoperClass() == null ? other.getMenuoperClass() == null : this.getMenuoperClass().equals(other.getMenuoperClass()))
            && (this.getMenuoperTarget() == null ? other.getMenuoperTarget() == null : this.getMenuoperTarget().equals(other.getMenuoperTarget()))
            && (this.getMenuoperAppcode() == null ? other.getMenuoperAppcode() == null : this.getMenuoperAppcode().equals(other.getMenuoperAppcode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuoperid() == null) ? 0 : getMenuoperid().hashCode());
        result = prime * result + ((getMenuoperName() == null) ? 0 : getMenuoperName().hashCode());
        result = prime * result + ((getMenuoperLink() == null) ? 0 : getMenuoperLink().hashCode());
        result = prime * result + ((getMenuoperOrder() == null) ? 0 : getMenuoperOrder().hashCode());
        result = prime * result + ((getMenuoperAppid() == null) ? 0 : getMenuoperAppid().hashCode());
        result = prime * result + ((getMenuoperClass() == null) ? 0 : getMenuoperClass().hashCode());
        result = prime * result + ((getMenuoperTarget() == null) ? 0 : getMenuoperTarget().hashCode());
        result = prime * result + ((getMenuoperAppcode() == null) ? 0 : getMenuoperAppcode().hashCode());
        return result;
    }

	public List<biz_submenuoper> getList_submenuoper() {
		return list_submenuoper;
	}

	public void setList_submenuoper(List<biz_submenuoper> list_submenuoper) {
		this.list_submenuoper = list_submenuoper;
	}

	
}