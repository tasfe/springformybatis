package com.hedgehog.controller.Manager;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;
import java.util.ArrayList; 
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.sys_Applications;
import com.hedgehog.domain.sys_Module;
import com.hedgehog.domain.sys_User;
import com.hedgehog.service.ApplicationsService;
import com.hedgehog.service.ModuleService;
import com.hedgehog.service.NewsService;

@Controller
@RequestMapping("/Manager")
public class MenuController {
	private static final String LOGIN_NAME = "/Manager/login";
	private ModuleService moduleService;
	  
	  @Inject
	  public MenuController(ModuleService moduleService) {
	    this.moduleService = moduleService;
	  }
	  
		private ApplicationsService applicationsService;		

		@Inject
		public void setApplicationsService(ApplicationsService applicationsService) {
			this.applicationsService = applicationsService;
		}
		

	@RequestMapping(value={"/Menu"},method=GET)
	public String left(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			Map<String, Object> model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
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
		model.put("menu", list);
		//List<sys_Module> list_module=new ArrayList<sys_Module>();
		
//		for(sys_Applications appmd:list_app)
//		{
//			list_module.add(appmd.getList_module());
//		}
		
		
//		QueryParam qp=new QueryParam();
//		qp.setTableName("sys_Module");
//		qp.setReturnFields(" * ");
//		//qp.setPageSize(30);
//		//qp.setPageIndex(1);
//		//qp.setWhere(" where 1=1 ");
//		qp.setOrderfld("ModuleID");
//		//qp.setOrderType(1);
//		
//		model.put("menu", this.moduleService.selectRecordInPager(qp));
		return "Manager/left";		
	}
	

}
