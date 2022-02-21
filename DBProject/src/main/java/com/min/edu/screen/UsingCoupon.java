package com.min.edu.screen;

import java.util.List;
import java.util.Scanner;

import com.min.edu.model.CouponIDUDao;
import com.min.edu.model.CouponIDUDaoImpl;
import com.min.edu.vo.CouponVo;
import com.min.edu.vo.ProductVo;

public class UsingCoupon {

	public int usingCoupon(int pdPrice) {
		Scanner scan = new Scanner(System.in);
		CouponIDUDao dao = new CouponIDUDaoImpl();
		List<CouponVo> couponLists = dao.getCouponinfo();
		CouponVo cpvo = new CouponVo();
		ProductVo prvo = new ProductVo();
		
		System.out.println("쿠폰을 선택해주세요\n");
		
		int num = 1; 
		for (CouponVo couponVo : couponLists) {
			System.out.print(num+". "+couponVo.getCoupon_name()+"\t");
			num++;
		}
		
		System.out.println("\n");
		
		while (true) {
			int coupon = scan.nextInt();
			if(coupon <= couponLists.size()) {
				cpvo = couponLists.get(coupon-1);
				break;
			}else {
				System.out.println("\n다시 입력해주세요\n");
			}
		}
		
		int price = pdPrice;
		int couponPrice = (int) (price - (price*(cpvo.getCoupon_discount()*0.01)));
		
		System.out.println("\n할인된 가격은 "+couponPrice+"원 입니다.");
		
		dao.delCoupon(cpvo.getCoupon_id());
		return couponPrice;
	}
	
}
