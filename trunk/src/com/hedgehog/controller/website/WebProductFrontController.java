package com.hedgehog.controller.website;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_menu;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.biz_websiteWithBLOBs;
import com.hedgehog.domain.web_friendlink;
import com.hedgehog.domain.web_news;
import com.hedgehog.domain.web_newsclass;
import com.hedgehog.domain.web_product;
import com.hedgehog.domain.web_productclass;
import com.hedgehog.service.FriendlinkService;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.WebProductService;
import com.hedgehog.service.WebsiteService;

@Controller
@RequestMapping("/{username}/product/{menuID}")
public class WebProductFrontController {
	
	private WebProductService webProductService;	
	@Autowired
	public void setwebProductService(WebProductService webProductService) {
		this.webProductService = webProductService;
	}
	
    private WebsiteService websiteService;	
	@Autowired
	public void setWebsiteService(WebsiteService websiteService) {
		this.websiteService = websiteService;
	}	
	private MemberService memberService;
	@Autowired
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	private MenuService menuService;
	@Autowired
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	@ModelAttribute("menuenable")
	public List<biz_menu> getmenulist(@PathVariable("username") String username)
	{
		biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		return this.menuService.selectByMemberEnable(member.getMemberid());		
	}	
	private FriendlinkService friendlinkService;
    @Autowired
    public void setFriendlinkService(FriendlinkService friendlinkService) {
		this.friendlinkService = friendlinkService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String list(
			@PathVariable("username") String username,
			  @PathVariable("menuID") int menuID,
			  @ModelAttribute("menuenable") List<biz_menu> menuenable,
			  @RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
			ModelMap model)
	{
		model.addAttribute("username", username);
		biz_menu menu=this.menuService.selectByPrimaryKey(menuID);
		model.addAttribute("menu",menu);
		
		List<web_productclass> list_productclass=this.webProductService.selectByMenuID(menuID);
		model.addAttribute("list_productclass", list_productclass);
		
		if(list_productclass.size()>0)
		{
			web_productclass newsclass=list_productclass.get(0);
		  
		  model.addAttribute("productclass", newsclass);
		  
		  QueryParam qp=new QueryParam();
			qp.setTableName("web_product");
			qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_Thumbs,Product_updatetime,Product_hits ");
			
			//qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
			//qp.setReturnFields(" productID,product_Title,product_Class,product_Source,product_Hits,product_Updatetime,product_menuID ");
			qp.setPageSize(perPage);
			qp.setPageIndex(page);
			qp.setWhere(" where Product_Class="+newsclass.getPcid());
			qp.setOrderfld("ProductID");
			qp.setOrderType(1);	
			
			model.addAttribute("list_product", this.webProductService.selectWebProductInPager(qp));
			//System.out.println("总记录数："+ (Integer)qp.getRecordCount());
			//System.out.println("总页数："+ (Integer)qp.getPageCount());
			model.addAttribute("queryParam", qp);
			
		}
		//数据实现		
		//查询product数据表 menuID={menuID}的产品列表
		//List<product> list=
		//model.put("list", list);
		
		//然后查询productclass数据表menuID={menuID}的产品分类 显示在页面左栏 或右栏导航
		
		//视图实现		
		//查询website数据表memberID={memberID}的模板代号 比如 "E00"
		
		//返回视图
		//注 视图可采用tiles视图 或jsp视图两种方式
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());	
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
	    return website.getwTemplet()+"_product";
		//return "E00/product/list";
	}
	
	@RequestMapping(value="/{cateid}",method=RequestMethod.GET)
	  public String showHomePaget(
			  @PathVariable("username") String username,
			  @PathVariable("menuID") int menuID,
			  @PathVariable("cateid") int cateid,
			  @ModelAttribute("menuenable") List<biz_menu> menuenable,
			  @RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
			  ModelMap model) {
		model.addAttribute("username", username);
		biz_menu menu=this.menuService.selectByPrimaryKey(menuID);
		model.addAttribute("menu",menu);
		
		List<web_productclass> list_productclass=this.webProductService.selectByMenuID(menuID);
		model.addAttribute("list_productclass", list_productclass);
		
		web_productclass newsclass=this.webProductService.selectByPrimaryKey(cateid);//list_newsclass.get(0);
		  
		  model.addAttribute("newsclass", newsclass);
		  
          model.addAttribute("productclass", newsclass);
		  
		  QueryParam qp=new QueryParam();
			qp.setTableName("web_product");
			qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_Thumbs,Product_updatetime,Product_hits ");
			
			//qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
			//qp.setReturnFields(" productID,product_Title,product_Class,product_Source,product_Hits,product_Updatetime,product_menuID ");
			qp.setPageSize(perPage);
			qp.setPageIndex(page);
			qp.setWhere(" where Product_Class="+newsclass.getPcid());
			qp.setOrderfld("ProductID");
			qp.setOrderType(1);	
			
			model.addAttribute("list_product", this.webProductService.selectWebProductInPager(qp));
			//System.out.println("总记录数："+ (Integer)qp.getRecordCount());
			//System.out.println("总页数："+ (Integer)qp.getPageCount());
			model.addAttribute("queryParam", qp);		
		
		
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());	
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
		return website.getwTemplet()+"_product";
	  }
	
	@RequestMapping(value="/{cateid}/{productid}",method=RequestMethod.GET)
	  public String showHomePagetf(
			  @PathVariable("username") String username,
			  @PathVariable("menuID") int menuID,
			  @PathVariable("cateid") int cateid,
			  @PathVariable("productid") int productid,
			  @ModelAttribute("menuenable") List<biz_menu> menuenable,			  
			  ModelMap model) {
		model.addAttribute("username", username);
		biz_menu menu=this.menuService.selectByPrimaryKey(menuID);
		model.addAttribute("menu",menu);
		System.out.println("有木有到这里：新闻页面");
		
		List<web_productclass> list_productclass=this.webProductService.selectByMenuID(menuID);
		model.addAttribute("list_productclass", list_productclass);
		
		web_product news=this.webProductService.selectProductByPrimaryKey(productid);
		model.addAttribute("product", news);
		
		
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
		System.out.println("视图名称"+website.getwTemplet()+"_product_detail");
	    return website.getwTemplet()+"_product_detail";
	  }
	
	@RequestMapping(value="/aa/{productid}",method=RequestMethod.GET)
	public String detail(@PathVariable("username") String memberID,
			@PathVariable("menuID") String menuID,
			@PathVariable("productid") String productid,
			Map<String, Object> model)
	{
		//数据实现		
		//查询product数据表 menuID={menuID} productID={productid} 产品详细信息
		//product  product=
		//model.put("product", product);
		
		//视图实现		
		//查询website数据表memberID={memberID}的模板代号 比如 "E00"
		
		//返回视图
		return "E00/product/detail";
	}

}
