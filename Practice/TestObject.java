package com.Practice;

public class TestObject
{
	public static void main(String[] args) 
	{
		TestObject o = new TestObject();

		System.out.println(o.equals(o));
		System.out.println(o.hashCode());
		System.out.println(o.toString());
		System.out.println(o.getClass());
//		System.out.println(o.notify());
//		System.out.println(o.notifyAll());
//		System.out.println(o.wait());
//		System.out.println(o.wait(0));
//		System.out.println(o.wait(0, 0));
//		System.out.println(o.main(args));
	}
}
