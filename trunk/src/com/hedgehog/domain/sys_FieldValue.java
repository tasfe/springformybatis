package com.hedgehog.domain;

public class sys_FieldValue implements java.io.Serializable{
    private Integer valueid;

    private String vFKey;

    private String vText;

    private String vCode;

    private Integer vShoworder;

    public Integer getValueid() {
        return valueid;
    }

    public void setValueid(Integer valueid) {
        this.valueid = valueid;
    }

    public String getvFKey() {
        return vFKey;
    }

    public void setvFKey(String vFKey) {
        this.vFKey = vFKey;
    }

    public String getvText() {
        return vText;
    }

    public void setvText(String vText) {
        this.vText = vText;
    }

    public String getvCode() {
        return vCode;
    }

    public void setvCode(String vCode) {
        this.vCode = vCode;
    }

    public Integer getvShoworder() {
        return vShoworder;
    }

    public void setvShoworder(Integer vShoworder) {
        this.vShoworder = vShoworder;
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
        sys_FieldValue other = (sys_FieldValue) that;
        return (this.getValueid() == null ? other.getValueid() == null : this.getValueid().equals(other.getValueid()))
            && (this.getvFKey() == null ? other.getvFKey() == null : this.getvFKey().equals(other.getvFKey()))
            && (this.getvText() == null ? other.getvText() == null : this.getvText().equals(other.getvText()))
            && (this.getvCode() == null ? other.getvCode() == null : this.getvCode().equals(other.getvCode()))
            && (this.getvShoworder() == null ? other.getvShoworder() == null : this.getvShoworder().equals(other.getvShoworder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getValueid() == null) ? 0 : getValueid().hashCode());
        result = prime * result + ((getvFKey() == null) ? 0 : getvFKey().hashCode());
        result = prime * result + ((getvText() == null) ? 0 : getvText().hashCode());
        result = prime * result + ((getvCode() == null) ? 0 : getvCode().hashCode());
        result = prime * result + ((getvShoworder() == null) ? 0 : getvShoworder().hashCode());
        return result;
    }
}