package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.vo.MemberVo;

public class MemberSelectDaoImpl implements IMemberSelectDao{

	private Logger logger = Logger.getLogger(this.getClass());
	private SqlSessionFactory manager = SqlSessionFactoryManager.getFactory();
	private final String NS = "com.min.edu.model.MemberSelectDaoImpl.";
	
	@Override
	public MemberVo selectMember_update(int id) {
		SqlSession session = manager.openSession();
		return session.selectOne(NS+"selectMember_update" , id);
	}

	@Override
	public MemberVo chkLogId(String logId) {
		SqlSession session = manager.openSession();
		return session.selectOne(NS+"chkLogId" ,logId);
	}

	@Override
	public MemberVo chkPwd(String pwd) {
		SqlSession session = manager.openSession();
		return session.selectOne(NS+"chkPwd" ,pwd);
	}

	
	
}
