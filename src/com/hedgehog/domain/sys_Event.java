package com.hedgehog.domain;

import java.util.Date;

public class sys_Event implements java.io.Serializable{
    private Integer eventid;

    private String eULoginname;

    private Integer eUserid;

    private Date eDatetime;

    private Integer eApplicationid;

    private String eAAppname;

    private String eMName;

    private String eMPagecode;

    private String eFrom;

    private Byte eType;

    private String eIp;

    private String eRecord;

    public Integer getEventid() {
        return eventid;
    }

    public void setEventid(Integer eventid) {
        this.eventid = eventid;
    }

    public String geteULoginname() {
        return eULoginname;
    }

    public void seteULoginname(String eULoginname) {
        this.eULoginname = eULoginname;
    }

    public Integer geteUserid() {
        return eUserid;
    }

    public void seteUserid(Integer eUserid) {
        this.eUserid = eUserid;
    }

    public Date geteDatetime() {
        return eDatetime;
    }

    public void seteDatetime(Date eDatetime) {
        this.eDatetime = eDatetime;
    }

    public Integer geteApplicationid() {
        return eApplicationid;
    }

    public void seteApplicationid(Integer eApplicationid) {
        this.eApplicationid = eApplicationid;
    }

    public String geteAAppname() {
        return eAAppname;
    }

    public void seteAAppname(String eAAppname) {
        this.eAAppname = eAAppname;
    }

    public String geteMName() {
        return eMName;
    }

    public void seteMName(String eMName) {
        this.eMName = eMName;
    }

    public String geteMPagecode() {
        return eMPagecode;
    }

    public void seteMPagecode(String eMPagecode) {
        this.eMPagecode = eMPagecode;
    }

    public String geteFrom() {
        return eFrom;
    }

    public void seteFrom(String eFrom) {
        this.eFrom = eFrom;
    }

    public Byte geteType() {
        return eType;
    }

    public void seteType(Byte eType) {
        this.eType = eType;
    }

    public String geteIp() {
        return eIp;
    }

    public void seteIp(String eIp) {
        this.eIp = eIp;
    }

    public String geteRecord() {
        return eRecord;
    }

    public void seteRecord(String eRecord) {
        this.eRecord = eRecord;
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
        sys_Event other = (sys_Event) that;
        return (this.getEventid() == null ? other.getEventid() == null : this.getEventid().equals(other.getEventid()))
            && (this.geteULoginname() == null ? other.geteULoginname() == null : this.geteULoginname().equals(other.geteULoginname()))
            && (this.geteUserid() == null ? other.geteUserid() == null : this.geteUserid().equals(other.geteUserid()))
            && (this.geteDatetime() == null ? other.geteDatetime() == null : this.geteDatetime().equals(other.geteDatetime()))
            && (this.geteApplicationid() == null ? other.geteApplicationid() == null : this.geteApplicationid().equals(other.geteApplicationid()))
            && (this.geteAAppname() == null ? other.geteAAppname() == null : this.geteAAppname().equals(other.geteAAppname()))
            && (this.geteMName() == null ? other.geteMName() == null : this.geteMName().equals(other.geteMName()))
            && (this.geteMPagecode() == null ? other.geteMPagecode() == null : this.geteMPagecode().equals(other.geteMPagecode()))
            && (this.geteFrom() == null ? other.geteFrom() == null : this.geteFrom().equals(other.geteFrom()))
            && (this.geteType() == null ? other.geteType() == null : this.geteType().equals(other.geteType()))
            && (this.geteIp() == null ? other.geteIp() == null : this.geteIp().equals(other.geteIp()))
            && (this.geteRecord() == null ? other.geteRecord() == null : this.geteRecord().equals(other.geteRecord()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEventid() == null) ? 0 : getEventid().hashCode());
        result = prime * result + ((geteULoginname() == null) ? 0 : geteULoginname().hashCode());
        result = prime * result + ((geteUserid() == null) ? 0 : geteUserid().hashCode());
        result = prime * result + ((geteDatetime() == null) ? 0 : geteDatetime().hashCode());
        result = prime * result + ((geteApplicationid() == null) ? 0 : geteApplicationid().hashCode());
        result = prime * result + ((geteAAppname() == null) ? 0 : geteAAppname().hashCode());
        result = prime * result + ((geteMName() == null) ? 0 : geteMName().hashCode());
        result = prime * result + ((geteMPagecode() == null) ? 0 : geteMPagecode().hashCode());
        result = prime * result + ((geteFrom() == null) ? 0 : geteFrom().hashCode());
        result = prime * result + ((geteType() == null) ? 0 : geteType().hashCode());
        result = prime * result + ((geteIp() == null) ? 0 : geteIp().hashCode());
        result = prime * result + ((geteRecord() == null) ? 0 : geteRecord().hashCode());
        return result;
    }
}