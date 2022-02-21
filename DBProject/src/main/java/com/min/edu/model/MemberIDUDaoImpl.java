package com.min.edu.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.vo.MemberVo;

public class MemberIDUDaoImpl implements MemberIDUDao{
	
	private Logger logger = Logger.getLogger(MemberIDUDaoImpl.class);
	private final String NS = "com.min.edu.member.";
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();

	@Override
	public int insert01(MemberVo vo) {
		SqlSession session = manager.openSession(true);
		int row = session.insert(NS+"insertMemberAll",vo);
		return row;
	}
	
	

}
