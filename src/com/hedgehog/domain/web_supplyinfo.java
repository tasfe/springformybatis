package com.hedgehog.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class web_supplyinfo {
    private Integer supplyinfoid;
    @NotNull(message="请选择类别")
	@NumberFormat(style = Style.NUMBER)
    private Integer supplyinfoSc;

    @Size(min=1, max=200, message="标题不能为空")
    private String supplyinfoTitle;
    @Size(max=100, message="缩略图超过100字符")
    private String supplyinfoThumbs;
    @NotNull(message="请选择类型")
	@NumberFormat(style = Style.NUMBER)
    private Integer supplyinfoType;

    private Integer supplyinfoMenuid;

    private Date supplyinfoUpdatetime;

    private Integer supplyinfoHits;

    private String supplyinfoProperties;
    @Size(min=1, message="描述不能为空")
    private String supplyinfoDes;
    
    private String[] supplyinfoFlag;
    
    private web_supplyclass supplyclass;
    
    private biz_menu menu;

    public biz_menu getMenu() {
    		return menu;
    	}

    	public void setMenu(biz_menu menu) {
    		this.menu = menu;
    	}
    
    public String[] getSupplyinfoFlag() {
    	//return productFlag;
		if(this.supplyinfoProperties!=null)
		{
			return this.supplyinfoProperties.split(",");
		}
		return null;
	}

	public void setSupplyinfoFlag(String[] supplyinfoFlag) {
		//this.newsFlag = newsFlag;
		//System.out.println("设置属性值:"+newsFlag);
		if(supplyinfoFlag!=null)
		{
			if(supplyinfoFlag.length>0)
			{
				//this.newsProperties=newsFlag.toString();
				StringBuffer buf  = new StringBuffer();
				for(String str:supplyinfoFlag)
					{
						//System.out.println(str);
						buf.append(str+",");
					}
				String oldStr=buf.toString();
				if(oldStr!="")
				{
					this.supplyinfoProperties=oldStr.substring(0,oldStr.length() - 1); 
				}				
			}
		}
	}   
    
    private CommonsMultipartFile fileData;

	public CommonsMultipartFile getFileData() {	
		//FileItem 
		//DiskFileItem
		//CommonsMultipartFile dd=new CommonsMultipartFile();
		//fileData.getFileItem();
		return fileData;
	}

	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}
	

    public Integer getSupplyinfoid() {
        return supplyinfoid;
    }

    public void setSupplyinfoid(Integer supplyinfoid) {
        this.supplyinfoid = supplyinfoid;
    }

    public Integer getSupplyinfoSc() {
        return supplyinfoSc;
    }

    public void setSupplyinfoSc(Integer supplyinfoSc) {
        this.supplyinfoSc = supplyinfoSc;
    }

    public String getSupplyinfoTitle() {
        return supplyinfoTitle;
    }

    public void setSupplyinfoTitle(String supplyinfoTitle) {
        this.supplyinfoTitle = supplyinfoTitle;
    }

    public String getSupplyinfoThumbs() {
        return supplyinfoThumbs;
    }

    public void setSupplyinfoThumbs(String supplyinfoThumbs) {
        this.supplyinfoThumbs = supplyinfoThumbs;
    }

    public Integer getSupplyinfoType() {
        return supplyinfoType;
    }

    public void setSupplyinfoType(Integer supplyinfoType) {
        this.supplyinfoType = supplyinfoType;
    }

    public Integer getSupplyinfoMenuid() {
        return supplyinfoMenuid;
    }

    public void setSupplyinfoMenuid(Integer supplyinfoMenuid) {
        this.supplyinfoMenuid = supplyinfoMenuid;
    }

    public Date getSupplyinfoUpdatetime() {
        return supplyinfoUpdatetime;
    }

    public void setSupplyinfoUpdatetime(Date supplyinfoUpdatetime) {
        this.supplyinfoUpdatetime = supplyinfoUpdatetime;
    }

    public Integer getSupplyinfoHits() {
        return supplyinfoHits;
    }

    public void setSupplyinfoHits(Integer supplyinfoHits) {
        this.supplyinfoHits = supplyinfoHits;
    }

    public String getSupplyinfoProperties() {
        return supplyinfoProperties;
    }

    public void setSupplyinfoProperties(String supplyinfoProperties) {
        this.supplyinfoProperties = supplyinfoProperties;
    }

    public String getSupplyinfoDes() {
        return supplyinfoDes;
    }

    public void setSupplyinfoDes(String supplyinfoDes) {
        this.supplyinfoDes = supplyinfoDes;
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
        web_supplyinfo other = (web_supplyinfo) that;
        return (this.getSupplyinfoid() == null ? other.getSupplyinfoid() == null : this.getSupplyinfoid().equals(other.getSupplyinfoid()))
            && (this.getSupplyinfoSc() == null ? other.getSupplyinfoSc() == null : this.getSupplyinfoSc().equals(other.getSupplyinfoSc()))
            && (this.getSupplyinfoTitle() == null ? other.getSupplyinfoTitle() == null : this.getSupplyinfoTitle().equals(other.getSupplyinfoTitle()))
            && (this.getSupplyinfoThumbs() == null ? other.getSupplyinfoThumbs() == null : this.getSupplyinfoThumbs().equals(other.getSupplyinfoThumbs()))
            && (this.getSupplyinfoType() == null ? other.getSupplyinfoType() == null : this.getSupplyinfoType().equals(other.getSupplyinfoType()))
            && (this.getSupplyinfoMenuid() == null ? other.getSupplyinfoMenuid() == null : this.getSupplyinfoMenuid().equals(other.getSupplyinfoMenuid()))
            && (this.getSupplyinfoUpdatetime() == null ? other.getSupplyinfoUpdatetime() == null : this.getSupplyinfoUpdatetime().equals(other.getSupplyinfoUpdatetime()))
            && (this.getSupplyinfoHits() == null ? other.getSupplyinfoHits() == null : this.getSupplyinfoHits().equals(other.getSupplyinfoHits()))
            && (this.getSupplyinfoProperties() == null ? other.getSupplyinfoProperties() == null : this.getSupplyinfoProperties().equals(other.getSupplyinfoProperties()))
            && (this.getSupplyinfoDes() == null ? other.getSupplyinfoDes() == null : this.getSupplyinfoDes().equals(other.getSupplyinfoDes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSupplyinfoid() == null) ? 0 : getSupplyinfoid().hashCode());
        result = prime * result + ((getSupplyinfoSc() == null) ? 0 : getSupplyinfoSc().hashCode());
        result = prime * result + ((getSupplyinfoTitle() == null) ? 0 : getSupplyinfoTitle().hashCode());
        result = prime * result + ((getSupplyinfoThumbs() == null) ? 0 : getSupplyinfoThumbs().hashCode());
        result = prime * result + ((getSupplyinfoType() == null) ? 0 : getSupplyinfoType().hashCode());
        result = prime * result + ((getSupplyinfoMenuid() == null) ? 0 : getSupplyinfoMenuid().hashCode());
        result = prime * result + ((getSupplyinfoUpdatetime() == null) ? 0 : getSupplyinfoUpdatetime().hashCode());
        result = prime * result + ((getSupplyinfoHits() == null) ? 0 : getSupplyinfoHits().hashCode());
        result = prime * result + ((getSupplyinfoProperties() == null) ? 0 : getSupplyinfoProperties().hashCode());
        result = prime * result + ((getSupplyinfoDes() == null) ? 0 : getSupplyinfoDes().hashCode());
        return result;
    }

	public web_supplyclass getSupplyclass() {
		return supplyclass;
	}

	public void setSupplyclass(web_supplyclass supplyclass) {
		this.supplyclass = supplyclass;
	}	
}