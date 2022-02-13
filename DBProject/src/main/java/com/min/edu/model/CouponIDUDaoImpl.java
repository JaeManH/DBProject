package com.min.edu.model;

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
	
}
