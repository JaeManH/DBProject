package com.min.edu.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.vo.ProductVo;

public class ProductIDUDaoImpl implements ProductIDUDao {
	
	private final String NS = "com.min.edu.product.";
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
	
	@Override
	public int insert01(ProductVo vo) {
		SqlSession session = manager.openSession();
		int row = session.insert(NS+"insertProductAll",vo);
		return row;
	}

	
	
}
