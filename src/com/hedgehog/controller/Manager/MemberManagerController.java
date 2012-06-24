package com.hedgehog.controller.Manager;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hedgehog.Utils.Security;
import com.hedgehog.controller.RegistrationValidation;
import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_city;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_rank;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.memberwrap;
import com.hedgehog.domain.sys_User;
import com.hedgehog.service.MemberService;
import com.hedgehog.service.ProvinceService;
import com.hedgehog.service.WebsiteService;

@Controller
@RequestMapping("/Manager/Module/FrameWork/ProjectInfo/BIZ_MEMBER")
public class MemberManagerController {
	private static final String LOGIN_NAME = "/Manager/login";
	private MemberService memberService;
	@Inject
	public MemberManagerController(MemberService memberService) {
		
		this.memberService = memberService;
	}
	
	private WebsiteService websiteService;
	
	@Autowired
	public void setWebsiteService(WebsiteService websiteService) {
		this.websiteService = websiteService;
	}
	
	@Autowired
    private ProvinceService provinceService;
    
    public void setProvinceService(ProvinceService provinceService) {
		this.provinceService = provinceService;
	}
    @Autowired
    private RegistrationValidation registrationValidation;

    public void setRegistrationValidation(RegistrationValidation registrationValidation) {
            this.registrationValidation = registrationValidation;
    }
    

