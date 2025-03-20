package com.CollectionPractice;


import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice
{
	public static void main(String[] args) 
	{
		//Creation of a map
		//same for the all  calss[Hashtable,HashMap,LinkedHashMap,TreeMap]
		
		Map<Integer,String> m = new Hashtable<>();

		//Addition of elements into the map
		m.put(1,"One");
		m.put(2,"Two");
		m.put(3,"Three");
		m.put(4,"Four");
		m.put(5,"Five"); 

		//Retrieval of keys from the map
		Set<Integer> keys = m.keySet();
		for(Integer key : keys)
		{
			System.out.println(key);
		}

		System.out.println("-----------------------------");

		//Retrieval of values from the map
		Collection<String> values= m.values();
		for(String value : values)
		{
			System.out.println(value);
		}

		System.out.println("-----------------------------");

		//Retrieval of value from the map based on a key
		System.out.println(m.get(2));

		System.out.println("-----------------------------");

		//Retrieval of key and value will display but,only key will display.
		for(Integer key : keys)
		{
			System.out.println(key+">>>>>>>>"+m.get(key));
		}

		System.out.println("-----------------------------");

		System.out.println(m);

		System.out.println("-----------------------------");

		//Deletion of element from the map
		m.remove(3);
		m.remove(2,"Two");
		System.out.println(m);

		System.out.println("-----------------------------");
		//Verification of Keys in the map
		System.out.println(m.containsKey(1));

		System.out.println("-----------------------------");

		//Verification of values in the map
		System.out.println(m.containsValue("One"));

		System.out.println("-----------------------------");

		//Updation of elements in the map
		System.out.println(m);
		m.put(1,"ONEEE");
		m.replace(4,"FOUR");
		//m.putIfAbsent(1, "One,Two,Three");
		System.out.println(m);


		System.out.println("-----------------------------");
		// how many element in the map
		System.out.println(m.size());

		System.out.println("-----------------------------");
		// how to clear entrie map 
		//m.clear();
		System.out.println(m);

		System.out.println("-----------------------------");
		// Entries set mens both key and value will display in output
		Set<Entry<Integer,String>> entries = m.entrySet();
		for(Entry<Integer,String> entry : entries)
		{
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+">>>>"+value);	
		}

	}

}



/*
 * What is Map ?
 * ANS:Map is an interface that represents a data structure to store key and value pairs.
   Each key is unique.
 * 
 * 
 * 
 * 
 * MAJOR OPERATIONS IN MAP
 * 
 * Creation of a map?
 * Addition of elements into the map?
 * Retrieval of keys from the map?
 * Retrieval of values from the map?
 * Retrieval of value from the mapbased on a key?
 * Retrieval of key&value from the map based on both?
 * Deletion of element from the map?
 * Verification of Keys in the map?
 * Verification of values in the map?
 * Updation of elements in the map?
 * 
 * Entries set mens both key and value will display in output?
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */