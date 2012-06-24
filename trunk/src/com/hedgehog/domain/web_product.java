package com.hedgehog.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class web_product {
    private Integer productid;

    private Integer productMenuid;

    @NotNull(message="请选择类别")
	@NumberFormat(style = Style.NUMBER)
    private Integer productClass;

    @Size(min=1, max=200, message="产品名称不能为空")
    private String productName;
    @Size(max=50, message="产品型号超过50字符")
    private String productType;
    @Size(max=50, message="市场价格超过50字符")
    private String productMarket;
    @Size(max=50, message="促销价格超过50字符")
    private String productPromote;
    @Size(max=100, message="缩略图超过100字符")
    private String productThumbs;

    private String productProperty;
    

    private Date productUpdatetime;

    private Integer productHits;
    @Size(min=1, message="产品描述不能为空")
    private String productDes;
    
    private web_productclass productclass;
    private biz_menu menu;
    
    private String[] productFlag;

    public String[] getProductFlag() {
		//return productFlag;
		if(this.productProperty!=null)
		{
			return this.productProperty.split(",");
		}
		return null;
	}

	public void setProductFlag(String[] productFlag) {
		//this.newsFlag = newsFlag;
		//System.out.println("设置属性值:"+newsFlag);
		if(productFlag!=null)
		{
			if(productFlag.length>0)
			{
				//this.newsProperties=newsFlag.toString();
				StringBuffer buf  = new StringBuffer();
				for(String str:productFlag)
					{
						//System.out.println(str);
						buf.append(str+",");
					}
				String oldStr=buf.toString();
				if(oldStr!="")
				{
					this.productProperty=oldStr.substring(0,oldStr.length() - 1); 
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

	public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getProductMenuid() {
        return productMenuid;
    }

    public void setProductMenuid(Integer productMenuid) {
        this.productMenuid = productMenuid;
    }

    public Integer getProductClass() {
        return productClass;
    }

    public void setProductClass(Integer productClass) {
        this.productClass = productClass;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductMarket() {
        return productMarket;
    }

    public void setProductMarket(String productMarket) {
        this.productMarket = productMarket;
    }

    public String getProductPromote() {
        return productPromote;
    }

    public void setProductPromote(String productPromote) {
        this.productPromote = productPromote;
    }

    public String getProductThumbs() {
        return productThumbs;
    }

    public void setProductThumbs(String productThumbs) {
        this.productThumbs = productThumbs;
    }

//    public Integer getProductProperty() {
//        return productProperty;
//    }
//
//    public void setProductProperty(Integer productProperty) {
//        this.productProperty = productProperty;
//    }

    public Date getProductUpdatetime() {
        return productUpdatetime;
    }

    public void setProductUpdatetime(Date productUpdatetime) {
        this.productUpdatetime = productUpdatetime;
    }

    public Integer getProductHits() {
        return productHits;
    }

    public void setProductHits(Integer productHits) {
        this.productHits = productHits;
    }

    public String getProductDes() {
        return productDes;
    }

    public void setProductDes(String productDes) {
        this.productDes = productDes;
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
        web_product other = (web_product) that;
        return (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductMenuid() == null ? other.getProductMenuid() == null : this.getProductMenuid().equals(other.getProductMenuid()))
            && (this.getProductClass() == null ? other.getProductClass() == null : this.getProductClass().equals(other.getProductClass()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductType() == null ? other.getProductType() == null : this.getProductType().equals(other.getProductType()))
            && (this.getProductMarket() == null ? other.getProductMarket() == null : this.getProductMarket().equals(other.getProductMarket()))
            && (this.getProductPromote() == null ? other.getProductPromote() == null : this.getProductPromote().equals(other.getProductPromote()))
            && (this.getProductThumbs() == null ? other.getProductThumbs() == null : this.getProductThumbs().equals(other.getProductThumbs()))
            && (this.getProductProperty() == null ? other.getProductProperty() == null : this.getProductProperty().equals(other.getProductProperty()))
            && (this.getProductUpdatetime() == null ? other.getProductUpdatetime() == null : this.getProductUpdatetime().equals(other.getProductUpdatetime()))
            && (this.getProductHits() == null ? other.getProductHits() == null : this.getProductHits().equals(other.getProductHits()))
            && (this.getProductDes() == null ? other.getProductDes() == null : this.getProductDes().equals(other.getProductDes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductMenuid() == null) ? 0 : getProductMenuid().hashCode());
        result = prime * result + ((getProductClass() == null) ? 0 : getProductClass().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductType() == null) ? 0 : getProductType().hashCode());
        result = prime * result + ((getProductMarket() == null) ? 0 : getProductMarket().hashCode());
        result = prime * result + ((getProductPromote() == null) ? 0 : getProductPromote().hashCode());
        result = prime * result + ((getProductThumbs() == null) ? 0 : getProductThumbs().hashCode());
        result = prime * result + ((getProductProperty() == null) ? 0 : getProductProperty().hashCode());
        result = prime * result + ((getProductUpdatetime() == null) ? 0 : getProductUpdatetime().hashCode());
        result = prime * result + ((getProductHits() == null) ? 0 : getProductHits().hashCode());
        result = prime * result + ((getProductDes() == null) ? 0 : getProductDes().hashCode());
        return result;
    }

	public web_productclass getProductclass() {
		return productclass;
	}

	public void setProductclass(web_productclass productclass) {
		this.productclass = productclass;
	}

	public String getProductProperty() {
		return productProperty;
	}

	public void setProductProperty(String productProperty) {
		this.productProperty = productProperty;
	}

	public biz_menu getMenu() {
		return menu;
	}

	public void setMenu(biz_menu menu) {
		this.menu = menu;
	}
}