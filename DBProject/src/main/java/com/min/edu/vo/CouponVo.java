package com.min.edu.vo;

import java.io.Serializable;

public class CouponVo implements Serializable {
	

	private static final long serialVersionUID = 928782576686618970L;
	private int coupon_id;
	private String coupon_name;
	private int coupon_discount;
	private String coupon_sdate;
	private String coupon_edate;
	
	public CouponVo() {
	}

	public CouponVo(String coupon_name, int coupon_discount, String coupon_sdate, String coupon_edate) {
		super();
//		this.coupon_id = coupon_id;
		this.coupon_name = coupon_name;
		this.coupon_discount = coupon_discount;
		this.coupon_sdate = coupon_sdate;
		this.coupon_edate = coupon_edate;
	}

	public int getCoupon_id() {
		return coupon_id;
	}

	public void setCoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
	}

	public String getCoupon_name() {
		return coupon_name;
	}

	public void setCoupon_name(String coupon_name) {
		this.coupon_name = coupon_name;
	}

	public int getCoupon_discount() {
		return coupon_discount;
	}

	public void setCoupon_discount(int coupon_discount) {
		this.coupon_discount = coupon_discount;
	}

	public String getCoupon_sdate() {
		return coupon_sdate;
	}

	public void setCoupon_sdate(String coupon_sdate) {
		this.coupon_sdate = coupon_sdate;
	}

	public String getCoupon_edate() {
		return coupon_edate;
	}

	public void setCoupon_edate(String coupon_edate) {
		this.coupon_edate = coupon_edate;
	}

	@Override
	public String toString() {
		return "CouponVo [coupon_id=" + coupon_id + ", coupon_name=" + coupon_name + ", coupon_discount="
				+ coupon_discount + ", coupon_sdate=" + coupon_sdate + ", coupon_edate=" + coupon_edate + "]";
	}

	
	
}
