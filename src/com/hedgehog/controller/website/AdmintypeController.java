package com.hedgehog.controller.website;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hedgehog.Utils.Security;
import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_channel;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_menu;
import com.hedgehog.domain.biz_menuoper;
import com.hedgehog.domain.biz_templet;
import com.hedgehog.domain.biz_templet_class;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.biz_websiteWithBLOBs;
import com.hedgehog.domain.memberloginwrap;
import com.hedgehog.domain.memberpwdwrap;
import com.hedgehog.domain.web_commoninfo;
import com.hedgehog.domain.web_friendlink;
import com.hedgehog.domain.web_guestbook;
import com.hedgehog.domain.web_newsclass;
import com.hedgehog.domain.web_product;
import com.hedgehog.service.ChannelService;
import com.hedgehog.service.FriendlinkService;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.MenuoperService;
import com.hedgehog.service.ProvinceService;
import com.hedgehog.service.TempletService;
import com.hedgehog.service.WebCommoninfoService;
import com.hedgehog.service.WebGuestbookService;
import com.hedgehog.service.WebNewsService;
import com.hedgehog.service.WebProductService;
import com.hedgehog.service.WebPurveyService;
import com.hedgehog.service.WebsiteService;

@Controller
@RequestMapping("/{username}/manage")
public class AdmintypeController {
	private static final String LOGIN_NAME = "login";
	private WebsiteService websiteService;
	@Inject
	public AdmintypeController(WebsiteService websiteService) {
		
		this.websiteService = websiteService;
	}
	
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
	private ProvinceService provinceService;
    @Autowired
    public void setProvinceService(ProvinceService provinceService) {
		this.provinceService = provinceService;
	}
    
    private TempletService templetService;
    @Autowired
    public void setTempletService(TempletService templetService) {
		this.templetService = templetService;
	}
    private FriendlinkService friendlinkService;
    @Autowired
    public void setFriendlinkService(FriendlinkService friendlinkService) {
		this.friendlinkService = friendlinkService;
	}
    private MemberValidation memberValidation;
    @Autowired
	public void setMemberValidation(MemberValidation memberValidation) {
		this.memberValidation = memberValidation;
	}
    
    
	@ModelAttribute("menuenable")
	public List<biz_menu> getmenulist(@PathVariable("username") String username)
	{
		biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		return this.menuService.selectByMemberEnable(member.getMemberid());		
	}
	@ModelAttribute("menuoper")
	public biz_menuoper getmenuoper()
	{
		//biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
		biz_menuoper menuoper=this.menuoperService.selectByAppcode("ch_system");
		menuoper.setMenuoperName("系统管理");
		//model.addAttribute("menuoper", menuoper);
		return menuoper;
		
	}
	
	@RequestMapping(value={"/admin_type"},method=GET)
	public String manageadmintype(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
		biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_type";
	}
	@RequestMapping(value={"/admin_type"},method=GET,params="cmd=new")
	public String manageadmintypetyd(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		biz_member member=this.memberService.selectByUsername(username);
		List<biz_menu> list_menu=this.menuService.selectByMember(member.getMemberid());
		if((list_menu.size()+1)>member.getMemberLamucount())
		{
			model.addAttribute("menu", list_menu);
			return "tradeweb/admin_type";
		}
		member.getMemberLamucount();
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
		
		//biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		biz_menu bmenu=new biz_menu();
		bmenu.setMenuEnable(1);//启用
		model.addAttribute("bizmenu",bmenu);
		
		
		
		String[] memberlamu= member.getMemberLamu().split(",");
		List<biz_channel> list_channel=new ArrayList<biz_channel>();
		biz_channel channel=null;
		for(String str:memberlamu)
		{
			channel=this.channelService.selectByChannelCode(str);
			list_channel.add(channel);			
		}
		model.addAttribute("list_channel",list_channel);	
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_typeEdit";
	}
	@RequestMapping(value={"/admin_type"},method=POST,params="cmd=new")
	public String manageadmintypetyddf(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			@ModelAttribute("bizmenu") @Valid biz_menu bmenu,
			BindingResult result,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		biz_member member=this.memberService.selectByUsername(username);
		if(result.hasErrors())
		{
			String[] memberlamu= member.getMemberLamu().split(",");
			List<biz_channel> list_channel=new ArrayList<biz_channel>();
			biz_channel channel=null;
			for(String str:memberlamu)
			{
				channel=this.channelService.selectByChannelCode(str);
				list_channel.add(channel);			
			}
			model.addAttribute("list_channel",list_channel);	
			return "tradeweb/admin_typeEdit";			
		}
		//提交
		//biz_member member=this.memberService.selectByUsername(username);
		bmenu.setMenuMemberid(member.getMemberid());
		bmenu.setMenuParentid(0);
		this.menuService.insertSelective(bmenu);
		
		//呈现tradeweb/admin_type视图
		//biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
		//menuenable=this.menuService.selectByMemberEnable(member.getMemberid());
		model.addAttribute("menuenable", this.menuService.selectByMemberEnable(member.getMemberid()));
		
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
		
		//biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		//model.addAttribute("bizmenu",new biz_menu());
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_type";
	}
	@RequestMapping(value={"/admin_type"},method=GET,params="cmd=edit")
	public String manageadmintypetyddf(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="menuid") String menuid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		
		biz_member member=this.memberService.selectByUsername(username);	
		String[] memberlamu= member.getMemberLamu().split(",");
		List<biz_channel> list_channel=new ArrayList<biz_channel>();
		biz_channel channel=null;
		for(String str:memberlamu)
		{
			channel=this.channelService.selectByChannelCode(str);
			list_channel.add(channel);			
		}
		model.addAttribute("list_channel",list_channel);	
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
		
