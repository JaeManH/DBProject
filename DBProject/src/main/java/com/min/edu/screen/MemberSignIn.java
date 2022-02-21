package com.min.edu.screen;

import java.util.Scanner;

import com.min.edu.vo.MemberVo;

public class MemberSignIn {

	public static void main(String[] args) {
		MemberVo vo = new MemberVo();
		Scanner scan = new Scanner(System.in);
		String input;
		System.out.println("이름을 입력해주세요");
		input = scan.next();
		vo.setMember_name(input);
		System.out.println("아이디을 입력해주세요");
		input = scan.next();
		vo.setMember_loginId(input);
		System.out.println("비밀번호을 입력해주세요");
		input = scan.next();
		vo.setMember_password(input);
		System.out.println("전화번호을 입력해주세요");
		input = scan.next();
		vo.setMember_phoneNumber(input);
		System.out.println("생년월일을 입력해주세요");
		input = scan.next();
		vo.setMember_birth(input);
		System.out.println("주소을 입력해주세요");
		input = scan.next();
		vo.setMember_address(input);
		System.out.println("닉네임을 입력해주세요");
		input = scan.next();
		vo.setMember_nickName(input);
		System.out.println("이메일을 입력해주세요");
		input = scan.next();
		vo.setMember_email(input);
		//다입력 받으면 vo객체로 넘겨서 insert

	}
}
