package com.hedgehog.controller.Manager;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_city;
import com.hedgehog.domain.biz_classinfo;
import com.hedgehog.domain.biz_classinfoclass;
import com.hedgehog.domain.memberwrap;
import com.hedgehog.domain.sys_User;
import com.hedgehog.service.ClassinfoService;

@Controller
@RequestMapping("/Manager/Module/FrameWork/ProjectInfo/BIZ_CLASSINFO")
public class ClassinfoManagerController {
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
		qp.setTableName("biz_classinfo");
		qp.setReturnFields(" classinfoID,classinfo_title,classinfo_class,classinfo_price,classinfo_email,classinfo_name,classinfo_addr,classinfo_code,classinfo_tel,classinfo_ICQ,classinfo_publishdate ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where 1=1 ");
		qp.setOrderfld("classinfoID");
		qp.setOrderType(1);
		modelMap.put("classinfolist", this.classinfoService.selectRecordInPager(qp));
		modelMap.put("queryParam", qp);
		
		return "Classinfo/List";
	}
	@RequestMapping(value={"/List"},method=GET,params="cmd=new")
	public String userlistfd(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		modelMap.addAttribute("classinfo", new biz_classinfo());
		modelMap.addAttribute("cicplist", this.classinfoService.selectcicAllParentRecord());
		
		return "Classinfo/Manager";
	}
	@RequestMapping(value={"/List"},method=POST,params="cmd=new")
	public String userlistfhfd(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@ModelAttribute("classinfo") @Valid biz_classinfo classinfo,
			BindingResult result,
			HttpServletRequest request,
			HttpServletResponse response,
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		if(result.hasErrors())
		{
			modelMap.addAttribute("cicplist", this.classinfoService.selectcicAllParentRecord());
			return "Classinfo/Manager";
			
		}
		try
		{
			MultipartFile file = classinfo.getFileData();		
			
			String fileName = null;
			InputStream inputStream = null;
			OutputStream outputStream = null;
			if (file.getSize() > 0) {
				inputStream = file.getInputStream();
				if (file.getSize() > 500000) {
					System.out.println("File Size:::" + file.getSize());
					return "tradeweb/admin_purveyEdit";
				}
				System.out.println("size::" + file.getSize());
				//request.getSession().getServletContext().getRealPath("/");
				
				//String restfilename="/resources/files/userfiles/"+ username+"/"+file.getOriginalFilename();
				String restfilename="/resources/files/userfiles/classinfo/"+UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")).toLowerCase();
				fileName = request.getSession().getServletContext().getRealPath("/") +restfilename;
				File dir=new File(request.getSession().getServletContext().getRealPath("/")+"/resources/files/userfiles/classinfo/");
				if(!dir.exists())
				{
					dir.mkdir();					
				}				
				outputStream = new FileOutputStream(fileName);
				System.out.println("fileName:" + file.getOriginalFilename());

				int readBytes = 0;
				byte[] buffer = new byte[10000];
				while ((readBytes = inputStream.read(buffer, 0, 10000)) != -1) {
					outputStream.write(buffer, 0, readBytes);
				}
				outputStream.close();
				inputStream.close();				
				//supply.setSupplyinfoThumbs(restfilename);
				classinfo.setClassinfoPic(restfilename);
			}
			//supply.setSupplyinfoMenuid(Integer.parseInt(menuid));
			//添加新闻
			//this.webPurveyService.insertSupplyinfoSelective(supply);
			this.classinfoService.insertSelective(classinfo);
	} catch (Exception e) {
		e.printStackTrace();
	}
		//新增分类信息
		
		
		return "redirect:List";
	}
	@RequestMapping(value={"/List"},method=GET,params="cmd=edit")
	public String userlistfddg(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int classinfoid,
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		modelMap.addAttribute("classinfo",this.classinfoService.selectByPrimaryKey(classinfoid));
		modelMap.addAttribute("cicplist", this.classinfoService.selectcicAllParentRecord());
		
		return "Classinfo/Manager";
	}
	
	@RequestMapping(value={"/List"},method=POST,params="cmd=edit")
	public String userlisdftfddg(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int classinfoid,
			@ModelAttribute("classinfo") @Valid biz_classinfo classinfo,
			BindingResult result,	
			HttpServletRequest request,
			HttpServletResponse response,
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		//modelMap.addAttribute("classinfo",this.classinfoService.selectByPrimaryKey(classinfoid));
		if(result.hasErrors())
		{
			modelMap.addAttribute("cicplist", this.classinfoService.selectcicAllParentRecord());
			return "Classinfo/Manager";			
		}
		try
		{
			MultipartFile file = classinfo.getFileData();	
			
			
			String fileName = null;
			InputStream inputStream = null;
			OutputStream outputStream = null;
			if (file.getSize() > 0) {
				inputStream = file.getInputStream();
				if (file.getSize() > 500000) {
					System.out.println("File Size:::" + file.getSize());
					return "tradeweb/admin_purveyEdit";
				}
				System.out.println("size::" + file.getSize());
				//request.getSession().getServletContext().getRealPath("/");
				
				//String restfilename="/resources/files/userfiles/"+ username+"/"+file.getOriginalFilename();
				String restfilename="/resources/files/userfiles/classinfo/"+UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")).toLowerCase();
				fileName = request.getSession().getServletContext().getRealPath("/") +restfilename;
				File dir=new File(request.getSession().getServletContext().getRealPath("/")+"/resources/files/userfiles/classinfo/");
				if(!dir.exists())
				{
					dir.mkdir();					
				}				
				outputStream = new FileOutputStream(fileName);
				System.out.println("fileName:" + file.getOriginalFilename());

				int readBytes = 0;
				byte[] buffer = new byte[10000];
				while ((readBytes = inputStream.read(buffer, 0, 10000)) != -1) {
					outputStream.write(buffer, 0, readBytes);
				}
				outputStream.close();
				inputStream.close();				
				//supply.setSupplyinfoThumbs(restfilename);
				classinfo.setClassinfoPic(restfilename);
			}
			//supply.setsupplyMenuid(Integer.parseInt(menuid));
			//添加新闻
			//this.webPurveyService.insertsupplySelective(supply);
			//supply.setSupplyinfoid(Integer.parseInt(supplyid));
			//this.webPurveyService.updateSupplyinfoByPrimaryKeySelective(supply);	
			classinfo.setClassinfoid(classinfoid);
			this.classinfoService.updateByPrimaryKeySelective(classinfo);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
		
		return "redirect:List";
	}
	@RequestMapping(value={"/List"},method=GET,params="cmd=del")
	public String userlistfdfd(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int infoid,	
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		this.classinfoService.deleteByPrimaryKey(infoid);
		this.classinfoService.deleteReplyByClassinfoid(infoid);
		
		
		return "redirect:List";//"Classinfo/Manager";
	}
	@RequestMapping(value="/getlistByparent", method = RequestMethod.GET)
	@ResponseBody
    public List<biz_classinfoclass> getlistBypro(@RequestParam(value="id", required=true) int parentid)
	{	
//	  //String returnText="user has registered 中文乱码";	
    	List<biz_classinfoclass> list=this.classinfoService.selectcicByParentID(parentid);
	  return list;	
	}

}
