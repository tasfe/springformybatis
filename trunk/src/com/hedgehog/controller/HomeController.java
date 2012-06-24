package com.hedgehog.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CommonsHttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hedgehog.Utils.CommonUtil;
import com.hedgehog.Utils.SearchParameter;
import com.hedgehog.Utils.Security;
import com.hedgehog.Utils.Callback;
import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_classinfo;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_rank;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.memberloginwrap;
import com.hedgehog.domain.memberwrap;
import com.hedgehog.domain.web_product;
import com.hedgehog.domain.web_supplyinfo;
import com.hedgehog.service.ClassinfoService;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.ProvinceService;
import com.hedgehog.service.WebProductService;
import com.hedgehog.service.WebPurveyService;
import com.hedgehog.service.WebsiteService;

@Controller
public class HomeController {
	private static final String SOLR_URL = "http://www.mysolr.com/";
	@Autowired
    private ProvinceService provinceService;
    
    public void setProvinceService(ProvinceService provinceService) {
		this.provinceService = provinceService;
	}
    private MemberService memberService;
	
	@Autowired
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	private WebsiteService websiteService;
	@Autowired
	public void setWebsiteService(WebsiteService websiteService) {
		this.websiteService = websiteService;
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
	
    @Autowired
    private RegistrationValidation registrationValidation;

    public void setRegistrationValidation(RegistrationValidation registrationValidation) {
            this.registrationValidation = registrationValidation;
    }
	@RequestMapping(value={"/","/home"}, method=RequestMethod.GET)
	  public String showHomePage(ModelMap model) {		
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_website");
		qp.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp.setPageSize(19);
		qp.setPageIndex(1);
		qp.setWhere(" where w_memberID in (select memberID from biz_member where member_Rank=2 and member_lock=1)");//商务通加强版
		qp.setOrderfld("websiteID");
		qp.setOrderType(1);	
		model.addAttribute("tradelist_jiaqiang", this.websiteService.selectRecordInPager(qp));
		//System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		//System.out.println("总页数："+ (Integer)qp.getPageCount());
		//model.addAttribute("queryParam", qp);
		QueryParam qp2=new QueryParam();
		qp2.setTableName("biz_website");
		qp2.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp2.setPageSize(19);
		qp2.setPageIndex(1);
		qp2.setWhere(" where w_memberID in (select memberID from biz_member where member_Rank=1 and member_lock=1)");//商务通标准版
		qp2.setOrderfld("websiteID");
		qp2.setOrderType(1);	
		model.addAttribute("tradelist_biaozhun", this.websiteService.selectRecordInPager(qp2));
		
		QueryParam qp3=new QueryParam();
		qp3.setTableName("biz_website");
		qp3.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp3.setPageSize(19);
		qp3.setPageIndex(1);
		qp3.setWhere(" where w_memberID in (select memberID from biz_member where member_PRank=2 and member_lock=1)");//生意通
		qp3.setOrderfld("websiteID");
		qp3.setOrderType(1);	
		model.addAttribute("businesslist", this.websiteService.selectRecordInPager(qp3));
		
		QueryParam qp4=new QueryParam();
		qp4.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name ");
		qp4.setPageSize(64);
		qp4.setPageIndex(1);
		qp4.setWhere(" where Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");
		qp4.setOrderfld("ProductID");
		qp4.setOrderType(1);		
		model.addAttribute("list_product", this.webProductService.selectWebProductInPager(qp4));
		//System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		//System.out.println("总页数："+ (Integer)qp.getPageCount());
		//model.addAttribute("queryParam", qp4);
		QueryParam qp5=new QueryParam();
		qp5.setTableName("web_supplyinfo");
		qp5.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp5.setPageSize(32);
		qp5.setPageIndex(1);
		qp5.setWhere(" where supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");
		qp5.setOrderfld("supplyinfoID");
		qp5.setOrderType(1);		
		model.addAttribute("list_supplyinfo", this.webPurveyService.selectWebSupplyinfoInPager(qp5));	
		
		QueryParam qp6=new QueryParam();
		qp6.setTableName("biz_website");
		qp6.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp6.setPageSize(32);
		qp6.setPageIndex(1);
		qp6.setWhere(" where w_Property like '%h%' and w_memberID in (select memberID from biz_member where member_lock=1)");//精品企业
		qp6.setOrderfld("websiteID");
		qp6.setOrderType(1);	
		model.addAttribute("tradelist_jingpin", this.websiteService.selectRecordInPager(qp6));
		
		QueryParam qp7=new QueryParam();
		qp7.setTableName("biz_website");
		qp7.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp7.setPageSize(32);
		qp7.setPageIndex(1);
		qp7.setWhere(" where w_Property like '%c%' and w_memberID in (select memberID from biz_member where member_lock=1)");//推荐企业
		qp7.setOrderfld("websiteID");
		qp7.setOrderType(1);	
		model.addAttribute("tradelist_tuijian", this.websiteService.selectRecordInPager(qp7));
		
		QueryParam qp8=new QueryParam();
		qp8.setTableName("web_supplyinfo");
		qp8.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
		qp8.setPageSize(16);
		qp8.setPageIndex(1);
		qp5.setWhere(" where supplyinfo_properties like '%c%' and supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//推荐供求
		qp8.setOrderfld("supplyinfoID");
		qp8.setOrderType(1);		
		model.addAttribute("list_supplyinfo_tuijian", this.webPurveyService.selectWebSupplyinfoInPager(qp8));
		
		
		QueryParam qp9=new QueryParam();
		qp9.setTableName("web_product");
		//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp9.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Thumbs ");
		qp9.setPageSize(9);
		qp9.setPageIndex(1);
		qp9.setWhere(" where Product_Property like '%h%' and Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1))");//精品产品
		qp9.setOrderfld("ProductID");
		qp9.setOrderType(1);		
		model.addAttribute("list_product_jingpin", this.webProductService.selectWebProductInPager(qp9));		
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
	    return "home";
	  }
	@RequestMapping(value={"/register"}, method=RequestMethod.GET)
	  public String showHomePagereg(Model model) {
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
        model.addAttribute("title", "用户注册");
		
		model.addAttribute("member", new memberwrap());
		
		model.addAttribute("prolist", this.provinceService.selectAllRecord());
		//model.addAttribute("citylist",this.cityService.selectAllRecord());		
	    return "jsp/register";
	  }
	@RequestMapping(value={"/register"},method=POST)
	public String editnewspost(
			HttpSession session,
			@ModelAttribute("member") @Valid memberwrap memwrap,
			BindingResult result,
			Model model) 
	{
		
		String code = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY); 
		if(memwrap.getCheckcode()!="")
		{
			if(!(memwrap.getCheckcode()).equals(code))
			{
				result.rejectValue("checkcode", "checkcode.error", "验证码错误");				
			}			
		}
		//System.out.println("会员名："+member.getMemberName());
		//modelMap.addAttribute("member", new biz_member());
		// set custom Validation by user
		System.out.println("省份："+memwrap.getWProvince());
        registrationValidation.validate(memwrap, result);
		//result.rejectValue("memberCname", "企业名不能为空吧");
		if(result.hasErrors())
		{
			model.addAttribute("title", "用户注册");
			//model.addAttribute(arg0, arg1);
			model.addAttribute("prolist", this.provinceService.selectAllRecord());
			//model.addAttribute("citylist",this.cityService.selectAllRecord());
			return "jsp/register";			
		}
		//添加用户
		biz_member member=new biz_member();
		member.setMemberName(memwrap.getMemberName());//用户名
		//Security.MD5(s);
		member.setMemberPwd(Security.MD5(memwrap.getMemberPwd()));//密码
		
		member.setMemberRealname(memwrap.getMemberRealname());//真实姓名(后台编辑)
		member.setMemberQq(memwrap.getMemberQq());//QQ (后台编辑)
		
		member.setMemberTel(memwrap.getMemberTel());//电话  转移
		member.setMemberCname(memwrap.getMemberCname());//企业名称  转移		
		member.setMemberEmail(memwrap.getMemberEmail());//E-mail  转移
		//member.setMemberCname(memwrap.getMemberCname());//重复
		
		//member.setMemberTemplet("8");//标准版模板类
		member.setMemberPrank(1);//默认等级 企业汇 标准版 
		member.setMemberRank(1);
		
		biz_rank rank=this.memberService.selectRankByPrimaryKey(member.getMemberRank());
		//所能选择的模板分类 所能选择的栏目 栏目个数||默认模板 默认企业标志图片
		member.setMemberTemplet(rank.getRankDes());//设置在biz_rank表 所能选择的模板分类
		member.setMemberLamu(rank.getRankChannel());
		member.setMemberLamucount(rank.getRankChannelcount());
		
		
		//member.setMemberLock(Byte.valueOf("1"));
		member.setMemberLock(Byte.valueOf("0"));//默认锁定
		member.setMemberAgentname(1);
		member.setMemberLamucount(10);
		member.setMemberTplock(Byte.valueOf("1"));
		Date date = new Date();      
		Timestamp nousedate = new Timestamp(date.getTime());
		member.setMemberRegdate(nousedate);//注册时间
		
		biz_website website=new biz_website();
		website.setwProvince(memwrap.getWProvince());//省份
		website.setwCity(memwrap.getWCity());//城市
		website.setwComname(memwrap.getMemberCname());//企业名称
		website.setwTel(memwrap.getMemberTel());//电话
		website.setwMail(memwrap.getMemberEmail());//E-mail
		
		//website.setwTemplet("company");		
		website.setwTemplet(rank.getRankTemplet());//默认模板
		website.setwCompany(rank.getRankCompany());//企业等级标志图片
		//website.setwComname(memwrap.getMemberCname());//企业名称  重复
		//website.setwMemberid(111);
		
		//int temp=this.memberService.insertSelective(member);
		//int temp=this.memberService.insert(member);
		int temp=this.memberService.insertmemberpro(member,website);
		System.out.println("id："+member.getMemberid());
		//System.out.println("会员ID33主键："+temp);
		//System.out.println("注册时间22："+member.getMemberRegdate());
		model.addAttribute("member2",member);
		return "registersuc";
		//return "redirect:/login";
	}
	@RequestMapping(value={"/login"}, method=RequestMethod.GET)
	  public String showHomePagelogin(Model model) {
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
		model.addAttribute("member", new memberloginwrap());
	    return "login";
	  }
	
	@RequestMapping(value={"/login"},method=POST)
	public String login2(HttpSession session,HttpServletResponse response,@ModelAttribute("member") @Valid memberloginwrap member,BindingResult result,Model model) 
	{
		String code = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY); 
		if(member.getCheckcode()!="")
		{
			if(!(member.getCheckcode()).equals(code))
			{
				result.rejectValue("checkcode", "checkcode.error", "验证码错误");
			}			
		}
		biz_member rmember=new biz_member();
		rmember.setMemberName(member.getMemberName());
		rmember.setMemberPwd(Security.MD5(member.getMemberPwd()));
		if(!result.hasErrors())
		{
			if(!this.memberService.authenticate(rmember))
			{
				result.rejectValue("authenticate", "authenticate.error", "用户名或密码错误");				
			}
		}
		
		if(result.hasErrors())
		{
			//model.addAttribute(arg0, arg1);
			//model.addAttribute("prolist", this.provinceService.selectAllRecord());
			//model.addAttribute("citylist",this.cityService.selectAllRecord());
			return "login";			
		}
		Cookie usernamecookie=new Cookie("userName", member.getMemberName());
		usernamecookie.setMaxAge(1200);
		usernamecookie.setPath("/"+member.getMemberName()+"/manage/");
		response.addCookie(usernamecookie);
		//model.addAttribute("member", new biz_member());
		
		//model.addAttribute("prolist", this.provinceService.selectAllRecord());
		//model.addAttribute("citylist",this.cityService.selectAllRecord());
		//model.addAttribute("member", rmember);
		
		//return "jsp/credit/loginsuccess";
		return "redirect:/"+member.getMemberName()+"/manage/admin_manager";
		
	}
	@RequestMapping(value={"/searchresult"},method=RequestMethod.GET)
	  public String showHomePagefgh(
			  @RequestParam(value="type", defaultValue="1") int type,
			  @RequestParam(value="key", defaultValue="") String querystr,
			  @RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="10") int perPage,
	          ModelMap modelMap) {
		if(StringUtils.isBlank(querystr))
		{
			return "redirect:/search";
		}
		if(type<1||type>4)
		{
			type=1;
		}
		if(page<1)
		{
			page=1;
		}
		//String SOLR_URL = "http://localhost:8081/solr/core"+String.valueOf(type); 
	    
	    try {
			//CommonsHttpSolrServer solrServer=new CommonsHttpSolrServer(SOLR_URL);
			CommonsHttpSolrServer solrServer = new CommonsHttpSolrServer(SOLR_URL+"core"+String.valueOf(type)); 
			
			 SolrQuery query = new SolrQuery();//.setHighlight(true);  
			    //query.setHighlight(true);
			        
			        query.setQuery("all:"+querystr);  
			        query.setStart((page-1)*perPage);
			        query.setRows(perPage);
			        
			        QueryResponse rsp = solrServer.query( query );  
		            
		            SolrDocumentList docs = rsp.getResults();  
		            //List<BookIndex> bookLists = rsp.getBeans(BookIndex.class)
		            Map<String,Map<String,List<String>>> hl = rsp.getHighlighting(); 
		            
		            Callback cb=new Callback();
		            cb.setSum((int)docs.getNumFound());
		            cb.setSpan(rsp.getQTime());		            
		            modelMap.addAttribute("callback", cb);
		            
		            SearchParameter spara=new SearchParameter();
		            spara.setType(type);
		            spara.setKey(querystr);
		            modelMap.put("SearchParameter", spara);
		            
		            QueryParam qp=new QueryParam();
		            qp.setPageSize(perPage);
		            qp.setPageIndex(page);
		            qp.setRecordCount((int)docs.getNumFound());
		            qp.setPageCount(((int)docs.getNumFound() + qp.getPageSize() - 1) / qp.getPageSize());
		            modelMap.put("queryParam", qp);
		            
		            modelMap.addAttribute("docs", docs);
		            modelMap.addAttribute("hl", hl);
		            
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//最新加入企业
		QueryParam qp10=new QueryParam();
		qp10.setTableName("biz_website");
		qp10.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_ComName ");
		qp10.setPageSize(30);
		qp10.setPageIndex(1);
		qp10.setWhere(" where w_memberID in (select memberID from biz_member where member_lock=1)");//商务通加强版
		qp10.setOrderfld("websiteID");
		qp10.setOrderType(1);	
		modelMap.addAttribute("tradelist_last", this.websiteService.selectRecordInPager(qp10));
	    //model.put("spittles", spitterService.getRecentSpittles(spittlesPerPage));
	    return "jsp/searchresult";
	  }
	
	@RequestMapping(value={"/url"},method=RequestMethod.GET,params="url")
	  public String showHomePagefghf(
			  @RequestParam(value="url") String url,
	          ModelMap modelMap) {
		if(StringUtils.isBlank(url))
		{
			return "redirect:"+url;
		}
		
	    return "redirect:/search";
	  }
	@RequestMapping(value={"/createIndex"},method=RequestMethod.GET,params="type=1")
	  public void showHomePagefgdghghgff(
			  @RequestParam(value="type", defaultValue="1") int type,			  
			  @RequestParam(value="startid", defaultValue="1") int startid,	          
			  HttpServletRequest request,
			  HttpServletResponse response)  {
		System.out.println("创建企业信息索引开始");
		//String SOLR_URL = "http://localhost:8081/solr/core4"; 
		SolrServer solrServer;  
		SolrInputDocument doc;
	    try {  
	    	solrServer = new CommonsHttpSolrServer(SOLR_URL+"core"+String.valueOf(type)); 
	        //solrServer.deleteByQuery( "*:*" );// CAUTION: deletes everything!
	        
//	        solrServer..setSoTimeout(1000);  // socket read timeout
//	        solrServer.setConnectionTimeout(100);
//	        solrServer.setDefaultMaxConnectionsPerHost(100);
//	        solrServer.setMaxTotalConnections(100);
//	        solrServer.setFollowRedirects(false);  // defaults to false
//	        // allowCompression defaults to false.
//	        // Server side must support gzip or deflate for this to have any effect.
//	        solrServer.setAllowCompression(true);
//	        solrServer.setMaxRetries(1); // defaults to 0.  > 1 not recommended.
//	        solrServer.setParser(new XMLResponseParser()); // binary	        
	        
	        Collection<SolrInputDocument> docs = new ArrayList<SolrInputDocument>(); 	         
	        
	        
	        QueryParam qp=new QueryParam();
			qp.setTableName("biz_website");
			qp.setReturnFields(" websiteID,w_memberID,w_city,w_province,w_BComType,w_ComName,w_FreeText ");
			//qp.setPageSize(34);
			//qp.setPageIndex(1);
			qp.setWhere(" where w_memberID in (select memberID from biz_member where member_lock=1) and websiteID>="+startid);//商务通加强版
			qp.setOrderfld("websiteID");
			qp.setOrderType(1);	
			List<biz_website> list=this.websiteService.selectRecordInPager(qp);		
			
			
	        
			if(list.size()>0)
			{
				Iterator<biz_website> it=list.iterator();  
				biz_website website=null;
				  while(it.hasNext())
				  {    
					  website=(biz_website)it.next();					 
					 doc = new SolrInputDocument(); 
					 doc.addField("id", website.getWebsiteid());
					 doc.addField("title", website.getwComname());
					 doc.addField("content", CommonUtil.Html2Text(this.websiteService.selectByPrimaryKeyWrap(website.getWebsiteid()).getwFreetext()));
					 //doc.addField("classinfoParentclass", classinfo.getClassinfoParentclass());//大类id
					 //doc.addField("classinfoClass", classinfo.getClassinfoClass());//子类id
					 doc.addField("keywords",website.getProvince().getProvinceName()+" "+website.getCity().getCityName());//大类name
					 //doc.addField("classinfoClassname", this.classinfoService.selectcicByPrimaryKey(classinfo.getClassinfoClass()).getCicName());//子类name
					 doc.addField("update", new Date());
					 doc.addField("link","http://www.zggsdh.com/"+website.getMember().getMemberName()+"/");
					 docs.add(doc);
				  }	
				  solrServer.add(docs);
			        solrServer.commit();
			}	        
	        
	    } catch (MalformedURLException e) {  
	        e.printStackTrace();  
	    } catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("创建企业信息索引结束");
	
	}
	@RequestMapping(value={"/createIndex"},method=RequestMethod.GET,params="type=2")
	  public void showHomePagefgdghghf(
			  @RequestParam(value="type", defaultValue="1") int type,			  
			  @RequestParam(value="startid", defaultValue="1") int startid,	          
			  HttpServletRequest request,
			  HttpServletResponse response)  {
		System.out.println("创建产品信息索引开始");
		//String SOLR_URL = "http://localhost:8081/solr/core4"; 
		SolrServer solrServer;  
		SolrInputDocument doc;
	    try {  
	    	solrServer = new CommonsHttpSolrServer(SOLR_URL+"core"+String.valueOf(type)); 
	        //solrServer.deleteByQuery( "*:*" );// CAUTION: deletes everything!
	        
//	        solrServer..setSoTimeout(1000);  // socket read timeout
//	        solrServer.setConnectionTimeout(100);
//	        solrServer.setDefaultMaxConnectionsPerHost(100);
//	        solrServer.setMaxTotalConnections(100);
//	        solrServer.setFollowRedirects(false);  // defaults to false
//	        // allowCompression defaults to false.
//	        // Server side must support gzip or deflate for this to have any effect.
//	        solrServer.setAllowCompression(true);
//	        solrServer.setMaxRetries(1); // defaults to 0.  > 1 not recommended.
//	        solrServer.setParser(new XMLResponseParser()); // binary	        
	        
	        Collection<SolrInputDocument> docs = new ArrayList<SolrInputDocument>(); 	         
	        
	        QueryParam qp4=new QueryParam();
			qp4.setTableName("web_product");
			//qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
			qp4.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Thumbs,Product_Des,Product_updatetime ");
			//qp4.setPageSize(18);
			//qp4.setPageIndex(1);
			qp4.setWhere(" where Product_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1)) and ProductID>="+startid);//
			qp4.setOrderfld("ProductID");
			qp4.setOrderType(1);	
			List<web_product> list=this.webProductService.selectWebProductInPager(qp4);
	        
			if(list.size()>0)
			{
				Iterator<web_product> it=list.iterator();  
				web_product product=null;
				  while(it.hasNext())
				  {    
					  product=(web_product)it.next();					 
					 doc = new SolrInputDocument(); 
					 doc.addField("id", product.getProductid());
					 doc.addField("title", product.getProductName());
					 doc.addField("content", CommonUtil.Html2Text(this.webProductService.selectProductByPrimaryKey(product.getProductid()).getProductDes()));
					 //doc.addField("classinfoParentclass", classinfo.getClassinfoParentclass());//大类id
					 //doc.addField("classinfoClass", classinfo.getClassinfoClass());//子类id
					 doc.addField("keywords",product.getProductclass().getPcName());//大类name
					 //doc.addField("classinfoClassname", this.classinfoService.selectcicByPrimaryKey(classinfo.getClassinfoClass()).getCicName());//子类name
					 doc.addField("update", new Date());
					 doc.addField("link","http://www.zggsdh.com/"+product.getMenu().getMember().getMemberName()+"/product/"+String.valueOf(product.getProductMenuid())+"/"+String.valueOf(product.getProductClass())+"/"+String.valueOf(product.getProductid()));
					 docs.add(doc);
				  }	
				  solrServer.add(docs);
			        solrServer.commit();
			}	        
	        
	    } catch (MalformedURLException e) {  
	        e.printStackTrace();  
	    } catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("创建产品信息索引结束");
	
	}
	@RequestMapping(value={"/createIndex"},method=RequestMethod.GET,params="type=3")
	  public void showHomePagefgdghgh(
			  @RequestParam(value="type", defaultValue="1") int type,			  
			  @RequestParam(value="startid", defaultValue="1") int startid,	          
			  HttpServletRequest request,
			  HttpServletResponse response)  {
		System.out.println("创建供求信息索引开始");
		//String SOLR_URL = "http://localhost:8081/solr/core4"; 
		SolrServer solrServer;  
		SolrInputDocument doc;
	    try {  
	    	solrServer = new CommonsHttpSolrServer(SOLR_URL+"core"+String.valueOf(type)); 
	        //solrServer.deleteByQuery( "*:*" );// CAUTION: deletes everything!
	        
//	        solrServer..setSoTimeout(1000);  // socket read timeout
//	        solrServer.setConnectionTimeout(100);
//	        solrServer.setDefaultMaxConnectionsPerHost(100);
//	        solrServer.setMaxTotalConnections(100);
//	        solrServer.setFollowRedirects(false);  // defaults to false
//	        // allowCompression defaults to false.
//	        // Server side must support gzip or deflate for this to have any effect.
//	        solrServer.setAllowCompression(true);
//	        solrServer.setMaxRetries(1); // defaults to 0.  > 1 not recommended.
//	        solrServer.setParser(new XMLResponseParser()); // binary	        
	        
	        Collection<SolrInputDocument> docs = new ArrayList<SolrInputDocument>(); 	         
	        
	        
	        QueryParam qp5=new QueryParam();
			qp5.setTableName("web_supplyinfo");
			qp5.setReturnFields(" supplyinfoID,supplyinfo_sc,supplyinfo_Title,supplyinfo_des,supplyinfo_type,supplyinfo_menuID,supplyinfo_updatetime,supplyinfo_hits ");
			//qp5.setPageSize(12);
			//qp5.setPageIndex(1);
			qp5.setWhere(" where supplyinfo_menuID in (select menuID from biz_menu where menu_memberid in (select memberID from biz_member where member_lock=1)) and supplyinfoID>="+startid);//
			qp5.setOrderfld("supplyinfoID");
			qp5.setOrderType(1);		
			List<web_supplyinfo> list=this.webPurveyService.selectWebSupplyinfoInPager(qp5);			
			
			
	        
			if(list.size()>0)
			{
				Iterator<web_supplyinfo> it=list.iterator();  
				web_supplyinfo supplyinfo=null;
				  while(it.hasNext())
				  {    
					 supplyinfo=(web_supplyinfo)it.next();					 
					 doc = new SolrInputDocument(); 
					 doc.addField("id", supplyinfo.getSupplyinfoid());
					 doc.addField("title", supplyinfo.getSupplyinfoTitle());
					 doc.addField("content", CommonUtil.Html2Text(this.webPurveyService.selectSupplyinfoByPrimaryKey(supplyinfo.getSupplyinfoid()).getSupplyinfoDes()));
					 //doc.addField("classinfoParentclass", classinfo.getClassinfoParentclass());//大类id
					 //doc.addField("classinfoClass", classinfo.getClassinfoClass());//子类id
					 doc.addField("keywords",supplyinfo.getSupplyclass().getScName());//大类name
					 //doc.addField("classinfoClassname", this.classinfoService.selectcicByPrimaryKey(classinfo.getClassinfoClass()).getCicName());//子类name
					 doc.addField("update", new Date());
					 doc.addField("link","http://www.zggsdh.com/"+supplyinfo.getMenu().getMember().getMemberName()+"/purvey/"+String.valueOf(supplyinfo.getSupplyinfoMenuid())+"/"+String.valueOf(supplyinfo.getSupplyinfoSc())+"/"+String.valueOf(supplyinfo.getSupplyinfoid()));
					 docs.add(doc);
				  }	
				  solrServer.add(docs);
			        solrServer.commit();
			}	        
	        
	    } catch (MalformedURLException e) {  
	        e.printStackTrace();  
	    } catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("创建供求信息索引结束");
	
	}
	@RequestMapping(value={"/createIndex"},method=RequestMethod.GET,params="type=4")
	  public void showHomePagefgdgh(
			  @RequestParam(value="type", defaultValue="1") int type,			  
			  @RequestParam(value="startid", defaultValue="1") int startid,	          
			  HttpServletRequest request,
			  HttpServletResponse response)  {
		System.out.println("创建分类信息索引开始");
		//String SOLR_URL = "http://localhost:8081/solr/core4"; 
		SolrServer solrServer;  
		SolrInputDocument doc;
	    try {  
	        solrServer = new CommonsHttpSolrServer(SOLR_URL+"core"+String.valueOf(type));  
	        //solrServer.deleteByQuery( "*:*" );// CAUTION: deletes everything!
	        
//	        solrServer..setSoTimeout(1000);  // socket read timeout
//	        solrServer.setConnectionTimeout(100);
//	        solrServer.setDefaultMaxConnectionsPerHost(100);
//	        solrServer.setMaxTotalConnections(100);
//	        solrServer.setFollowRedirects(false);  // defaults to false
//	        // allowCompression defaults to false.
//	        // Server side must support gzip or deflate for this to have any effect.
//	        solrServer.setAllowCompression(true);
//	        solrServer.setMaxRetries(1); // defaults to 0.  > 1 not recommended.
//	        solrServer.setParser(new XMLResponseParser()); // binary	        
	        
	        Collection<SolrInputDocument> docs = new ArrayList<SolrInputDocument>(); 	         
	        
	        QueryParam qp=new QueryParam();
			qp.setTableName("biz_classinfo");
			qp.setReturnFields(" classinfoID,classinfo_title,classinfo_parentclass,classinfo_class,classinfo_des,classinfo_price,classinfo_email,classinfo_name,classinfo_addr,classinfo_code,classinfo_tel,classinfo_ICQ,classinfo_publishdate ");
			//qp.setPageSize(26);
			//qp.setPageIndex(1);
			qp.setWhere(" where classinfoID>= "+startid);
			qp.setOrderfld("classinfoID");
			qp.setOrderType(1);
			List<biz_classinfo> list=this.classinfoService.selectRecordInPager(qp);
			if(list.size()>0)
			{
				Iterator<biz_classinfo> it=list.iterator();  
				biz_classinfo classinfo=null;
				  while(it.hasNext())
				  {    
					 classinfo=(biz_classinfo)it.next();					 
					 doc = new SolrInputDocument(); 
					 doc.addField("id", classinfo.getClassinfoid());
					 doc.addField("title", classinfo.getClassinfoTitle());
					 doc.addField("content", CommonUtil.Html2Text(this.classinfoService.selectByPrimaryKey(classinfo.getClassinfoid()).getClassinfoDes()));
					 //doc.addField("classinfoParentclass", classinfo.getClassinfoParentclass());//大类id
					 //doc.addField("classinfoClass", classinfo.getClassinfoClass());//子类id
					 doc.addField("keywords",this.classinfoService.selectcicByPrimaryKey(classinfo.getClassinfoParentclass()).getCicName()+" "+this.classinfoService.selectcicByPrimaryKey(classinfo.getClassinfoClass()).getCicName());//大类name
					 //doc.addField("classinfoClassname", this.classinfoService.selectcicByPrimaryKey(classinfo.getClassinfoClass()).getCicName());//子类name
					 doc.addField("update", new Date());
					 doc.addField("link","http://www.zggsdh.com/classify/hotinfoview/"+String.valueOf(classinfo.getClassinfoClass())+"/"+String.valueOf(classinfo.getClassinfoid()));
					 docs.add(doc);
				  }	
				  solrServer.add(docs);
			        solrServer.commit();
			}	        
	        
	    } catch (MalformedURLException e) {  
	        e.printStackTrace();  
	    } catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("创建分类信息索引结束");
	
	}
	private ClassinfoService classinfoService;
	@Autowired
	public void setClassinfoService(ClassinfoService classinfoService) {
		this.classinfoService = classinfoService;
	}
	

	

}

