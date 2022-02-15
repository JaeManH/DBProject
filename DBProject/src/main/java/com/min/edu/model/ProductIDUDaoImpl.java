package com.min.edu.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.vo.ProductVo;

public class ProductIDUDaoImpl implements ProductIDUDao {
	
	private final String NS = "com.min.edu.product.";
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
	private Logger logger = Logger.getLogger(this.getClass());
	@Override
	public int productRegistration(ProductVo vo) {
		SqlSession session = manager.openSession(true);
		logger.info("상품 등록 실행");
		int row = session.insert(NS+"productRegistration",vo);
		return row;
	}
	@Override
	public List<ProductVo> showProductList() {
		SqlSession session = manager.openSession();
		logger.info("상품 진열");
		List<ProductVo> lists = session.selectList(NS+"showProductList");
		return lists;
	}

	
	
}
