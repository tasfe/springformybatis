package com.hedgehog.controller.website;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_menu;
import com.hedgehog.domain.biz_menuoper;
import com.hedgehog.domain.memberloginwrap;
import com.hedgehog.domain.web_product;
import com.hedgehog.domain.web_supplyclass;
import com.hedgehog.domain.web_supplyinfo;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.MenuoperService;
import com.hedgehog.service.WebPurveyService;

@Controller
@RequestMapping("/{username}/manage")
public class WebPurveyController {
	private static final String LOGIN_NAME = "login";
	
	private MenuoperService menuoperService;
	@Autowired
	public void setMenuoperService(MenuoperService menuoperService) {
		this.menuoperService = menuoperService;
	}
	
	private MemberService memberService;
	@Autowired
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	private MenuService menuService;
	@Autowired
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	
	private WebPurveyService webPurveyService;
	@Autowired
	public void setWebPurveyService(WebPurveyService webPurveyService) {
		this.webPurveyService = webPurveyService;
	}
	
	@ModelAttribute("menuenable")
	public List<biz_menu> getmenulist(@PathVariable("username") String username)
	{
		biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		return this.menuService.selectByMemberEnable(member.getMemberid());
		
	}
	@ModelAttribute("menuoper")
	public biz_menuoper getmenuoper(@PathVariable("menuid") String menuid)
	{
		//��ѯmenu domain
		biz_menu menu=this.menuService.selectByPrimaryKey(Integer.valueOf(menuid));
		//biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
		biz_menuoper menuoper=this.menuoperService.selectByAppcode("ch_purvey");
		menuoper.setMenuoperName(menu.getMenuName());
		//model.addAttribute("menuoper", menuoper);
		return menuoper;		
	}
	