	@RequestMapping(value={"/List"},method=GET)
	public String userlist(	
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="page", defaultValue="1") int page,
	          @RequestParam(value="perPage", defaultValue="30") int perPage,
	          ModelMap modelMap) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
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
		
		return "Member/List";
	}
	
	@RequestMapping(value={"/List"},method=GET,params="cmd=edit")
	public String userlistF(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int memberid,	          
	          ModelMap model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		//modelMap.addAttribute("member", new biz_member());
		biz_member member=this.memberService.selectByPrimaryKey(memberid);
		
		memberwrap mwrap= new memberwrap();
		System.out.println("编辑注册会员");
		mwrap.setWProvince(member.getWebsite().getwProvince());//省份
		mwrap.setWCity(member.getWebsite().getwCity());//城市
		mwrap.setMembercity(member.getWebsite().getwCity());//城市
		System.out.println("城市编号"+mwrap.getWCity());
		mwrap.setMemberName(member.getMemberName());//用户名
		mwrap.setMemberPwd(member.getMemberPwd());//密码
		mwrap.setMemberRealname(member.getMemberRealname());//真实姓名
		//mwrap.setMemberTel(member.getMemberTel());//电话
		mwrap.setMemberTel(member.getWebsite().getwTel());//电话
		mwrap.setMemberCname(member.getWebsite().getwComname());//企业名称
		mwrap.setMemberQq(member.getMemberQq());//QQ
		//mwrap.setMemberEmail(member.getMemberEmail());//E-mail
		mwrap.setMemberEmail(member.getWebsite().getwMail());//E-mail
		mwrap.setMemberLock(member.getMemberLock());
		mwrap.setMemberRank(member.getMemberRank());//会员等级 
		mwrap.setMemberPrank(member.getMemberPrank());//会员等级
		//SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		//df.parse(source);
		
		mwrap.setMemberExpire(member.getMemberExpire());//到期时间
		
		mwrap.setCheckcode("8686");//伪代码
		
		
		model.addAttribute("pranklist", this.memberService.selectPrankAllRecord());
		
		model.addAttribute("prolist", this.provinceService.selectAllRecord());
		model.addAttribute("member", mwrap);
		
		return "Member/Manager";
	}
	@RequestMapping(value={"/List"},method=POST,params="cmd=edit")
	public String userlistFf(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@RequestParam(value="id") int memberid,
			@ModelAttribute("member") memberwrap memwrap,
			BindingResult result,
	          ModelMap model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		boolean tag=false;
		if(memwrap.getMemberPwd()=="")
		{
			tag=true;
			biz_member member22=this.memberService.selectByPrimaryKey(memberid);
			memwrap.setMemberPwd(member22.getMemberPwd());			
		}
		
		//registrationValidation.validate(memwrap, result);
		//result.rejectValue("memberCname", "企业名不能为空吧");
		if(result.hasErrors())
		{
			model.addAttribute("pranklist", this.memberService.selectPrankAllRecord());
			//model.addAttribute(arg0, arg1);
			model.addAttribute("prolist", this.provinceService.selectAllRecord());
			//model.addAttribute("citylist",this.cityService.selectAllRecord());
			return "Member/Manager";			
		}
		//编辑用户
		biz_member member=new biz_member();
		member.setMemberName(memwrap.getMemberName());
		//Security.MD5(s);
		if(!tag)
		{
			member.setMemberPwd(Security.MD5(memwrap.getMemberPwd()));
			
		}
		
		
		member.setMemberRealname(memwrap.getMemberRealname());//真实姓名
		member.setMemberQq(memwrap.getMemberQq());//QQ
		
		member.setMemberTel(memwrap.getMemberTel());//电话 转移
		member.setMemberCname(memwrap.getMemberCname());//企业名称 转移		
		member.setMemberEmail(memwrap.getMemberEmail());//E-mail 转移
		//member.setMemberCname(memwrap.getMemberCname());//企业名称 重复
		
		member.setMemberRank(memwrap.getMemberRank());//等级
		member.setMemberLock(memwrap.getMemberLock());
		member.setMemberExpire(memwrap.getMemberExpire());
		member.setMemberPrank(memwrap.getMemberPrank());
		
		biz_rank rank=this.memberService.selectRankByPrimaryKey(memwrap.getMemberRank());
		
		member.setMemberTemplet(rank.getRankDes());//设置在biz_rank表 所能选择的模板分类
		
		member.setMemberLamu(rank.getRankChannel());
		member.setMemberLamucount(rank.getRankChannelcount());
		
		member.setMemberid(memberid);//设置主键
		//member.setMemberAgentname(1);
		//member.setMemberLamucount(10);
		//member.setMemberTplock(Byte.valueOf("1"));
		this.memberService.updateByPrimaryKeySelective(member);
		
		biz_website website=new biz_website();
		website.setwProvince(memwrap.getWProvince());//省份
		//website.setwCity(memwrap.getWCity());
		website.setwCity(memwrap.getMembercity());//城市
		
		website.setwComname(memwrap.getMemberCname());//企业名称
		
		website.setwTel(memwrap.getMemberTel());//电话
		website.setwMail(memwrap.getMemberEmail());//E-mail
		//模板重置 
		website.setwTemplet(rank.getRankTemplet());//默认模板
		website.setwCompany(rank.getRankCompany());//企业等级标志图片
		
		//website.setwTemplet("1");
		//website.setwComname(memwrap.getMemberCname());//企业名称 重复
		
		website.setWebsiteid(this.memberService.selectByPrimaryKey(memberid).getWebsite().getWebsiteid());//查询根据id查询member的website属性
		this.websiteService.updateByPrimaryKeySelective(website);
		
		
		return "redirect:List";
	}
	
	@RequestMapping(value={"/List"},method=GET,params="cmd=new")
	public String userlistFfg(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
	          ModelMap model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		//modelMap.addAttribute("member", new biz_member());
		//biz_member member=this.memberService.selectByPrimaryKey(memberid);
		
		memberwrap mwrap= new memberwrap();
		
		
//		mwrap.setWProvince(member.getWebsite().getwProvince());
//		mwrap.setWCity(member.getWebsite().getwCity());
//		mwrap.setMemberName(member.getMemberName());
//		mwrap.setMemberPwd(member.getMemberPwd());
//		mwrap.setMemberRealname(member.getMemberRealname());
//		mwrap.setMemberTel(member.getMemberTel());
//		mwrap.setMemberCname(member.getWebsite().getwComname());//企业名称
//		mwrap.setMemberQq(member.getMemberQq());
//		mwrap.setMemberEmail(member.getMemberEmail());
//		mwrap.setMemberLock(member.getMemberLock());
//		mwrap.setMemberRank(member.getMemberRank());
//		mwrap.setMemberExpire(member.getMemberExpire());
		
		mwrap.setCheckcode("8686");//伪代码
		
		model.addAttribute("pranklist", this.memberService.selectPrankAllRecord());
		model.addAttribute("prolist", this.provinceService.selectAllRecord());
		model.addAttribute("member", mwrap);
		
		return "Member/Manager";
	}
	
	@RequestMapping(value={"/List"},method=POST,params="cmd=new")
	public String userlistFffh(
			@CookieValue(value="sysuser",defaultValue="") String cookieuserName,
			@ModelAttribute("member") memberwrap memwrap,
			BindingResult result,
	          ModelMap model) 
	{
		if(!StringUtils.hasLength(cookieuserName))
		{
			return "redirect:"+LOGIN_NAME;
		}
		//registrationValidation.validate(memwrap, result);
		//result.rejectValue("memberCname", "企业名不能为空吧");
		if(memwrap.getMemberName()!="")
		{
			if(this.memberService.isExist(memwrap.getMemberName()))
			{
				result.rejectValue("memberName", "error.memberName.repeat","该用户已注册");			
			}
			
		}
		if(result.hasErrors())
		{
			model.addAttribute("pranklist", this.memberService.selectPrankAllRecord());
			//model.addAttribute(arg0, arg1);
			model.addAttribute("prolist", this.provinceService.selectAllRecord());
			//model.addAttribute("citylist",this.cityService.selectAllRecord());
			return "Member/Manager";			
		}
		//编辑用户
		biz_member member=new biz_member();
		member.setMemberName(memwrap.getMemberName());//用户名
		//Security.MD5(s);
		member.setMemberPwd(Security.MD5(memwrap.getMemberPwd()));//密码
		
		member.setMemberRealname(memwrap.getMemberRealname());//真实姓名
		member.setMemberQq(memwrap.getMemberQq());//QQ
		
		member.setMemberTel(memwrap.getMemberTel());//电话 转移
		member.setMemberCname(memwrap.getMemberCname());//企业名称 转移		
		member.setMemberEmail(memwrap.getMemberEmail());//E-mail 转移
		//member.setMemberCname(memwrap.getMemberCname());//企业名称 重复
		
		member.setMemberRank(memwrap.getMemberRank());
		member.setMemberPrank(memwrap.getMemberPrank());
		//所能选择的模板分类 所能选择的栏目 栏目个数||默认模板 默认企业标志图片
		biz_rank rank=this.memberService.selectRankByPrimaryKey(memwrap.getMemberRank());
		member.setMemberTemplet(rank.getRankDes());//设置在biz_rank表 所能选择的模板分类
		member.setMemberLamu(rank.getRankChannel());
		member.setMemberLamucount(rank.getRankChannelcount());
		
		
		member.setMemberLock(memwrap.getMemberLock());
		
		
		member.setMemberExpire(memwrap.getMemberExpire());
		
		//member.setMemberid(memberid);
		//member.setMemberAgentname(1);
		//member.setMemberLamucount(10);
		//member.setMemberTplock(Byte.valueOf("1"));
		
		
		biz_website website=new biz_website();
		website.setwProvince(memwrap.getWProvince());//省份
		//website.setwCity(memwrap.getWCity());
		website.setwCity(memwrap.getMembercity());//城市
		
		website.setwComname(memwrap.getMemberCname());//企业名称
		website.setwTel(memwrap.getMemberTel());//电话
		website.setwMail(memwrap.getMemberEmail());//E-mail
		
		website.setwTemplet(rank.getRankTemplet());//默认模板
		website.setwCompany(rank.getRankCompany());//企业等级标志图片
		//website.setwTemplet("1");
		//website.setwComname(memwrap.getMemberCname());//企业名称 重复
		
		//website.setWebsiteid(this.memberService.selectByPrimaryKey(memberid).getWebsite().getWebsiteid());//查询根据id查询member的website属性
		//this.websiteService.updateByPrimaryKeySelective(website);
		this.memberService.insertmemberpro(member, website);
		
		return "redirect:List";
	}
	@RequestMapping(value="/getlistByprank", method = RequestMethod.GET)
	@ResponseBody
    public List<biz_rank> getlistBypro(@RequestParam(value="id", required=true) String pid)
	{	
//	  //String returnText="user has registered 中文乱码";	
      List<biz_rank> list=this.memberService.selectRankByParentid(Integer.valueOf(pid));
      
	  return list;	
	}
	
	

}
