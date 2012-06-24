package com.hedgehog.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hedgehog.Utils.Security;
import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_city;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.memberloginwrap;
import com.hedgehog.domain.memberwrap;
import com.hedgehog.service.CityService;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.ProvinceService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	private MemberService memberService;
	
	@Autowired
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@RequestMapping(value={"/login"},method=GET)
	public String login(Model model) 
	{
		model.addAttribute("member", new memberloginwrap());
		
		//model.addAttribute("prolist", this.provinceService.selectAllRecord());
		//model.addAttribute("citylist",this.cityService.selectAllRecord());
		
		return "jsp/credit/login";
	}
	
	@RequestMapping(value={"/login"},method=POST)
	public String login2(
			HttpSession session,
			HttpServletResponse response,
			@ModelAttribute("member") @Valid memberloginwrap member,
			BindingResult result,
			Model model) 
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
			return "jsp/credit/login";
			//return "/login";	
		}
		Cookie usernamecookie=new Cookie("userName", member.getMemberName());
		usernamecookie.setMaxAge(1200);
		usernamecookie.setPath("/"+member.getMemberName()+"/manage/");
		response.addCookie(usernamecookie);
		//model.addAttribute("member", new biz_member());
		
		//model.addAttribute("prolist", this.provinceService.selectAllRecord());
		//model.addAttribute("citylist",this.cityService.selectAllRecord());
		model.addAttribute("member", rmember);
		
		return "jsp/credit/loginsuccess";
	}
	
	
	@Autowired
    private RegistrationValidation registrationValidation;

    public void setRegistrationValidation(RegistrationValidation registrationValidation) {
            this.registrationValidation = registrationValidation;
    }
    @Autowired
    private ProvinceService provinceService;
    
    public void setProvinceService(ProvinceService provinceService) {
		this.provinceService = provinceService;
	}
    @Autowired
    private CityService cityService;
    
    public void setCityService(CityService cityService) {
		this.cityService = cityService;
	}
    
	@RequestMapping(value={"/userlist"},method=GET)
	public String userlist(@RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
	          ModelMap modelMap) 
	{
		//modelMap.addAttribute("member", new biz_member());
		//用户列表
		QueryParam qp=new QueryParam();
		qp.setTableName("biz_member");
		qp.setReturnFields(" * ");
		qp.setPageSize(perPage);
		qp.setPageIndex(page);
		qp.setWhere(" where 1=1 ");
		qp.setOrderfld("memberID");
		qp.setOrderType(1);
		modelMap.put("userlist", this.memberService.selectRecordInPager(qp));
		modelMap.put("queryParam", qp);
		
		return "jsp/credit/userlist";
	}
	@RequestMapping(value={"/register"},method=GET)
	public String register(Model model) 
	{
		model.addAttribute("title", "用户注册");
		
		model.addAttribute("member", new memberwrap());
		
		model.addAttribute("prolist", this.provinceService.selectAllRecord());
		//model.addAttribute("citylist",this.cityService.selectAllRecord());
		
		return "credit/register";
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
			return "credit/register";			
		}
		//添加用户
		biz_member member=new biz_member();
		member.setMemberName(memwrap.getMemberName());
		//Security.MD5(s);
		member.setMemberPwd(Security.MD5(memwrap.getMemberPwd()));
		
		member.setMemberRealname(memwrap.getMemberRealname());
		member.setMemberTel(memwrap.getMemberTel());
		member.setMemberCname(memwrap.getMemberCname());
		member.setMemberQq(memwrap.getMemberQq());
		member.setMemberEmail(memwrap.getMemberEmail());
		member.setMemberCname(memwrap.getMemberCname());
		
		member.setMemberRank(0);
		member.setMemberLock(Byte.valueOf("1"));
		member.setMemberAgentname(1);
		member.setMemberLamucount(10);
		member.setMemberTplock(Byte.valueOf("1"));
		
		biz_website website=new biz_website();
		website.setwProvince(memwrap.getWProvince());
		website.setwCity(memwrap.getWCity());
		website.setwComname(memwrap.getMemberCname());
		website.setwTemplet("1");
		website.setwComname(memwrap.getMemberCname());//企业名称
		//website.setwMemberid(111);
		
		//int temp=this.memberService.insertSelective(member);
		//int temp=this.memberService.insert(member);
		int temp=this.memberService.insertmemberpro(member,website);
		System.out.println("id："+member.getMemberid());
		//System.out.println("会员ID33主键："+temp);
		//System.out.println("注册时间22："+member.getMemberRegdate());
		return "redirect:userlist";
	}
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	  public String deletemember(
			  @RequestParam(value="id", required=true) String memberid) {
		//删除处理
		//newsService.deleteNews(newsid);
		int temp=this.memberService.deleteByPrimaryKey(Integer.valueOf(memberid));
		return "redirect:userlist";
	}
	@RequestMapping(value="/getlistBypro", method = RequestMethod.GET)
	@ResponseBody
    public List<biz_city> getlistBypro(@RequestParam(value="id", required=true) String proid)
	{	
//	  //String returnText="user has registered 中文乱码";	
      List<biz_city> list=this.cityService.selectAllRecordBypro(Integer.valueOf(proid));		
	  return list;	
	}

	

}