	@RequestMapping(value={"/admin_purvey/{menuid}"},method=GET)
	public String manageadmintype(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("ϵͳ����");
//		model.addAttribute("menuoper", menuoper);
		
		QueryParam qp=new QueryParam();
		qp.setTableName("web_supplyinfo");
		qp.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where supplyinfo_menuID="+menuid);
		qp.setOrderfld("supplyinfoID");
		qp.setOrderType(1);
		
		
		model.addAttribute("list_supplyinfo", this.webPurveyService.selectWebSupplyinfoInPager(qp));
		System.out.println("�ܼ�¼����"+ (Integer)qp.getRecordCount());
		System.out.println("��ҳ����"+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		//System.out.println("�ܼ�¼��2��"+returnid );
	    //model.put("news", newsService.getNewsList());
	    System.out.println("ҳ�룺"+page);
	    //System.out.println("��ľ�е�����listNews");
		
		//model.addAttribute("list_news", menuoper);
		
		return "tradeweb/admin_purvey";
	}
	
	@RequestMapping(value={"/admin_purveytype/{menuid}"},method=GET)
	public String manageadmin_newstype(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";	
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("ϵͳ����");
//		model.addAttribute("menuoper", menuoper);
		//��menuid��ѯ��������
//		List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(Integer.valueOf(menuid));
//		System.out.println("����¼����"+list_newsclass.size());
//		
//		model.addAttribute("list_newsclass", list_newsclass);
		
		//model.addAttribute("newsclass", new web_newsclass());
		
		List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("list_supplyclass", list_supplyclass);
		
		return "tradeweb/admin_purveytype";
	}
	@RequestMapping(value={"/admin_purveytype/{menuid}"},method=POST,params="cmd=new")
	public String manageadmin_newstypepost(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@ModelAttribute("supplyclass") @Valid web_supplyclass supplyclass,
			BindingResult result,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";	
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("ϵͳ����");
//		model.addAttribute("menuoper", menuoper);
		//��menuid��ѯ��������
		
		
//		newsclass.setNcParentid(0);
//		newsclass.setNcMenuid(Integer.valueOf(menuid));
		supplyclass.setScParentid(0);
		supplyclass.setScMenuid(Integer.valueOf(menuid));
		
		
		if(result.hasErrors())
		{
			System.out.println("��ӹ������");
			//List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(Integer.valueOf(menuid));
			//model.addAttribute("list_newsclass", list_newsclass);
			return "tradeweb/admin_purveytypeEdit";	//�޸ķ�����ͼ		
		}
		//����������
		//this.webNewsService.insertSelective(newsclass);	
		this.webPurveyService.insertSelective(supplyclass);
		
		List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("list_supplyclass", list_supplyclass);
		//model.addAttribute("newsclass", new web_newsclass());
		
		return "tradeweb/admin_purveytype";//�ض�����ͼ  ���� redirect��ַ����
	}
	
	@RequestMapping(value={"/admin_purveytype/{menuid}"},method=GET,params="cmd=new")
	public String manageadmin_newstypeadd(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
		
		model.addAttribute("supplyclass", new web_supplyclass());
		
		return "tradeweb/admin_purveytypeEdit";// ������������ͼ
	}
	
	@RequestMapping(value={"/admin_purveytype/{menuid}"},method=GET,params="cmd=edit")
	public String manageadmin_newstypeedit(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String supplyclassid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";	
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
		
		model.addAttribute("supplyclass", this.webPurveyService.selectByPrimaryKey(Integer.valueOf(supplyclassid)));
		
		return "tradeweb/admin_purveytypeEdit";// ������������ͼ
	}
	
	@RequestMapping(value={"/admin_purveytype/{menuid}"},method=POST,params="cmd=edit")
	public String manageadmin_purveytypeeditpost(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String supplyclassid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@ModelAttribute("supplyclass") @Valid web_supplyclass supplyclass,
			BindingResult result,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";	
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
		if(result.hasErrors())
		{
			return "tradeweb/admin_purveytypeEdit";
			
		}
		//update �������		
		supplyclass.setScid(Integer.parseInt(supplyclassid));		
		this.webPurveyService.updateByPrimaryKeySelective(supplyclass);	
		
		List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("list_supplyclass", list_supplyclass);
		
		return "tradeweb/admin_purveytype";// ������������ͼ
	}
	@RequestMapping(value={"/admin_purveytype/{menuid}"},method=GET,params="cmd=del")
	public String manageadmin_purveytypedel(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String supplyclassid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,			
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";	
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
		
		//ִ��ɾ������ �жϸ������������Ƿ�Ϊ��
		if(this.webPurveyService.selectCountByClass(Integer.parseInt(supplyclassid))==0)
		{
			this.webPurveyService.deleteByPrimaryKey(Integer.parseInt(supplyclassid));			
		}
		List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("list_supplyclass", list_supplyclass);
		
		return "tradeweb/admin_purveytype";// ������������ͼ
	}
	
//���沿��ִ�й�����ز���
	
	@RequestMapping(value={"/admin_purvey/{menuid}"},method=GET,params="cmd=new")
	public String manageadmin_purveyadd(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";	
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
		
		List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("nclist", list_supplyclass);
		//�Զ�������
		Map<String,String> sort=new LinkedHashMap<String,String>();
		sort.put("h", "ͷ��[h]");
		sort.put("c", "�Ƽ�[c]");
		sort.put("f", "�õ�[f]");
		sort.put("a", "�ؼ�[a]");		
		sort.put("s", "����[s]");
		sort.put("b", "�Ӵ�[b]");
		sort.put("p", "ͼƬ[p]");
		sort.put("j", "��ת[j]");
		model.addAttribute("sortlist", sort);	
		//web_supply supply=new web_supply();
		//supply.setsupplyFlag(supplyFlag)
		model.addAttribute("websupplyinfo", new web_supplyinfo());
		
		
		
		return "tradeweb/admin_purveyEdit";// ������������ͼ
	}
	
	@RequestMapping(value={"/admin_purvey/{menuid}"},method=POST,params="cmd=new")
	public String manageadmin_purveyaddpost(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@ModelAttribute("websupplyinfo") @Valid web_supplyinfo supply,
			BindingResult result,
			HttpServletRequest request,
			HttpServletResponse response,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";	
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
		
//		supply.setsupplyProperties(supply.getsupplyFlag().toString());
//		System.out.println("����ֵ"+supply.getsupplyProperties());
		
		
		if(result.hasErrors())
		{
			List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
			model.addAttribute("nclist", list_supplyclass);
			
			//�Զ�������
			Map<String,String> sort=new LinkedHashMap<String,String>();
			sort.put("h", "ͷ��[h]");
			sort.put("c", "�Ƽ�[c]");
			sort.put("f", "�õ�[f]");
			sort.put("a", "�ؼ�[a]");		
			sort.put("s", "����[s]");
			sort.put("b", "�Ӵ�[b]");
			sort.put("p", "ͼƬ[p]");
			sort.put("j", "��ת[j]");
			model.addAttribute("sortlist", sort);
			
			return "tradeweb/admin_purveyEdit";// ������������ͼ
			
		}
		//String temp="";
		//temp.split(regex)
		try
		{
			MultipartFile file = supply.getFileData();		
			
			String fileName = null;
			InputStream inputStream = null;
			OutputStream outputStream = null;
			
			if (file.getSize() > 0) {
				//System.out.println("ƫ�ƣ�"+file.getOriginalFilename().lastIndexOf("."));
				if(file.getOriginalFilename().lastIndexOf(".")==-1)
				{
					List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_supplyclass);
					
					//�Զ�������
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "ͷ��[h]");
					sort.put("c", "�Ƽ�[c]");
					sort.put("f", "�õ�[f]");
					sort.put("a", "�ؼ�[a]");		
					sort.put("s", "����[s]");
					sort.put("b", "�Ӵ�[b]");
					sort.put("p", "ͼƬ[p]");
					sort.put("j", "��ת[j]");
					model.addAttribute("sortlist", sort);
					
					System.out.println("�ļ���ʽ���Ϸ�");
					return "tradeweb/admin_purveyEdit";
				}
				String ext=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1).toLowerCase();//��׺
				//System.out.println("�ļ���׺��"+ext);
				if(ext!="jpg"||ext!="jpeg"||ext!="png")
				{
					List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_supplyclass);
					
					//�Զ�������
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "ͷ��[h]");
					sort.put("c", "�Ƽ�[c]");
					sort.put("f", "�õ�[f]");
					sort.put("a", "�ؼ�[a]");		
					sort.put("s", "����[s]");
					sort.put("b", "�Ӵ�[b]");
					sort.put("p", "ͼƬ[p]");
					sort.put("j", "��ת[j]");
					model.addAttribute("sortlist", sort);
					System.out.println("�ļ���ʽ���Ϸ�");
					return "tradeweb/admin_purveyEdit";
				}
				inputStream = file.getInputStream();
				if (file.getSize() > 500000) {
					List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_supplyclass);
					
					//�Զ�������
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "ͷ��[h]");
					sort.put("c", "�Ƽ�[c]");
					sort.put("f", "�õ�[f]");
					sort.put("a", "�ؼ�[a]");		
					sort.put("s", "����[s]");
					sort.put("b", "�Ӵ�[b]");
					sort.put("p", "ͼƬ[p]");
					sort.put("j", "��ת[j]");
					model.addAttribute("sortlist", sort);
					
					System.out.println("File Size:::" + file.getSize());
					return "tradeweb/admin_purveyEdit";
				}
				System.out.println("size::" + file.getSize());
				//request.getSession().getServletContext().getRealPath("/");
				
				//String restfilename="/resources/files/userfiles/"+ username+"/"+file.getOriginalFilename();
				String restfilename="/resources/files/userfiles/"+ username+"/"+UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")).toLowerCase();;
				//���򱣴��ļ�
				fileName = request.getSession().getServletContext().getRealPath("/") +"resources\\files/userfiles\\"+ username+"\\"+UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")).toLowerCase();;
				File dir=new File(request.getSession().getServletContext().getRealPath("/")+"resources\\files\\userfiles\\"+ username+"\\");
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
				supply.setSupplyinfoThumbs(restfilename);
			}
			supply.setSupplyinfoMenuid(Integer.parseInt(menuid));
			//�������
			this.webPurveyService.insertSupplyinfoSelective(supply);
	} catch (Exception e) {
		e.printStackTrace();
	}
