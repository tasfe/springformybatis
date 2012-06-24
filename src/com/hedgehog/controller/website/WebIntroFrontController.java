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
import com.hedgehog.domain.web_commoninfo;
import com.hedgehog.domain.web_friendlink;
import com.hedgehog.service.FriendlinkService;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.WebCommoninfoService;
import com.hedgehog.service.WebsiteService;

@Controller
@RequestMapping("/{username}")
public class WebIntroFrontController {
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
	private WebCommoninfoService webCommoninfoService;
	@Autowired
	public void setWebCommoninfoService(WebCommoninfoService webCommoninfoService) {
		this.webCommoninfoService = webCommoninfoService;
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
	
	@RequestMapping(value={"/intro/{menuid}"}, method=RequestMethod.GET,params="!id")
	  public String showHomePagef(			  
			  @PathVariable("username") String username,
			  @PathVariable("menuid") int menuid,
			  @ModelAttribute("menuenable") List<biz_menu> menuenable,
			  ModelMap model) {
		model.addAttribute("username", username);
		biz_menu menu=this.menuService.selectByPrimaryKey(menuid);
		model.addAttribute("menu",menu);
		
		QueryParam qp=new QueryParam();
		qp.setTableName("web_commoninfo");
		qp.setReturnFields(" commoninfoID,cmm_name,cmm_menuID ");
		//qp.setPageSize(perPage);
		//qp.setPageIndex(1);
		qp.setWhere(" where cmm_menuID="+menuid);
		qp.setOrderfld("commoninfoID");
		qp.setOrderType(0);	
		List<web_commoninfo> list_commoninfo=this.webCommoninfoService.selectWebCommoninfoInPager(qp);
		model.addAttribute("list_commoninfo", list_commoninfo);
		//web_commoninfo commoninfo=new web_commoninfo();
		if(qp.getRecordCount()>0)
		{
			//commoninfo=list_commoninfo.get(0);
			web_commoninfo commoninfo=this.webCommoninfoService.selectByPrimaryKey(list_commoninfo.get(0).getCommoninfoid());
			model.addAttribute("commoninfo",commoninfo);
		}
		
		
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));		
		System.out.println("模板视图："+website.getwTemplet()+"_home");		
	    return website.getwTemplet()+"_intro";
	  }
	@RequestMapping(value={"/intro/{menuid}"}, method=RequestMethod.GET,params="id")
	  public String showHomePagefd(
			  @RequestParam(value="id") int id,
			  @PathVariable("username") String username,
			  @PathVariable("menuid") int menuid,
			  @ModelAttribute("menuenable") List<biz_menu> menuenable,
			  ModelMap model) {
		model.addAttribute("username", username);
		biz_menu menu=this.menuService.selectByPrimaryKey(menuid);
		model.addAttribute("menu",menu);
		
		QueryParam qp=new QueryParam();
		qp.setTableName("web_commoninfo");
		qp.setReturnFields(" commoninfoID,cmm_name,cmm_menuID ");
		//qp.setPageSize(perPage);
		//qp.setPageIndex(1);
		qp.setWhere(" where cmm_menuID="+menuid);
		qp.setOrderfld("commoninfoID");
		qp.setOrderType(1);	
		List<web_commoninfo> list_commoninfo=this.webCommoninfoService.selectWebCommoninfoInPager(qp);
		model.addAttribute("list_commoninfo", list_commoninfo);
		web_commoninfo commoninfo=this.webCommoninfoService.selectByPrimaryKey(id);
		
		model.addAttribute("commoninfo",commoninfo);
		
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));		
		System.out.println("模板视图："+website.getwTemplet()+"_home");		
	    return website.getwTemplet()+"_intro";
	  }
	
}
