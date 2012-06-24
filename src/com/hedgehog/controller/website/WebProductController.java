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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_menu;
import com.hedgehog.domain.biz_menuoper;
import com.hedgehog.domain.memberloginwrap;
import com.hedgehog.domain.web_newsclass;

import com.hedgehog.domain.web_product;
import com.hedgehog.domain.web_productclass;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.MenuService;
import com.hedgehog.service.MenuoperService;
import com.hedgehog.service.WebProductService;


@Controller
@RequestMapping("/{username}/manage")
public class WebProductController {
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
	
	private WebProductService webProductService;	
	@Autowired
	public void setwebProductService(WebProductService webProductService) {
		this.webProductService = webProductService;
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
		biz_menuoper menuoper=this.menuoperService.selectByAppcode("ch_product");
		menuoper.setMenuoperName(menu.getMenuName());
		//model.addAttribute("menuoper", menuoper);
		return menuoper;		
	}
	
	@RequestMapping(value={"/admin_product/{menuid}"},method=GET)
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
		qp.setTableName("web_product");
		qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where Product_menuID="+menuid);
		qp.setOrderfld("ProductID");
		qp.setOrderType(1);
		
		
		model.addAttribute("list_product", this.webProductService.selectWebProductInPager(qp));
		System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		System.out.println("总页数："+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		//System.out.println("总记录数2："+returnid );
	    //model.put("news", newsService.getNewsList());
	    System.out.println("页码："+page);
	    //System.out.println("有木有到这里listNews");
		
		//model.addAttribute("list_news", menuoper);
		
		return "tradeweb/admin_product";
	}
	
	@RequestMapping(value={"/admin_producttype/{menuid}"},method=GET)
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
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		//按menuid查询新闻类别表
//		List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(Integer.valueOf(menuid));
//		System.out.println("类别记录数："+list_newsclass.size());
//		
//		model.addAttribute("list_newsclass", list_newsclass);
		
		//model.addAttribute("newsclass", new web_newsclass());
		
		List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("list_productclass", list_productclass);
		
		return "tradeweb/admin_producttype";
	}
	@RequestMapping(value={"/admin_producttype/{menuid}"},method=POST,params="cmd=new")
	public String manageadmin_newstypepost(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@ModelAttribute("productclass") @Valid web_productclass productclass,
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
//		menuoper.setMenuoperName("系统管理");
//		model.addAttribute("menuoper", menuoper);
		//按menuid查询新闻类别表
		
		
//		newsclass.setNcParentid(0);
//		newsclass.setNcMenuid(Integer.valueOf(menuid));
		productclass.setPcParentid(0);
		productclass.setPcMenuid(Integer.valueOf(menuid));
		
		
		if(result.hasErrors())
		{
			System.out.println("添加产品类别");
			//List<web_newsclass> list_newsclass=this.webNewsService.selectByMenuID(Integer.valueOf(menuid));
			//model.addAttribute("list_newsclass", list_newsclass);
			return "tradeweb/admin_producttypeEdit";	//修改返回视图		
		}
		//添加新闻类别
		//this.webNewsService.insertSelective(newsclass);	
		this.webProductService.insertSelective(productclass);
		
		List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("list_productclass", list_productclass);
		//model.addAttribute("newsclass", new web_newsclass());
		
		return "tradeweb/admin_producttype";//重定向视图  调试 redirect地址有误
	}
	
	@RequestMapping(value={"/admin_producttype/{menuid}"},method=GET,params="cmd=new")
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
		
		model.addAttribute("productclass", new web_productclass());
		
		return "tradeweb/admin_producttypeEdit";// 返回添加类别视图
	}
	
	@RequestMapping(value={"/admin_producttype/{menuid}"},method=GET,params="cmd=edit")
	public String manageadmin_newstypeedit(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String productclassid,
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
		
		model.addAttribute("productclass", this.webProductService.selectByPrimaryKey(Integer.valueOf(productclassid)));
		
		return "tradeweb/admin_producttypeEdit";// 返回添加类别视图
	}
	
	@RequestMapping(value={"/admin_producttype/{menuid}"},method=POST,params="cmd=edit")
	public String manageadmin_producttypeeditpost(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String productclassid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@ModelAttribute("productclass") @Valid web_productclass productclass,
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
			return "tradeweb/admin_producttypeEdit";
			
		}
		//update 新闻类别		
		productclass.setPcid(Integer.parseInt(productclassid));		
		this.webProductService.updateByPrimaryKeySelective(productclass);	
		
		List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("list_productclass", list_productclass);
		
		return "tradeweb/admin_producttype";// 返回添加类别视图
	}
	@RequestMapping(value={"/admin_producttype/{menuid}"},method=GET,params="cmd=del")
	public String manageadmin_producttypedel(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String productclassid,
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
		
		//执行删除操作 判断该类新闻数据是否为空
		if(this.webProductService.selectCountByClass(Integer.parseInt(productclassid))==0)
		{
			this.webProductService.deleteByPrimaryKey(Integer.parseInt(productclassid));			
		}
		List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("list_productclass", list_productclass);
		
		return "tradeweb/admin_producttype";// 返回添加类别视图
	}
