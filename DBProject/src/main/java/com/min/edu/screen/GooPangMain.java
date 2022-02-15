package com.min.edu.screen;

import java.util.Scanner;

public class GooPangMain {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│□□□□□□□□□□□□□□□□□□□□□□□□□□□■□□□□□│");
		System.out.println("│□□□□□□□□□■■■■□□□□□□■■■■■■■□■□□□□□│");
		System.out.println("│□□□□□□□□□□□□■□□□□□□□□■□■□□□■■■□□□│");
		System.out.println("│□□□□□□□□□□□□■□□□□□□□□■□■□□□■□□□□□│");
		System.out.println("│□□□□□□□□■■■■■■■■□□□■■■■■■■□■□□□□□│");
		System.out.println("│□□□□□□□□□□□□■□□□□□□□□□□□□□□■□□□□□│");
		System.out.println("│□□□□□□□□□□□□■□□□□□□□□□□■■□□□□□□□□│");
		System.out.println("│□□□□□□□□□□□□■□□□□□□□□□■□□■□□□□□□□│");
		System.out.println("│□□□□□□□□□□□□□□□□□□□□□□□■■□□□□□□□□│");
		System.out.println("└─────────────────────────────────┘");
		System.out.println("1.로그인\t2.회원가입\t3.아이디찾기\t4.비밀번호찾기\t5.관리자로그인\t0.종료");
		input = scan.next();
		//TODO 로그인 화면 만들기
		if(input.equals("1")) {
			//로그인 띄우기
		}else if(input.equals("2")) {
			//회원가입 띄우기 
		}else if(input.equals("3")) {
			//아이디찾기
		}else if(input.equals("4")) {
			//비밀번호찾기
		}else if(input.equals("5")) {
			//관리자로그인 admin테이블에서 값 비교하기 
		}else if(input.equals("0")) {
			//종료
		}else {
			//예외처리 
		}
	}
	


	
	
	
	
	
	
	

}
