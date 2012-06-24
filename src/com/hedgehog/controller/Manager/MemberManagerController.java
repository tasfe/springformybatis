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
		//�û��б�
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
		System.out.println("�༭ע���Ա");
		mwrap.setWProvince(member.getWebsite().getwProvince());//ʡ��
		mwrap.setWCity(member.getWebsite().getwCity());//����
		mwrap.setMembercity(member.getWebsite().getwCity());//����
		System.out.println("���б��"+mwrap.getWCity());
		mwrap.setMemberName(member.getMemberName());//�û���
		mwrap.setMemberPwd(member.getMemberPwd());//����
		mwrap.setMemberRealname(member.getMemberRealname());//��ʵ����
		//mwrap.setMemberTel(member.getMemberTel());//�绰
		mwrap.setMemberTel(member.getWebsite().getwTel());//�绰
		mwrap.setMemberCname(member.getWebsite().getwComname());//��ҵ����
		mwrap.setMemberQq(member.getMemberQq());//QQ
		//mwrap.setMemberEmail(member.getMemberEmail());//E-mail
		mwrap.setMemberEmail(member.getWebsite().getwMail());//E-mail
		mwrap.setMemberLock(member.getMemberLock());
		mwrap.setMemberRank(member.getMemberRank());//��Ա�ȼ� 
		mwrap.setMemberPrank(member.getMemberPrank());//��Ա�ȼ�
		//SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		//df.parse(source);
		
		mwrap.setMemberExpire(member.getMemberExpire());//����ʱ��
		
		mwrap.setCheckcode("8686");//α����
		
		
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
		//result.rejectValue("memberCname", "��ҵ������Ϊ�հ�");
		if(result.hasErrors())
		{
			model.addAttribute("pranklist", this.memberService.selectPrankAllRecord());
			//model.addAttribute(arg0, arg1);
			model.addAttribute("prolist", this.provinceService.selectAllRecord());
			//model.addAttribute("citylist",this.cityService.selectAllRecord());
			return "Member/Manager";			
		}
		//�༭�û�
		biz_member member=new biz_member();
		member.setMemberName(memwrap.getMemberName());
		//Security.MD5(s);
		if(!tag)
		{
			member.setMemberPwd(Security.MD5(memwrap.getMemberPwd()));
			
		}
		
		
		member.setMemberRealname(memwrap.getMemberRealname());//��ʵ����
		member.setMemberQq(memwrap.getMemberQq());//QQ
		
		member.setMemberTel(memwrap.getMemberTel());//�绰 ת��
		member.setMemberCname(memwrap.getMemberCname());//��ҵ���� ת��		
		member.setMemberEmail(memwrap.getMemberEmail());//E-mail ת��
		//member.setMemberCname(memwrap.getMemberCname());//��ҵ���� �ظ�
		
		member.setMemberRank(memwrap.getMemberRank());//�ȼ�
		member.setMemberLock(memwrap.getMemberLock());
		member.setMemberExpire(memwrap.getMemberExpire());
		member.setMemberPrank(memwrap.getMemberPrank());
		
		biz_rank rank=this.memberService.selectRankByPrimaryKey(memwrap.getMemberRank());
		
		member.setMemberTemplet(rank.getRankDes());//������biz_rank�� ����ѡ���ģ�����
		
		member.setMemberLamu(rank.getRankChannel());
		member.setMemberLamucount(rank.getRankChannelcount());
		
		member.setMemberid(memberid);//��������
		//member.setMemberAgentname(1);
		//member.setMemberLamucount(10);
		//member.setMemberTplock(Byte.valueOf("1"));
		this.memberService.updateByPrimaryKeySelective(member);
		
		biz_website website=new biz_website();
		website.setwProvince(memwrap.getWProvince());//ʡ��
		//website.setwCity(memwrap.getWCity());
		website.setwCity(memwrap.getMembercity());//����
		
		website.setwComname(memwrap.getMemberCname());//��ҵ����
		
		website.setwTel(memwrap.getMemberTel());//�绰
		website.setwMail(memwrap.getMemberEmail());//E-mail
		//ģ������ 
		website.setwTemplet(rank.getRankTemplet());//Ĭ��ģ��
		website.setwCompany(rank.getRankCompany());//��ҵ�ȼ���־ͼƬ
		
		//website.setwTemplet("1");
		//website.setwComname(memwrap.getMemberCname());//��ҵ���� �ظ�
		
		website.setWebsiteid(this.memberService.selectByPrimaryKey(memberid).getWebsite().getWebsiteid());//��ѯ����id��ѯmember��website����
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
//		mwrap.setMemberCname(member.getWebsite().getwComname());//��ҵ����
//		mwrap.setMemberQq(member.getMemberQq());
//		mwrap.setMemberEmail(member.getMemberEmail());
//		mwrap.setMemberLock(member.getMemberLock());
//		mwrap.setMemberRank(member.getMemberRank());
//		mwrap.setMemberExpire(member.getMemberExpire());
		
		mwrap.setCheckcode("8686");//α����
		
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
		//result.rejectValue("memberCname", "��ҵ������Ϊ�հ�");
		if(memwrap.getMemberName()!="")
		{
			if(this.memberService.isExist(memwrap.getMemberName()))
			{
				result.rejectValue("memberName", "error.memberName.repeat","���û���ע��");			
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
		//�༭�û�
		biz_member member=new biz_member();
		member.setMemberName(memwrap.getMemberName());//�û���
		//Security.MD5(s);
		member.setMemberPwd(Security.MD5(memwrap.getMemberPwd()));//����
		
		member.setMemberRealname(memwrap.getMemberRealname());//��ʵ����
		member.setMemberQq(memwrap.getMemberQq());//QQ
		
		member.setMemberTel(memwrap.getMemberTel());//�绰 ת��
		member.setMemberCname(memwrap.getMemberCname());//��ҵ���� ת��		
		member.setMemberEmail(memwrap.getMemberEmail());//E-mail ת��
		//member.setMemberCname(memwrap.getMemberCname());//��ҵ���� �ظ�
		
		member.setMemberRank(memwrap.getMemberRank());
		member.setMemberPrank(memwrap.getMemberPrank());
		//����ѡ���ģ����� ����ѡ�����Ŀ ��Ŀ����||Ĭ��ģ�� Ĭ����ҵ��־ͼƬ
		biz_rank rank=this.memberService.selectRankByPrimaryKey(memwrap.getMemberRank());
		member.setMemberTemplet(rank.getRankDes());//������biz_rank�� ����ѡ���ģ�����
		member.setMemberLamu(rank.getRankChannel());
		member.setMemberLamucount(rank.getRankChannelcount());
		
		
		member.setMemberLock(memwrap.getMemberLock());
		
		
		member.setMemberExpire(memwrap.getMemberExpire());
		
		//member.setMemberid(memberid);
		//member.setMemberAgentname(1);
		//member.setMemberLamucount(10);
		//member.setMemberTplock(Byte.valueOf("1"));
		
		
		biz_website website=new biz_website();
		website.setwProvince(memwrap.getWProvince());//ʡ��
		//website.setwCity(memwrap.getWCity());
		website.setwCity(memwrap.getMembercity());//����
		
		website.setwComname(memwrap.getMemberCname());//��ҵ����
		website.setwTel(memwrap.getMemberTel());//�绰
		website.setwMail(memwrap.getMemberEmail());//E-mail
		
		website.setwTemplet(rank.getRankTemplet());//Ĭ��ģ��
		website.setwCompany(rank.getRankCompany());//��ҵ�ȼ���־ͼƬ
		//website.setwTemplet("1");
		//website.setwComname(memwrap.getMemberCname());//��ҵ���� �ظ�
		
		//website.setWebsiteid(this.memberService.selectByPrimaryKey(memberid).getWebsite().getWebsiteid());//��ѯ����id��ѯmember��website����
		//this.websiteService.updateByPrimaryKeySelective(website);
		this.memberService.insertmemberpro(member, website);
		
		return "redirect:List";
	}
	@RequestMapping(value="/getlistByprank", method = RequestMethod.GET)
	@ResponseBody
    public List<biz_rank> getlistBypro(@RequestParam(value="id", required=true) String pid)
	{	
//	  //String returnText="user has registered ��������";	
      List<biz_rank> list=this.memberService.selectRankByParentid(Integer.valueOf(pid));
      
	  return list;	
	}
	
	

}
