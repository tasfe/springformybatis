package com.hedgehog.domain;

import java.util.Date;

public class biz_message {
    private Integer messageid;

    private String messageSender;

    private String messageIncept;

    private String messageTitle;

    private Integer messageFlag;

    private Date messageSendtime;

    private Integer messageDelr;

    private Integer messageDels;

    private Integer messageIssend;

    private String messageContent;

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(String messageSender) {
        this.messageSender = messageSender;
    }

    public String getMessageIncept() {
        return messageIncept;
    }

    public void setMessageIncept(String messageIncept) {
        this.messageIncept = messageIncept;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public Integer getMessageFlag() {
        return messageFlag;
    }

    public void setMessageFlag(Integer messageFlag) {
        this.messageFlag = messageFlag;
    }

    public Date getMessageSendtime() {
        return messageSendtime;
    }

    public void setMessageSendtime(Date messageSendtime) {
        this.messageSendtime = messageSendtime;
    }

    public Integer getMessageDelr() {
        return messageDelr;
    }

    public void setMessageDelr(Integer messageDelr) {
        this.messageDelr = messageDelr;
    }

    public Integer getMessageDels() {
        return messageDels;
    }

    public void setMessageDels(Integer messageDels) {
        this.messageDels = messageDels;
    }

    public Integer getMessageIssend() {
        return messageIssend;
    }

    public void setMessageIssend(Integer messageIssend) {
        this.messageIssend = messageIssend;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
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
        biz_message other = (biz_message) that;
        return (this.getMessageid() == null ? other.getMessageid() == null : this.getMessageid().equals(other.getMessageid()))
            && (this.getMessageSender() == null ? other.getMessageSender() == null : this.getMessageSender().equals(other.getMessageSender()))
            && (this.getMessageIncept() == null ? other.getMessageIncept() == null : this.getMessageIncept().equals(other.getMessageIncept()))
            && (this.getMessageTitle() == null ? other.getMessageTitle() == null : this.getMessageTitle().equals(other.getMessageTitle()))
            && (this.getMessageFlag() == null ? other.getMessageFlag() == null : this.getMessageFlag().equals(other.getMessageFlag()))
            && (this.getMessageSendtime() == null ? other.getMessageSendtime() == null : this.getMessageSendtime().equals(other.getMessageSendtime()))
            && (this.getMessageDelr() == null ? other.getMessageDelr() == null : this.getMessageDelr().equals(other.getMessageDelr()))
            && (this.getMessageDels() == null ? other.getMessageDels() == null : this.getMessageDels().equals(other.getMessageDels()))
            && (this.getMessageIssend() == null ? other.getMessageIssend() == null : this.getMessageIssend().equals(other.getMessageIssend()))
            && (this.getMessageContent() == null ? other.getMessageContent() == null : this.getMessageContent().equals(other.getMessageContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMessageid() == null) ? 0 : getMessageid().hashCode());
        result = prime * result + ((getMessageSender() == null) ? 0 : getMessageSender().hashCode());
        result = prime * result + ((getMessageIncept() == null) ? 0 : getMessageIncept().hashCode());
        result = prime * result + ((getMessageTitle() == null) ? 0 : getMessageTitle().hashCode());
        result = prime * result + ((getMessageFlag() == null) ? 0 : getMessageFlag().hashCode());
        result = prime * result + ((getMessageSendtime() == null) ? 0 : getMessageSendtime().hashCode());
        result = prime * result + ((getMessageDelr() == null) ? 0 : getMessageDelr().hashCode());
        result = prime * result + ((getMessageDels() == null) ? 0 : getMessageDels().hashCode());
        result = prime * result + ((getMessageIssend() == null) ? 0 : getMessageIssend().hashCode());
        result = prime * result + ((getMessageContent() == null) ? 0 : getMessageContent().hashCode());
        return result;
    }
}