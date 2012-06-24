package com.hedgehog.controller.Manager;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


import com.hedgehog.Utils.Security;
import com.hedgehog.domain.memberloginwrap;
import com.hedgehog.domain.sys_SystemInfo;
import com.hedgehog.domain.sys_User;
import com.hedgehog.service.SystemInfoService;
import com.hedgehog.service.UserService;

@Controller
@RequestMapping("/Manager")
public class BasicController {
	private static final String LOGIN_NAME = "/Manager/login";
	private SystemInfoService systemInfoService;
	@Inject
	public BasicController(SystemInfoService systemInfoService) {		
		this.systemInfoService = systemInfoService;
	}
	private UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	

	@RequestMapping(value={"/login"},method=GET)
	public String login(ModelMap modelMap) 
	{
      sys_SystemInfo systeminfo=this.systemInfoService.selectByPrimaryKey(1);
		
		modelMap.addAttribute("FrameName", systeminfo.getsName());
		modelMap.addAttribute("FrameNameVer",systeminfo.getsVersion());
      
		modelMap.addAttribute("sysUser", new sys_User());
		return "Manager/Login";
	}
	@RequestMapping(value={"/login"},method=POST)
	public String loginpost(
			@ModelAttribute("sysUser") sys_User user,
			HttpServletResponse response,
			ModelMap modelMap) 
	{
		if(this.userService.authenticate(user.getuLoginname(), Security.MD5(user.getuPassword())))
	      {
	    	  //User user=userService.getUser(username);
			  sys_User sysuser=this.userService.getUser(user.getuLoginname());
	    	  //session.setAttribute("sysUser", user);
	    	  //session.setMaxInactiveInterval(1200);
	    	  
	    	 Cookie usernamecookie=new Cookie("sysuser", sysuser.getuLoginname());
	  		 usernamecookie.setMaxAge(1200);
	  		 usernamecookie.setPath("/Manager/");
	  		 response.addCookie(usernamecookie);
	    	 return "redirect:/Manager/Main";
	      }
		System.out.println(user.getuLoginname());
		
		System.out.println(user.getuPassword());
		
		return "redirect:"+LOGIN_NAME;
	}
	
	@RequestMapping(value={"/LoginOut"},method=GET)
	public String loginout(
			HttpServletRequest request,
			HttpServletResponse response,
			Model model) 
	{
		Cookie deleteNewCookie=new Cookie("sysuser",null);
		deleteNewCookie.setMaxAge(0);
		deleteNewCookie.setPath("/Manager/"); 
		response.addCookie(deleteNewCookie);
		//sessionStatus.setComplete();
		return "redirect:login";
	}
	
	@RequestMapping(value={"/Main"},method=GET)
	public String admin(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		
		sys_SystemInfo systeminfo=this.systemInfoService.selectByPrimaryKey(1);
		
		modelMap.addAttribute("FrameName", systeminfo.getsName());
		modelMap.addAttribute("FrameNameVer",systeminfo.getsVersion());
		modelMap.addAttribute("MenuStyle", 1);
		return "Manager/Default";
	}
	
	@RequestMapping(value={"/right"},method=GET)
	public String right(Map<String, Object> model) 
	{
		model.put("sysinfo", this.systemInfoService.selectByPrimaryKey(1));
		return "Manager/Right";		
	}

}
