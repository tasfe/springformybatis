package com.hedgehog.controller.website;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_menu;
import com.hedgehog.domain.biz_menuoper;
import com.hedgehog.domain.memberloginwrap;
import com.hedgehog.domain.web_commoninfo;
import com.hedgehog.domain.web_guestbook;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.MenuoperService;
import com.hedgehog.service.WebGuestbookService;

@Controller
@RequestMapping("/{username}/manage")
public class WebGuestbookController {
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
	private WebGuestbookService webGuestbookService;
	@Autowired
	public void setWebGuestbookService(WebGuestbookService webGuestbookService) {
		this.webGuestbookService = webGuestbookService;
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
		//查询menu domain
		biz_menu menu=this.menuService.selectByPrimaryKey(Integer.valueOf(menuid));
		//biz_menuoper menuoper=this.menuoperService.selectByAppKey(1);
		biz_menuoper menuoper=this.menuoperService.selectByAppcode("ch_guestbook");
		menuoper.setMenuoperName(menu.getMenuName());
		//model.addAttribute("menuoper", menuoper);
		return menuoper;		
	}
	@RequestMapping(value={"/admin_guestbook/{menuid}"},method=GET)
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
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		
		QueryParam qp=new QueryParam();
		qp.setTableName("web_guestbook");
		qp.setReturnFields(" guestbookID,gb_nikename,gb_content,gb_datetime,gb_clientip,gb_menuID ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where gb_menuID="+menuid);
		qp.setOrderfld("guestbookID");
		qp.setOrderType(1);
		
		
		model.addAttribute("list_guestbook", this.webGuestbookService.selectwebGuestbookInPager(qp));
		System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		System.out.println("总页数："+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		//System.out.println("总记录数2："+returnid );
	    //model.put("news", newsService.getNewsList());
	    System.out.println("页码："+page);
	    //System.out.println("有木有到这里listNews");
		
		//model.addAttribute("list_news", menuoper);
		
		return "tradeweb/admin_guestbook";
	}
	@RequestMapping(value={"/admin_guestbook/{menuid}"},method=GET,params="cmd=new")
	public String manageadmin_newsadd(
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
		
//		List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(Integer.valueOf(menuid));
//		model.addAttribute("nclist", list_newsclass);
//		//自定义属性
//		Map<String,String> sort=new LinkedHashMap<String,String>();
//		sort.put("h", "头条[h]");
//		sort.put("c", "推荐[c]");
//		sort.put("f", "幻灯[f]");
//		sort.put("a", "特荐[a]");		
//		sort.put("s", "滚动[s]");
//		sort.put("b", "加粗[b]");
//		sort.put("p", "图片[p]");
//		sort.put("j", "跳转[j]");
//		model.addAttribute("sortlist", sort);	
		//web_news news=new web_news();
		//news.setNewsFlag(newsFlag)
		model.addAttribute("webguestbook", new web_guestbook());		
		
		
		return "tradeweb/admin_guestbookEdit";// 返回添加类别视图
	}
	@RequestMapping(value={"/admin_guestbook/{menuid}"},method=POST,params="cmd=new")
	public String manageadmin_newsaddpost(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			HttpSession session,
			HttpServletRequest request,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@ModelAttribute("webguestbook") @Valid web_guestbook guestbook,
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
		
//		news.setNewsProperties(news.getNewsFlag().toString());
//		System.out.println("属性值"+news.getNewsProperties());
		String code = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY); 
		if(guestbook.getCheckcode()!="")
		{
			if(!(guestbook.getCheckcode()).equals(code))
			{
				result.rejectValue("checkcode", "checkcode.error", "验证码错误");				
			}			
		}
		System.out.println("有没有到外面");
		
		if(result.hasErrors())
		{
			System.out.println("有没有到里面");
//			List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(Integer.valueOf(menuid));
//			model.addAttribute("nclist", list_newsclass);
//			
//			//自定义属性
//			Map<String,String> sort=new LinkedHashMap<String,String>();
//			sort.put("h", "头条[h]");
//			sort.put("c", "推荐[c]");
//			sort.put("f", "幻灯[f]");
//			sort.put("a", "特荐[a]");		
//			sort.put("s", "滚动[s]");
//			sort.put("b", "加粗[b]");
//			sort.put("p", "图片[p]");
//			sort.put("j", "跳转[j]");
//			model.addAttribute("sortlist", sort);
			
			return "tradeweb/admin_guestbookEdit";// 返回添加类别视图
			
		}
		//String temp="";
		//temp.split(regex)
		
		guestbook.setGbMenuid(Integer.parseInt(menuid));
		guestbook.setGbClientip(request.getRemoteAddr());
		//添加新闻
		this.webGuestbookService.insertSelective(guestbook);
		
		//model.addAttribute("webnews", new web_news());
		
