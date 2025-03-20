package com.CollectionPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPratice 
{

	public static void main(String[] args) 
	{

		ArrayList<String> al = new ArrayList<String>();
		al.add("YY");
		al.add("HH");
		al.add("JJ");

		LinkedList<String> l = new LinkedList<String>();

		l.add("Sharath");
		l.add("Karthick");
		l.add("Karthick");
		l.add("Abhi");
		l.add("Reddy");
		l.add(null);
		l.add(1,"Ganesh");
		l.addAll(al);
		l.addAll(0, al);//addAll Method is used to ArrayList to Linked List we can add by using addAll Method.

		System.out.println(l); 
		
		for (String s: l)
		{
			System.out.println(s);
		}

	}

}


/*
 * 
 * 
 * 
 * 
 * Creation of a list.[LinkedList 1 = new LinkedList(); or LinkedList<String> l = new LinkedList<String>();
 ]
 * add the element.[ 1.add("Sharath");]
 * retrieval element.[ System.out.println(1.get(2));]
 * deletion of element.
 * [
        1.remove(0); we can remove by using index value
        1.remove("karthick"); we can remove by using Name also.
        1.removeALL(v2); we can all remove v1 inside v2 values also.
        1.clear();
 * ]
 
 * verfication of element.
 * [
 *    System.out.println (1.contains("sharath")); it will writen in the true/false only
 *    System.out.println (1.containsALL(v2)); order is not matter in the vector list.
 * ]
 * 
 
 * updation of the element.
 * 
 *[1.set(1,"kar");]
 * 
 * 
 * 
 * Important Points to Rememeber
 * 
 * what is the default capacity? 0  // only how many you element add that element only will tell you.
 * what is the initial capacity? 0
 * Does it allows duplicate elements? Yes
 * Does it allows null values? Yes
 * Does it maintain the insertion order? Yes
 * Does it maintain the sorted order? No
 * Does it offer the random access of element?  Yes, by using get() method.
 *    
 * Is it synchronised? 
 * ANS:YES, only when you collection [Collections.synchronizedList(al);] 
   by default not synchronised LinkedList.
 * 
 * what is it good at?
 * ANS: LinkedList is good for data manipulation.
 *
 *
 *
 */
