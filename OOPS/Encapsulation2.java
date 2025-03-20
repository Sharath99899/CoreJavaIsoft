package com.OOPS;

public class Encapsulation2 
{
	private String name;
	private int Age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
	public static void main(String[] args) {
		
		Encapsulation2 a = new Encapsulation2();
		a.setName("Sharath");
		a.setAge(23);
		
		System.out.println("Name: " + a.getName());
        System.out.println("Age: " + a.getAge());
	}
	

}
