package com.anwesh.add;

public class Employee {
	
	int id;
	String name ;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	//Object class method
	
	public String toString() {
		return name;
	}
	
	public int hashCode() {
		return id;
		//return id+"";
	}

}

class Test{
	
	public static void main(String[] args) {
		Employee emp = new Employee(10, "anwesh");
		Employee emp1 = new Employee(20, "rahul");
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
		
	}
}
