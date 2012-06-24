package com.hedgehog.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
public class memberpwdwrap implements Serializable{
	

    private String memberName;
    
    
    @Size(min=1, max=100, message="密码不能为空")
    private String memberPwd;
    @Size(min=1, max=100, message="新密码不能为空")
    private String memberNewPwd;
    
    @Size(min=1, max=100, message="确认新密码不能为空")
    private String memberconfirmNewPwd;

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

	public String getMemberNewPwd() {
		return memberNewPwd;
	}

	public void setMemberNewPwd(String memberNewPwd) {
		this.memberNewPwd = memberNewPwd;
	}

	public String getMemberconfirmNewPwd() {
		return memberconfirmNewPwd;
	}

	public void setMemberconfirmNewPwd(String memberconfirmNewPwd) {
		this.memberconfirmNewPwd = memberconfirmNewPwd;
	}
    
    
    

}
