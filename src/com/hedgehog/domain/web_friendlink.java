package com.hedgehog.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class web_friendlink {
    private Integer friendlinkId;
    @Size(min=1, max=100, message="类名不能为空")
    private String friendlinkTitle;
    @Size(min=1, max=100, message="URL地址不能为空")
    private String friendlinkUrl;

    private String friendlinkImageurl;
    @Min(0)
    private Integer friendlinkOrder;

    private Integer friendlinkMenuid;

    public Integer getFriendlinkId() {
        return friendlinkId;
    }

    public void setFriendlinkId(Integer friendlinkId) {
        this.friendlinkId = friendlinkId;
    }

    public String getFriendlinkTitle() {
        return friendlinkTitle;
    }

    public void setFriendlinkTitle(String friendlinkTitle) {
        this.friendlinkTitle = friendlinkTitle;
    }

    public String getFriendlinkUrl() {
        return friendlinkUrl;
    }

    public void setFriendlinkUrl(String friendlinkUrl) {
        this.friendlinkUrl = friendlinkUrl;
    }

    public String getFriendlinkImageurl() {
        return friendlinkImageurl;
    }

    public void setFriendlinkImageurl(String friendlinkImageurl) {
        this.friendlinkImageurl = friendlinkImageurl;
    }

    public Integer getFriendlinkOrder() {
        return friendlinkOrder;
    }

    public void setFriendlinkOrder(Integer friendlinkOrder) {
        this.friendlinkOrder = friendlinkOrder;
    }

    public Integer getFriendlinkMenuid() {
        return friendlinkMenuid;
    }

    public void setFriendlinkMenuid(Integer friendlinkMenuid) {
        this.friendlinkMenuid = friendlinkMenuid;
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
        web_friendlink other = (web_friendlink) that;
        return (this.getFriendlinkId() == null ? other.getFriendlinkId() == null : this.getFriendlinkId().equals(other.getFriendlinkId()))
            && (this.getFriendlinkTitle() == null ? other.getFriendlinkTitle() == null : this.getFriendlinkTitle().equals(other.getFriendlinkTitle()))
            && (this.getFriendlinkUrl() == null ? other.getFriendlinkUrl() == null : this.getFriendlinkUrl().equals(other.getFriendlinkUrl()))
            && (this.getFriendlinkImageurl() == null ? other.getFriendlinkImageurl() == null : this.getFriendlinkImageurl().equals(other.getFriendlinkImageurl()))
            && (this.getFriendlinkOrder() == null ? other.getFriendlinkOrder() == null : this.getFriendlinkOrder().equals(other.getFriendlinkOrder()))
            && (this.getFriendlinkMenuid() == null ? other.getFriendlinkMenuid() == null : this.getFriendlinkMenuid().equals(other.getFriendlinkMenuid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFriendlinkId() == null) ? 0 : getFriendlinkId().hashCode());
        result = prime * result + ((getFriendlinkTitle() == null) ? 0 : getFriendlinkTitle().hashCode());
        result = prime * result + ((getFriendlinkUrl() == null) ? 0 : getFriendlinkUrl().hashCode());
        result = prime * result + ((getFriendlinkImageurl() == null) ? 0 : getFriendlinkImageurl().hashCode());
        result = prime * result + ((getFriendlinkOrder() == null) ? 0 : getFriendlinkOrder().hashCode());
        result = prime * result + ((getFriendlinkMenuid() == null) ? 0 : getFriendlinkMenuid().hashCode());
        return result;
    }
}