//		supply.setsupplyMenuid(Integer.parseInt(menuid));
//		//�������
//		this.webPurveyService.insertsupplySelective(supply);
		
		//model.addAttribute("websupply", new web_supply());
		
	QueryParam qp=new QueryParam();
	qp.setTableName("web_supplyinfo");
	qp.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
	qp.setPageSize(30);
	qp.setPageIndex(1);
	qp.setWhere(" where supplyinfo_menuID="+menuid);
	qp.setOrderfld("supplyinfoID");
	qp.setOrderType(1);
	
	
	model.addAttribute("list_supplyinfo", this.webPurveyService.selectWebSupplyinfoInPager(qp));
		System.out.println("�ܼ�¼����"+ (Integer)qp.getRecordCount());
		System.out.println("��ҳ����"+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		//System.out.println("�ܼ�¼��2��"+returnid );
	    //model.put("supply", supplyService.getsupplyList());
	    //System.out.println("ҳ�룺"+page);
	    
		
		return "tradeweb/admin_purvey";// ������������ͼ
	}
	
	@RequestMapping(value={"/admin_purvey/{menuid}"},method=GET,params="cmd=edit")
	public String manageadmin_purveyedit(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String supplyid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,			
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
		
		List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("nclist", list_supplyclass);
		
		//�Զ�������
		Map<String,String> sort=new LinkedHashMap<String,String>();
		sort.put("h", "ͷ��[h]");
		sort.put("c", "�Ƽ�[c]");
		sort.put("f", "�õ�[f]");
		sort.put("a", "�ؼ�[a]");		
		sort.put("s", "����[s]");
		sort.put("b", "�Ӵ�[b]");
		sort.put("p", "ͼƬ[p]");
		sort.put("j", "��ת[j]");
		model.addAttribute("sortlist", sort);
		web_supplyinfo supply=this.webPurveyService.selectSupplyinfoByPrimaryKey(Integer.parseInt(supplyid));
//		if(supply.getsupplyProperties()!=null)
//		{
//			if(supply.getsupplyProperties().contains(","))
//			{
//				
//				supply.setsupplyFlag(supply.getsupplyProperties().split(","));
//				
//			}
//			
//		}
		
		model.addAttribute("websupplyinfo", supply);		
		
		return "tradeweb/admin_purveyEdit";// ������������ͼ
	}
	
	@RequestMapping(value={"/admin_purvey/{menuid}"},method=POST,params="cmd=edit")
	public String manageadmin_purveyeditpost(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String supplyid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@ModelAttribute("websupplyinfo") @Valid web_supplyinfo supply,
			BindingResult result,
			HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
//		StringBuffer buf  = new StringBuffer();
//		for(String str:supply.getsupplyFlag())
//		{
//			System.out.println(str);
//			buf.append(str);
//		}
		
//		System.out.println("����Ϊ����"+supply.getsupplyFlag().toString());
//		supply.setsupplyProperties(supply.getsupplyFlag().toString());
		
		if(result.hasErrors())
		{
			List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
			model.addAttribute("nclist", list_supplyclass);			
			//�Զ�������
			Map<String,String> sort=new LinkedHashMap<String,String>();
			sort.put("h", "ͷ��[h]");
			sort.put("c", "�Ƽ�[c]");
			sort.put("f", "�õ�[f]");
			sort.put("a", "�ؼ�[a]");		
			sort.put("s", "����[s]");
			sort.put("b", "�Ӵ�[b]");
			sort.put("p", "ͼƬ[p]");
			sort.put("j", "��ת[j]");
			model.addAttribute("sortlist", sort);
			//model.addAttribute("websupply", this.webPurveyService.selectsupplyByPrimaryKey(Integer.parseInt(supplyid)));
			return "tradeweb/admin_purveyEdit";// ������������ͼ
		}
		try
		{
			MultipartFile file = supply.getFileData();	
			
			
			String fileName = null;
			InputStream inputStream = null;
			OutputStream outputStream = null;
			
			if (file.getSize() > 0) {
				//System.out.println("ƫ�ƣ�"+file.getOriginalFilename().lastIndexOf("."));
				if(file.getOriginalFilename().lastIndexOf(".")==-1)
				{
					List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_supplyclass);			
					//�Զ�������
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "ͷ��[h]");
					sort.put("c", "�Ƽ�[c]");
					sort.put("f", "�õ�[f]");
					sort.put("a", "�ؼ�[a]");		
					sort.put("s", "����[s]");
					sort.put("b", "�Ӵ�[b]");
					sort.put("p", "ͼƬ[p]");
					sort.put("j", "��ת[j]");
					model.addAttribute("sortlist", sort);
					
					System.out.println("�ļ���ʽ���Ϸ�");
					return "tradeweb/admin_purveyEdit";
				}
				String ext=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1).toLowerCase();//��׺
				//System.out.println("�ļ���׺��"+ext);
				if(ext!="jpg"||ext!="jpeg"||ext!="png")
				{
					List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_supplyclass);			
					//�Զ�������
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "ͷ��[h]");
					sort.put("c", "�Ƽ�[c]");
					sort.put("f", "�õ�[f]");
					sort.put("a", "�ؼ�[a]");		
					sort.put("s", "����[s]");
					sort.put("b", "�Ӵ�[b]");
					sort.put("p", "ͼƬ[p]");
					sort.put("j", "��ת[j]");
					model.addAttribute("sortlist", sort);
					System.out.println("�ļ���ʽ���Ϸ�");
					return "tradeweb/admin_purveyEdit";
				}
				inputStream = file.getInputStream();
				if (file.getSize() > 500000) {
					List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_supplyclass);			
					//�Զ�������
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "ͷ��[h]");
					sort.put("c", "�Ƽ�[c]");
					sort.put("f", "�õ�[f]");
					sort.put("a", "�ؼ�[a]");		
					sort.put("s", "����[s]");
					sort.put("b", "�Ӵ�[b]");
					sort.put("p", "ͼƬ[p]");
					sort.put("j", "��ת[j]");
					model.addAttribute("sortlist", sort);
					System.out.println("File Size:::" + file.getSize());
					return "tradeweb/admin_purveyEdit";
				}
				System.out.println("size::" + file.getSize());
				//request.getSession().getServletContext().getRealPath("/");
				
				//String restfilename="/resources/files/userfiles/"+ username+"/"+file.getOriginalFilename();
				String restfilename="/resources/files/userfiles/"+ username+"/"+UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")).toLowerCase();
				fileName = request.getSession().getServletContext().getRealPath("/") +"resources\\files\\userfiles\\"+ username+"\\"+UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")).toLowerCase();
				File dir=new File(request.getSession().getServletContext().getRealPath("/")+"resources\\files\\userfiles\\"+ username+"\\");
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
				supply.setSupplyinfoThumbs(restfilename);
			}
			//supply.setsupplyMenuid(Integer.parseInt(menuid));
			//�������
			//this.webPurveyService.insertsupplySelective(supply);
			supply.setSupplyinfoid(Integer.parseInt(supplyid));
			this.webPurveyService.updateSupplyinfoByPrimaryKeySelective(supply);	
	} catch (Exception e) {
		e.printStackTrace();
	}
