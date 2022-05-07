package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	
    	
    	Scanner sc = new Scanner(System.in);
        System.out.println("친구를 3명 등록해 주세요");
    	//친구정보 3명 입력 로직 --> 반복문 사용
    	Friend[] fArray = new Friend[3];
        for(int i=0; i<fArray.length; i++) {
        	Friend friends = new Friend();
        	
        	System.out.println("이름:");
        	friends.setName(sc.nextLine());
        	
        	System.out.println("핸드폰:");
        	friends.setHp(sc.nextLine());
        	
        	System.out.println("학교:");
        	friends.setSchool(sc.nextLine());
        	fArray[i] = friends;
        	
        }
        
        
        
        sc.close();
    	
    	
    	
    
        // 친구정보 출력
    	for(int i =0; i<fArray.length; i++) {
    		fArray[i].showInfo();
    	}
    
    	
       //친구정보 출력 메소드 호출
    	
        
    }

}
