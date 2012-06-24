package com.hedgehog.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class biz_city implements Serializable{
    private Integer cityid;

    private Integer cityProid;

    private String cityName;

    private String cityCode;

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getCityProid() {
        return cityProid;
    }

    public void setCityProid(Integer cityProid) {
        this.cityProid = cityProid;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
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
        biz_city other = (biz_city) that;
        return (this.getCityid() == null ? other.getCityid() == null : this.getCityid().equals(other.getCityid()))
            && (this.getCityProid() == null ? other.getCityProid() == null : this.getCityProid().equals(other.getCityProid()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getCityCode() == null ? other.getCityCode() == null : this.getCityCode().equals(other.getCityCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCityid() == null) ? 0 : getCityid().hashCode());
        result = prime * result + ((getCityProid() == null) ? 0 : getCityProid().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getCityCode() == null) ? 0 : getCityCode().hashCode());
        return result;
    }
}