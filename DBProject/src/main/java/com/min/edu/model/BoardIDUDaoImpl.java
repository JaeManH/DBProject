package com.min.edu.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.vo.BoardVo;

public class BoardIDUDaoImpl implements BoardIDUDao {
	
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
	private final String NS ="com.min.edu.board.";
	
	@Override
	public int insert01(BoardVo vo) {
		SqlSession session = manager.openSession();
		int row = session.insert(NS+"insertBoardAll",vo);
		return row;
	}
	
	
	

}
