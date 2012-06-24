package com.hedgehog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_city;
import com.hedgehog.service.CityService;
import com.hedgehog.service.ClassinfoService;
import com.hedgehog.service.WebProductService;
import com.hedgehog.service.WebPurveyService;
import com.hedgehog.service.WebsiteService;

@Controller
@RequestMapping("/city")
public class CityController {
	private WebsiteService websiteService;
	@Autowired
	public void setWebsiteService(WebsiteService websiteService) {
		this.websiteService = websiteService;
	}
	private CityService cityService;
	@Autowired
	public void setCityService(CityService cityService) {
		this.cityService = cityService;
	}
	private WebProductService webProductService;	
	@Autowired
	public void setwebProductService(WebProductService webProductService) {
		this.webProductService = webProductService;
	}
	private WebPurveyService webPurveyService;
	@Autowired
	public void setWebPurveyService(WebPurveyService webPurveyService) {
		this.webPurveyService = webPurveyService;
	}
	private ClassinfoService classinfoService;
	@Autowired
	public void setClassinfoService(ClassinfoService classinfoService) {
		this.classinfoService = classinfoService;
	}
	@RequestMapping(value="/{citycode}",method=RequestMethod.GET)
	  public String showHomePagefdlist(
			  @PathVariable("citycode") String cityCode,			 
			  ModelMap model) {
		biz_city city=this.cityService.selectByCode(cityCode);
		if(city!=null)
		{
			System.out.println("城市编号："+city.getCityid());
			
		}
		model.addAttribute("city", city);
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_website");
		qp.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp.setPageSize(11);
		qp.setPageIndex(1);
		qp.setWhere(" where w_city="+city.getCityid()+" and w_memberID in (select memberID from biz_member where member_Rank=2 and member_lock=1)");//商务通加强版
		qp.setOrderfld("websiteID");
		qp.setOrderType(1);	
		model.addAttribute("tradelist_jiaqiang", this.websiteService.selectRecordInPager(qp));
		//System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		//System.out.println("总页数："+ (Integer)qp.getPageCount());
		//model.addAttribute("queryParam", qp);
		QueryParam qp2=new QueryParam();
		qp2.setTableName("biz_website");
		qp2.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp2.setPageSize(11);
		qp2.setPageIndex(1);
		qp2.setWhere(" where w_city="+city.getCityid()+" and w_memberID in (select memberID from biz_member where member_Rank=1 and member_lock=1)");//商务通标准版
		qp2.setOrderfld("websiteID");
		qp2.setOrderType(1);	
		model.addAttribute("tradelist_biaozhun", this.websiteService.selectRecordInPager(qp2));
		
		QueryParam qp3=new QueryParam();
		qp3.setTableName("biz_website");
		qp3.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp3.setPageSize(11);
		qp3.setPageIndex(1);
		qp3.setWhere(" where w_city="+city.getCityid()+" and w_memberID in (select memberID from biz_member where member_PRank=2 and member_lock=1)");//生意通
		qp3.setOrderfld("websiteID");
		qp3.setOrderType(1);	
		model.addAttribute("businesslist", this.websiteService.selectRecordInPager(qp3));
		
		//处理
		QueryParam qp4=new QueryParam();
		qp4.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name ");
		qp4.setPageSize(44);
		qp4.setPageIndex(1);
		//qp4.setWhere(" where Product_menuID="+menuid);
		qp4.setWhere(" where Product_menuID in (select menuID from biz_menu where menu_memberid in (select w_memberID from biz_website where w_city="+city.getCityid()+" and w_memberID in (select memberID from biz_member where member_lock=1)))");
		qp4.setOrderfld("ProductID");
		qp4.setOrderType(1);		
		model.addAttribute("list_product", this.webProductService.selectWebProductInPager(qp4));
		//处理
		QueryParam qp5=new QueryParam();
		qp5.setTableName("web_supplyinfo");
		qp5.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp5.setPageSize(22);
		qp5.setPageIndex(1);
		qp5.setWhere(" where supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select w_memberID from biz_website where w_city="+city.getCityid()+" and w_memberID in (select memberID from biz_member where member_lock=1)))");
		qp5.setOrderfld("supplyinfoID");
		qp5.setOrderType(1);		
		model.addAttribute("list_supplyinfo", this.webPurveyService.selectWebSupplyinfoInPager(qp5));
		
		QueryParam qp6=new QueryParam();
		qp6.setTableName("biz_website");
		qp6.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp6.setPageSize(32);
		qp6.setPageIndex(1);
		qp6.setWhere(" where w_city="+city.getCityid()+" and w_Property like '%h%' and w_memberID in (select memberID from biz_member where member_lock=1)");//精品企业
		qp6.setOrderfld("websiteID");
		qp6.setOrderType(1);	
		model.addAttribute("tradelist_jingpin", this.websiteService.selectRecordInPager(qp6));
		
		QueryParam qp7=new QueryParam();
		qp7.setTableName("biz_website");
		qp7.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp7.setPageSize(32);
		qp7.setPageIndex(1);
		qp7.setWhere(" where w_city="+city.getCityid()+" and w_Property like '%c%' and w_memberID in (select memberID from biz_member where member_lock=1)");//推荐企业
		qp7.setOrderfld("websiteID");
		qp7.setOrderType(1);	
		model.addAttribute("tradelist_tuijian", this.websiteService.selectRecordInPager(qp7));
		//处理
		QueryParam qp8=new QueryParam();
		qp8.setTableName("web_supplyinfo");
		qp8.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp8.setPageSize(11);
		qp8.setPageIndex(1);
		qp5.setWhere(" where supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select w_memberID from biz_website where w_city="+city.getCityid()+" and w_memberID in (select memberID from biz_member where member_lock=1))) and supplyinfo_properties like '%c%'");//推荐供求
		qp8.setOrderfld("supplyinfoID");
		qp8.setOrderType(1);		
		model.addAttribute("list_supplyinfo_tuijian", this.webPurveyService.selectWebSupplyinfoInPager(qp8));
		//处理
		QueryParam qp9=new QueryParam();
		qp9.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp9.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Thumbs ");
		qp9.setPageSize(6);
		qp9.setPageIndex(1);
		qp9.setWhere(" where Product_menuID in (select menuID from biz_menu where menu_memberid in (select w_memberID from biz_website where w_city="+city.getCityid()+" and w_memberID in (select memberID from biz_member where member_lock=1))) and Product_Property like '%h%'");//精品产品
		qp9.setOrderfld("ProductID");
		qp9.setOrderType(1);		
		model.addAttribute("list_product_jingpin", this.webProductService.selectWebProductInPager(qp9));
		//最新加入企业
		QueryParam qp10=new QueryParam();
		qp10.setTableName("biz_website");
		qp10.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp10.setPageSize(10);
		qp10.setPageIndex(1);
		qp10.setWhere(" where w_memberID in (select memberID from biz_member where member_lock=1)");//商务通加强版
		qp10.setOrderfld("websiteID");
		qp10.setOrderType(1);	
		model.addAttribute("tradelist_last", this.websiteService.selectRecordInPager(qp10));
		//最新发布产品
		QueryParam qp11=new QueryParam();
		qp11.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp11.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name ");
		qp11.setPageSize(10);
		qp11.setPageIndex(1);
		qp11.setWhere(" where Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");
		qp11.setOrderfld("ProductID");
		qp11.setOrderType(1);		
		model.addAttribute("list_product_last", this.webProductService.selectWebProductInPager(qp11));
		//最新供求信息
		QueryParam qp12=new QueryParam();
		qp12.setTableName("web_supplyinfo");
		qp12.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp12.setPageSize(10);
		qp12.setPageIndex(1);
		qp12.setWhere(" where supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");
		qp12.setOrderfld("supplyinfoID");
		qp12.setOrderType(1);		
		model.addAttribute("list_supplyinfo_last", this.webPurveyService.selectWebSupplyinfoInPager(qp12));	
		//最新分类信息
		QueryParam qp13=new QueryParam();
		qp13.setTableName("biz_classinfo");
		qp13.setReturnFields(" classinfoID,classinfo_title,classinfo_class,classinfo_des,classinfo_price,classinfo_email,classinfo_name,classinfo_addr,classinfo_code,classinfo_tel,classinfo_ICQ,classinfo_publishdate ");
		qp13.setPageSize(10);
		qp13.setPageIndex(1);
		//qp.setWhere(" where classinfo_class= "+cateid);
		qp13.setOrderfld("classinfoID");
		qp13.setOrderType(1);
		model.addAttribute("classinfolist_new", this.classinfoService.selectRecordInPager(qp13));
		
		return "jsp/city";
	}

	
}
