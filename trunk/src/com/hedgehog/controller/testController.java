package com.hedgehog.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import com.hedgehog.domain.User;

@Controller
@RequestMapping("/cookies")
public class testController {
	@RequestMapping(value={"/write"},method=GET)
	public String write(@CookieValue("JSESSIONID") String sessionId,@CookieValue("userName") String userName,ModelMap modelMap) 
	{
		System.out.println(sessionId);
		System.out.println(userName);
		//model.put("sysinfo", this.systemInfoService.selectByPrimaryKey(1));
		modelMap.addAttribute("currentUser", new User());
		return "MyJsp";		
	}
	@RequestMapping(value={"/read"},method=GET)
	public String read(Map<String, Object> model) 
	{
		//model.put("sysinfo", this.systemInfoService.selectByPrimaryKey(1));
		return "MyJsp";		
	}
	@RequestMapping(value = "/handle21")
	public void handle21(HttpServletRequest request,HttpServletResponse response) {
			//String userName = WebUtils.findParameterValue(request, "userName");
			response.addCookie(new Cookie("userName", "chenying99"));
	}
	@RequestMapping(value = "/handle22")
	public void handle22(HttpServletRequest request,HttpServletResponse response) {
			//String userName = WebUtils.findParameterValue(request, "userName");
			//response.addCookie(new Cookie("userName", "chenying99"));
			Cookie deleteNewCookie=new Cookie("userName",null);
			deleteNewCookie.setMaxAge(0);
			//deleteNewCookie.setPath("/"); 
			response.addCookie(deleteNewCookie);
	}
	@RequestMapping(value="/AddUser",method=GET)	
    public @ResponseBody String addUser()
	{	
	  String returnText="user has registered ÖÐÎÄÂÒÂë";	
	  return returnText;	
	}
}
