package com.hedgehog.controller.website;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_menu;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.biz_websiteWithBLOBs;
import com.hedgehog.domain.web_commoninfo;
import com.hedgehog.domain.web_friendlink;
import com.hedgehog.domain.web_guestbook;
import com.hedgehog.service.FriendlinkService;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.WebCommoninfoService;
import com.hedgehog.service.WebGuestbookService;
import com.hedgehog.service.WebsiteService;

@Controller
@RequestMapping("/{username}")
public class WebGuestbookFrontontroller {
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
	
	private WebGuestbookService webGuestbookService;
	@Autowired
	public void setWebGuestbookService(WebGuestbookService webGuestbookService) {
		this.webGuestbookService = webGuestbookService;
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
	@RequestMapping(value={"/guestbook/{menuid}"}, method=RequestMethod.GET,params="!id")
	  public String showHomePagef(			  
			  @PathVariable("username") String username,
			  @PathVariable("menuid") int menuid,
			  @ModelAttribute("menuenable") List<biz_menu> menuenable,
			  ModelMap model) {
		model.addAttribute("username", username);
		biz_menu menu=this.menuService.selectByPrimaryKey(menuid);
		model.addAttribute("menu",menu);
		
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));	
		model.addAttribute("webguestbook", new web_guestbook());
		System.out.println("模板视图："+website.getwTemplet()+"_home");		
	    return website.getwTemplet()+"_guestbook";
	  }
	@RequestMapping(value={"/guestbook/{menuid}"}, method=RequestMethod.POST,params="!id")
	  public String showHomePagefs(	
			  HttpSession session,
			  HttpServletRequest request,
			  HttpServletResponse response,
			  @PathVariable("username") String username,
			  @PathVariable("menuid") int menuid,
			  @ModelAttribute("menuenable") List<biz_menu> menuenable,
			  @ModelAttribute("webguestbook") @Valid web_guestbook guestbook,
				BindingResult result,
			  ModelMap model) {
		model.addAttribute("username", username);
		biz_menu menu=this.menuService.selectByPrimaryKey(menuid);
		model.addAttribute("menu",menu);
		
		biz_member member=memberService.selectByUsername(username);
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		model.addAttribute("member", member);
		model.addAttribute("website", websiteWithBLOBs);
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));	
		model.addAttribute("webguestbook", new web_guestbook());
		System.out.println("模板视图："+website.getwTemplet()+"_home");	
		
		
		String code = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY); 
		if(guestbook.getCheckcode()!="")
		{
			if(!(guestbook.getCheckcode()).equals(code))
			{
				result.rejectValue("checkcode", "checkcode.error", "验证码错误");				
			}			
		}
		if(result.hasErrors())
		{
			for (ObjectError error : result.getAllErrors()) {
				System.err.println("Error: " + error.getCode() + " - "
						+ error.getDefaultMessage());
			}
			//System.out.println("有没有到里面");
			
			return website.getwTemplet()+"_guestbook";
			
		}
		guestbook.setGbMenuid(menuid);
		guestbook.setGbClientip(request.getRemoteAddr());
		//添加新闻
		this.webGuestbookService.insertSelective(guestbook);
			
	    return website.getwTemplet()+"_guestbook";
	  }

}
