package com.javaex.ex06;

	public class CConverter {
    //필드
	
	//생성자
	
	//public CConverter() {}
	
	//메소드 gs
	//rate = 1118.70
	public static double rate;
		
	public static void setRate(double rate){
        CConverter.rate = rate;
        
    }
		
	
	//메소드 일반	
    
    
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }
    

}
