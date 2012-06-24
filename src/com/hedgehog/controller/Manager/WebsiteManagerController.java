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
		//qp.setWhere(" where w_memberID in (select memberID from biz_member where member_Rank=2)");//����ͨ��ǿ��
		qp.setOrderfld("websiteID");
		qp.setOrderType(1);	
		model.addAttribute("tradelist", this.websiteService.selectRecordInPager(qp));
		//System.out.println("�ܼ�¼����"+ (Integer)qp.getRecordCount());
		//System.out.println("��ҳ����"+ (Integer)qp.getPageCount());
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
			System.out.println("��ľ�е�����");	
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
			model.addAttribute("prolist", this.provinceService.selectAllRecord());			
			return "website/Manager";
		}
		website.setWebsiteid(websiteid);
		this.websiteService.updateByPrimaryKeySelective(website);
		return "redirect:List";//�������·��
	}
	

}
