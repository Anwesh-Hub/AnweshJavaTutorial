package com.anwesh.Constructor;

public class Emp {
	
	int id ;
	String name;
	
	Emp(){}
	
	Emp(int id, String name){
		this.id = id;
	}
	Emp(String name, int id){
		this.id = id;
		this.name = name;
	}
	

}

class HR extends Emp{
	int count;
	HR(int id, String name, int count){
		super(id, name);
		this.count = count;
	}
	
	HR hr = new HR(123, "anwesh", 1);
	
	
}
