package com.CollectionPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPratice 
{
  public static void main(String[] args) 
  {
	  
	  //Integer[] arr = new Integer[] {1,4,5,2,8,9};   // type one  we can use
	 // ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
	  
	  ArrayList<Integer> al = new ArrayList<Integer>(); // type two we can use 
	  
	  al.add(11);
	  al.add(12);
	  al.add(13);
	  al.add(14);
	  al.add(15);
	  al.add(16);
	  
	  System.out.println(al);
	   for(Integer integer:al)
	   {
		   System.out.print(integer+" ");
	   }
	 // Collections.synchronizedList(al);
  }
}

/*
 * the arraylist default value is 0.
 * after the element add in the arraylist will be 10.
 * vector size will be increased 50 % like (Fist will have 10 after that 15 after 22 after 33   ....).
 * 
 * 
 * 
 * 
 * 
 * Important Points to Rememeber
 * 
 * what is the default capacity? 0
 * what is the initial capacity? 10
 * Does it allows duplicate elements? yes
 * Does it allows null values? yes
 * Does it maintain the insertion order? yes
 * Does it maintain the sorted order? no
 * Does it offer the random access of element? yes ,by using get() method.
 * Is it synchronised? 
 * ANS:No,by default arraylist is not synchronised ,but with using collections class we can make the arrayList as synchronised.
 * Collections.synchronizedList(al);
 * what is it good at?
 * ANS: Data is not Exponential increased.
 *      add and get is good it means data to store and data retrive the data.
 * 
 * 
 * 
 */


