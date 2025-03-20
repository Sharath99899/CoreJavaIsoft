package com.methodOverloading;

public class Caculator {


	public void add(int a, int b) {
		System.out.println(a+b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a+b+c);

	}
	public static void main(String[] args) {
		
		Caculator c = new Caculator();
		
		c.add(1, 4);
		c.add(1,3, 8);

	}
}
