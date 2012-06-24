package com.hedgehog.controller.Manager;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.validation.Valid;

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

import com.hedgehog.domain.ProNew;
import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.sys_Applications;
import com.hedgehog.domain.sys_User;
import com.hedgehog.service.ApplicationsService;

@Controller
@RequestMapping("/Manager/Module/FrameWork/SystemApp/AppManager")
public class AppManagerController {
	private static final String LOGIN_NAME = "/Manager/login";
	private ApplicationsService applicationsService;
	@Inject
	  public AppManagerController(ApplicationsService applicationsService) {
	    this.applicationsService = applicationsService;
	  }
	
	
	@RequestMapping(value={"/List"},method=RequestMethod.GET)
	public String list(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			Map<String, Object> model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME ;
		}
		QueryParam qp=new QueryParam();
		qp.setTableName("sys_Applications");
		qp.setReturnFields(" * ");
		//qp.setPageSize(30);
		//qp.setPageIndex(1);
		//qp.setWhere(" where 1=1 ");
		qp.setOrderfld("A_Order");
		qp.setOrderType(0);
		List<sys_Applications> list=this.applicationsService.selectRecordInPager(qp);
		model.put("list", list);
		
		//return "Manager/Module/FrameWork/SystemApp/AppManager/List";
		return "AppManager/List";
	}
	
	@RequestMapping(value={"/Manager"},method=RequestMethod.GET,params="CMD=Edit")
	public String Manager(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="IDX") int applicationid,Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		//System.out.println("有没有执行到这里controller添加或编辑"+applicationid);
			model.addAttribute("app", this.applicationsService.selectByPrimaryKey(applicationid));
		//sys_Applications app = (applicationid == null ? new sys_Applications() : this.applicationsService.selectByPrimaryKey(Integer.parseInt(applicationid)));
		//model.addAttribute("app", app);
		
		return "AppManager/Manager";		
	}
	@RequestMapping(value={"/Manager"},method=RequestMethod.GET,params="CMD=New")
	public String Managernew(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		//System.out.println("有没有执行到这里controller添加或编辑"+applicationid);
			//model.addAttribute("app", this.applicationsService.selectByPrimaryKey(applicationid));
		//sys_Applications app = (applicationid == null ? new sys_Applications() : this.applicationsService.selectByPrimaryKey(Integer.parseInt(applicationid)));
		model.addAttribute("app", new sys_Applications());
		
		return "AppManager/Manager";		
	}
	@RequestMapping(value={"/Manager"},method=RequestMethod.GET,params="CMD=Delete")
	public String ManagerDelete(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="IDX") int applicationid,Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		System.out.println("有没有执行到这里controller删除"+applicationid);
		this.applicationsService.deleteByPrimaryKey(applicationid);
		return "redirect:List";			
	}
	@RequestMapping(value={"/Manager"},method=RequestMethod.POST,params="CMD=Edit")
	public String Managersub(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="IDX") String applicationid,
			@ModelAttribute("app") @Valid sys_Applications app,BindingResult result,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		if(result.hasErrors())
		{
			//model.addAttribute("app", app);
			return "AppManager/Manager";			
		}
		System.out.println("有没有执行到这里controller"+applicationid);
		app.setApplicationid(Integer.parseInt(applicationid));
		this.applicationsService.updateByPrimaryKeySelective(app);
		return "redirect:List";		
	}
	@RequestMapping(value={"/Manager"},method=RequestMethod.POST,params="CMD=New")
	public String Managersubnew(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@ModelAttribute("app") @Valid sys_Applications app,BindingResult result,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		if(result.hasErrors())
		{
			//model.addAttribute("app", app);
			return "AppManager/Manager";			
		}
//		System.out.println("有没有执行到这里controller"+applicationid);
//		app.setApplicationid(Integer.parseInt(applicationid));
//		this.applicationsService.updateByPrimaryKeySelective(app);
		//添加
		this.applicationsService.insertSelective(app);
		
		return "redirect:List";		
	}

}
