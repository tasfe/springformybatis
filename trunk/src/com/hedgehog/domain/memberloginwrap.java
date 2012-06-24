package com.hedgehog.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class memberloginwrap implements Serializable{
	
	@Size(min=1, max=100, message="用户名不能为空")
    @Pattern(regexp="^[0-9a-zA-Z]*$",message="用户名必须为字母或数字")
    private String memberName;
    
    
    @Size(min=1, max=100, message="密码不能为空")
    private String memberPwd;
    
    @Size(min=1, max=50, message="验证码不能为空")
    private String checkcode;
    
    private String authenticate;

	public String getAuthenticate() {
		return authenticate;
	}

	public void setAuthenticate(String authenticate) {
		this.authenticate = authenticate;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

}
