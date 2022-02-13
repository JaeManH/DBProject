package com.min.edu.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.vo.BoardVo;

public class IBoardSelectDaoImpl implements IBoardSelectDao {

	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
	
	private final String NS = "com.min.edu.model.IBoardSelectDaoImpl.";
	
	@Override
	public BoardVo selectDetail(Object board_id) {
		SqlSession session = manager.openSession();
		BoardVo vo = session.selectOne(NS+"selectDetail", board_id);
		return vo;
	}
}
