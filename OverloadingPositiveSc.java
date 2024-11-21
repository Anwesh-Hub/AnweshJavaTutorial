package com.anwesh.overloadingConcepts;

public class OverloadingPositiveSc {
	
	public int m1(int a, String b) {
		System.out.println("1 method");
		return 10;
	}
	
	public void m1(String a, int b) {
		System.out.println("2 method");//C.E
		
		//resoultion return integer value to resolve error
	}
	
	public void m1(int a, String b, int c) {
		System.out.println("3 method");//C.E
		
		//resoultion return integer value to resolve error
	}
	
	public static void main(String[] args) {
		OverloadingPositiveSc overl = new OverloadingPositiveSc();
		overl.m1(10, "anwesh");
		overl.m1("anwesh", 20);
		overl.m1(10, "anwesh", 20);
				
	}

}

