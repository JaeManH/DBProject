package com.min.edu.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.vo.CouponVo;

public class CouponIDUDaoImpl implements CouponIDUDao {
	
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
	private final String NS = "com.min.edu.coupon.";

	@Override
	public int insert01(CouponVo vo) {
		SqlSession session = manager.openSession();
		int row = session.insert(NS+"insertCouponAll",vo);
		return row;
	}

	@Override
	public List<CouponVo> getCouponinfo() {
		SqlSession session = manager.openSession();
		return session.selectList(NS+"getCouponinfo");
	}

	@Override
	public int delCoupon(int coupon_id) {
		SqlSession session = manager.openSession(true);
		return session.delete(NS+"delCoupon" ,coupon_id);
	}

//	@Override
//	public int getCoupon(int coupon_id) {
//		SqlSession session = manager.openSession();
//		int coupon = session.selectOne(NS+"getCoupon" , coupon_id);
//		return coupon;
//	}

	
	
}
