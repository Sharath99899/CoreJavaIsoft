package com.CollectionPractice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice 
{
	public static void main(String[] args) 
	{
		//Hashset ->(is stored in hashmap) HashMap -> Array of node (key,value).
		//LinkedHashSet -> LinkedHashMap ->link of nodes (key,value).
		//TreeSet -> TreeMap -> Binary tree 

		//Creation of a Set
		HashSet<Integer> hs = new HashSet<Integer>();
                          //or
		Set<Integer> s = new HashSet<Integer>();

		//Addition of element into the Set
		//dummy Object in value place
		hs.add(10);
		hs.add(2);
		hs.add(7);
		hs.add(22);
		hs.add(13);
		hs.add(21);
		hs.add(288);
		
		System.out.println(hs);
		System.out.println("------------------------------------------------");
		
		//Deletion of elemeny from the Set
		System.out.println(hs);
		hs.remove(21);
		System.out.println(hs);
		
		System.out.println("------------------------------------------------");
		
		//Verification of element in the Set
		System.out.println(hs);
		System.out.println(hs.contains(288));
		
		System.out.println("------------------------------------------------");
		
		//Retrieval of element from the Set
		System.out.println(hs);
		for(Integer i : hs)
		{
			System.out.println(i);
		}
			
	}
}


/*
 * What is Set?
 -> Set is an interface and it is part of collections framework.
 -> Set is aslo used for the data to store and it is aslo data structure.
 -> Set is a data structure which only store the uniqe element of data ,which not allow the duplicate element.
  
 -> linkedhashset will maintain order[like 1,2,3,4,5...]  insertion order
 *  
 *  
 *  
 *  
 * Major Operations

 ->Creation of a Set
 ->Addition of element into the Set
 ->Retrieval of element from the Set
 ->Deletion of elemeny from the Set
 ->Verification of element in the Set
 * 
 * 
 * 
 * 
 * MAJOR OPERATIONS IN MAP for HashSet
 * 
 * what is the default capacity? 0
 * what is the initial capacity? 16
 * Does it allows duplicate elements? Yes
 * Does it allows null values? Yes
 * Does it maintain the insertion order? No
 * Does it maintain the sorted order? No
 * Does it offer the random access of element? No
 * Is it synchronised? 
 * ANS:No
 * 
 * 
 * 
 * MAJOR OPERATIONS IN MAP for LinkedHashSet
 * 
 * what is the default capacity? 16
 * what is the initial capacity? 16
 * Does it allows duplicate elements? No
 * Does it allows null values? Yes
 * Does it maintain the insertion order? Yes
 * Does it maintain the sorted order? No
 * Does it offer the random access of element? No
 * Is it synchronised? 
 * ANS:No
 *  
 * 
 */