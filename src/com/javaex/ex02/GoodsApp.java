package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();  //잘못된 예시
//		Goods cup = new Goods("머그컵", 2000);
//		
//		camera.setName("니콘");
//		camera.setPrice(400000);
//		
//		camera.showinfo();
//		cup.showinfo(); 
	
	Goods camera = new Goods();
	
	camera.setName("니콘");
	camera.setPrice(400000);
	
	Goods cup = new Goods("머그컵", 2000);
	
	camera.showinfo();
	cup.showinfo();
	
	}

}


