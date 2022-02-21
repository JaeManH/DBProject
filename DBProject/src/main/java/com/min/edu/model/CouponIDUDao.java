package com.min.edu.model;

import java.util.List;

import com.min.edu.vo.CouponVo;

public interface CouponIDUDao {
	
	public int insert01(CouponVo vo);
	
	public List<CouponVo> getCouponinfo();
	
	public int delCoupon(int coupon_id);
}
