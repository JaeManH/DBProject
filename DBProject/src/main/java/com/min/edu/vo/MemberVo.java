package com.min.edu.vo;

import java.io.Serializable;

public class MemberVo implements Serializable{

	private static final long serialVersionUID = -1827148254100939227L;

	private int member_id;
	private String member_loginid;
	private String member_password;
	private String member_name;
	private String member_nickname;
	private String member_phonenumber;
	private String member_birth;
	private String member_regdate;
	private String member_del;
	private String member_address;
	private String member_email;
	
	public MemberVo() {
	}

	public MemberVo( String member_loginid, String member_password, String member_name,
			String member_nickname, String member_phonenumber, String member_birth,
			String member_del, String member_address, String member_email) {
		super();
		this.member_loginid = member_loginid;
		this.member_password = member_password;
		this.member_name = member_name;
		this.member_nickname = member_nickname;
		this.member_phonenumber = member_phonenumber;
		this.member_birth = member_birth;
		this.member_del = member_del;
		this.member_address = member_address;
		this.member_email = member_email;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getMember_loginid() {
		return member_loginid;
	}

	public void setMember_loginid(String member_loginid) {
		this.member_loginid = member_loginid;
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

	public String getMember_nickname() {
		return member_nickname;
	}

	public void setMember_nickname(String member_nickname) {
		this.member_nickname = member_nickname;
	}

	public String getMember_phonenumber() {
		return member_phonenumber;
	}

	public void setMember_phonenumber(String member_phonenumber) {
		this.member_phonenumber = member_phonenumber;
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

	@Override
	public String toString() {
		return "MemberVo [member_id=" + member_id + ", member_loginid=" + member_loginid + ", member_password="
				+ member_password + ", member_name=" + member_name + ", member_nickname=" + member_nickname
				+ ", member_phonenumber=" + member_phonenumber + ", member_birth=" + member_birth + ", member_regdate="
				+ member_regdate + ", member_del=" + member_del + ", member_address=" + member_address
				+ ", member_email=" + member_email + "]";
	}


	
}
