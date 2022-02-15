package com.min.edu.screen;

import java.util.Scanner;

public class WriteBoard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		System.out.println("글 제목을 입력해주세요:");
		input = scan.next();
		System.out.println("글 내용을 입력해주세요:");
		scan.next();
		input = scan.nextLine();
		//TODO 글을 모두 작성하면 내가 쓴 글 보여주면서 페이지로 이동하기 selectKey를 쓰면 됩니당
	}

}
