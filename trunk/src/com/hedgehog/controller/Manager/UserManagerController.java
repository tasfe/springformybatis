package com.hedgehog.controller.Manager;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Map;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hedgehog.Utils.Security;
import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.User;
import com.hedgehog.domain.biz_templet;
import com.hedgehog.domain.sys_SystemInfo;
import com.hedgehog.domain.sys_User;
import com.hedgehog.service.SystemInfoService;
import com.hedgehog.service.UserService;

@Controller 
@RequestMapping("/Manager/Module/FrameWork/SystemApp/UserManager")
public class UserManagerController {
	private static final String LOGIN_NAME = "/Manager/login";
	private UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}	
	

	@RequestMapping(value={"/List"},method=RequestMethod.GET)
	public String list(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="page", defaultValue="1") int page,
	        @RequestParam(value="perPage", defaultValue="30") int perPage,			
			ModelMap modelMap) 
	{
		//if(user==null) user=new sys_User();
		
		//sys_User user=(sys_User)modelMap.get("sysUser");
		//System.out.println("登录用户名："+user.getuLoginname());
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		
		QueryParam qp=new QueryParam();
		qp.setTableName("sys_User");
		qp.setReturnFields(" * ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where 1=1 ");
		qp.setOrderfld("UserID");
		qp.setOrderType(1);
		modelMap.put("userlist", this.userService.selectUserInPager(qp));
		modelMap.put("queryParam", qp);		
		
		return "UserManager/List";
	}
	@RequestMapping(value={"/List"},method=RequestMethod.GET,params="cmd=new")
	public String listf(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@ModelAttribute("sysUser") sys_User user,
			ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		modelMap.addAttribute("user", new sys_User());
		return "UserManager/UserManager";
	}
	@RequestMapping(value={"/List"},method=RequestMethod.POST,params="cmd=new")
	public String lifstf(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@ModelAttribute("user") @Valid sys_User user,
			BindingResult result,
			ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		if(user.getuPassword()=="")
		{
			result.rejectValue("uPassword", "uPassword.error", "密码不能为空");			
		}
		if(result.hasErrors())
		{
			return "UserManager/UserManager";
		}
		user.setuPassword(Security.MD5(user.getuPassword()));
		this.userService.insertSelective(user);
		
		return "redirect:List";
	}
	
	@RequestMapping(value={"/List"},method=RequestMethod.GET,params="cmd=edit")
	public String listfgf(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int userid,
			ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		modelMap.addAttribute("user", this.userService.selectByPrimaryKey(userid));
		return "UserManager/UserManager";
	}
	@RequestMapping(value={"/List"},method=RequestMethod.POST,params="cmd=edit")
	public String lifstgf(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int userid,
			@ModelAttribute("user") @Valid sys_User user,
			BindingResult result,
			ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		if(result.hasErrors())
		{
			return "UserManager/UserManager";			
		}
		user.setUserid(userid);
		if(user.getuPassword()=="")
		{
			user.setuPassword(null);
		}
		if(user.getuPassword()!="")
		{
			user.setuPassword(Security.MD5(user.getuPassword()));
			
		}
		
		this.userService.updateByPrimaryKeySelective(user);
		return "redirect:List";
	}
	@RequestMapping(value={"/List"},method=RequestMethod.GET,params="cmd=del")
	public String listfcb(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int userid,
			ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		this.userService.deleteByPrimaryKey(userid);
		return "redirect:List";
	}
	

}
