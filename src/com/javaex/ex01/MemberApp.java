package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member members = new Member();
		
		members.setName("정우성");
		members.setId("jws");
		members.setPoint(5000);
		
		members.showinfo();
		
		members.setName("유재석");
		members.setId("yjs");
		members.setPoint(3000);
		
		members.showinfo();
		
		members.setName("이효리");
		members.setId("lhr");
		members.setPoint(4000);
		
		members.showinfo();
		
		
	}

}
