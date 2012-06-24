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
import com.hedgehog.domain.biz_prank;
import com.hedgehog.domain.biz_rank;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.WebProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	private WebProductService webProductService;	
	@Autowired
	public void setwebProductService(WebProductService webProductService) {
		this.webProductService = webProductService;
	}
	private MemberService MemberService;
	@Autowired
	public void setMemberService(MemberService memberService) {
		this.MemberService = memberService;
	}
	@RequestMapping(method=RequestMethod.GET)
	  public String showHomePage(ModelMap model) {
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		QueryParam qp4=new QueryParam();
		qp4.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Thumbs ");
		qp4.setPageSize(18);
		qp4.setPageIndex(1);
		qp4.setWhere(" where Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_Rank=2 and member_lock=1))");//加强版
		qp4.setOrderfld("ProductID");
		qp4.setOrderType(1);	
		model.addAttribute("list_product_jiaqiang", this.webProductService.selectWebProductInPager(qp4));
		
		QueryParam qp5=new QueryParam();
		qp5.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp5.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Thumbs ");
		qp5.setPageSize(18);
		qp5.setPageIndex(1);
		qp5.setWhere(" where Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_Rank=1 and member_lock=1))");//标准版
		qp5.setOrderfld("ProductID");
		qp5.setOrderType(1);	
		model.addAttribute("list_product_biaozhun", this.webProductService.selectWebProductInPager(qp5));
		
		QueryParam qp6=new QueryParam();
		qp6.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp6.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Thumbs ");
		qp6.setPageSize(18);
		qp6.setPageIndex(1);
		qp6.setWhere(" where Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_PRank=2 and member_lock=1))");//生意版
		qp6.setOrderfld("ProductID");
		qp6.setOrderType(1);	
		model.addAttribute("list_product_shengyi", this.webProductService.selectWebProductInPager(qp6));
		
		QueryParam qp9=new QueryParam();
		qp9.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp9.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Thumbs ");
		qp9.setPageSize(16);
		qp9.setPageIndex(1);
		qp9.setWhere(" where Product_Property like '%c%' and Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//推荐产品
		qp9.setOrderfld("ProductID");
		qp9.setOrderType(1);		
		model.addAttribute("list_product_tuijian", this.webProductService.selectWebProductInPager(qp9));	
		
	    return "product";
	  }
	@RequestMapping(value="/list/{prank}/{cateid}",method=RequestMethod.GET)
	  public String showHomePagef(
			  @PathVariable("prank") int prankid,
			  @PathVariable("cateid") int rankid,
			  @RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="66") int perPage,
			  ModelMap model) {
		QueryParam qp=new QueryParam();
		qp.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Thumbs ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_PRank="+prankid+" and member_Rank="+rankid+" and member_lock=1))");//生意版
		qp.setOrderfld("ProductID");
		qp.setOrderType(1);	
		model.addAttribute("list_product", this.webProductService.selectWebProductInPager(qp));	
		model.addAttribute("queryParam", qp);
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		biz_prank prank=this.MemberService.selectPrankByPrimaryKey(prankid);
		biz_rank rank=this.MemberService.selectRankByPrimaryKey(rankid);
		model.addAttribute("nav", "最新"+prank.getPrankName()+rank.getRankName()+"产品");
		
		QueryParam qp9=new QueryParam();
		qp9.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp9.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Thumbs ");
		qp9.setPageSize(16);
		qp9.setPageIndex(1);
		qp9.setWhere(" where Product_Property like '%c%' and Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//推荐产品
		qp9.setOrderfld("ProductID");
		qp9.setOrderType(1);		
		model.addAttribute("list_product_tuijian", this.webProductService.selectWebProductInPager(qp9));	
	    return "product_list";
	  }
	@RequestMapping(value="/list/{prank}",method=RequestMethod.GET)
	  public String showHomePageef(
			  @PathVariable("prank") int prankid,
			  @RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="66") int perPage,
			  ModelMap model) {
		QueryParam qp=new QueryParam();
		qp.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Thumbs ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_PRank="+prankid+" and member_lock=1))");//生意版
		qp.setOrderfld("ProductID");
		qp.setOrderType(1);	
		model.addAttribute("list_product", this.webProductService.selectWebProductInPager(qp));	
		model.addAttribute("queryParam", qp);
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		biz_prank prank=this.MemberService.selectPrankByPrimaryKey(prankid);
		model.addAttribute("nav", "最新"+prank.getPrankName()+"产品");
		
		QueryParam qp9=new QueryParam();
		qp9.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp9.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Thumbs ");
		qp9.setPageSize(16);
		qp9.setPageIndex(1);
		qp9.setWhere(" where Product_Property like '%c%' and Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//推荐产品
		qp9.setOrderfld("ProductID");
		qp9.setOrderType(1);		
		model.addAttribute("list_product_tuijian", this.webProductService.selectWebProductInPager(qp9));	
		
	    return "product_list";
	  }
	
}
