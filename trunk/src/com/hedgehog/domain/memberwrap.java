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
public class memberwrap implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="��ѡ��ʡ��")
	@NumberFormat(style = Style.NUMBER)
	private Integer wProvince;
	
	
	private Integer wCity;
	
	@Size(min=1, max=100, message="�û�������Ϊ��")
    @Pattern(regexp="^[0-9a-zA-Z]*$",message="�û�������Ϊ��ĸ������")
    private String memberName;
    
    
    @Size(min=1, max=100, message="���벻��Ϊ��")
    private String memberPwd;
    
    @Size(min=1, max=100, message="ȷ�����벻��Ϊ��")
    private String memberconfirmPwd;
    
    
    @Size(min=1, max=100, message="��ʵ��������Ϊ��")
    private String memberRealname;
    
    
    @Size(min=1, max=100, message="��ϵ�绰����Ϊ��")
    private String memberTel;

    private String memberCname;

    private String memberQq;

    @Email(message="�����ʽ����ȷ")
    private String memberEmail;
    
    @Size(min=1, max=50, message="��֤�벻��Ϊ��")
    private String checkcode;
    
    private Integer memberRank;
    
    private Integer membercity;   
    
    
    private Byte memberLock;
    
    private Date memberExpire;
    
    private Integer memberPrank;

	public Integer getMemberPrank() {
		return memberPrank;
	}

	public void setMemberPrank(Integer memberPrank) {
		this.memberPrank = memberPrank;
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

	public String getMemberRealname() {
		return memberRealname;
	}

	public void setMemberRealname(String memberRealname) {
		this.memberRealname = memberRealname;
	}

	public String getMemberTel() {
		return memberTel;
	}

	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}

	public String getMemberCname() {
		return memberCname;
	}

	public void setMemberCname(String memberCname) {
		this.memberCname = memberCname;
	}

	public String getMemberQq() {
		return memberQq;
	}

	public void setMemberQq(String memberQq) {
		this.memberQq = memberQq;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberconfirmPwd() {
		return memberconfirmPwd;
	}

	public void setMemberconfirmPwd(String memberconfirmPwd) {
		this.memberconfirmPwd = memberconfirmPwd;
	}

	public Integer getWProvince() {
		return wProvince;
	}

	public void setWProvince(Integer province) {
		this.wProvince = province;
	}

	public Integer getWCity() {
		return wCity;
	}

	public void setWCity(Integer city) {
		this.wCity = city;
	}

	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	public Integer getMemberRank() {
		return memberRank;
	}

	public void setMemberRank(Integer memberRank) {
		this.memberRank = memberRank;
	}

	public Byte getMemberLock() {
		return memberLock;
	}

	public void setMemberLock(Byte memberLock) {
		this.memberLock = memberLock;
	}

	public Date getMemberExpire() {
		return memberExpire;
	}

	public void setMemberExpire(Date memberExpire) {
		this.memberExpire = memberExpire;
	}

	public Integer getMembercity() {
		return membercity;
	}

	public void setMembercity(Integer membercity) {
		this.membercity = membercity;
	}

}
