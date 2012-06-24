package com.hedgehog.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class memberloginwrap implements Serializable{
	
	@Size(min=1, max=100, message="�û�������Ϊ��")
    @Pattern(regexp="^[0-9a-zA-Z]*$",message="�û�������Ϊ��ĸ������")
    private String memberName;
    
    
    @Size(min=1, max=100, message="���벻��Ϊ��")
    private String memberPwd;
    
    @Size(min=1, max=50, message="��֤�벻��Ϊ��")
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
