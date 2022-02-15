package com.min.edu.DBProject;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.min.edu.db.SqlSessionFactoryManager;
import com.min.edu.model.IMemberSelectDao;
import com.min.edu.model.MemberSelectDaoImpl;
import com.min.edu.vo.MemberVo;

public class MemberTest {

	SqlSession session;
	IMemberSelectDao dao = new MemberSelectDaoImpl();

	
	// 회원 정보 수정시 회원 정보 불러오기
//	@Test
	public void selectMember_update() {
		MemberVo vo = dao.selectMember_update(1);
		System.out.println("name: " + vo.getMember_name());
		System.out.println("nickName: " + vo.getMember_nickName());
		System.out.println("phoneNumber: " + vo.getMember_phoneNumber());
		System.out.println("birth: " + vo.getMember_birth());
		System.out.println("regdate: " + vo.getMember_regdate());
		System.out.println("address: " + vo.getMember_address());
		System.out.println("email: " + vo.getMember_email());
	}
	
	// 로그인시 아이디와 비밀번호를 입력해서 정보와 일치하면 로그인
	@Test
	public void chkId() {
		Scanner scan = new Scanner(System.in);
		
		String id = scan.next();
		
		MemberVo vo = new MemberVo(0, id, null, null, null, null, null, null, null, null, null);
		System.out.println("id : "+ vo.getMember_loginId());
	}
	
//	@Test
	public void chkPwd() {
		Scanner scan = new Scanner(System.in);
		
		String pwd = scan.next();
		MemberVo vo = new MemberVo(0, null, pwd, null, null, null, null, null, null, null, null);
		System.out.println("pwd: " + vo.getMember_password());
		System.out.println(vo);
	}
	
	public void signIn1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요");
		String logId = scan.next();
		
		System.out.println("비밀번호를 입력해주세요");
		String pwd = scan.next();
		
		
		MemberVo vo = new MemberVo(0, logId, pwd, null, null, null, null, null, null, null, null);
				
		if(logId == null && pwd == null) {
			System.out.println("아이디를 다시 입력해주세요");
			vo.setMember_loginId(logId);
			System.out.println("비밀번호를 다시 입력해주세요");
			vo.setMember_password(pwd);
		}else {
			
		}
	}
	
	@Test
	public void signIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String logId = scan.next();
		System.out.println("비밀번호를 입력해주세요");
		String pwd = scan.next();
		
		
		
		if(dao.chkLogId(logId) == null && dao.chkPwd(pwd) == null) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
		}
		
	}
	
	
	
}