//下面部分执行产品相关操作
	
	@RequestMapping(value={"/admin_product/{menuid}"},method=GET,params="cmd=new")
	public String manageadmin_productadd(
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
		
		List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("nclist", list_productclass);
		//自定义属性
		Map<String,String> sort=new LinkedHashMap<String,String>();
		sort.put("h", "头条[h]");
		sort.put("c", "推荐[c]");
		sort.put("f", "幻灯[f]");
		sort.put("a", "特荐[a]");		
		sort.put("s", "滚动[s]");
		sort.put("b", "加粗[b]");
		sort.put("p", "图片[p]");
		sort.put("j", "跳转[j]");
		model.addAttribute("sortlist", sort);	
		//web_product product=new web_product();
		//product.setproductFlag(productFlag)
		model.addAttribute("webproduct", new web_product());
		
		
		
		return "tradeweb/admin_productEdit";// 返回添加类别视图
	}
	
	@RequestMapping(value={"/admin_product/{menuid}"},method=POST,params="cmd=new")
	public String manageadmin_productaddpost(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@ModelAttribute("webproduct") @Valid web_product product,
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
		
//		product.setproductProperties(product.getproductFlag().toString());
//		System.out.println("属性值"+product.getproductProperties());
		
		
		if(result.hasErrors())
		{
			List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
			model.addAttribute("nclist", list_productclass);
			
			//自定义属性
			Map<String,String> sort=new LinkedHashMap<String,String>();
			sort.put("h", "头条[h]");
			sort.put("c", "推荐[c]");
			sort.put("f", "幻灯[f]");
			sort.put("a", "特荐[a]");		
			sort.put("s", "滚动[s]");
			sort.put("b", "加粗[b]");
			sort.put("p", "图片[p]");
			sort.put("j", "跳转[j]");
			model.addAttribute("sortlist", sort);
			
			return "tradeweb/admin_productEdit";// 返回添加类别视图
			
		}
		//String temp="";
		//temp.split(regex)
		try
		{
			MultipartFile file = product.getFileData();		
			
			String fileName = null;
			InputStream inputStream = null;
			OutputStream outputStream = null;
			
			if (file.getSize() > 0) {
				//System.out.println("偏移："+file.getOriginalFilename().lastIndexOf("."));
				if(file.getOriginalFilename().lastIndexOf(".")==-1)
				{
					List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_productclass);
					
					//自定义属性
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "头条[h]");
					sort.put("c", "推荐[c]");
					sort.put("f", "幻灯[f]");
					sort.put("a", "特荐[a]");		
					sort.put("s", "滚动[s]");
					sort.put("b", "加粗[b]");
					sort.put("p", "图片[p]");
					sort.put("j", "跳转[j]");
					model.addAttribute("sortlist", sort);
					System.out.println("文件格式不合法");
					return "classify_infopublish";
				}
				String ext=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1).toLowerCase();//后缀
				//System.out.println("文件后缀："+ext);
				if(!ext.equalsIgnoreCase("jpg")&&!ext.equalsIgnoreCase("jpeg")&&!ext.equalsIgnoreCase("png"))
				{
					List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_productclass);
					
					//自定义属性
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "头条[h]");
					sort.put("c", "推荐[c]");
					sort.put("f", "幻灯[f]");
					sort.put("a", "特荐[a]");		
					sort.put("s", "滚动[s]");
					sort.put("b", "加粗[b]");
					sort.put("p", "图片[p]");
					sort.put("j", "跳转[j]");
					model.addAttribute("sortlist", sort);
					System.out.println("文件格式不合法");
					return "classify_infopublish";
				}
				inputStream = file.getInputStream();
				if (file.getSize() > 500000) {
					List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_productclass);
					
					//自定义属性
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "头条[h]");
					sort.put("c", "推荐[c]");
					sort.put("f", "幻灯[f]");
					sort.put("a", "特荐[a]");		
					sort.put("s", "滚动[s]");
					sort.put("b", "加粗[b]");
					sort.put("p", "图片[p]");
					sort.put("j", "跳转[j]");
					model.addAttribute("sortlist", sort);
					System.out.println("File Size:::" + file.getSize());
					return "tradeweb/admin_productEdit";
				}
				System.out.println("size::" + file.getSize());
				//request.getSession().getServletContext().getRealPath("/");
				//UUID.randomUUID();
				System.out.println(file.getContentType());
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
				product.setProductThumbs(restfilename);
			}
			product.setProductMenuid(Integer.parseInt(menuid));
			//添加新闻
			this.webProductService.insertProductSelective(product);
	} catch (Exception e) {
		e.printStackTrace();
	}
