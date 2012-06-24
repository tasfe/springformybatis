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
import com.hedgehog.service.WebsiteService;

@Controller
@RequestMapping("/business")
public class BusinessController {
	private WebsiteService websiteService;
	@Autowired
	public void setWebsiteService(WebsiteService websiteService) {
		this.websiteService = websiteService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	  public String showHomePage(ModelMap model) {
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_website");
		qp.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp.setPageSize(40);
		qp.setPageIndex(1);
		qp.setWhere(" where w_memberID in (select memberID from biz_member where member_Rank=3 and member_lock=1)");//白银
		qp.setOrderfld("websiteID");
		qp.setOrderType(1);	
		model.addAttribute("businesslist_baiyin", this.websiteService.selectRecordInPager(qp));
		
		QueryParam qp2=new QueryParam();
		qp2.setTableName("biz_website");
		qp2.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp2.setPageSize(46);
		qp2.setPageIndex(1);
		qp2.setWhere(" where w_memberID in (select memberID from biz_member where member_Rank=4 and member_lock=1)");//黄金
		qp2.setOrderfld("websiteID");
		qp2.setOrderType(1);	
		model.addAttribute("businesslist_huangjin", this.websiteService.selectRecordInPager(qp2));
		
		QueryParam qp3=new QueryParam();
		qp3.setTableName("biz_website");
		qp3.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp3.setPageSize(40);
		qp3.setPageIndex(1);
		qp3.setWhere(" where w_memberID in (select memberID from biz_member where member_Rank=5 and member_lock=1)");//钻石
		qp3.setOrderfld("websiteID");
		qp3.setOrderType(1);	
		model.addAttribute("businesslist_zuanshi", this.websiteService.selectRecordInPager(qp3));
		
		QueryParam qp7=new QueryParam();
		qp7.setTableName("biz_website");
		qp7.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp7.setPageSize(34);
		qp7.setPageIndex(1);
		qp7.setWhere(" where w_Property like '%c%' and w_memberID in (select memberID from biz_member where member_lock=1)");//推荐企业
		qp7.setOrderfld("websiteID");
		qp7.setOrderType(1);	
		model.addAttribute("tradelist_tuijian", this.websiteService.selectRecordInPager(qp7));
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
	    return "business";
	  }
	@RequestMapping(value="/list/{rank}",method=RequestMethod.GET)
	  public String showHomePagelist(
			  @PathVariable("rank") int rank,
			  @RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="84") int perPage,
			  ModelMap model) {
		if(rank>5||rank<3)
		{
			rank=3;
		}
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_website");
		qp.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where w_memberID in (select memberID from biz_member where member_Rank="+rank+" and member_lock=1)");//白银
		qp.setOrderfld("websiteID");
		qp.setOrderType(1);	
		model.addAttribute("businesslist", this.websiteService.selectRecordInPager(qp));
		model.addAttribute("queryParam", qp);
		String[] strarray=new String[]{"最新生意通白银店铺","最新生意通黄金店铺","最新生意通钻石店铺"};
		model.addAttribute("nav", strarray[rank-3]);
		
		QueryParam qp7=new QueryParam();
		qp7.setTableName("biz_website");
		qp7.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp7.setPageSize(34);
		qp7.setPageIndex(1);
		qp7.setWhere(" where w_Property like '%c%' and w_memberID in (select memberID from biz_member where member_lock=1)");//推荐企业
		qp7.setOrderfld("websiteID");
		qp7.setOrderType(1);	
		model.addAttribute("tradelist_tuijian", this.websiteService.selectRecordInPager(qp7));
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
	    return "business_list";
	  }

}
