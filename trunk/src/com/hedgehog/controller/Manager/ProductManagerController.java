package com.hedgehog.controller.Manager;

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
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.web_product;
import com.hedgehog.domain.web_productclass;
import com.hedgehog.service.WebProductService;

@Controller
@RequestMapping("/Manager/Module/FrameWork/ProjectInfo/BIZ_PRODUCT")
public class ProductManagerController {
	private static final String LOGIN_NAME = "/Manager/login";
	private WebProductService webProductService;	
	@Autowired
	public void setwebProductService(WebProductService webProductService) {
		this.webProductService = webProductService;
	}
	@RequestMapping(value={"/List"},method=GET)
	public String left(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
			ModelMap model) 
	{
		System.out.println("靠 有没有到这里");
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		QueryParam qp=new QueryParam();
		qp.setTableName("web_product");
		qp.setReturnFields(" ProductID,Product_menuID,Product_Class,Product_Name,Product_Type,Product_Market,Product_Promote,Product_updatetime,Product_hits ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		//qp.setWhere(" where Product_menuID="+menuid);
		qp.setOrderfld("ProductID");
		qp.setOrderType(1);
		
		
		model.addAttribute("list_product", this.webProductService.selectWebProductInPager(qp));
		System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		System.out.println("总页数："+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		return "Product/List";		
	}
	@RequestMapping(value={"/List"},method=GET,params="cmd=edit")
	public String userlistF(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int productid,	          
	          ModelMap model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
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
		//modelMap.addAttribute("member", new biz_member());
		//model.addAttribute("prolist", this.provinceService.selectAllRecord());
		
		web_product product=this.webProductService.selectProductByPrimaryKey(productid);		
		
		List<web_productclass> list_productclass=this.webProductService.selectByMenuID(product.getProductMenuid());
		model.addAttribute("nclist", list_productclass);
		model.addAttribute("product", product);
		return "Product/Manager";
	}
	@RequestMapping(value={"/List"},method=POST,params="cmd=edit")
	public String userlistFf(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int productid,
			@ModelAttribute("webproduct") @Valid web_product product,
			BindingResult result,
			HttpServletRequest request,
			HttpServletResponse response,
	          ModelMap model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		web_product product2=this.webProductService.selectProductByPrimaryKey(productid);
		if(result.hasErrors())
		{
			for (ObjectError error : result.getAllErrors()) {
				System.err.println("Error: " + error.getCode() + " - "
						+ error.getDefaultMessage());
			}
			System.out.println("有木有到这里");	
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
			
			
			
			List<web_productclass> list_productclass=this.webProductService.selectByMenuID(product2.getProductMenuid());
			model.addAttribute("nclist", list_productclass);
			return "Product/Manager";
		}
		String username=product2.getMenu().getMember().getMemberName();
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
					List<web_productclass> list_productclass=this.webProductService.selectByMenuID(product2.getProductMenuid());
					model.addAttribute("nclist", list_productclass);
					System.out.println("文件格式不合法");
					return "Product/Manager";
				}
				String ext=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1).toLowerCase();//后缀
				//System.out.println("文件后缀："+ext);
				if(!ext.equalsIgnoreCase("jpg")&&!ext.equalsIgnoreCase("jpeg")&&!ext.equalsIgnoreCase("png"))
				{
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
					List<web_productclass> list_productclass=this.webProductService.selectByMenuID(product2.getProductMenuid());
					model.addAttribute("nclist", list_productclass);
					System.out.println("文件格式不合法");
					return "Product/Manager";
				}
				inputStream = file.getInputStream();
				if (file.getSize() > 500000) {
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
					
					List<web_productclass> list_productclass=this.webProductService.selectByMenuID(product2.getProductMenuid());
					model.addAttribute("nclist", list_productclass);
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
			product.setProductid(productid);
			this.webProductService.updateProductByPrimaryKeySelective(product);	
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		return "redirect:List";// redirect 优先相对路径
	}
	@RequestMapping(value={"/List"},method=GET,params="cmd=del")
	public String userlistyF(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int productid,	          
	          ModelMap model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		this.webProductService.deleteProductByPrimaryKey(productid);
		return "redirect:List";// redirect 优先相对路径
	}
	

}
