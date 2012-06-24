package com.hedgehog.controller.Manager;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.service.ClassinfoService;

@Controller
@RequestMapping("/Manager/Module/FrameWork/ProjectInfo/BIZ_REPLY")
public class ReplyManagerController {
	private static final String LOGIN_NAME = "/Manager/login";
	private ClassinfoService classinfoService;
	@Autowired
	public void setClassinfoService(ClassinfoService classinfoService) {
		this.classinfoService = classinfoService;
	}
	
	//Classinfo/List
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
		qp.setTableName("biz_reply");
		qp.setReturnFields(" replyID,reply_infoID,reply_nikename,reply_email,reply_content,reply_datetime,reply_clientip ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where 1=1 ");
		qp.setOrderfld("replyID");
		qp.setOrderType(1);
		modelMap.put("replylist", this.classinfoService.selectReplyRecordInPager(qp));
		modelMap.put("queryParam", qp);
		
		return "Reply/List";
	}
	@RequestMapping(value={"/List"},method=GET,params="cmd=del")
	public String userlistfdfd(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int replyid,	
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		this.classinfoService.deleteReplyByPrimaryKey(replyid);
		//this.classinfoService.deleteByPrimaryKey(infoid);
		//this.classinfoService.deleteReplyByClassinfoid(infoid);
		
		
		return "redirect:List";//"Classinfo/Manager";
	}
}
