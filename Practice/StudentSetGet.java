package com.Practice;

public class StudentSetGet 
{
	private String stuName;
	private int age;

		
	public String getStuName() 
	{
		return stuName;
	}
	public void setStuName(String stuName) 
	{
		this.stuName = stuName;
	}

	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}


	public static void main(String[] args) 
	{
		StudentSetGet s = new StudentSetGet();
		s.setStuName("Sharath");
		s.setAge(23);
		System.out.println("Student Name: "+s.getStuName());
		System.out.println("Student Age: "+s.getAge());
	}

}
