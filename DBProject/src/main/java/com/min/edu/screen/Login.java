package com.min.edu.screen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.min.edu.model.MemberIDUDao;
import com.min.edu.model.MemberIDUDaoImpl;
import com.min.edu.vo.MemberVo;

public class Login {
	
	public MemberVo login() {
		Scanner scan = new Scanner(System.in);
		String input;
		Map<String, Object> map = new HashMap<String, Object>();
		MemberIDUDao dao = new MemberIDUDaoImpl();
		
		while(true) {
			System.out.print("아이디를 입력해주세요 : ");
			input = scan.next();
			map.put("member_loginId", input);
			System.out.print("비밀번호를 입력해주세요 : ");
			input = scan.next();
			map.put("member_password", input);
			
			MemberVo loginVo = dao.chkLogIdPwd(map);
			
			if(loginVo != null) {
				break;
			}else {
				System.out.println("로그인에 실패했습니다\n");
			}
			
		}
		
		MemberVo oneMemverVo = dao.chkLogIdPwd(map);
		return oneMemverVo;
	}
	
}
