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

import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_menu;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.biz_websiteWithBLOBs;
import com.hedgehog.domain.web_friendlink;
import com.hedgehog.service.FriendlinkService;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.WebsiteService;

@Controller
@RequestMapping("/{username}")
public class WebHomeController {
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
	@RequestMapping(value={"/"}, method=RequestMethod.GET)
	  public String showHomePage(
			  @PathVariable("username") String username,
			  @ModelAttribute("menuenable") List<biz_menu> menuenable,
			  ModelMap model) {		
		model.addAttribute("username", username);
		biz_member member=this.memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		System.out.println("编号："+website.getWebsiteid());
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		System.out.println("内容标题："+websiteWithBLOBs.getwFree());
		System.out.println(websiteWithBLOBs.getwFreetext());
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));		
		System.out.println("模板视图："+website.getwTemplet()+"_home");		
	    return website.getwTemplet()+"_home";
	  }
	
	
}