//		supply.setsupplyid(Integer.parseInt(supplyid));
//		this.webPurveyService.updatesupplyByPrimaryKeySelective(supply);	
		
	QueryParam qp=new QueryParam();
	qp.setTableName("web_supplyinfo");
	qp.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
	qp.setPageSize(perPage);
	qp.setPageIndex(page);
	qp.setWhere(" where supplyinfo_menuID="+menuid);
	qp.setOrderfld("supplyinfoID");
	qp.setOrderType(1);
		
		model.addAttribute("list_supplyinfo", this.webPurveyService.selectWebSupplyinfoInPager(qp));
		System.out.println("�ܼ�¼����"+ (Integer)qp.getRecordCount());
		System.out.println("��ҳ����"+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		
		return "tradeweb/admin_purvey";// ������������ͼ
	}
	
	@RequestMapping(value={"/admin_purvey/{menuid}"},method=GET,params="cmd=del")
	public String manageadmin_purveydel(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String supplyid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@RequestParam(value="page", defaultValue="1") int page,
	        @RequestParam(value="perPage", defaultValue="30") int perPage,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
			return "redirect:/login";
		}
		model.addAttribute("username", username);
		model.addAttribute("menuid", menuid);
		
		this.webPurveyService.deleteSupplyinfoByPrimaryKey(Integer.parseInt(supplyid));
		
		QueryParam qp=new QueryParam();
		qp.setTableName("web_supplyinfo");
		qp.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where supplyinfo_menuID="+menuid);
		qp.setOrderfld("supplyinfoID");
		qp.setOrderType(1);
		
		model.addAttribute("list_supplyinfo", this.webPurveyService.selectWebSupplyinfoInPager(qp));
		System.out.println("�ܼ�¼����"+ (Integer)qp.getRecordCount());
		System.out.println("��ҳ����"+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		//List<web_supplyclass> list_supplyclass=this.webPurveyService.selectByMenuID(Integer.valueOf(menuid));
		//model.addAttribute("nclist", list_supplyclass);
		
		//model.addAttribute("websupply", this.webPurveyService.selectsupplyByPrimaryKey(Integer.parseInt(supplyid)));		
		
		return "tradeweb/admin_purvey";// ������������ͼ
	}
	

}