		QueryParam qp=new QueryParam();
		qp.setTableName("web_guestbook");
		qp.setReturnFields(" guestbookID,gb_nikename,gb_content,gb_datetime,gb_clientip,gb_menuID ");
		qp.setPageSize(30);
		qp.setPageIndex(1);
		qp.setWhere(" where gb_menuID="+menuid);
		qp.setOrderfld("guestbookID");
		qp.setOrderType(1);
		
		
		model.addAttribute("list_guestbook", this.webGuestbookService.selectwebGuestbookInPager(qp));
		System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		System.out.println("总页数："+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		//System.out.println("总记录数2："+returnid );
	    //model.put("news", newsService.getNewsList());
	    //System.out.println("页码："+page);
	    
		
		return "tradeweb/admin_guestbook";// 返回添加类别视图
	}
	
	@RequestMapping(value={"/admin_guestbook/{menuid}"},method=GET,params="cmd=edit")
	public String manageadmin_newsedit(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String guestbookid,
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
		
//		List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(Integer.valueOf(menuid));
//		model.addAttribute("nclist", list_newsclass);
//		
//		//自定义属性
//		Map<String,String> sort=new LinkedHashMap<String,String>();
//		sort.put("h", "头条[h]");
//		sort.put("c", "推荐[c]");
//		sort.put("f", "幻灯[f]");
//		sort.put("a", "特荐[a]");		
//		sort.put("s", "滚动[s]");
//		sort.put("b", "加粗[b]");
//		sort.put("p", "图片[p]");
//		sort.put("j", "跳转[j]");
//		model.addAttribute("sortlist", sort);
		web_guestbook webguestbook=this.webGuestbookService.selectByPrimaryKey(Integer.parseInt(guestbookid));
//		if(news.getNewsProperties()!=null)
//		{
//			if(news.getNewsProperties().contains(","))
//			{
//				
//				news.setNewsFlag(news.getNewsProperties().split(","));
//				
//			}
//			
//		}
		
		model.addAttribute("webguestbook", webguestbook);		
		
		return "tradeweb/admin_guestbookEdit";// 返回添加类别视图
	}
	@RequestMapping(value={"/admin_guestbook/{menuid}"},method=POST,params="cmd=edit")
	public String manageadmin_newseditpost(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String guestbookid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@ModelAttribute("webguestbook") @Valid web_guestbook guestbook,
			BindingResult result,
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
//		for(String str:news.getNewsFlag())
//		{
//			System.out.println(str);
//			buf.append(str);
//		}
		
//		System.out.println("到底为何物"+news.getNewsFlag().toString());
//		news.setNewsProperties(news.getNewsFlag().toString());
		
		if(result.hasErrors())
		{
//			List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(Integer.valueOf(menuid));
//			model.addAttribute("nclist", list_newsclass);			
//			//自定义属性
//			Map<String,String> sort=new LinkedHashMap<String,String>();
//			sort.put("h", "头条[h]");
//			sort.put("c", "推荐[c]");
//			sort.put("f", "幻灯[f]");
//			sort.put("a", "特荐[a]");		
//			sort.put("s", "滚动[s]");
//			sort.put("b", "加粗[b]");
//			sort.put("p", "图片[p]");
//			sort.put("j", "跳转[j]");
//			model.addAttribute("sortlist", sort);
			//model.addAttribute("webnews", this.webNewsService.selectNewsByPrimaryKey(Integer.parseInt(newsid)));
			return "tradeweb/admin_guestbookEdit";// 返回添加类别视图
		}
		guestbook.setGuestbookid(Integer.parseInt(guestbookid));
		this.webGuestbookService.updateByPrimaryKeySelective(guestbook);
		
		QueryParam qp=new QueryParam();
		qp.setTableName("web_guestbook");
		qp.setReturnFields(" guestbookID,gb_nikename,gb_content,gb_datetime,gb_clientip,gb_menuID ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where gb_menuID="+menuid);
		qp.setOrderfld("guestbookID");
		qp.setOrderType(1);
		
		
		model.addAttribute("list_guestbook", this.webGuestbookService.selectwebGuestbookInPager(qp));
		System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		System.out.println("总页数："+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		
		return "tradeweb/admin_guestbook";// 返回添加类别视图
	}
	@RequestMapping(value={"/admin_guestbook/{menuid}"},method=GET,params="cmd=del")
	public String manageadmin_newsdel(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String guestbookid,
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
		
		this.webGuestbookService.deleteByPrimaryKey(Integer.parseInt(guestbookid));//.webNewsService.deleteNewsByPrimaryKey(Integer.parseInt(newsid));
		
		QueryParam qp=new QueryParam();
		qp.setTableName("web_guestbook");
		qp.setReturnFields(" guestbookID,gb_nikename,gb_content,gb_datetime,gb_clientip,gb_menuID ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where gb_menuID="+menuid);
		qp.setOrderfld("guestbookID");
		qp.setOrderType(1);
		
		
		model.addAttribute("list_guestbook", this.webGuestbookService.selectwebGuestbookInPager(qp));
		System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		System.out.println("总页数："+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		//List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(Integer.valueOf(menuid));
		//model.addAttribute("nclist", list_newsclass);
		
		//model.addAttribute("webnews", this.webNewsService.selectNewsByPrimaryKey(Integer.parseInt(newsid)));		
		
		return "tradeweb/admin_guestbook";// 返回添加类别视图
	}
	

}
