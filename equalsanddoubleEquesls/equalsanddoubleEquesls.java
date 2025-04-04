package com.equalsanddoubleEquesls;

public class equalsanddoubleEquesls 
{
	
	public static void main(String[] args) 
	{
		
		String a = "Sharath";
		String a1 = "Sharath";
		
		System.out.println(a == a1);	//addresss
		System.out.println(a.equals(a1));// content sharath = sharath Ani 

		String s = new String("Sharath");
		String s1 = new String("Sharath");
		
			
		System.out.println(s == s1);	
		System.out.println(s.equals(s1));
	}

}
