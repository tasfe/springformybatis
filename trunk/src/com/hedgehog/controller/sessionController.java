package com.hedgehog.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.hedgehog.domain.User;

@Controller
@SessionAttributes("currentUser") 
@RequestMapping("/session")
public class sessionController {
	@ModelAttribute("currentUser")
	public User getUser()
	{
		User user=new User();
		return user;
	}
	
	@RequestMapping(value={"/login"},method=POST)
	public   String  hello(@ModelAttribute("currentUser") User user) { 
		//user.setUsername("chenying99");
		user.setUserpwd("193421");
		//user.setAddress("湖南平江");
   // user.sayHello() 
		return "MyJsp";
} 
	@RequestMapping(value={"/read"},method=GET)
	public String read(ModelMap model) 
	{
		//model.put("sysinfo", this.systemInfoService.selectByPrimaryKey(1));
		User user=(User)model.get("currentUser");
		System.out.println(user.getUsername());
		System.out.println(user.getUserpwd());
		System.out.println(user.getAddress());
		return "MyJsp";		
	}
	@RequestMapping(value={"/login"},method=GET)
	public String login(ModelMap modelMap)
	{
		//ModelMap modelMap
		//@ModelAttribute("currentUser" ) 页面隐含模型
		//sessionStatus.setComplete();
		modelMap.addAttribute("currentUser", new User());
		
		return "MyJsp";
	}
	@RequestMapping(value={"/loginout"},method=GET)
	public String loginout(SessionStatus sessionStatus)
	{
		sessionStatus.setComplete();
		return "MyJsp";
	}
	@RequestMapping(value={"/setsession"},method=GET)
	public String handle23(HttpSession session) {
		session.setAttribute("sessionId", 1234);
		return "MyJsp";		
}


}
