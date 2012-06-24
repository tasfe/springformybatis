package com.hedgehog.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class biz_menu {
    private Integer menuid;

    private Integer menuMemberid;

    private Integer menuParentid;
    @Min(0)
    private Integer menuIndex;
    @Size(min=1, max=50, message="栏目名称不能为空")
    private String menuName;

    private String menuTarget;

    private String menuClass;
    @Min(0)
    private Integer menuEnable;
    
    @Size(min=1, max=50, message="栏目类型不能为空")
    private String menuChCode;

    private String menuContent;
    
    private biz_channel channel;
    
    private biz_member member;

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getMenuMemberid() {
        return menuMemberid;
    }

    public void setMenuMemberid(Integer menuMemberid) {
        this.menuMemberid = menuMemberid;
    }

    public Integer getMenuParentid() {
        return menuParentid;
    }

    public void setMenuParentid(Integer menuParentid) {
        this.menuParentid = menuParentid;
    }

    public Integer getMenuIndex() {
        return menuIndex;
    }

    public void setMenuIndex(Integer menuIndex) {
        this.menuIndex = menuIndex;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuTarget() {
        return menuTarget;
    }

    public void setMenuTarget(String menuTarget) {
        this.menuTarget = menuTarget;
    }

    public String getMenuClass() {
        return menuClass;
    }

    public void setMenuClass(String menuClass) {
        this.menuClass = menuClass;
    }

    public Integer getMenuEnable() {
        return menuEnable;
    }

    public void setMenuEnable(Integer menuEnable) {
        this.menuEnable = menuEnable;
    }

    public String getMenuChCode() {
        return menuChCode;
    }

    public void setMenuChCode(String menuChCode) {
        this.menuChCode = menuChCode;
    }

    public String getMenuContent() {
        return menuContent;
    }

    public void setMenuContent(String menuContent) {
        this.menuContent = menuContent;
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
        biz_menu other = (biz_menu) that;
        return (this.getMenuid() == null ? other.getMenuid() == null : this.getMenuid().equals(other.getMenuid()))
            && (this.getMenuMemberid() == null ? other.getMenuMemberid() == null : this.getMenuMemberid().equals(other.getMenuMemberid()))
            && (this.getMenuParentid() == null ? other.getMenuParentid() == null : this.getMenuParentid().equals(other.getMenuParentid()))
            && (this.getMenuIndex() == null ? other.getMenuIndex() == null : this.getMenuIndex().equals(other.getMenuIndex()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getMenuTarget() == null ? other.getMenuTarget() == null : this.getMenuTarget().equals(other.getMenuTarget()))
            && (this.getMenuClass() == null ? other.getMenuClass() == null : this.getMenuClass().equals(other.getMenuClass()))
            && (this.getMenuEnable() == null ? other.getMenuEnable() == null : this.getMenuEnable().equals(other.getMenuEnable()))
            && (this.getMenuChCode() == null ? other.getMenuChCode() == null : this.getMenuChCode().equals(other.getMenuChCode()))
            && (this.getMenuContent() == null ? other.getMenuContent() == null : this.getMenuContent().equals(other.getMenuContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuid() == null) ? 0 : getMenuid().hashCode());
        result = prime * result + ((getMenuMemberid() == null) ? 0 : getMenuMemberid().hashCode());
        result = prime * result + ((getMenuParentid() == null) ? 0 : getMenuParentid().hashCode());
        result = prime * result + ((getMenuIndex() == null) ? 0 : getMenuIndex().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getMenuTarget() == null) ? 0 : getMenuTarget().hashCode());
        result = prime * result + ((getMenuClass() == null) ? 0 : getMenuClass().hashCode());
        result = prime * result + ((getMenuEnable() == null) ? 0 : getMenuEnable().hashCode());
        result = prime * result + ((getMenuChCode() == null) ? 0 : getMenuChCode().hashCode());
        result = prime * result + ((getMenuContent() == null) ? 0 : getMenuContent().hashCode());
        return result;
    }

	public biz_channel getChannel() {
		return channel;
	}

	public void setChannel(biz_channel channel) {
		this.channel = channel;
	}

	public biz_member getMember() {
		return member;
	}

	public void setMember(biz_member member) {
		this.member = member;
	}
}