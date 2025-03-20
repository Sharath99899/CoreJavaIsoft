package com.PojoClass;

public class Emplyee {
	
	private int Id;
	public String name;
	protected int salary;
	
	//Constructor initializer
	public Emplyee(int Id){
		this.Id=Id;
	}
	
	public Emplyee(){
		System.out.println("Empty Constructor");
	}
	
	//getter
	public int getId() {
		return Id;
	}
	//setter
	public void setId(int Id) {
		this.Id=Id;
	}

}


/* 1) What is POJO Class?
 * ->POJO means Plain Old Java Object.
 * ->It is a Simple Java Object, Which is not bound by any special restriction.
 * 
 * 2)Rules for a class to be called as a POJO class
→ It must be public.
→It is recommended to make the properties (instance variables) as private for improved security.
→It can have Getters & Setters in order to access the properties.
→It shouldn't implement any interfaces.
→It shouldn't extend any classes.
→It shouldn't have any annotations specified.
 * 
 * 
 * 
 */
