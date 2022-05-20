package com.masai;

public class Whole {

	void check(int a) {
		
		if(a%2==0) {
			int b = a/10;
			System.out.println(b*10+10);
		}
		else if(a%2==1) {
			System.out.println(a);
		}
		else if(a<0) {
			System.out.println("Error");
		}
		
	}
	
	public static void main(String[] args) {
		
		Whole w1 = new Whole();
		w1.check(154);

	}

}
