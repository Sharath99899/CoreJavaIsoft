package com.StringPractice;

public class ReverseAString 
{
	public static void main(String[] args) 
	{
		String str="Sharath";

		StringBuilder sb = new StringBuilder();
		//StringBuilder sb1 = new StringBuilder("REddy");

		for(int i=str.length()-1;i>=0;i--)
		{
			sb.append(str.charAt(i));
			//sb.reverse();
		}
		System.out.println(sb);	
	}
}
