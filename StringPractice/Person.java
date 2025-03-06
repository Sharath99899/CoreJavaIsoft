package com.StringPractice;

public class Person 
{
     String name;
     int age;
     
     public Person(String name,int age)
     {
    	 this.name=name;
    	 this.age=age;
     }
     
     // Overriding the toString() method is used to convert an object to a string.
    
     public String toString()
     {
    	 return "->Person{name="+name+",age="+age+"}";
     }
     
     public static void main(String[] args) 
     {
     	Person p = new Person("Sharath",23);
     	
     	System.out.println(p.toString());
     }
}