//		product.setProductMenuid(Integer.parseInt(menuid));
//		//添加新闻
//		this.webProductService.insertProductSelective(product);
		
		//model.addAttribute("webproduct", new web_product());
		
		QueryParam qp=new QueryParam();
		qp.setTableName("web_product");
		qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp.setPageSize(30);
		qp.setPageIndex(1);
		qp.setWhere(" where Product_menuID="+menuid);
		qp.setOrderfld("ProductID");
		qp.setOrderType(1);
		
		
		model.addAttribute("list_product", this.webProductService.selectWebProductInPager(qp));
		System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		System.out.println("总页数："+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		//System.out.println("总记录数2："+returnid );
	    //model.put("product", productService.getproductList());
	    //System.out.println("页码："+page);
	    
		
		return "tradeweb/admin_product";// 返回添加类别视图
	}
	
	@RequestMapping(value={"/admin_product/{menuid}"},method=GET,params="cmd=edit")
	public String manageadmin_productedit(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String productid,
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
		
		List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
		model.addAttribute("nclist", list_productclass);
		
		//自定义属性
		Map<String,String> sort=new LinkedHashMap<String,String>();
		sort.put("h", "头条[h]");
		sort.put("c", "推荐[c]");
		sort.put("f", "幻灯[f]");
		sort.put("a", "特荐[a]");		
		sort.put("s", "滚动[s]");
		sort.put("b", "加粗[b]");
		sort.put("p", "图片[p]");
		sort.put("j", "跳转[j]");
		model.addAttribute("sortlist", sort);
		web_product product=this.webProductService.selectProductByPrimaryKey(Integer.parseInt(productid));
//		if(product.getproductProperties()!=null)
//		{
//			if(product.getproductProperties().contains(","))
//			{
//				
//				product.setproductFlag(product.getproductProperties().split(","));
//				
//			}
//			
//		}
		
		model.addAttribute("webproduct", product);		
		
		return "tradeweb/admin_productEdit";// 返回添加类别视图
	}
	
	@RequestMapping(value={"/admin_product/{menuid}"},method=POST,params="cmd=edit")
	public String manageadmin_producteditpost(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String productid,
			@ModelAttribute("menuenable") List<biz_menu> menuenable,
			@ModelAttribute("menuoper") biz_menuoper menuoper,
			@PathVariable("menuid") String menuid,
			@PathVariable("username") String username,
			@ModelAttribute("webproduct") @Valid web_product product,
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
//		for(String str:product.getproductFlag())
//		{
//			System.out.println(str);
//			buf.append(str);
//		}
		
//		System.out.println("到底为何物"+product.getproductFlag().toString());
//		product.setproductProperties(product.getproductFlag().toString());
		
		if(result.hasErrors())
		{
			List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
			model.addAttribute("nclist", list_productclass);			
			//自定义属性
			Map<String,String> sort=new LinkedHashMap<String,String>();
			sort.put("h", "头条[h]");
			sort.put("c", "推荐[c]");
			sort.put("f", "幻灯[f]");
			sort.put("a", "特荐[a]");		
			sort.put("s", "滚动[s]");
			sort.put("b", "加粗[b]");
			sort.put("p", "图片[p]");
			sort.put("j", "跳转[j]");
			model.addAttribute("sortlist", sort);
			//model.addAttribute("webproduct", this.webProductService.selectproductByPrimaryKey(Integer.parseInt(productid)));
			return "tradeweb/admin_productEdit";// 返回添加类别视图
		}
		try
		{
			MultipartFile file = product.getFileData();	
			
			
			String fileName = null;
			InputStream inputStream = null;
			OutputStream outputStream = null;
			
			if (file.getSize() > 0) {
				//System.out.println("偏移："+file.getOriginalFilename().lastIndexOf("."));
				if(file.getOriginalFilename().lastIndexOf(".")==-1)
				{
					List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_productclass);			
					//自定义属性
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "头条[h]");
					sort.put("c", "推荐[c]");
					sort.put("f", "幻灯[f]");
					sort.put("a", "特荐[a]");		
					sort.put("s", "滚动[s]");
					sort.put("b", "加粗[b]");
					sort.put("p", "图片[p]");
					sort.put("j", "跳转[j]");
					model.addAttribute("sortlist", sort);
					System.out.println("文件格式不合法");
					return "classify_infopublish";
				}
				String ext=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1).toLowerCase();//后缀
				//System.out.println("文件后缀："+ext);
				if(!ext.equalsIgnoreCase("jpg")&&!ext.equalsIgnoreCase("jpeg")&&!ext.equalsIgnoreCase("png"))
				{
					List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_productclass);			
					//自定义属性
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "头条[h]");
					sort.put("c", "推荐[c]");
					sort.put("f", "幻灯[f]");
					sort.put("a", "特荐[a]");		
					sort.put("s", "滚动[s]");
					sort.put("b", "加粗[b]");
					sort.put("p", "图片[p]");
					sort.put("j", "跳转[j]");
					model.addAttribute("sortlist", sort);
					System.out.println("文件格式不合法");
					return "classify_infopublish";
				}
				inputStream = file.getInputStream();
				if (file.getSize() > 500000) {
					List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
					model.addAttribute("nclist", list_productclass);			
					//自定义属性
					Map<String,String> sort=new LinkedHashMap<String,String>();
					sort.put("h", "头条[h]");
					sort.put("c", "推荐[c]");
					sort.put("f", "幻灯[f]");
					sort.put("a", "特荐[a]");		
					sort.put("s", "滚动[s]");
					sort.put("b", "加粗[b]");
					sort.put("p", "图片[p]");
					sort.put("j", "跳转[j]");
					model.addAttribute("sortlist", sort);
					System.out.println("File Size:::" + file.getSize());
					return "tradeweb/admin_productEdit";
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
				product.setProductThumbs(restfilename);
			}
			//product.setProductMenuid(Integer.parseInt(menuid));
			//添加新闻
			//this.webProductService.insertProductSelective(product);
			product.setProductid(Integer.parseInt(productid));
			this.webProductService.updateProductByPrimaryKeySelective(product);	
	} catch (Exception e) {
		e.printStackTrace();
	}
