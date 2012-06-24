package com.hedgehog.controller.Manager;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Map;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hedgehog.domain.memberwrap;
import com.hedgehog.domain.sys_SystemInfo;
import com.hedgehog.domain.sys_User;
import com.hedgehog.service.SystemInfoService;

@Controller
@RequestMapping("/Manager/Module/FrameWork/SystemMaintenance/SystemConfig")
public class SystemConfigController {
	private static final String LOGIN_NAME = "/Manager/login";
	private SystemInfoService systemInfoService;
	@Inject
	public SystemConfigController(SystemInfoService systemInfoService) {		
		this.systemInfoService = systemInfoService;
	}
	
	
	@RequestMapping(value={"/default"},method=GET,params="!cmd")
	public String right(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			Map<String, Object> model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		model.put("sysinfo", this.systemInfoService.selectByPrimaryKey(1));
		return "SystemConfig/default";		
	}
	
	@RequestMapping(value={"/default"},method=GET,params="cmd=edit")
	public String rightfgh(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			Map<String, Object> model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		model.put("sysinfo", this.systemInfoService.selectByPrimaryKey(1));
		return "SystemConfig/Manager";		
	}
	@RequestMapping(value={"/default"},method=POST,params="cmd=edit")
	public String rightfghfg(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@ModelAttribute("sysinfo") @Valid sys_SystemInfo systeminfo,
			BindingResult result,
			Map<String, Object> model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		if(result.hasErrors())
		{
			return "SystemConfig/Manager";	
		}
		systeminfo.setSystemid(1);
		this.systemInfoService.updateByPrimaryKeySelective(systeminfo);
		//model.put("sysinfo", this.systemInfoService.selectByPrimaryKey(1));
		return "SystemConfig/default";
	}

	
	

}
