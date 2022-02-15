package com.min.edu.screen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginScreen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.print("아이디를 입력해주세요:");
		input = scan.next();
		map.put("memeber_loginid", input);
		System.out.println("비밀번호를 입력해주세요");
		map.put("memeber_loginid", input);
		input = scan.next();
		//TODO map으로 selectOne 검색하고 만약에 받아온값이 null이면 로그인실패, null이 아니면 값을 받아온거니까 로그인 성공!
		//나중에 loginSession을 만들껀데 그러기위해서 memberVo에 담아두기 
	}
}
