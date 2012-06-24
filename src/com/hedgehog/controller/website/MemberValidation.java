package com.hedgehog.controller.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.hedgehog.Utils.Security;
import com.hedgehog.domain.memberpwdwrap;
import com.hedgehog.service.MemberService;

@Component("memberValidation")
public class MemberValidation {
	
	private MemberService memberService;
	@Autowired
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public boolean supports(Class<?> klass) {
	    return memberpwdwrap.class.isAssignableFrom(klass);
	  }
	public void validate(Object target, Errors errors) {
		memberpwdwrap member = (memberpwdwrap)target;
		if(member.getMemberPwd()!="")
		{
			if(!((this.memberService.selectByUsername(member.getMemberName()).getMemberPwd()).equals(Security.MD5(member.getMemberPwd()))))
			{
				errors.rejectValue("memberPwd","matchingPassword.registration.memberPwd","旧密码错误");	
			}
			
		}
		
		if(member.getMemberNewPwd()!=""&&member.getMemberconfirmNewPwd()!="")
		{
			if(!(member.getMemberNewPwd()).equals(member.getMemberconfirmNewPwd()))
			{
				 errors.rejectValue("memberNewPwd","matchingPassword.registration.memberconfirmNewsPwd","确认新密码与新密码不一致");			
			}
			
		}
		
		
		
//		HttpSession
//		String code = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);  
		
		//ValidationUtils.rejectIfEmpty(errors, "memberCname", "error.memberCname.required", "企业名不能为空");
		
//	    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName",
//	        "NotEmpty.registration.userName",
//	        "User Name must not be Empty.");
//	    String userName = registration.getUserName();
//	    if ((userName.length()) > 50) {
//	      errors.rejectValue("userName",
//	          "lengthOfUser.registration.userName",
//	          "User Name must not more than 50 characters.");
//	    }
//	    if (!(registration.getPassword()).equals(registration
//	        .getConfirmPassword())) {
//	      errors.rejectValue("password",
//	          "matchingPassword.registration.password",
//	          "Password and Confirm Password Not match.");
//	    }
	  }

}
