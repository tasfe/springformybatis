package com.hedgehog.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_classinfo;
import com.hedgehog.domain.biz_classinfoclass;
import com.hedgehog.domain.biz_reply;
import com.hedgehog.service.ClassinfoService;

@Controller
@RequestMapping("/classify")
public class ClassifyController {
	private ClassinfoService classinfoService;
	@Autowired
	public void setClassinfoService(ClassinfoService classinfoService) {
		this.classinfoService = classinfoService;
	}
	@RequestMapping(method=RequestMethod.GET)
	  public String showHomePage(ModelMap model) {
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		List<biz_classinfoclass> list_cic=this.classinfoService.selectcicAllParentRecord();
		model.addAttribute("list_cic", list_cic);
		
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_classinfo");
		qp.setReturnFields(" classinfoID,classinfo_title,classinfo_class,classinfo_des,classinfo_price,classinfo_email,classinfo_name,classinfo_addr,classinfo_code,classinfo_tel,classinfo_ICQ,classinfo_publishdate ");
		qp.setPageSize(26);
		qp.setPageIndex(1);
		//qp.setWhere(" where classinfo_class= "+cateid);
		qp.setOrderfld("classinfoID");
		qp.setOrderType(1);
		model.addAttribute("classinfolist_new", this.classinfoService.selectRecordInPager(qp));
		
	    return "classify";
	  }
	@RequestMapping(value="/infolist/{cateid}",method=RequestMethod.GET)
	  public String showHomePagelist(
			  @PathVariable("cateid") int cateid,
			  @RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="13") int perPage,
			  ModelMap model) {
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		List<biz_classinfoclass> list_cic=this.classinfoService.selectcicAllParentRecord();		
		model.addAttribute("list_cic", list_cic);
		
		biz_classinfoclass cic=this.classinfoService.selectcicByPrimaryKey(cateid);		
		model.addAttribute("cic",cic);
		
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_classinfo");
		qp.setReturnFields(" classinfoID,classinfo_title,classinfo_class,classinfo_des,classinfo_price,classinfo_email,classinfo_name,classinfo_addr,classinfo_code,classinfo_tel,classinfo_ICQ,classinfo_publishdate ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where classinfo_class= "+cateid);
		qp.setOrderfld("classinfoID");
		qp.setOrderType(1);
		model.addAttribute("classinfolist", this.classinfoService.selectRecordInPager(qp));
		model.addAttribute("queryParam", qp);		
		
	    return "classify_list";
	  }
	@RequestMapping(value="/hotinfoview/{cateid}/{infoid}",method=RequestMethod.POST)
	public String showHomePagelistpublishinfoviewgs(
			@PathVariable(value="cateid") int cateid,
			@PathVariable(value="infoid") int infoid,
			@ModelAttribute("reply") @Valid biz_reply reply,	
			BindingResult result,			  		 
			ModelMap model) 
	{
		//WebRequest request,
		System.out.println("回复开始");
		if(result.hasErrors())
		{
			biz_classinfoclass cic=this.classinfoService.selectcicByPrimaryKey(cateid);		
			model.addAttribute("cic",cic);
			
			biz_classinfo classinfo=this.classinfoService.selectByPrimaryKey(infoid);
			//classinfo.getClassinfoClientip().substring(0, classinfo.getClassinfoClientip().lastIndexOf("."))+".*"; //classinfo.getClassinfoClientip().lastIndexOf(".");
			classinfo.setClassinfoClientip(classinfo.getClassinfoClientip().substring(0, classinfo.getClassinfoClientip().lastIndexOf("."))+".*");
			model.addAttribute("classinfo",classinfo);
		    return "classify_hotinfoview";
		    
			//return "/hotinfoview/"+String.valueOf(cateid)+"/"+String.valueOf(infoid);
		}
		//reply.setReplyInfoid(infoid);
		//String userName = WebUtils.findParameterValue(request, "userName");
		//String tbxReplyEmail= request.getParameter("tbxReplyEmail");
		//String tbxReplyNick=request.getParameter("tbxReplyNick");
		//String tbxReplyContent=request.getParameter("tbxReplyContent");
		//biz_reply record=new biz_reply();
		//record.setReplyInfoid(infoid);
		//record.setReplyNikename(tbxReplyNick);
		//record.setReplyEmail(tbxReplyEmail);
		//record.setReplyContent(tbxReplyContent);
		
		this.classinfoService.insertReplySelective(reply);
		System.out.println("回复成功");
		
		return "redirect:/classify/hotinfoview/"+String.valueOf(cateid)+"/"+String.valueOf(infoid);
	}
	
	@RequestMapping(value="/hotinfoview/{cateid}/{infoid}",method=RequestMethod.GET)
	  public String showHomePagelistpublishinfoview(
			  @PathVariable(value="cateid") int cateid,
			  @PathVariable(value="infoid") int infoid,
			  ModelMap model) {
		biz_classinfoclass cic=this.classinfoService.selectcicByPrimaryKey(cateid);		
		model.addAttribute("cic",cic);
		
		biz_classinfo classinfo=this.classinfoService.selectByPrimaryKey(infoid);
		//classinfo.getClassinfoClientip().substring(0, classinfo.getClassinfoClientip().lastIndexOf("."))+".*"; //classinfo.getClassinfoClientip().lastIndexOf(".");
		classinfo.setClassinfoClientip(classinfo.getClassinfoClientip().substring(0, classinfo.getClassinfoClientip().lastIndexOf("."))+".*");
		model.addAttribute("classinfo",classinfo);
		
		biz_reply reply=new biz_reply();
		reply.setReplyInfoid(infoid);
		model.addAttribute("reply",reply);
		
	    return "classify_hotinfoview";
	}
	@RequestMapping(value="/infoselmode",method=RequestMethod.GET)
	  public String showHomePagelistpublish(
			  @RequestParam(value="cateid", defaultValue="1") int cateid,
			  ModelMap model) {
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		//List<biz_classinfoclass> list_cic=this.classinfoService.selectcicAllParentRecord();
		
		//model.addAttribute("list_cic", list_cic);
		model.addAttribute("cateid", cateid);
	    return "classify_infoselmode";
	  }
	@RequestMapping(value="/infoseltype",method=RequestMethod.GET)
	  public String showHomePagelistpublishsel(ModelMap model) {
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		//List<biz_classinfoclass> list_cic=this.classinfoService.selectcicAllParentRecord();
		
		//model.addAttribute("list_cic", list_cic);
		List<biz_classinfoclass> list_cic=this.classinfoService.selectcicAllParentRecord();
		model.addAttribute("list_cic", list_cic);
	    return "classify_infoseltype";
	  }
	@RequestMapping(value="/infopublish",method=RequestMethod.GET)
	  public String showHomePagelistpublishpost(
			  @RequestParam(value="cateid", defaultValue="1") int cateid,
			  ModelMap model) {
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		//List<biz_classinfoclass> list_cic=this.classinfoService.selectcicAllParentRecord();
		
		//model.addAttribute("list_cic", list_cic);
		//model.addAttribute("cateid", cateid);
		biz_classinfo classinfo=new biz_classinfo();
		classinfo.setClassinfoClass(cateid);
		biz_classinfoclass cic=this.classinfoService.selectcicByPrimaryKey(cateid);			
		classinfo.setClassinfoParentclass(cic.getParentclassinfoclass().getCicid());
		model.addAttribute("classinfo", classinfo);
	    return "classify_infopublish";
	  }
	@RequestMapping(value="/infopublish",method=RequestMethod.POST)
	  public String showHomePagelistpublishposthandle(
			  @RequestParam(value="cateid", defaultValue="1") int cateid,
			  @ModelAttribute("classinfo") @Valid biz_classinfo classinfo,
				BindingResult result,
				HttpSession session,
				HttpServletRequest request,
				HttpServletResponse response,
			  ModelMap model) {
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		//List<biz_classinfoclass> list_cic=this.classinfoService.selectcicAllParentRecord();
		
		//model.addAttribute("list_cic", list_cic);
		//model.addAttribute("cateid", cateid);
		classinfo.setClassinfoClientip(request.getRemoteAddr());//ip
		//验证码
		String code = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY); 
		if(classinfo.getCheckcode()=="")
		{
			result.rejectValue("checkcode", "checkcode.requirederror", "验证码不能为空");
		}
		if(classinfo.getCheckcode()!="")
		{
			if(!(classinfo.getCheckcode()).equals(code))
			{
				result.rejectValue("checkcode", "checkcode.error", "验证码错误");			
			}			
		}
		
		if(result.hasErrors())
		{
			for (ObjectError error : result.getAllErrors()) {
				System.err.println("Error: " + error.getCode() + " - "
						+ error.getDefaultMessage());
			}
		  return "classify_infopublish";			
		}
		
		try
		{
			MultipartFile file = classinfo.getFileData();		
			
			String fileName = null;
			InputStream inputStream = null;
			OutputStream outputStream = null;
			
			if (file.getSize() > 0) {
				//System.out.println("偏移："+file.getOriginalFilename().lastIndexOf("."));
				if(file.getOriginalFilename().lastIndexOf(".")==-1)
				{
					System.out.println("文件格式不合法");
					return "classify_infopublish";
				}
				String ext=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1).toLowerCase();//后缀
				//System.out.println("文件后缀："+ext);
				if(!ext.equalsIgnoreCase("jpg")&&!ext.equalsIgnoreCase("jpeg")&&!ext.equalsIgnoreCase("png"))
				{
					System.out.println("文件格式不合法");
					return "classify_infopublish";
				}
				
				inputStream = file.getInputStream();
				if (file.getSize() > 500000) {
					System.out.println("File Size:::" + file.getSize());
					return "classify_infopublish";
				}
				System.out.println("size::" + file.getSize());
				//request.getSession().getServletContext().getRealPath("/");
				
				//String restfilename="/resources/files/userfiles/"+ username+"/"+file.getOriginalFilename();
				//数据库存储值
				String restfilename="/resources/files/userfiles/classinfo/"+UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")).toLowerCase();
				System.out.println("相对路径文件名："+restfilename);
				//程序保存
				fileName = request.getSession().getServletContext().getRealPath("/") +"resources\\files\\userfiles\\classinfo\\"+UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")).toLowerCase();;
				System.out.println("绝对路径文件名："+fileName);
				File dir=new File(request.getSession().getServletContext().getRealPath("/")+"resources\\files\\userfiles\\classinfo\\");
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
		//success view
	    return "classify_success";
	  }
	
	

}
