package com.min.edu.DBProject;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.model.IBoardSelectDao;
import com.min.edu.model.IBoardSelectDaoImpl;
import com.min.edu.vo.BoardVo;

public class Board_JunitTest {

	SqlSession session;
	IBoardSelectDao dao = new IBoardSelectDaoImpl();
	
	
	@Before
	public void createSession() {
		SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
		session = manager.openSession();
		assertNotNull(session);
	}
	
//	@Test
//	public void selectDetail() {
//		int it = 1;
//		Object obj = it;
//		BoardVo vo = dao.selectDetail(obj);
//		System.out.println(vo);
//		assertNotNull(obj);
//	}
	
	@Test
	public void selectAll() {
		List<BoardVo> boardAll = session.selectList("com.min.edu.boards.selectBoardAll");
		System.out.println(boardAll);
		assertNotNull(boardAll);
	}

	
}
