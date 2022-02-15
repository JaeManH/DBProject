package com.min.edu.screen;

import java.util.Scanner;

public class ShowBoard {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.println("\t번호\t제목\t작성자\t등록날짜\t\t\t\t");
		//TODO 게시판 리스트 뿌리기 최신순으로 5개 뿌리기
		
		System.out.println("\t8.내가쓴글\t9.글작성\t0.뒤로가기");
		input = scan.nextInt();
		if(input==9) {
			//글 작성하는 곳으로 
		}
		//입력받은 값의 게시판 글 보여주기 
		
	}
}
