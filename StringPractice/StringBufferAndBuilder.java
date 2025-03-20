package com.StringPractice;

public class StringBufferAndBuilder 
{	
	public static void main(String[] args) 
	{
		String s = "Hello";
		String s5 = "Hello";

		System.out.println(s == s5);

		StringBuffer  d = new StringBuffer("Sharath");
		
		//System.out.println(d.equals(sb2));
		d.insert(7, "Car");
		System.out.println(d);
		d.deleteCharAt(0);
		System.out.println(d);
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder("Sharath");
		StringBuilder sb2 = new StringBuilder("Sharath");

		System.out.println(sb.capacity());
		
		System.out.println("objects:" + (sb1 == sb2));
		sb.append("Sharath");
		sb.insert(0, "Reddy");
		System.out.println(sb);

	}

}


/*
 * 1)String is immutable
 -> The memory are same.with same data like 
   String a = "Car";
   String a1 = "Car";
 * 
 * 2)StringBuffer and StringBuilde
 ->StringBuffer and StringBuilder  are mutable
 ->StringBuffer is used for the Multiple thread Accept.(synchronized)
 ->StringBuilder is used for the Single thread Accept.(Non-synchronized)
 ->The memory are diffrents.
 *
 *3)Methods for the StringBuffer and StringBuilder
 *->append
 *->insert
 *->delete
 *->reverse
 *->capacity() by deafult it will create 16 size bite.
 *->
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 
 */
