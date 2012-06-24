package com.hedgehog.controller.website;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_menu;
import com.hedgehog.domain.biz_menuoper;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.MenuoperService;

@Controller
@RequestMapping("/{username}/manage")
public class WebIntroController {
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
		biz_menuoper menuoper=this.menuoperService.selectByAppcode("ch_common");
		menuoper.setMenuoperName(menu.getMenuName());
		//model.addAttribute("menuoper", menuoper);
		return menuoper;		
	}
	
//	@RequestMapping(value={"/admin_intro/{menuid}"},method=GET)
//	public String manageadmintype(
//			@ModelAttribute("menuenable") List<biz_menu> menuenable,
//			@ModelAttribute("menuoper") biz_menuoper menuoper,
//			@PathVariable("menuid") String menuid,
//			@PathVariable("username") String username,
//			Model model) 
//	{
//		model.addAttribute("username", username);
//		model.addAttribute("menuid", menuid);
////		
////        biz_member member=this.memberService.selectByUsername(username);		
////		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
////		biz_member member=this.memberService.selectByUsername(username);
////		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
//		
////		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
////		menuoper.setMenuoperName("系统管理");
////		model.addAttribute("menuoper", menuoper);
//		
//		return "tradeweb/admin_intro";
//	}

}
