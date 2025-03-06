 package com.CollectionPractice;

import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) 
	{
		
		Vector<Integer> v = new Vector<Integer>();
		
		 v.add(12);
		 v.add(23);
		 v.add(3);
		 System.out.println(v);
		      
        Vector v1 = new Vector();
        v1.add("Sharath");
        v1.add("karthick");
        v1.add(0,"Ravi");
        v1.add("");
        
        Vector v2 = new Vector();
        v2.add("car");
        v2.add("bus");
        v2.add(0,"cycle");
        
//        for(int i=0;i<v2.size();i++)
//        {                                   // add in v1 one way.
//        	v1.add(v2.get(i));
//        }
        
        
//        v1.addAll(v2);                   // add in v1 second way.
//        v1.addAll(0, v2);

        
        v1.remove(0);
        v1.remove("karthick");
        
        System.out.println(v1);
        System.out.println(v2);
      //  System.out.println(v1.get(3));
        System.out.println("Size of Vector: "+v1.size());
        System.out.println("Capacity of Vector: "+v1.capacity());
   
        v1.clear();
        System.out.println(v1);
        
	}

} 

/*
 * vector size will be increased 100 % like (Fist will have 10 after that 20 after 40 after 80 ....).
 * vector size() method is used for the elements present in the vector.
 * vector capacity() method is used for the Array size.
 * vector will also accept the duplicate values.
 * vector will also accept the null Value.
 * 
 * vector is introduce in 1.0 java version.
 * collections is introduce in 1.2 version.
 * 
 * Generic<Interger> 1.5 version released.
 * in the generic in side we can only pass non-primitive data types like wapper class only.
 * object is created only for non primitive only.
 * not for the primitive data types.
 */

/*
 * Creation of a list.[Vector v1 = new Vector(); or Vector<Integer> v = new Vector<Integer>(); ]
 * add the element.[ v1.add("Sharath");]
 * retrieval element.[ System.out.println(v1.get(2));]
 * deletion of element.
 * [
        v1.remove(0); we can remove by using index value
        v1.remove("karthick"); we can remove by using Name also.
        v1.removeALL(v2); we can all remove v1 inside v2 values also.
        v1.clear();
 * ]
 
 * verfication of element.
 * [
 *    System.out.println (v1.contains("sharath")); it will writen in the true/false only
 *    System.out.println (v1.containsALL(v2)); order is not matter in the vector list.
 * ]
 * 
 
 * updation of the element.
 * 
 *[v1.set(1,"kar");]
 *
 *
 *other methos 
 *
 *v1.indexof("sharath"); it will display the in the array which index is there that name.
 *when have same name with duplicate in the index we can use lastindexof("Sharath");
 * 
 * 
 * v1.firstElement();array lo first.
 * v1.lastElement();array lo last .
 * v1.Empty();
 * 
 *
 * 
 * total array to store in one array
 * Object[] arr = v1.toArray();
 * System.out.println(Arrays.toString(arr));
 * 
 * 
 * Object[] arr = new Object[]{1,2,3,4,5};
 * Vector v1 = new Vector(Arrays.asList(arr));
 * 
 * [1,2,3,4,5]
 * size=5
 * capacity = 5
 * how much we can specifi that can only display thta is the advantages of list.
 * 
 * 
 * 
 * 
 * 
 * Important Points to Rememeber
 * 
 * what is the default capacity? 10
 * what is the initial capacity? 10
 * Does it allows duplicate elements? yes
 * Does it allows null values? yes
 * Does it maintain the insertion order? yes
 * Does it maintain the sorted order? no
 * Does it offer the random access of element? yes ,by using get() method.
 * Is it synchronised? 
 * ANS:yes,multiple threads to access it is called synchronised.
 * it always accepts only one by one only.
 * what is it good at?
 * ANS: Data is Exponential increased or multiple threads to access is used.
 * 
 * 
 * 
 * 
 * 
 */

