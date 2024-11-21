package com.anwesh.add;

public class ReferenceDType {
	//class level variable
	int i = 10;
	
	public void m1() {
		System.out.println("i value.."+i);
		int j = 20;
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceDType referenceDT = new ReferenceDType();
		System.out.println("class level vari.."+referenceDT.i);
	
		referenceDT.m1();

	}

}
