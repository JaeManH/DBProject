package com.min.edu.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.vo.AdminVo;

public class AdminIDUDaoImpl implements AdminIDUDao {
	
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
	private final String NS = "com.min.edu.admin.";

	@Override
	public int insert01(AdminVo vo) {
		SqlSession session = manager.openSession();
		int row = session.insert(NS+"insertAdminAll", vo);
		return row;
	}

	 
}
