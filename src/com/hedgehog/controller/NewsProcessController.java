package com.hedgehog.controller;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.hedgehog.domain.*;
//import com.hedgehog.persistence.NewsDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.ServletRequestUtils;   
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date; 
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder; 
import com.hedgehog.service.NewsService;
import org.springframework.web.bind.ServletRequestUtils;
import java.sql.Timestamp;


public class NewsProcessController extends SimpleFormController{
	
private Logger logger = Logger.getLogger(this.getClass().getName());  
public NewsProcessController(){   
   
    setBindOnNewForm(true);   
}   
 
public ModelAndView onSubmit(Object command, BindException errors) throws Exception { 
	//public void doSubmitAction(Object command) throws Exception { 
		ProNew news = (ProNew)command;
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
		
         //Map model = errors.getModel(); 
		System.out.println(news.getNewsID());
		System.out.println(news.getNews_NesortID());
		System.out.println(news.getNews_Title());
//		System.out.println(news.getNeswFrom());
//		System.out.println(news.getNewsSummery());
//		System.out.println(news.getNewsContent());
//		System.out.println(news.getNewsHits());
//		System.out.println(news.getNewsUpdateTime());
//		System.out.println(news.getNewsKeywords());
//		System.out.println(news.getNewsTempstr());
//		System.out.println(news.getNewsTempint());	
		//newsService.updatenews(news);
		
		System.out.println("控制器：NewsProcessController 调试信息：到了这里--看到修改没有");
		//Map model = new HashMap();
	     //model.put("news", news); 
         return new ModelAndView("redirect:list.html"); 
         
         //User user = (User)command;
         //Map model = new HashMap();
         //model.put("user", user); 
         //return new ModelAndView(getSuccessView(), model); 
    } 
	protected Object formBackingObject(HttpServletRequest request) throws Exception
	{
		System.out.println("formBackingObject方法执行-->01");   

		//String newsid=request.getParameter("id");
		//String newsid = ServletRequestUtils.getStringParameter(request,"id");  
		String newsid =ServletRequestUtils.getStringParameter(request, "id", "0");
		System.out.println("接收参数："+newsid);
		ProNew news;
		if(newsid=="0")
		{
			news=new ProNew();
			return news;			
		}
		
			//String newsid="1";
			//ProNew news=new ProNew();
		 news=new ProNew();//newsService.getNews(newsid);//newsdao.getProNew(newsid);
			//news.setNewsTitle("哈哈 修改后 是什么标题");
		//if(news==null)
		//{
		//	news=new ProNew();
			
		//}
		
		
		return news;
	}
	protected Map referenceData(HttpServletRequest request)throws Exception{ 
		Map sort=new LinkedHashMap();
		sort.put("79", "国内新闻");
		sort.put("80", "国际新闻");
		sort.put("81", "校园动态");
		sort.put("82", "图话教育");		
		return new ModelMap().addObject("sortlist", sort);
	}
	protected void initBinder(HttpServletRequest request,   
	        ServletRequestDataBinder binder)throws Exception{   
	        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");   PropertyEditorSupport
	        //dateFormat.setLenient(false);   
	        //binder.registerCustomEditor(date.class,new CustomDateEditor(dateFormat,true));   
	        //binder.registerCustomEditor(SportType.class,new SportTypeEditor(reservationService)); 
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");   
        //dateFormat.setLenient(false);   
        //binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   
        //System.out.println("initBinder方法执行-->02");   
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");   
        dateFormat.setLenient(false);  
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));  
        
        //DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd"); 
        //CustomDateEditor dateEditor = new CustomDateEditor(fmt, true); 
        //binder.registerCustomEditor(Date.class, dateEditor); 
        //super.initBinder(request, binder); 


	    }   

	//private NewsDao newsdao;
	//public NewsDao getNewsDao() {
	//	return newsdao;
	//}

	//public void setNewsDao(NewsDao newsdao) {
	//	this.newsdao = newsdao;
	//}
	private NewsService newsService;
	public NewsService getNewsService() {
		return newsService;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
}
