package com.hedgehog.controller.website;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_menu;
import com.hedgehog.domain.biz_menuoper;
import com.hedgehog.domain.memberloginwrap;
import com.hedgehog.domain.web_freeweb;
import com.hedgehog.domain.web_guestbook;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.MenuoperService;
import com.hedgehog.service.WebFreewebService;

@Controller
@RequestMapping("/{username}/manage")
public class WebFreewebController {
	private static final String LOGIN_NAME = "login";
	private MenuoperService menuoperService;
	@Autowired
	public void setMenuoperService(MenuoperService menuoperService) {
		this.menuoperService = menuoperService;
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
	private WebFreewebService webFreewebService;
	@Autowired
	public void setWebFreewebService(WebFreewebService webFreewebService) {
		this.webFreewebService = webFreewebService;
	}
	@ModelAttribute("menuenable")
	public List<biz_menu> getmenulist(@PathVariable("username") String username)
	{
		biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		return this.menuService.selectByMemberEnable(member.getMemberid());
		
	}
	@ModelAttribute("menuoper")
	public biz_menuoper getmenuoper(@PathVariable("menuid") String menuid)
	{
		//查询menu domain
		biz_menu menu=this.menuService.selectByPrimaryKey(Integer.valueOf(menuid));
		//biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
		biz_menuoper menuoper=this.menuoperService.selectByAppcode("ch_system");
		menuoper.setMenuoperName(menu.getMenuName());
		//model.addAttribute("menuoper", menuoper);
		return menuoper;		
	}
	
	@RequestMapping(value={"/admin_freeweb/{menuid}"},method=GET)
	public String manageadmintype(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,			
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";	
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);

		
//		web_freeweb freeweb=this.webFreewebService.selectByMenuid(Integer.parseInt(menuid));
//		if(freeweb==null)
//		{
//			freeweb=new web_freeweb();
//			
//		}
		biz_menu menu=this.menuService.selectByPrimaryKey(Integer.parseInt(menuid));
		//web_freeweb freeweb=new web_freeweb();
		model.addAttribute("webmenu", menu);
		
		return "tradeweb/admin_freeweb";
	}
	@RequestMapping(value={"/admin_freeweb/{menuid}"},method=POST)
	public String manageadmin_newsaddpost(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@ModelAttribute("webmenu") @Valid biz_menu menu,
			BindingResult result,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";	
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
		
//		news.setNewsProperties(news.getNewsFlag().toString());
//		System.out.println("属性值"+news.getNewsProperties());
	
		
		if(result.hasErrors())
		{
			//System.out.println("有没有到里面");

			
			return "tradeweb/admin_freeweb";// 返回添加类别视图
			
		}
		//String temp="";
		//temp.split(regex)
		//freeweb.setFreewebMenuid(Integer.parseInt(menuid));
		
		
		//添加新闻
		menu.setMenuid(Integer.parseInt(menuid));
		this.menuService.updateByPrimaryKeySelective(menu);
		//this.webFreewebService.insertSelective(freeweb);
//		this.webFreewebService.saveorupdate(freeweb);
//		web_freeweb freeweb2=this.webFreewebService.selectByMenuid(Integer.parseInt(menuid));
//		model.addAttribute("webfreeweb", freeweb);
		
		return "tradeweb/admin_freewebshow";// 返回添加类别视图
	}

}
