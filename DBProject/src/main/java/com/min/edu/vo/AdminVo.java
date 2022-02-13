package com.min.edu.vo;

import java.io.Serializable;

public class AdminVo implements Serializable{


	private static final long serialVersionUID = -7808780995757628774L;
	private int admin_id;
	private String admin_loginid;
	private String admin_password;
	private String admin_name;
	
	public AdminVo() {
	}

	public AdminVo( String admin_loginid, String admin_password, String admin_name) {
		super();
//		this.admin_id = admin_id;
		this.admin_loginid = admin_loginid;
		this.admin_password = admin_password;
		this.admin_name = admin_name;
	}

	@Override
	public String toString() {
		return "AdminVo [admin_id=" + admin_id + ", admin_loginid=" + admin_loginid + ", admin_password="
				+ admin_password + ", admin_name=" + admin_name + "]";
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_loginid() {
		return admin_loginid;
	}

	public void setAdmin_loginid(String admin_loginid) {
		this.admin_loginid = admin_loginid;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
}