//		product.setProductid(Integer.parseInt(productid));
//		this.webProductService.updateProductByPrimaryKeySelective(product);	
		
		QueryParam qp=new QueryParam();
		qp.setTableName("web_product");
		qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		
		//qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		//qp.setReturnFields(" productID,product_Title,product_Class,product_Source,product_Hits,product_Updatetime,product_menuID ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where Product_menuID="+menuid);
		qp.setOrderfld("ProductID");
		qp.setOrderType(1);	
		
		model.addAttribute("list_product", this.webProductService.selectWebProductInPager(qp));
		System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		System.out.println("总页数："+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		
		return "tradeweb/admin_product";// 返回添加类别视图
	}
	
	@RequestMapping(value={"/admin_product/{menuid}"},method=GET,params="cmd=del")
	public String manageadmin_productdel(
			@CookieValue(value="userName",defaultValue="") String cookieuserName,
			@RequestParam(value="id") String productid,
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
		
		this.webProductService.deleteProductByPrimaryKey(Integer.parseInt(productid));
		
		QueryParam qp=new QueryParam();
		qp.setTableName("web_product");
		qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		
		//qp.setReturnFields(" productID,product_Title,product_Class,product_Source,product_Hits,product_Updatetime,product_menuID ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where Product_menuID="+menuid);
		qp.setOrderfld("ProductID");
		qp.setOrderType(1);		
		
		model.addAttribute("list_product", this.webProductService.selectWebProductInPager(qp));
		System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		System.out.println("总页数："+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		//List<web_productclass> list_productclass=this.webProductService.selectByMenuID(Integer.valueOf(menuid));
		//model.addAttribute("nclist", list_productclass);
		
		//model.addAttribute("webproduct", this.webProductService.selectproductByPrimaryKey(Integer.parseInt(productid)));		
		
		return "tradeweb/admin_product";// 返回添加类别视图
	}
	
	

}
