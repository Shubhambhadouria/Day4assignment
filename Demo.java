package com.masai;

public class Demo {

	Demo(){
		
		this("a");
		System.out.println("Into the 1st Constructor");
		
	}
	
	Demo(String s){
		this(1);
		System.out.println("Into the 2nd Constructor");
	}
	
	Demo(int i){
		this(10.55f);
		System.out.println("Into the 3rd Constructor");
	}
	
	Demo(float f){
		System.out.println("Into the 4th Constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		
		
	}

}
