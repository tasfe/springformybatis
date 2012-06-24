package com.hedgehog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.hedgehog.domain.memberwrap;
import com.hedgehog.service.MemberService;

@Component("registrationValidator")
public class RegistrationValidation {
	
	private MemberService memberService;
	@Autowired
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public boolean supports(Class<?> klass) {
	    return memberwrap.class.isAssignableFrom(klass);
	  }
	public void validate(Object target, Errors errors) {
		memberwrap member = (memberwrap)target;
		
		if(!(member.getMemberPwd()).equals(member.getMemberconfirmPwd()))
		{
			 errors.rejectValue("memberconfirmPwd","matchingPassword.registration.memberconfirmPwd","确认密码与密码不一致");			
		}
		if(member.getMemberName()!="")
		{
			if(this.memberService.isExist(member.getMemberName()))
			{
				errors.rejectValue("memberName", "error.memberName.repeat","该用户已注册");			
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
