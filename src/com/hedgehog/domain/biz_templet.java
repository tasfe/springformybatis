package com.hedgehog.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class biz_templet {
    private Integer templetid;
    
    @NotNull(message="请选择模板类型")
    @NumberFormat(style = Style.NUMBER)
    private Integer templetType;

    @Size(min=1, max=50, message="模板名称不能为空")
    private String templetName;

    @Size(min=1, max=50, message="模板代号不能为空")
    private String templetCode;

    private String templetIntro;

    private String templetThumbs;

    private Byte templetMember;

    private Byte templetVote;

    private Byte templetLink;

    private String templetServer;
    
    private biz_templet_class templetclass;

    

	public Integer getTempletid() {
        return templetid;
    }

    public void setTempletid(Integer templetid) {
        this.templetid = templetid;
    }

    public Integer getTempletType() {
        return templetType;
    }

    public void setTempletType(Integer templetType) {
        this.templetType = templetType;
    }

    public String getTempletName() {
        return templetName;
    }

    public void setTempletName(String templetName) {
        this.templetName = templetName;
    }

    public String getTempletCode() {
        return templetCode;
    }

    public void setTempletCode(String templetCode) {
        this.templetCode = templetCode;
    }

    public String getTempletIntro() {
        return templetIntro;
    }

    public void setTempletIntro(String templetIntro) {
        this.templetIntro = templetIntro;
    }

    public String getTempletThumbs() {
        return templetThumbs;
    }

    public void setTempletThumbs(String templetThumbs) {
        this.templetThumbs = templetThumbs;
    }

    public Byte getTempletMember() {
        return templetMember;
    }

    public void setTempletMember(Byte templetMember) {
        this.templetMember = templetMember;
    }

    public Byte getTempletVote() {
        return templetVote;
    }

    public void setTempletVote(Byte templetVote) {
        this.templetVote = templetVote;
    }

    public Byte getTempletLink() {
        return templetLink;
    }

    public void setTempletLink(Byte templetLink) {
        this.templetLink = templetLink;
    }

    public String getTempletServer() {
        return templetServer;
    }

    public void setTempletServer(String templetServer) {
        this.templetServer = templetServer;
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
        biz_templet other = (biz_templet) that;
        return (this.getTempletid() == null ? other.getTempletid() == null : this.getTempletid().equals(other.getTempletid()))
            && (this.getTempletType() == null ? other.getTempletType() == null : this.getTempletType().equals(other.getTempletType()))
            && (this.getTempletName() == null ? other.getTempletName() == null : this.getTempletName().equals(other.getTempletName()))
            && (this.getTempletCode() == null ? other.getTempletCode() == null : this.getTempletCode().equals(other.getTempletCode()))
            && (this.getTempletIntro() == null ? other.getTempletIntro() == null : this.getTempletIntro().equals(other.getTempletIntro()))
            && (this.getTempletThumbs() == null ? other.getTempletThumbs() == null : this.getTempletThumbs().equals(other.getTempletThumbs()))
            && (this.getTempletMember() == null ? other.getTempletMember() == null : this.getTempletMember().equals(other.getTempletMember()))
            && (this.getTempletVote() == null ? other.getTempletVote() == null : this.getTempletVote().equals(other.getTempletVote()))
            && (this.getTempletLink() == null ? other.getTempletLink() == null : this.getTempletLink().equals(other.getTempletLink()))
            && (this.getTempletServer() == null ? other.getTempletServer() == null : this.getTempletServer().equals(other.getTempletServer()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTempletid() == null) ? 0 : getTempletid().hashCode());
        result = prime * result + ((getTempletType() == null) ? 0 : getTempletType().hashCode());
        result = prime * result + ((getTempletName() == null) ? 0 : getTempletName().hashCode());
        result = prime * result + ((getTempletCode() == null) ? 0 : getTempletCode().hashCode());
        result = prime * result + ((getTempletIntro() == null) ? 0 : getTempletIntro().hashCode());
        result = prime * result + ((getTempletThumbs() == null) ? 0 : getTempletThumbs().hashCode());
        result = prime * result + ((getTempletMember() == null) ? 0 : getTempletMember().hashCode());
        result = prime * result + ((getTempletVote() == null) ? 0 : getTempletVote().hashCode());
        result = prime * result + ((getTempletLink() == null) ? 0 : getTempletLink().hashCode());
        result = prime * result + ((getTempletServer() == null) ? 0 : getTempletServer().hashCode());
        return result;
    }

	public biz_templet_class getTempletclass() {
		return templetclass;
	}

	public void setTempletclass(biz_templet_class templetclass) {
		this.templetclass = templetclass;
	}
}