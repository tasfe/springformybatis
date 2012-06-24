package com.hedgehog.controller.website;

import java.util.List;

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
import com.hedgehog.domain.web_supplyclass;
import com.hedgehog.domain.web_supplyinfo;
import com.hedgehog.service.FriendlinkService;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.WebPurveyService;
import com.hedgehog.service.WebsiteService;

@Controller
@RequestMapping("/{username}/purvey/{menuID}")
public class WebPurveyFrontController {
	
	private WebPurveyService webPurveyService;
	@Autowired
	public void setWebPurveyService(WebPurveyService webPurveyService) {
		this.webPurveyService = webPurveyService;
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
	private FriendlinkService friendlinkService;
    @Autowired
    public void setFriendlinkService(FriendlinkService friendlinkService) {
		this.friendlinkService = friendlinkService;
	}
	@ModelAttribute("menuenable")
	public List<biz_menu> getmenulist(@PathVariable("username") String username)
	{
		biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		return this.menuService.selectByMemberEnable(member.getMemberid());		
	}
	@RequestMapping(method=RequestMethod.GET)
	  public String showHomePage(
			  @PathVariable("username") String username,
			  @PathVariable("menuID") int menuID,
			  @ModelAttribute("menuenable") List<biz_menu> menuenable,
			  @RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
			  ModelMap model) {
		model.addAttribute("username", username);
		biz_menu menu=this.menuService.selectByPrimaryKey(menuID);
		model.addAttribute("menu",menu);
		System.out.println("有木有到这里：新闻页面");
		
		List<web_supplyclass> list_newsclass=this.webPurveyService.selectByMenuID(menuID);		
		model.addAttribute("list_supplyclass", list_newsclass);
		if(list_newsclass.size()>0)
		{
		  web_supplyclass newsclass=list_newsclass.get(0);
		  
		  model.addAttribute("supplyclass", newsclass);
		  
		  QueryParam qp=new QueryParam();
			qp.setTableName("web_supplyinfo");
			qp.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
			qp.setPageSize(perPage);
			qp.setPageIndex(page);
			qp.setWhere(" where supplyinfo_sc="+newsclass.getScid());
			qp.setOrderfld("supplyinfoID");
			qp.setOrderType(1);
				
				model.addAttribute("list_supplyinfo", this.webPurveyService.selectWebSupplyinfoInPager(qp));
			
			model.addAttribute("queryParam", qp);
			
		}
		
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());	
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
	    return website.getwTemplet()+"_purvey";
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
		System.out.println("有木有到这里：新闻页面");
		
		List<web_supplyclass> list_newsclass=this.webPurveyService.selectByMenuID(menuID);		
		model.addAttribute("list_supplyclass", list_newsclass);
		
		  web_supplyclass newsclass=this.webPurveyService.selectByPrimaryKey(cateid);//list_newsclass.get(0);
		  
		  model.addAttribute("supplyclass", newsclass);
		  
		  QueryParam qp=new QueryParam();
			qp.setTableName("web_supplyinfo");
			qp.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
			qp.setPageSize(perPage);
			qp.setPageIndex(page);
			qp.setWhere(" where supplyinfo_sc="+newsclass.getScid());
			qp.setOrderfld("supplyinfoID");
			qp.setOrderType(1);
				
				model.addAttribute("list_supplyinfo", this.webPurveyService.selectWebSupplyinfoInPager(qp));
			
			model.addAttribute("queryParam", qp);			
		
		
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());	
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
	    return website.getwTemplet()+"_purvey";
	  }
	@RequestMapping(value="/{cateid}/{newsid}",method=RequestMethod.GET)
	  public String showHomePagetf(
			  @PathVariable("username") String username,
			  @PathVariable("menuID") int menuID,
			  @PathVariable("cateid") int cateid,
			  @PathVariable("newsid") int newsid,
			  @ModelAttribute("menuenable") List<biz_menu> menuenable,			  
			  ModelMap model) {
		model.addAttribute("username", username);
		biz_menu menu=this.menuService.selectByPrimaryKey(menuID);
		model.addAttribute("menu",menu);
		System.out.println("有木有到这里：新闻页面");
		
		List<web_supplyclass> list_newsclass=this.webPurveyService.selectByMenuID(menuID);		
		model.addAttribute("list_supplyclass", list_newsclass);
		
		web_supplyinfo news=this.webPurveyService.selectSupplyinfoByPrimaryKey(newsid);
		model.addAttribute("supplyinfo", news);
		
		
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
		System.out.println("视图名称"+website.getwTemplet()+"_purvey_detail");
	    return website.getwTemplet()+"_purvey_detail";
	  }

}
