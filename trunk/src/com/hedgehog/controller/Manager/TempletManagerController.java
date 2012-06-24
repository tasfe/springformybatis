package com.hedgehog.controller.Manager;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_templet;
import com.hedgehog.domain.sys_User;
import com.hedgehog.service.TempletService;

@Controller
@RequestMapping("/Manager/Module/FrameWork/ProjectInfo/BIZ_TEMPLET")
public class TempletManagerController {
	private static final String LOGIN_NAME = "/Manager/login";
	private TempletService templetService;
	@Autowired
	public void setTempletService(TempletService templetService) {
		this.templetService = templetService;
	}
	
	@RequestMapping(value={"/List"},method=GET)
	public String userlist(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_templet");
		qp.setReturnFields(" * ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where 1=1 ");
		qp.setOrderfld("TempletID");
		qp.setOrderType(1);
		modelMap.put("templetlist", this.templetService.selectRecordInPager(qp));
		modelMap.put("queryParam", qp);
		
		return "Templet/List";
	}
	
	@RequestMapping(value={"/List"},method=GET,params="cmd=new")
	public String fhfdxh(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		modelMap.addAttribute("prolist", this.templetService.selectTempletclassAllRecord());		
		modelMap.addAttribute("templet", new biz_templet());
		return "Templet/Manager";
	}
	@RequestMapping(value={"/List"},method=POST,params="cmd=new")
	public String fhfdxfh(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@ModelAttribute("templet") @Valid biz_templet templet,
			BindingResult result,
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		if(result.hasErrors())
		{
			modelMap.addAttribute("prolist", this.templetService.selectTempletclassAllRecord());	
			return "Templet/Manager";
			
		}
		this.templetService.insertSelective(templet);
		//º”‘ÿ ˝æ›
//		QueryParam qp=new QueryParam();
//		qp.setTableName("biz_templet");
//		qp.setReturnFields(" * ");
//		qp.setPageSize(30);
//		qp.setPageIndex(1);
//		qp.setWhere(" where 1=1 ");
//		qp.setOrderfld("TempletID");
//		qp.setOrderType(1);
//		modelMap.put("templetlist", this.templetService.selectRecordInPager(qp));
//		modelMap.put("queryParam", qp);
		
		return "redirect:List";
	}
	
	@RequestMapping(value={"/List"},method=GET,params="cmd=edit")
	public String fhffdxh(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int templetid,
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		modelMap.addAttribute("prolist", this.templetService.selectTempletclassAllRecord());
		biz_templet templet=this.templetService.selectByPrimaryKey(templetid);
		modelMap.addAttribute("templet", templet);
		return "Templet/Manager";
	}
	@RequestMapping(value={"/List"},method=POST,params="cmd=edit")
	public String fhffdxhd(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
			@RequestParam(value="id") int templetid,
			@ModelAttribute("templet") @Valid biz_templet templet,
			BindingResult result,
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		if(result.hasErrors())
		{
			modelMap.addAttribute("prolist", this.templetService.selectTempletclassAllRecord());
			return "Templet/Manager";
		}
		templet.setTempletid(templetid);
		this.templetService.updateByPrimaryKeySelective(templet);
//		QueryParam qp=new QueryParam();
//		qp.setTableName("biz_templet");
//		qp.setReturnFields(" * ");
//		qp.setPageSize(perPage);
//		qp.setPageIndex(page);
//		qp.setWhere(" where 1=1 ");
//		qp.setOrderfld("TempletID");
//		qp.setOrderType(1);
//		modelMap.put("templetlist", this.templetService.selectRecordInPager(qp));
//		modelMap.put("queryParam", qp);
		
		return "redirect:List";
	}
	@RequestMapping(value={"/List"},method=GET,params="cmd=del")
	public String fhffdxhgf(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
			@RequestParam(value="id") int templetid,
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		
		this.templetService.deleteByPrimaryKey(templetid);
		
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_templet");
		qp.setReturnFields(" * ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where 1=1 ");
		qp.setOrderfld("TempletID");
		qp.setOrderType(1);
		modelMap.put("templetlist", this.templetService.selectRecordInPager(qp));
		modelMap.put("queryParam", qp);
		
		return "Templet/List";
	}
	
	
	

}
