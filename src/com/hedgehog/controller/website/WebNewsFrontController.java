package com.hedgehog.controller.website;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

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
import com.hedgehog.service.FriendlinkService;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.WebNewsService;
import com.hedgehog.service.WebsiteService;

@Controller
@RequestMapping("/{username}/news/{menuID}")
public class WebNewsFrontController {
	private WebNewsService webNewsService;
	@Inject
	public WebNewsFrontController(WebNewsService webNewsService) {
		
		this.webNewsService = webNewsService;
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
		
		List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(menuID);		
		model.addAttribute("list_newsclass", list_newsclass);
		if(list_newsclass.size()>0)
		{
		  web_newsclass newsclass=list_newsclass.get(0);
		  
		  model.addAttribute("newsclass", newsclass);
		  
		  QueryParam qp=new QueryParam();
			qp.setTableName("web_news");
			qp.setReturnFields(" NewsID,News_Title,News_Class,News_Source,News_Hits,News_Updatetime,News_menuID ");
			qp.setPageSize(perPage);
			qp.setPageIndex(page);
			qp.setWhere(" where News_Class="+newsclass.getNewsclassid());
			qp.setOrderfld("NewsID");
			qp.setOrderType(1);			
			model.addAttribute("list_news", this.webNewsService.selectWebNewsInPager(qp));
			
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
	    return website.getwTemplet()+"_news";
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
		
		List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(menuID);		
		model.addAttribute("list_newsclass", list_newsclass);
		
		  web_newsclass newsclass=this.webNewsService.selectByPrimaryKey(cateid);//list_newsclass.get(0);
		  
		  model.addAttribute("newsclass", newsclass);
		  
		  QueryParam qp=new QueryParam();
			qp.setTableName("web_news");
			qp.setReturnFields(" NewsID,News_Title,News_Class,News_Source,News_Hits,News_Updatetime,News_menuID ");
			qp.setPageSize(perPage);
			qp.setPageIndex(page);
			qp.setWhere(" where News_Class="+newsclass.getNewsclassid());
			qp.setOrderfld("NewsID");
			qp.setOrderType(1);			
			model.addAttribute("list_news", this.webNewsService.selectWebNewsInPager(qp));
			
			model.addAttribute("queryParam", qp);			
		
		
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());	
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
	    return website.getwTemplet()+"_news";
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
		
		List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(menuID);		
		model.addAttribute("list_newsclass", list_newsclass);
		
		web_news news=this.webNewsService.selectNewsByPrimaryKey(newsid);
		model.addAttribute("news", news);
		
		
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
		System.out.println("视图名称"+website.getwTemplet()+"_news_detail");
	    return website.getwTemplet()+"_news_detail";
	  }
}
