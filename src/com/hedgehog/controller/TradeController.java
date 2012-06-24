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
@RequestMapping("/trade")
public class TradeController {
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
		qp.setPageSize(34);
		qp.setPageIndex(1);
		qp.setWhere(" where w_memberID in (select memberID from biz_member where member_Rank=2 and member_lock=1)");//商务通加强版
		qp.setOrderfld("websiteID");
		qp.setOrderType(1);	
		model.addAttribute("tradelist_jiaqiang", this.websiteService.selectRecordInPager(qp));
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		QueryParam qp2=new QueryParam();
		qp2.setTableName("biz_website");
		qp2.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp2.setPageSize(34);
		qp2.setPageIndex(1);
		qp2.setWhere(" where w_memberID in (select memberID from biz_member where member_Rank=1 and member_lock=1)");//商务通标准版
		qp2.setOrderfld("websiteID");
		qp2.setOrderType(1);	
		model.addAttribute("tradelist_biaozhun", this.websiteService.selectRecordInPager(qp2));
		System.out.println("商贸通页面");
		model.addAttribute("name", "chenying99");
		
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
	    return "trade";
	  }
	@RequestMapping(value="/list/{rank}",method=RequestMethod.GET)
	  public String showHomePagelist(
			  @PathVariable("rank") int rank,
			  @RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="92") int perPage,
			  ModelMap model) {	
		if(rank>2||rank<1)
		{
			rank=1;
		}
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_website");
		qp.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where w_memberID in (select memberID from biz_member where member_Rank="+rank+" and member_lock=1)");//商务通加强版
		qp.setOrderfld("websiteID");
		qp.setOrderType(1);	
		model.addAttribute("tradelist", this.websiteService.selectRecordInPager(qp));		
		model.addAttribute("queryParam", qp);
		String[] strarray=new String[]{"最新商贸通标准版","最新商务通加强版"};
		model.addAttribute("nav", strarray[rank-1]);
		System.out.println("页面rank");
		
		QueryParam qp7=new QueryParam();
		qp7.setTableName("biz_website");
		qp7.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp7.setPageSize(34);
		qp7.setPageIndex(1);
		qp7.setWhere(" where w_Property like '%c%' and w_memberID in (select memberID from biz_member where member_lock=1)");//推荐企业
		qp7.setOrderfld("websiteID");
		qp7.setOrderType(1);	
		model.addAttribute("tradelist_tuijian", this.websiteService.selectRecordInPager(qp7));
	    return "trade_list";
	  }

}