		//biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		biz_menu bmenu=this.menuService.selectByPrimaryKey(Integer.parseInt(menuid));
		model.addAttribute("bizmenu",bmenu);
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_typeEdit";
	}
	@RequestMapping(value={"/admin_type"},method=POST,params="cmd=edit")
	public String manageadmintypetyddfdfg(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="menuid") String menuid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			@ModelAttribute("bizmenu") @Valid biz_menu bmenu,
			BindingResult result,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		biz_member member=this.memberService.selectByUsername(username);	
		if(result.hasErrors())
		{
			//biz_member member=this.memberService.selectByUsername(username);	
			String[] memberlamu= member.getMemberLamu().split(",");
			List<biz_channel> list_channel=new ArrayList<biz_channel>();
			biz_channel channel=null;
			for(String str:memberlamu)
			{
				channel=this.channelService.selectByChannelCode(str);
				list_channel.add(channel);			
			}
			model.addAttribute("list_channel",list_channel);	
			
			return "tradeweb/admin_typeEdit";			
		}
		//提交
//		biz_member member=this.memberService.selectByUsername(username);
//		bmenu.setMenuMemberid(member.getMemberid());
//		bmenu.setMenuParentid(0);
//		this.menuService.insertSelective(bmenu);
		biz_menu menuclone=this.menuService.selectByPrimaryKey(Integer.parseInt(menuid));
		
		bmenu.setMenuid(Integer.parseInt(menuid));
		bmenu.setMenuChCode(menuclone.getMenuChCode());//栏目类型不能修改
		this.menuService.updateByPrimaryKeySelective(bmenu);
		
		//呈现tradeweb/admin_type视图
		//biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
		//menuenable=this.menuService.selectByMemberEnable(member.getMemberid());
		model.addAttribute("menuenable", this.menuService.selectByMemberEnable(member.getMemberid()));
		
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
		
		//biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		//model.addAttribute("bizmenu",new biz_menu());
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_type";
	}
	@RequestMapping(value={"/admin_type"},method=GET,params="cmd=del")
	public String manageadmintypetyfddf(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="menuid") String menuid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";	
		}
		model.addAttribute("username", username);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
		
		//biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
		//biz_menu bmenu=this.menuService.selectByPrimaryKey(Integer.parseInt(menuid));
		//model.addAttribute("bizmenu",bmenu);
		
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		biz_menu mm=this.menuService.selectByPrimaryKey(Integer.parseInt(menuid));
		Map<String,String> map= new HashMap<String, String>(); 
		map.put("ch_news", "web_news");
		map.put("ch_product", "web_product");
		map.put("ch_purvey", "web_supplyinfo");
		//map.put("ch_freeweb", "biz_menu");
		map.put("ch_intro", "web_commoninfo");//公司介绍
		map.put("ch_guestbook", "web_guestbook");
		if(mm.getMenuChCode().equals("ch_news"))
		{
			//删除新闻类别 删除新闻			
			//this.webNewsService.selectCountByClass(classid)
			if(this.webNewsService.selectByMenuID(Integer.parseInt(menuid)).size()==0)
			{
				this.menuService.deleteByPrimaryKey(Integer.parseInt(menuid));
			}
		}
		if(mm.getMenuChCode().equals("ch_product"))
		{
			//删除产品类别 删除产品
			if(this.webProductService.selectByMenuID(Integer.parseInt(menuid)).size()==0)
			{
				this.menuService.deleteByPrimaryKey(Integer.parseInt(menuid));
			}
		}
		if(mm.getMenuChCode().equals("ch_purvey"))
		{	
			//删除供求类别 删除供求
			if(this.webPurveyService.selectByMenuID(Integer.parseInt(menuid)).size()==0)
			{
				this.menuService.deleteByPrimaryKey(Integer.parseInt(menuid));
			}
		}
		if(mm.getMenuChCode().equals("ch_freeweb"))
		{
			//直接删除菜单
			this.menuService.deleteByPrimaryKey(Integer.parseInt(menuid));
		}
		if(mm.getMenuChCode().equals("ch_intro"))
		{	
			//删除公司介绍
			QueryParam qp=new QueryParam();
			qp.setTableName("web_commoninfo");
			qp.setReturnFields(" commoninfoID,cmm_name,cmm_menuID ");
			//qp.setPageSize(perPage);
			//qp.setPageIndex(1);
			qp.setWhere(" where cmm_menuID="+menuid);
			qp.setOrderfld("commoninfoID");
			qp.setOrderType(1);
			List<web_commoninfo> list=this.webCommoninfoService.selectWebCommoninfoInPager(qp);
			if(qp.getRecordCount()==0)
			{
				this.menuService.deleteByPrimaryKey(Integer.parseInt(menuid));
			}
		}
		if(mm.getMenuChCode().equals("ch_guestbook"))
		{
			//删除客户留言
			QueryParam qp=new QueryParam();
			qp.setTableName("web_guestbook");
			qp.setReturnFields(" guestbookID,gb_nikename,gb_content,gb_datetime,gb_clientip,gb_menuID ");
			//qp.setPageSize(perPage);
			//qp.setPageIndex(page);
			qp.setWhere(" where gb_menuID="+menuid);
			qp.setOrderfld("guestbookID");
			qp.setOrderType(1);
			List<web_guestbook> list=this.webGuestbookService.selectwebGuestbookInPager(qp);			
			if(qp.getRecordCount()==0)
			{
				this.menuService.deleteByPrimaryKey(Integer.parseInt(menuid));
			}			
		}
		biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
		menuenable=this.menuService.selectByMemberEnable(member.getMemberid());
		//更新视图
		//biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
		//menuenable=this.menuService.selectByMemberEnable(member.getMemberid());
		model.addAttribute("menuenable", this.menuService.selectByMemberEnable(member.getMemberid()));
		
		return "tradeweb/admin_type";
	}
	@RequestMapping(value={"/admin_type"},method=GET,params="cmd=able")
	public String manageadmintypedd(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			@RequestParam(value="menuid") String menuid,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		biz_menu mm=this.menuService.selectByPrimaryKey(Integer.parseInt(menuid));
		mm.setMenuEnable(1);
		this.menuService.updateByPrimaryKeySelective(mm);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
		biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
		menuenable=this.menuService.selectByMemberEnable(member.getMemberid());
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_type";
	}
	@RequestMapping(value={"/admin_type"},method=GET,params="cmd=enable")
	public String manageadmintypeddg(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			@RequestParam(value="menuid") String menuid,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		biz_menu mm=this.menuService.selectByPrimaryKey(Integer.parseInt(menuid));
		mm.setMenuEnable(0);
		this.menuService.updateByPrimaryKeySelective(mm);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
		biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
		menuenable=this.menuService.selectByMemberEnable(member.getMemberid());
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_type";
	}
	
	@RequestMapping(value={"/admin_copyright"},method=GET)
	public String manageadmintypeffdf(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_copyright";
	}
	
	@RequestMapping(value={"/admin_attrib"},method=GET)
	public String manageadminattrib(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
		model.addAttribute("prolist", this.provinceService.selectAllRecord());
		biz_member member=this.memberService.selectByUsername(username);
		
		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_attrib";
	}
	
	@RequestMapping(value={"/admin_attrib"},method=POST)
	public String attribsub(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("username") String username,
			@ModelAttribute("website") @Valid biz_website website,
			BindingResult result,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		//model.addAttribute("prolist", this.provinceService.selectAllRecord());
		//biz_member member=this.memberService.selectByUsername(username);
		
		//model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));	
		model.addAttribute("prolist", this.provinceService.selectAllRecord());
		if(result.hasErrors())
		{
			for (ObjectError error : result.getAllErrors()) {
				System.err.println("Error: " + error.getCode() + " - "
						+ error.getDefaultMessage());
			}
			System.out.println("有木有到这里");
			
			
			
			return "tradeweb/admin_attrib";
		}
		biz_member member=this.memberService.selectByUsername(username);
		
		biz_website website2=this.websiteService.selectByMember(member.getMemberid());
		website.setWebsiteid(website2.getWebsiteid());//设置主键
		System.out.println("网站编号："+website.getWebsiteid());
		
		//this.websiteService.updateByPrimaryKey(website);
		this.websiteService.updateByPrimaryKeySelective(website);
		//不能redirect
		//return "forward:/chenying9899/manage/admin_template";
		return "tradeweb/admin_attrib";
	}
	
	@RequestMapping(value={"/admin_template"},method=GET)
	public String templatesel(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("username") String username,			
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		
        biz_member member=this.memberService.selectByUsername(username);
		
        biz_website website=this.websiteService.selectByMember(member.getMemberid());
		
		System.out.println("模板代号："+website.getwTemplet());
		
		biz_templet templet=this.templetService.selectByCode(website.getwTemplet());
		model.addAttribute("templet", templet);
		
		 return "tradeweb/admin_template";
	}
	
	@RequestMapping(value={"/admin_templatesel"},method=GET)
	public String templateself(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
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
		
        biz_member member=this.memberService.selectByUsername(username);
		
        //biz_website website=this.websiteService.selectByMember(member.getMemberid());
		
		 System.out.println("模板类："+member.getMemberTemplet());
		
		//biz_templet templet=this.templetService.selectByCode(website.getwTemplet());
		//model.addAttribute("templet", templet);
		
		List<biz_templet_class> list_tc=new ArrayList<biz_templet_class>();
		//List<biz_templet> list_templet=new ArrayList<biz_templet>();
		String[] strarray=member.getMemberTemplet().split(",");
		biz_templet_class tc=null;
		for(String str:strarray)
		{
			tc=this.templetService.selectTempletclassByArray(Integer.parseInt(str));
			list_tc.add(tc);
			//list_templet.addAll(tc.getList_templet());
		}			
		model.addAttribute("list_tc", list_tc);
		
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_templet");
		qp.setReturnFields(" * ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where Templet_Type in ("+member.getMemberTemplet()+") ");
		qp.setOrderfld("TempletID");
		qp.setOrderType(1);
		model.addAttribute("list_templet", this.templetService.selectRecordInPager(qp));
		model.addAttribute("queryParam", qp);
		//model.addAttribute("list_templet", list_templet);
		return "tradeweb/admin_templatesel";
	}
	
	@RequestMapping(value={"/admin_templatesel"},method=GET,params="templet")
	public String templateselffg(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="templet") String templetcode,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("username") String username,			
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		System.out.println("有木有到这里 选择模板");
        biz_member member=this.memberService.selectByUsername(username);
        biz_website website=this.websiteService.selectByMember(member.getMemberid());
        website.setwTemplet(templetcode);
        
        this.websiteService.updateByPrimaryKeySelective(website);
		
        
		//model.addAttribute("list_templet", list_templet);
        //biz_member member=this.memberService.selectByUsername(username);
		
        //biz_website website=this.websiteService.selectByMember(member.getMemberid());
		
		System.out.println("新模板代号："+website.getwTemplet());
		
		biz_templet templet=this.templetService.selectByCode(website.getwTemplet());
		model.addAttribute("templet", templet);
		
		 return "tradeweb/admin_template";
	}
	
	
	@RequestMapping(value={"/admin_website"},method=GET)
	public String manageadmintypefd(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
		biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		model.addAttribute("website", website);
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_website";
	}
	@RequestMapping(value={"/admin_website1"},method=GET)
	public String manageadmintypeffdfs(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		//第二次查询
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		//System.out.println("网站编号："+websiteWithBLOBs.getWebsiteid());
		//System.out.println("网站脚注："+websiteWithBLOBs.getwFootnote());
		model.addAttribute("website", websiteWithBLOBs);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_website1";
	}
	
	@RequestMapping(value={"/admin_website1"},method=POST)
	public String manageadmintypeffsddfs(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			@ModelAttribute("website") biz_websiteWithBLOBs website,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		biz_website websitemodel=this.websiteService.selectByMember(member.getMemberid());
		website.setWebsiteid(websitemodel.getWebsiteid());
		//this.websiteService.updateByPrimaryKeySelective(website);
		this.websiteService.updateByPrimaryKeySelectiveWrap(website);
		//model.addAttribute("website", website);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_website1";
	}
	@RequestMapping(value={"/admin_website2"},method=GET)
	public String manageadmintypeffdrfs(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		
		biz_websiteWithBLOBs websiteWithBLOBs=this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid());
		
		//System.out.println("网站编号："+website.getWebsiteid());
		//System.out.println("网站脚注："+website.getwFootnote());
		model.addAttribute("website", websiteWithBLOBs);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_website2";
	}
	@RequestMapping(value={"/admin_website2"},method=POST)
	public String manageadmintypeffsddfsgd(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			@ModelAttribute("website") biz_websiteWithBLOBs website,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		biz_website websitemodel=this.websiteService.selectByMember(member.getMemberid());
		website.setWebsiteid(websitemodel.getWebsiteid());
		//this.websiteService.updateByPrimaryKeySelective(website);
		this.websiteService.updateByPrimaryKeySelectiveWrap(website);
		//model.addAttribute("website", website);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_website2";
	}
	@RequestMapping(value={"/admin_friendlink"},method=GET)
	public String manageadmintypefffdfs(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    //return "redirect:/login";;	
		    return "redirect:/login";	//已更改
		}
		model.addAttribute("username", username);
		biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
		
		//System.out.println("网站编号："+website.getWebsiteid());
		//System.out.println("网站脚注："+website.getwFootnote());
		//model.addAttribute("website", website);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_friendlink";
	}
	
	@RequestMapping(value={"/admin_friendlink"},method=GET,params="cmd=new")
	public String manageadmintypefffdtfs(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		  //return "redirect:/login";;	
		    return "redirect:/login";	//已更改
		}
		model.addAttribute("username", username);
		//biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		//biz_website website=this.websiteService.selectByMember(member.getMemberid());
		
		//List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		//model.addAttribute("list_friendlink", list_friendlink);
		model.addAttribute("friendlink", new web_friendlink());
		
		//System.out.println("网站编号："+website.getWebsiteid());
		//System.out.println("网站脚注："+website.getwFootnote());
		//model.addAttribute("website", website);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_friendlinkEdit";
	}
	
	@RequestMapping(value={"/admin_friendlink"},method=POST,params="cmd=new")
	public String manageadmintypefffdtfgfs(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			@ModelAttribute("friendlink") @Valid web_friendlink friendlink,
			BindingResult result,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		
		if(result.hasErrors())
		{
			return "tradeweb/admin_friendlinkEdit";
		}
		biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		friendlink.setFriendlinkMenuid(website.getWebsiteid());
		this.friendlinkService.insertSelective(friendlink);
		//更新呈现数据		
		
		
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
		
		//System.out.println("网站编号："+website.getWebsiteid());
		//System.out.println("网站脚注："+website.getwFootnote());
		//model.addAttribute("website", website);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_friendlink";
	}
	
	@RequestMapping(value={"/admin_friendlink"},method=GET,params="cmd=edit")
	public String manageadmintyhgpefffdtfs(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int friendlinkId,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		//biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		//biz_website website=this.websiteService.selectByMember(member.getMemberid());
		
		//List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		//model.addAttribute("list_friendlink", list_friendlink);
		
		model.addAttribute("friendlink", this.friendlinkService.selectByPrimaryKey(friendlinkId));
		
		//System.out.println("网站编号："+website.getWebsiteid());
		//System.out.println("网站脚注："+website.getwFootnote());
		//model.addAttribute("website", website);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_friendlinkEdit";
	}
	
	@RequestMapping(value={"/admin_friendlink"},method=POST,params="cmd=edit")
	public String manageadminftypefffdtfgfs(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int friendlinkId,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			@ModelAttribute("friendlink") @Valid web_friendlink friendlink,
			BindingResult result,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		
		if(result.hasErrors())
		{
			return "tradeweb/admin_friendlinkEdit";
		}
		friendlink.setFriendlinkId(friendlinkId);
		biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		friendlink.setFriendlinkMenuid(website.getWebsiteid());
		this.friendlinkService.updateByPrimaryKeySelective(friendlink);
		//更新呈现数据		
		
		
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
		
		//System.out.println("网站编号："+website.getWebsiteid());
		//System.out.println("网站脚注："+website.getwFootnote());
		//model.addAttribute("website", website);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_friendlink";
	}
	
	@RequestMapping(value={"/admin_friendlink"},method=GET,params="cmd=del")
	public String manageadminftypeffffdtfgfs(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int friendlinkId,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		
		this.friendlinkService.deleteByPrimaryKey(friendlinkId);
		
		
		//更新呈现数据		
		biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		biz_website website=this.websiteService.selectByMember(member.getMemberid());
		
		List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		model.addAttribute("list_friendlink", list_friendlink);
		
		//System.out.println("网站编号："+website.getWebsiteid());
		//System.out.println("网站脚注："+website.getwFootnote());
		//model.addAttribute("website", website);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_friendlink";
	}
	
	@RequestMapping(value={"/admin_setpwd"},method=GET)
	public String manageadmfginftypeffffdtfgfs(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,			
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		
		memberpwdwrap wrap=new memberpwdwrap();
		wrap.setMemberName(username);
		model.addAttribute("member", wrap);
		
		//this.friendlinkService.deleteByPrimaryKey(friendlinkId);
		
		
		//更新呈现数据		
		//biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		//biz_website website=this.websiteService.selectByMember(member.getMemberid());
		
		//List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		//model.addAttribute("list_friendlink", list_friendlink);
		
		//System.out.println("网站编号："+website.getWebsiteid());
		//System.out.println("网站脚注："+website.getwFootnote());
		//model.addAttribute("website", website);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_setpwd";
	}
	@RequestMapping(value={"/admin_setpwd"},method=POST)
	public String manageadmfginftypfeffffdtfgfs(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			@ModelAttribute("member") @Valid memberpwdwrap wrap,
			BindingResult result,
			HttpServletRequest request,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		memberValidation.validate(wrap, result);
		if(result.hasErrors())
		{
			return "tradeweb/admin_setpwd";
		}
		biz_member member=this.memberService.selectByUsername(username);
		member.setMemberPwd(Security.MD5(wrap.getMemberNewPwd()));
		this.memberService.updateByPrimaryKeySelective(member);
		
		
		//this.friendlinkService.deleteByPrimaryKey(friendlinkId);
		
		
		//更新呈现数据		
		//biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		//biz_website website=this.websiteService.selectByMember(member.getMemberid());
		
		//List<web_friendlink> list_friendlink=this.friendlinkService.selectRecordByWebsiteid(website.getWebsiteid());
		//model.addAttribute("list_friendlink", list_friendlink);
		
		//System.out.println("网站编号："+website.getWebsiteid());
		//System.out.println("网站脚注："+website.getwFootnote());
		//model.addAttribute("website", website);
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
//		biz_member member=this.memberService.selectByUsername(username);
//		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_setpwd";
	}
	
	@RequestMapping(value={"/admin_website"},method=POST)
	public String manageadmintypefgd(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper, 
			@PathVariable("username") String username,
			@ModelAttribute("website") biz_website website,
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
//		
//        biz_member member=this.memberService.selectByUsername(username);		
//		model.addAttribute("website", this.websiteService.selectByMember(member.getMemberid()));
		biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("menu", this.menuService.selectByMember(member.getMemberid()));	
		
		biz_website websitemodel=this.websiteService.selectByMember(member.getMemberid());
		website.setWebsiteid(websitemodel.getWebsiteid());
		
		try
		{
			MultipartFile wLogofile = website.getWLogofileData();
			MultipartFile wCompanyfile=website.getWCompanyfileData();
			MultipartFile wBannerfile=website.getWBannerfileData();
			
			String fileName = null;
			InputStream inputStream = null;
			OutputStream outputStream = null;
			
			
			
			
			
			if (wLogofile.getSize() > 0) {
				System.out.println("偏移："+wLogofile.getOriginalFilename().lastIndexOf("."));
				if(wLogofile.getOriginalFilename().lastIndexOf(".")==-1)
				{
					
					System.out.println("文件格式不合法");
					return "tradeweb/admin_website";
				}
				String ext=wLogofile.getOriginalFilename().substring(wLogofile.getOriginalFilename().lastIndexOf(".")+1).toLowerCase();//后缀
				System.out.println("文件后缀："+ext);
				if(!ext.equalsIgnoreCase("jpg")&&!ext.equalsIgnoreCase("jpeg")&&!ext.equalsIgnoreCase("png"))
				{
					System.out.println("文件格式不合法22");
					return "tradeweb/admin_website";
				}
				inputStream = wLogofile.getInputStream();
				if (wLogofile.getSize() > 500000) {
					System.out.println("File Size:::" + wLogofile.getSize());
					return "tradeweb/admin_website";
				}
				System.out.println("size::" + wLogofile.getSize());
				//request.getSession().getServletContext().getRealPath("/");
				//UUID.randomUUID();
				System.out.println(wLogofile.getContentType());
				//String restfilename="/resources/files/userfiles/"+ username+"/"+file.getOriginalFilename();
				//数据库字段值
				String restfilename="images/"+UUID.randomUUID().toString()+wLogofile.getOriginalFilename().substring(wLogofile.getOriginalFilename().lastIndexOf(".")).toLowerCase();
				System.out.println("数据库存储字段值："+restfilename);
				//存储路径
				fileName = request.getSession().getServletContext().getRealPath("/")+"resources\\files\\userfiles\\"+ username+"\\" +restfilename;
				System.out.println("存储路径："+fileName);
				//存储目录
				File dir=new File(request.getSession().getServletContext().getRealPath("/")+"resources\\files\\userfiles\\"+ username+"\\images\\");
				if(!dir.exists())
				{
					System.out.println("有木有创建目录");
					dir.mkdirs();
					//dir.mkdir();					
				}				
				outputStream = new FileOutputStream(fileName);
				System.out.println("fileName:" + wLogofile.getOriginalFilename());

				int readBytes = 0;
				byte[] buffer = new byte[10000];
				while ((readBytes = inputStream.read(buffer, 0, 10000)) != -1) {
					outputStream.write(buffer, 0, readBytes);
				}
				outputStream.close();
				inputStream.close();
				website.setwLogo(restfilename);
				//product.setProductThumbs(restfilename);
			}
			
			if (wCompanyfile.getSize() > 0) {
				//System.out.println("偏移："+file.getOriginalFilename().lastIndexOf("."));
				if(wCompanyfile.getOriginalFilename().lastIndexOf(".")==-1)
				{
					System.out.println("文件格式不合法");
					return "tradeweb/admin_website";
				}
				String ext2=wCompanyfile.getOriginalFilename().substring(wCompanyfile.getOriginalFilename().lastIndexOf(".")+1).toLowerCase();//后缀
				//System.out.println("文件后缀："+ext);
				if(!ext2.equalsIgnoreCase("jpg")&&!ext2.equalsIgnoreCase("jpeg")&&!ext2.equalsIgnoreCase("png"))
				{
					System.out.println("文件格式不合法");
					return "tradeweb/admin_website";
				}
				inputStream = wCompanyfile.getInputStream();
				if (wCompanyfile.getSize() > 500000) {
					System.out.println("File Size:::" + wCompanyfile.getSize());
					return "tradeweb/admin_website";
				}
				System.out.println("size::" + wCompanyfile.getSize());
				//request.getSession().getServletContext().getRealPath("/");
				//UUID.randomUUID();
				System.out.println(wCompanyfile.getContentType());
				//String restfilename="/resources/files/userfiles/"+ username+"/"+file.getOriginalFilename();
				//数据库字段值
				String restfilename="images/"+UUID.randomUUID().toString()+wCompanyfile.getOriginalFilename().substring(wCompanyfile.getOriginalFilename().lastIndexOf(".")).toLowerCase();
				//存储路径
				//fileName = request.getSession().getServletContext().getRealPath("/")+"resources\\files\\userfiles\\"+ username+"\\" +restfilename;
				fileName = request.getSession().getServletContext().getRealPath("/")+"resources\\template\\" +restfilename;
				//存储目录
				//File dir=new File(request.getSession().getServletContext().getRealPath("/")+"resources\\files\\userfiles\\"+ username+"\\images\\");
				File dir=new File(request.getSession().getServletContext().getRealPath("/")+"resources\\template\\images\\");
				if(!dir.exists())
				{
					dir.mkdirs();					
				}				
				outputStream = new FileOutputStream(fileName);
				System.out.println("fileName:" + wCompanyfile.getOriginalFilename());

				int readBytes = 0;
				byte[] buffer = new byte[10000];
				while ((readBytes = inputStream.read(buffer, 0, 10000)) != -1) {
					outputStream.write(buffer, 0, readBytes);
				}
				outputStream.close();
				inputStream.close();
				website.setwCompany(restfilename);
				//product.setProductThumbs(restfilename);
			}
			
			if (wBannerfile.getSize() > 0) {
				//System.out.println("偏移："+file.getOriginalFilename().lastIndexOf("."));
				if(wBannerfile.getOriginalFilename().lastIndexOf(".")==-1)
				{
					System.out.println("文件格式不合法");
					return "tradeweb/admin_website";
				}
				String ext3=wBannerfile.getOriginalFilename().substring(wBannerfile.getOriginalFilename().lastIndexOf(".")+1).toLowerCase();//后缀
				//System.out.println("文件后缀："+ext);
				if(!ext3.equalsIgnoreCase("jpg")&&!ext3.equalsIgnoreCase("jpeg")&&!ext3.equalsIgnoreCase("png"))
				{
					System.out.println("文件格式不合法");
					return "tradeweb/admin_website";
				}
				inputStream = wBannerfile.getInputStream();
				if (wBannerfile.getSize() > 500000) {
					System.out.println("File Size:::" + wBannerfile.getSize());
					return "tradeweb/admin_website";
				}
				System.out.println("size::" + wBannerfile.getSize());
				//request.getSession().getServletContext().getRealPath("/");
				//UUID.randomUUID();
				System.out.println(wBannerfile.getContentType());
				//String restfilename="/resources/files/userfiles/"+ username+"/"+file.getOriginalFilename();
				//数据库字段值
				String restfilename="images/"+UUID.randomUUID().toString()+wBannerfile.getOriginalFilename().substring(wBannerfile.getOriginalFilename().lastIndexOf(".")).toLowerCase();
				//存储路径
				fileName = request.getSession().getServletContext().getRealPath("/")+"resources\\files\\userfiles\\"+ username+"\\" +restfilename;
				//存储目录
				File dir=new File(request.getSession().getServletContext().getRealPath("/")+"resources\\files\\userfiles\\"+ username+"\\images\\");
				if(!dir.exists())
				{
					dir.mkdirs();				
				}				
				outputStream = new FileOutputStream(fileName);
				System.out.println("fileName:" + wBannerfile.getOriginalFilename());

				int readBytes = 0;
				byte[] buffer = new byte[10000];
				while ((readBytes = inputStream.read(buffer, 0, 10000)) != -1) {
					outputStream.write(buffer, 0, readBytes);
				}
				outputStream.close();
				inputStream.close();
				website.setwBanner(restfilename);
				//product.setProductThumbs(restfilename);
			}
			
			this.websiteService.updateByPrimaryKeySelective(website);
			
//			product.setProductMenuid(Integer.parseInt(menuid));
//			//添加新闻
//			this.webProductService.insertProductSelective(product);
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		//model.addAttribute("website", website);
		
//		biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		return "tradeweb/admin_website";
	}
	@RequestMapping(value={"/","/admin_manager"},method=GET)
	public String adminmanager(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("username") String username,
			@ModelAttribute("website") @Valid biz_website website,
			BindingResult result,
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
		    //model.addAttribute("member", new memberloginwrap());		
		    return "redirect:/login";
		}
		model.addAttribute("username", username);
		biz_member member=this.memberService.selectByUsername(username);
		model.addAttribute("member", member);
		 return "tradeweb/admin_manager";
	}
	
	@RequestMapping(value={"/admin_updown"},method=GET)
	public String adminmanagerds(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("username") String username,			
			Model model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			//model.addAttribute("member", new memberloginwrap());
			
			//model.addAttribute("prolist", this.provinceService.selectAllRecord());
			//model.addAttribute("citylist",this.cityService.selectAllRecord());
			
			//return LOGIN_NAME;	
		    return "redirect:/login";	//已更改
		}
		System.out.println("cookies:"+cookieuserName);
		model.addAttribute("username", username);
		//biz_member member=this.memberService.selectByUsername(username);
		//model.addAttribute("member", member);
		 return "tradeweb/admin_updown";
	}
	
	
	@RequestMapping(value={"/admin_login"},method=GET)
	public String manageadmintypedfd(			
			@PathVariable("username") String username,
			Model model) 
	{
		model.addAttribute("username", username);
		
		return "jsp/tradeweb/manage/admin_login";
	}
	@RequestMapping(value={"/admin_logout"},method=GET)
	public String manageadmindtypedfd(			
			@PathVariable("username") String username,
			HttpServletRequest request,
			HttpServletResponse response,
			Model model) 
	{
		model.addAttribute("username", username);
		Cookie deleteNewCookie=new Cookie("userName",null);
		deleteNewCookie.setMaxAge(0);
		deleteNewCookie.setPath("/"+username+"/manage/"); 
		response.addCookie(deleteNewCookie);
		
		model.addAttribute("member", new memberloginwrap());		
		return LOGIN_NAME;	
	}
	private WebNewsService webNewsService;
	@Autowired
	public void setWebNewsService(WebNewsService webNewsService) {
		this.webNewsService = webNewsService;
	}
	private WebProductService webProductService;	
	@Autowired
	public void setwebProductService(WebProductService webProductService) {
		this.webProductService = webProductService;
	}
	private WebPurveyService webPurveyService;
	@Autowired
	public void setWebPurveyService(WebPurveyService webPurveyService) {
		this.webPurveyService = webPurveyService;
	}
	private WebCommoninfoService webCommoninfoService;
	@Autowired
	public void setWebCommoninfoService(WebCommoninfoService webCommoninfoService) {
		this.webCommoninfoService = webCommoninfoService;
	}
	private WebGuestbookService webGuestbookService;
	@Autowired
	public void setWebGuestbookService(WebGuestbookService webGuestbookService) {
		this.webGuestbookService = webGuestbookService;
	}
	private ChannelService channelService;
	@Autowired
	public void setChannelService(ChannelService channelService) {
		this.channelService = channelService;
	}
	
}
