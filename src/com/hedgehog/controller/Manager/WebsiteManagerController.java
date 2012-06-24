package com.hedgehog.controller.Manager;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.LinkedHashMap;
import java.util.Map;

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

import com.hedgehog.Utils.Security;
import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.memberwrap;
import com.hedgehog.service.ProvinceService;
import com.hedgehog.service.WebsiteService;

@Controller
@RequestMapping("/Manager/Module/FrameWork/ProjectInfo/BIZ_WEBSITE")
public class WebsiteManagerController {
	private static final String LOGIN_NAME = "/Manager/login";
	private WebsiteService websiteService;
	@Autowired
	public void setWebsiteService(WebsiteService websiteService) {
		this.websiteService = websiteService;
	}
	private ProvinceService provinceService;
    @Autowired
    public void setProvinceService(ProvinceService provinceService) {
		this.provinceService = provinceService;
	}
	@RequestMapping(value={"/List"},method=GET)
	public String userlist(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
	          ModelMap model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_website");
		qp.setReturnFields(" websiteID,w_memberID,w_BComType,w_city,w_Address,w_tel,w_province,w_ComName ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where 1=1 ");
		//qp.setWhere(" where w_memberID in (select memberID from biz_member where member_Rank=2)");//商务通加强版
		qp.setOrderfld("websiteID");
		qp.setOrderType(1);	
		model.addAttribute("tradelist", this.websiteService.selectRecordInPager(qp));
		//System.out.println("总记录数："+ (Integer)qp.getRecordCount());
		//System.out.println("总页数："+ (Integer)qp.getPageCount());
		model.addAttribute("queryParam", qp);
		
		return "website/List";
	}
	
	@RequestMapping(value={"/List"},method=GET,params="cmd=edit")
	public String userlistF(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int websiteid,	          
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
		model.addAttribute("prolist", this.provinceService.selectAllRecord());
		model.addAttribute("website", this.websiteService.selectByPrimaryKey(websiteid));
		
		return "website/Manager";
	}
	@RequestMapping(value={"/List"},method=POST,params="cmd=edit")
	public String userlistFf(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int websiteid,
			@ModelAttribute("website") @Valid biz_website website,
			BindingResult result,
	          ModelMap model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
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
			model.addAttribute("prolist", this.provinceService.selectAllRecord());			
			return "website/Manager";
		}
		website.setWebsiteid(websiteid);
		this.websiteService.updateByPrimaryKeySelective(website);
		return "redirect:List";//优先相对路径
	}
	

}
