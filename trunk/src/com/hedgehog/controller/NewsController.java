package com.hedgehog.controller;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;


import com.hedgehog.domain.ProNew;
import com.hedgehog.domain.QueryParam;
import com.hedgehog.service.NewsService;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/news")
public class NewsController  {
	private NewsService newsService;
	  
	  @Inject
	  public NewsController(NewsService newsService) {
	    this.newsService = newsService;
	  }
	  
	@RequestMapping(value="/list", method=RequestMethod.GET)
	  public String listNews(
	          @RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="10") int perPage,
	          Map<String, Object> model) {	
		model.put("title", "spring mvc 3.0+mybatis����");
		QueryParam qp=new QueryParam();
		qp.setTableName("PRO_NEWS");
		qp.setReturnFields(" NewsID,News_Title ");
		qp.setPageSize(30);
		qp.setPageIndex(page);
		qp.setWhere(" where 1=1 ");
		qp.setOrderfld("NewsID");
		qp.setOrderType(1);
		
		//Integer returnid = 0;  
//		Map<String, Object> hm=new HashMap<String,Object>();
//		hm.put("TableName", "PRO_NEWS");
//		hm.put("ReturnFields", "*");
//		hm.put("PageSize", 30);
//		hm.put("PageIndex", page);
//		hm.put("Where", " where 1=1");		
//		hm.put("Orderfld", "NewsID");
//		hm.put("OrderType", 1);
//		hm.put("RecordCount", null);		
		model.put("news", newsService.selectNewsInPager(qp));
		System.out.println("�ܼ�¼����"+ (Integer)qp.getRecordCount());
		System.out.println("��ҳ����"+ (Integer)qp.getPageCount());
		model.put("queryParam", qp);
		//System.out.println("�ܼ�¼��2��"+returnid );
	    //model.put("news", newsService.getNewsList());
	    System.out.println("ҳ�룺"+page);
	    //System.out.println("��ľ�е�����listNews");
	    return "news/list";
	  }
	
	@RequestMapping(value="/{newsid}", method=RequestMethod.GET)
	  public String detail(@PathVariable String newsid,
			  Map<String, Object> model) {
		System.out.println("��ľ�е�������ϸҳdetail");
	    model.put("ProNew", newsService.getNews(newsid));
	    return "news/detail";
	  }
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	  public String addnews(Model  model) {
		System.out.println("��ľ�е�����add");
	    //model.put("entity", newsService.getNews(newsid));
		Map<String,String> sort=new LinkedHashMap<String,String>();
		sort.put("79", "��������");
		sort.put("80", "��������");
		sort.put("81", "У԰��̬");
		sort.put("82", "ͼ������");		
		model.addAttribute("sortlist", sort);
		//model.addAttribute(new ProNew());
		model.addAttribute("ProNew",new ProNew());
		
	    return "news/edit";
	  }
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	  public String editnews(
			  @RequestParam(value="id", required=false) String newsid,
			  Model  model) {
		System.out.println("��ľ�е�����edit");
	    //model.put("entity", newsService.getNews(newsid));
		Map<String,String> sort=new LinkedHashMap<String,String>();
		sort.put("79", "��������");
		sort.put("80", "��������");
		sort.put("81", "У԰��̬");
		sort.put("82", "ͼ������");		
		model.addAttribute("sortlist", sort);
		//model.addAttribute(new ProNew());
		ProNew news = (newsid == null ? new ProNew() : newsService.getNews(newsid));
		model.addAttribute("ProNew",news);
	    return "news/edit";
	  }
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	  public String deletenews(
			  @RequestParam(value="id", required=true) String newsid,
			  Model  model) {
		//ɾ������
		newsService.deleteNews(newsid);
		return "redirect:list";
		
		
	}
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	  public String editnewspost(@RequestParam(value="id", required=false) String newsid,
			  @ModelAttribute("ProNew") @Valid ProNew news,BindingResult result, Model model) {
		System.out.println("���ձ��1��"+newsid);
		System.out.println("���ű�ţ�"+news.getNewsID());
		news.setNewsID(Integer.parseInt(newsid));
		System.out.println("�󶨺�����ű�ţ�"+news.getNewsID());
//		System.out.println(news.getNews_Title());
//		System.out.println(news.getNews_From());
//		System.out.println(news.getNews_NesortID());
//		System.out.println(news.getNews_Content());
//		System.out.println(news.getNews_Summery());
//		System.out.println(news.getNews_Keywords());
		if(result.hasErrors()) {
			Map<String,String> sort=new LinkedHashMap<String,String>();
			sort.put("79", "��������");
			sort.put("80", "��������");
			sort.put("81", "У԰��̬");
			sort.put("82", "ͼ������");		
			model.addAttribute("sortlist", sort);
			//@ModelAttribute("ProNew") @Valid ProNew news
			return "news/edit";
		
		}
		
			newsService.updateNews(news);
		    
	    return "redirect:list";
	
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	  public String addnewspost(@ModelAttribute("ProNew") @Valid ProNew news,BindingResult result, Model model) throws BindException{
		System.out.println("��ľ�е�����addnewspost");
		
		if(news.getNews_Hits()==null)
		{
			news.setNews_Hits(0);			
		}
		if(news.getNews_UpdateTime()==null)
		{
			//Date date = new Date();
			 // System.out.println(date);
			  //SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			 // System.out.println(df.format(date));			
			//Timestamp d = new Timestamp(System.currentTimeMillis());
			Date date = new Date();      
			Timestamp nousedate = new Timestamp(date.getTime());
			news.setNews_UpdateTime(nousedate);
		}
		if(news.getNews_Tempint()==null)
		{
			news.setNews_Tempint(0);
		}
		System.out.println("���"+news.getNews_NesortID());
//		System.out.println(news.getNews_Title());
//		System.out.println(news.getNews_From());
//		System.out.println(news.getNews_NesortID());
//		System.out.println(news.getNews_Content());
//		System.out.println(news.getNews_Summery());
//		System.out.println(news.getNews_Keywords());		
		if(result.hasErrors()) {
			//result.getAllErrors();
			//result.getModel();
			//ObjectError oe;
//			if(news.getNews_Summery()=="aa")
//			{
//				result.rejectValue("News_Summery", "���û����ѱ�ע��");
//			}
			
			
		      //throw new BindException(result);
			
			//Map<String,Object> model = result.getModel();
			//model.putAll(result.getModel());
//			model.addAllAttributes(result.getModel());
//			Iterator iter = result.getModel().entrySet().iterator();  
//			while (iter.hasNext()) {  
//			Map.Entry entry = (Map.Entry) iter.next(); 
//			Object key = entry.getKey();  
//			System.out.println("����"+key);
//			Object val = entry.getValue();  
//			System.out.println("ֵ��"+val);
//			}  
			
			
		      //throw new BindException(result);
			
			Map<String,String> sort=new LinkedHashMap<String,String>();
			sort.put("79", "��������");
			sort.put("80", "��������");
			sort.put("81", "У԰��̬");
			sort.put("82", "ͼ������");		
			model.addAttribute("sortlist", sort);
//			//model.addAttribute(new ProNew());
			//result.getModel();
			//model.mergeAttributes(result.getModel());
			
			//result.rejectValue("News_Summery", "11111111tesy validate");
			
			//@ModelAttribute("ProNew") news ��ʾ news �Ѿ��󶨵���ģ������
			//model.addAttribute("ProNew",news);
			
			
//			Set<Entry<String,Object>> entrySet = model.entrySet(); 
//			for (Entry<String, Object> entry : entrySet) { 
//			String k=	entry.getKey();
//			System.out.println("����"+k);
//			Object o = entry.getValue(); 
//			System.out.println("ֵ��"+o);
//			
//			}
			
			
			
		      return "news/edit";
			
			
		     
		    }
		
			newsService.addNews(news);
		   
	    return "redirect:list";
	  }
	
	
	
//	public ModelAndView detail(HttpServletRequest request,   
//	        HttpServletResponse response) throws Exception{
//		Map model=new HashMap();
//		String newsid=request.getParameter("id");
//		ProNew news=newsService.getNews(newsid);
//		model.put("entity", news);
//		return new ModelAndView("news/detail",model);	
//	}
//	public ModelAndView edit(HttpServletRequest request,   
//	        HttpServletResponse response) throws Exception{
//		Map model=new HashMap();
//		String newsid=request.getParameter("id");
//		ProNew news=new ProNew();//newsService.getNews(newsid);
//		model.put("entity", news);
//		Map sort=new LinkedHashMap();
//		sort.put("1", "��������");
//		sort.put("2", "��������");
//		model.put("sortlist", sort);		
//		return new ModelAndView("news/edit",model);	
//	}
//	public ModelAndView delete(HttpServletRequest request,   
//	        HttpServletResponse response) throws Exception{
//		String newsid=request.getParameter("id");
//		ProNew news=new ProNew();//newsService.getNews(newsid);
//		//newsService.deleteNews(news);
//		return new ModelAndView("redirect:list.html"); 
//	
//	}


}
