package com.min.edu.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.vo.QnAVo;
import com.min.edu.vo.QnA_CVo;

public class QnAIDUDaoImpl implements QnAIDUDao {
	
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
	private final String NS = "com.min.edu.qna.";

	@Override
	public int insert01(QnAVo vo) {
		SqlSession session = manager.openSession();
		int row = session.insert(NS+"insertQnAAll",vo);
		
		return row;
	}

	@Override
	public int qna_c_insert01(QnA_CVo vo) {
		SqlSession session = manager.openSession();
		int row = session.insert(NS+"insertQnA_C", vo);
		return row;
	}

	
	
}
