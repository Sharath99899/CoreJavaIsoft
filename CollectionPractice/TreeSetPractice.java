package com.CollectionPractice;

import java.util.TreeSet;

public class TreeSetPractice
{
	public static void main(String[] args) 
	{
		//TreeSet -> TreeMap -> Binary tree 
		TreeSet<Integer> t = new TreeSet<Integer>();
		
		t.add(12);
		t.add(14);
		t.add(4);
		t.add(18);
		t.add(1000);
		t.add(6);
		t.add(182);
		t.add(142);
		t.add(45);
		
		
		System.out.println(t);
		
		// TreeSet Some Methods
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println("------------------------------------------------");
		System.out.println(t);
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println("------------------------------------------------");
		System.out.println(t);
		System.out.println(t.subSet(2, 60));
		System.out.println("------------------------------------------------");
		System.out.println(t);
		System.out.println(t.descendingSet());
	}
	
}

/*set will not accept the duplicate will not allwo.
 * Set as three implemention HashSet and LinkendHashSet will accept the null value.
 * but,TreeSet will not accept the null value.
 * 
 * 
 * 
 * 
 * 
 *MAJOR OPERATIONS IN MAP
 * 
 * what is the default capacity? 0
 * what is the initial capacity? 0
 * Does it allows duplicate elements?No 
 * Does it allows null values? No
 * Does it maintain the insertion order?No 
 * Does it maintain the sorted order? Yes
 * Does it offer the random access of element? No
 * Is it synchronised? 
 * ANS:No
 * 
 *
 * 
 * 
 */
