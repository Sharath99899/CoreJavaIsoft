package com.CollectionPractice;

import java.util.ArrayDeque;

public class ArrayDequePractice 
{
	public static void main(String[] args)
	{
		//Creation ArrayDueue
           ArrayDeque<String> ad = new ArrayDeque<String>();
           
        // Adding the elements[add or offer]
           ad.add("car");
           ad.addFirst("bus");
           ad.addLast("bycle");

           ad.offer("bike");
           ad.offerFirst("Aeroplane");
           ad.offerLast("train");
       	
           System.out.println(ad); //[Aeroplane, bus, car, bycle, bike, train]
           
           System.out.println("-----------------------------------------");
           
           //Retrieval of elements [peek()] First seeing the first element in the Queue.
           System.out.println(ad.peek());
           System.out.println(ad.peekFirst());
           System.out.println(ad.peekLast());
           
           System.out.println("-----------------------------------------");
           
        // Deletion of Elemenet from the Queue.
           
           System.out.println(ad);
           System.out.println(ad.poll());
           System.out.println(ad.pollFirst());
           System.out.println(ad.pollLast());
           System.out.println(ad); 
           
           System.out.println("-----------------------------------------");
          
           System.out.println(ad.isEmpty());
           System.out.println(ad.size());
           
           System.out.println("-----------------------------------------");
           
           System.out.println(ad); 
           ad.clear();
           System.out.println(ad); 
         
	}

}


/*
 * ->ArrayDeque will Add form first and last.
 * ->ArrayDeque will remove form first and last.
 * 
 ->METHODS IN ARRAYDEQUE
 * Addition - Offer,OfferFirst,OfferLast,add,addFirst,addLast.
 * Retrieval - peek,peekFirst,peekLast.
 * Removal -Poll,pollFirst,pollLast,remove,removeFirst,removeLast.
 * 
 * 
 * 
 * Important Points to Rememeber
 * 
 * what is the default capacity? 11
 * what is the initial capacity? 11
 * Does it allows duplicate elements? yes
 * Does it allows null values? No
 * Does it maintain the insertion order? No
 * Does it maintain the sorted order? No
 * Does it offer the random access of element?  No
 * Is it synchronised? 
 * ANS: Queue is not synchronised totally.
 * what is it good at?
 * ANS: ArrayDeque is used for the FIFO.
 * 
 * 
 */
