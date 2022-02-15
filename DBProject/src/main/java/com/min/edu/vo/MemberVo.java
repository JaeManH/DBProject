package com.min.edu.vo;

import java.io.Serializable;

public class MemberVo implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 5790958869964253865L;
//	MEMBER_ID, 
//	MEMBER_LOGINID, 
//	MEMBER_PASSWORD, 
//	MEMBER_NAME, 
//	MEMBER_NICKNAME, 
//	MEMBER_PHONENUMBER, 
//	MEMBER_BIRTH, 
//	MEMBER_REGDATE, 
//	MEMBER_DEL, 
//	MEMBER_ADDRESS, 
//	MEMBER_EMAIL
	private int member_id;
	private String member_loginId;
	private String member_password;
	private String member_name;
	private String member_nickName;
	private String member_phoneNumber;
	private String member_birth;
	private String member_regdate;
	private String member_del;
	private String member_address;
	private String member_email;
	
	public MemberVo() {

	}

	public MemberVo(int member_id, String member_loginId, String member_password, String member_name,
			String member_ninkName, String member_phoneNumber, String member_birth, String member_regdate,
			String member_del, String member_address, String member_email) {
		super();
		this.member_id = member_id;
		this.member_loginId = member_loginId;
		this.member_password = member_password;
		this.member_name = member_name;
		this.member_nickName = member_ninkName;
		this.member_phoneNumber = member_phoneNumber;
		this.member_birth = member_birth;
		this.member_regdate = member_regdate;
		this.member_del = member_del;
		this.member_address = member_address;
		this.member_email = member_email;
	}

	@Override
	public String toString() {
		return "MemberVo [member_id=" + member_id + ", member_loginId=" + member_loginId + ", member_password="
				+ member_password + ", member_name=" + member_name + ", member_ninkName=" + member_nickName
				+ ", member_phoneNumber=" + member_phoneNumber + ", member_birth=" + member_birth + ", member_regdate="
				+ member_regdate + ", member_del=" + member_del + ", member_address=" + member_address
				+ ", member_email=" + member_email + "]";
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getMember_loginId() {
		return member_loginId;
	}

	public void setMember_loginId(String member_loginId) {
		this.member_loginId = member_loginId;
	}

	public String getMember_password() {
		return member_password;
	}

	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_nickName() {
		return member_nickName;
	}

	public void setMember_ninkName(String member_ninkName) {
		this.member_nickName = member_ninkName;
	}

	public String getMember_phoneNumber() {
		return member_phoneNumber;
	}

	public void setMember_phoneNumber(String member_phoneNumber) {
		this.member_phoneNumber = member_phoneNumber;
	}

	public String getMember_birth() {
		return member_birth;
	}

	public void setMember_birth(String member_birth) {
		this.member_birth = member_birth;
	}

	public String getMember_regdate() {
		return member_regdate;
	}

	public void setMember_regdate(String member_regdate) {
		this.member_regdate = member_regdate;
	}

	public String getMember_del() {
		return member_del;
	}

	public void setMember_del(String member_del) {
		this.member_del = member_del;
	}

	public String getMember_address() {
		return member_address;
	}

	public void setMember_address(String member_address) {
		this.member_address = member_address;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	
	
	
}
