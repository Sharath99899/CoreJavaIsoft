package com.PojoClass;

public class Employeemain {

	public static void main(String[] args) {
		
		Emplyee e = new Emplyee();
		e.setId(4);
		e.name = "Sharath";
		e.salary =50000;
		
		System.out.println(e.getId());
		System.out.println(e.name);
		System.out.println(e.salary);

	}

}
