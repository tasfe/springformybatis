package com.hedgehog.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.service.WebPurveyService;

@Controller
@RequestMapping("/purvey")
public class PurveyController {
	private WebPurveyService webPurveyService;
	@Autowired
	public void setWebPurveyService(WebPurveyService webPurveyService) {
		this.webPurveyService = webPurveyService;
	}
	@RequestMapping(method=RequestMethod.GET)
	  public String showHomePage(ModelMap model) {
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		QueryParam qp5=new QueryParam();
		qp5.setTableName("web_supplyinfo");
		qp5.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp5.setPageSize(12);
		qp5.setPageIndex(1);
		qp5.setWhere(" where supplyinfo_type=1 and supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//供应
		qp5.setOrderfld("supplyinfoID");
		qp5.setOrderType(1);		
		model.addAttribute("list_supplyinfo1", this.webPurveyService.selectWebSupplyinfoInPager(qp5));
		
		QueryParam qp6=new QueryParam();
		qp6.setTableName("web_supplyinfo");
		qp6.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp6.setPageSize(12);
		qp6.setPageIndex(1);
		qp6.setWhere(" where supplyinfo_type=2 and supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//求购
		qp6.setOrderfld("supplyinfoID");
		qp6.setOrderType(1);		
		model.addAttribute("list_supplyinfo2", this.webPurveyService.selectWebSupplyinfoInPager(qp6));	
		
		
		QueryParam qp8=new QueryParam();
		qp8.setTableName("web_supplyinfo");
		qp8.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp8.setPageSize(12);
		qp8.setPageIndex(1);
		qp5.setWhere(" where supplyinfo_type=1 and supplyinfo_properties like '%c%' and supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//推荐供应
		qp8.setOrderfld("supplyinfoID");
		qp8.setOrderType(1);		
		model.addAttribute("list_supplyinfo1_tuijian", this.webPurveyService.selectWebSupplyinfoInPager(qp8));
		
		QueryParam qp9=new QueryParam();
		qp9.setTableName("web_supplyinfo");
		qp9.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp9.setPageSize(12);
		qp9.setPageIndex(1);
		qp9.setWhere(" where supplyinfo_type=2 and supplyinfo_properties like '%c%' and supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//推荐求购
		qp9.setOrderfld("supplyinfoID");
		qp9.setOrderType(1);		
		model.addAttribute("list_supplyinfo2_tuijian", this.webPurveyService.selectWebSupplyinfoInPager(qp9));
		
	    return "purvey";
	  }
	@RequestMapping(value="/list/{type}",method=RequestMethod.GET)
	  public String showHomePagelist(
			  @PathVariable("type") int type,
			  @RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="52") int perPage,
			  ModelMap model) {
		if(!(type==1||type==2))
		{
			type=1;			
		}
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		QueryParam qp5=new QueryParam();
		qp5.setTableName("web_supplyinfo");
		qp5.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp5.setPageSize(perPage);
		qp5.setPageIndex(page);
		qp5.setWhere(" where supplyinfo_type="+type+" and supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//供应
		qp5.setOrderfld("supplyinfoID");
		qp5.setOrderType(1);		
		model.addAttribute("list_supplyinfo", this.webPurveyService.selectWebSupplyinfoInPager(qp5));
		model.addAttribute("queryParam", qp5);
		String[] strarray=new String[]{"供应","求购"};
		model.addAttribute("nav",strarray[type-1]);
		
		QueryParam qp8=new QueryParam();
		qp8.setTableName("web_supplyinfo");
		qp8.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp8.setPageSize(12);
		qp8.setPageIndex(1);
		qp5.setWhere(" where supplyinfo_type=1 and supplyinfo_properties like '%c%' and supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//推荐供应
		qp8.setOrderfld("supplyinfoID");
		qp8.setOrderType(1);		
		model.addAttribute("list_supplyinfo1_tuijian", this.webPurveyService.selectWebSupplyinfoInPager(qp8));
		
		QueryParam qp9=new QueryParam();
		qp9.setTableName("web_supplyinfo");
		qp9.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp9.setPageSize(12);
		qp9.setPageIndex(1);
		qp9.setWhere(" where supplyinfo_type=2 and supplyinfo_properties like '%c%' and supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//推荐求购
		qp9.setOrderfld("supplyinfoID");
		qp9.setOrderType(1);		
		model.addAttribute("list_supplyinfo2_tuijian", this.webPurveyService.selectWebSupplyinfoInPager(qp9));
		
	    return "purvey_list";
	  }

}
