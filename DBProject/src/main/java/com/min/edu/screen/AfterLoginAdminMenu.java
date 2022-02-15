package com.min.edu.screen;

import java.util.Scanner;

public class AfterLoginAdminMenu {

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
		System.out.println("1.상품\t2.게시판\t3.상품관리\t0.종료");
		input = scan.next();
		
		if(input.equals("1")) {
			//상품진열 띄우기
		}else if(input.equals("2")) {
			//게시판 띄우기 
		}else if(input.equals("3")) {
			//상품관리 띄우기 
		}else if(input.equals("0")) {
			//종료
		}else {
			//예외처리 
		}
	}

}
