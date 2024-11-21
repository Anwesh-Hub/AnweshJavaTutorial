package com.anwesh.Overriding;
class OldCar{
	
	int i =10;
	int j=20;
	
	public void oldCar() {
		
		System.out.println("old car");
	}
	
	public static void m1() {
		System.out.println("static method from old car");
	}
}

class NewCar extends OldCar{
	int i = 30;
	int j= 40;
	
	/*
	 * public void oldCar() { System.out.println("new car"); }
	 */
	public static void m1() {
		System.out.println("static method from new car");
	}
	
	
}

public class Overriding {
	public static void main(String[] args) {
		
		/*
		 * OldCar oldcar = new OldCar(); oldcar.oldCar();
		 */
		 
		
			
			  OldCar old = new NewCar(); 
			  old.oldCar();
			 
		
		/*
		 * NewCar newcar = new NewCar();
		 * 
		 * newcar.oldCar();
		 */

		
	}

}
