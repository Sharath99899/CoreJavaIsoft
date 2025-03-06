package com.StringPractice;

public class StringBufferAndBuilder 
{	
	public static void main(String[] args) 
	{
		String s = "Hello";
		String s5 = "Hello";

		//System.out.println(s == s5);

		StringBuffer  d = new StringBuffer("Sharath");
		
		//System.out.println(d.equals(sb2));
		d.insert(7, "Car");
		System.out.println(d);
		d.deleteCharAt(0);
		System.out.println(d);
		
		
		StringBuilder sb1 = new StringBuilder("Sharath");
		StringBuilder sb2 = new StringBuilder("Sharath");

		//System.out.println(sb1 == sb2);
		//sb.append("Sharath");
		//sb.insert(0, "Reddy");
		//System.out.println(sb);

	}

}


/*
 * String is immutable
 -> The memory are same.with same data like 
   String a = "Car";
   String a1 = "Car";
 * 
 * StringBuffer and StringBuilder  are mutable
 ->StringBuffer is used for the Multiple thread Accept.
 ->StringBuilder is used for the Single thread Accept.
 ->The memory are diffrents.
 * 
 */
