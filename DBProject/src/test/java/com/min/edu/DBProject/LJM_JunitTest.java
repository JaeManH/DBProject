package com.min.edu.DBProject;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.model.AdminIDUDao;
import com.min.edu.model.AdminIDUDaoImpl;
import com.min.edu.model.BoardIDUDao;
import com.min.edu.model.BoardIDUDaoImpl;
import com.min.edu.model.CouponIDUDao;
import com.min.edu.model.CouponIDUDaoImpl;
import com.min.edu.model.MemberIDUDao;
import com.min.edu.model.MemberIDUDaoImpl;
import com.min.edu.model.ProductIDUDao;
import com.min.edu.model.ProductIDUDaoImpl;
import com.min.edu.model.QnAIDUDao;
import com.min.edu.model.QnAIDUDaoImpl;
import com.min.edu.vo.AdminVo;
import com.min.edu.vo.BoardVo;
import com.min.edu.vo.CouponVo;
import com.min.edu.vo.MemberVo;
import com.min.edu.vo.ProductVo;
import com.min.edu.vo.QnAVo;
import com.min.edu.vo.QnA_CVo;

public class LJM_JunitTest {

//	@Test
	public void test() {
		SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
		SqlSession session = manager.openSession();
		assertNotNull(session);
	}
//	@Test
	public void insertTest() {
		MemberIDUDao dao = new MemberIDUDaoImpl();
		MemberVo vo = new MemberVo("admin","1234","admin","admin", 
				"010-1111-1111", "2022-02-12","N", "GOODEE", 
				"aaa@naver.com");
		int row = dao.insert01(vo);
		assertEquals(row, 1);
	}
	@Test
	public void productInsertTest() {
		ProductIDUDao dao = new ProductIDUDaoImpl();
		ProductVo vo = new ProductVo("상품1", 10000, 100, "1", "N");
		int row = dao.productRegistration(vo);
		assertEquals(row, 1);
	}
	
//	@Test
	public void couponInsertTest() {
		CouponIDUDao dao = new CouponIDUDaoImpl();
		CouponVo vo = new CouponVo("1", 1, "2022-01-01", "2022-01-01");
		int row = dao.insert01(vo);
		assertEquals(row, 1);
	}
	
//	@Test
	public void boardInsertTest() {
		BoardIDUDao dao = new BoardIDUDaoImpl();
		BoardVo vo = new BoardVo("1","1", "1", "2022-01-01");
		int row = dao.insert01(vo);
		assertEquals(row, 1);
	}
//	@Test
	public void qnaInsertTest() {
		QnAIDUDao dao = new QnAIDUDaoImpl();
		QnAVo vo = new QnAVo("제목", "내용", "2022-01-01", 1);
		int row = dao.insert01(vo);
		assertEquals(row, 1);
	}
	@Test
	public void qna_c_InsertTest() {
		QnAIDUDao dao = new QnAIDUDaoImpl();
		QnA_CVo vo = new QnA_CVo("답변입니다");
		int row = dao.qna_c_insert01(vo);
		assertEquals(row, 1);
	}
	
//	@Test
	public void adminInsertTest() {
		AdminIDUDao dao = new AdminIDUDaoImpl();
		AdminVo vo = new AdminVo("admin", "admin", "admin");
		int row = dao.insert01(vo);
		assertEquals(row, 1);
	}
	
	

}
