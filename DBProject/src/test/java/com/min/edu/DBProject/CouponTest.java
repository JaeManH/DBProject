package com.min.edu.DBProject;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import com.min.edu.model.CouponIDUDao;
import com.min.edu.model.CouponIDUDaoImpl;
import com.min.edu.vo.CouponVo;

public class CouponTest {

	
	
//	@Test
	public void showCoupon() {
		CouponIDUDao dao = new CouponIDUDaoImpl();
		List<CouponVo> couponLists = dao.getCouponinfo();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("쿠폰을 선택해주세요\n");
		
		for (int i = 0; i < couponLists.size(); i++) {
			System.out.print((i+1)+". "+couponLists.get(i)+"\t");
		}
		
		
		
	}
	
//	@Test
	public void couponPrice() {
		CouponIDUDao dao = new CouponIDUDaoImpl();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력해주세요");
		int coupon_id = scan.nextInt();
		double price = 36500;
//		double coupon = dao.getCoupon(coupon_id)*0.01;
//		int totalPrice = (int)(price - (price*coupon));
//		
//		System.out.println("할인된 가격은 "+totalPrice+"원 입니다");
		
	}

//	@Test
	public void failCoupon() {
		CouponIDUDao dao = new CouponIDUDaoImpl();
		Scanner scan = new Scanner(System.in);
		
		List<CouponVo> couponLists = dao.getCouponinfo();
		
		
//		System.out.println("1");
		
//		CouponVo couponVo = new CouponVo();
//		
//		System.out.println("쿠폰을 선택해주세요\n");
//		
//		for (int i = 0; i < couponLists.size(); i++) {
//			System.out.print((i+1)+". "+ couponVo.getCoupon_name()+"\t");
//		}
//		
//		System.out.println("\n");		
		
//		while(true) {
//			
//			int num = scan.nextInt();
//			
//			if(couponLists.get(num-1) != null) {
//				System.out.println("쿠폰있음");
//				break;
//			}else if(){
//				System.out.println("다시 입력해주세요\n");
//			}
//			
//		}
		
//		int coupon_id = scan.nextInt();
//		
//		double price = 36500;
//		double coupon = dao.getCoupon(coupon_id)*0.01;
//		int couponPrice = (int)(price - (price*coupon));
//		
//		System.out.println("할인된 가격은 "+couponPrice+"원 입니다");
		
		
	}
	
	@Test
	public void usingCoupon() {
		Scanner scan = new Scanner(System.in);
		
		CouponIDUDao dao = new CouponIDUDaoImpl();
		List<CouponVo> couponLists = dao.getCouponinfo();
		CouponVo cpvo = new CouponVo();
		
//		Iterator<CouponVo> cp = couponLists.iterator();
		
		System.out.println("쿠폰을 선택해주세요\n");
		
		
		int i = 1;
		for (CouponVo couponVo : couponLists) {
			System.out.print(i+". "+couponVo.getCoupon_name()+"\t");
			i++;
		}
		
		System.out.println("\n");
		
		int selCoupon = scan.nextInt();
		cpvo = couponLists.get(selCoupon-1);
		
		int price = 10000;
		int cpPrice = (int)(price - (price*(0.01*cpvo.getCoupon_discount())));
		
		System.out.println("\n할인된 가격은 "+cpPrice+" 입니다.");
		
		dao.delCoupon(cpvo.getCoupon_id());
		
	}
	
//	@Test
	public void delCoupon() {
		Scanner scan = new Scanner(System.in);
		
		CouponIDUDao dao = new CouponIDUDaoImpl();
		List<CouponVo> couponLists = dao.getCouponinfo();
		CouponVo vo = new CouponVo();
		System.out.println("쿠폰을 선택해주세요\n");
		
		
		int i = 1;
		
		for (CouponVo couponVo : couponLists) {
			System.out.print(i+". "+couponVo.getCoupon_name()+"\t");
			i++;
		}
		
		System.out.println("\n");
		
		int selCoupon = scan.nextInt();
		vo = couponLists.remove(selCoupon);
		System.out.println(vo.getCoupon_name());
	}
	
}
