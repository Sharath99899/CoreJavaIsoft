package com.CollectionPractice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePracties 
{
	public static void main(String[] args) 
	{

		//Creation PriorityQueue
		Queue<Integer> pq = new PriorityQueue<Integer>();
		//Queue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder()); //54321 like this will display
		//or
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();

		// Adding the elements[add or offer]
		pq.offer(1);
		pq.add(2);
		pq.offer(3);
		pq.add(4);
		pq.offer(52);
		pq.offer(36);
		pq.add(76);
		pq.offer(52);

		System.out.println(pq);

		System.out.println("-----------------------------------------");

		//Retrieval of elements [peek()] First seeing the first element in the Queue.

		System.out.println(pq.peek());

		System.out.println("-----------------------------------------");

		// Deletion of Elemenet from the Queue.
		System.out.println(pq.poll()); // I will removein the Queue.
		System.out.println(pq.remove()); // In the Queue is not present it throw an error.
		System.out.println(pq);

		System.out.println("-----------------------------------------");
		//Verificatio of elements in the queue

		System.out.println(pq.contains(2)); // In the queue presnt this element .

		System.out.println("-----------------------------------------");

		// To Print all data, but not use this in PriorityQueue or Queue.[3,5,2,8,9...like this it will print]
		for(Integer p : pq)
		{
			System.out.println(p);
		}

		System.out.println("-----------------------------------------");

		// While is best for the print in order like [1,2,3,4,5 like this]

		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}


		System.out.println("-----------------------------------------");

		//TO clear entrie PriorityQueue
		//		System.out.println(pq);
		//		pq.clear();
		//		System.out.println(pq);
	}
}


/*
 *what is a Queue?
     -> A Queue is an interface and data struture that follows the first in first out [FIFO] principle.
     -> Queue is an interface in the java.util package and extends the collections interface.

    -> priority Queue is not soerted, but it will higest priority will be the lowset number in the queue.
    -> In priority Queue is deletion on fornt side only.
 *
 *methos in [PriorityQueue,]
 * Addition - offer , add
 * Retrieval - peek
 * Removal - Poll,remove 
 * 
 *
 *MAJOR OPERATIONS

 ->Creation of a Queue?
 ->Addition of elements into the queue?
 ->Retrieval of elements from the queue?
 ->Deletion of elements from the queue?
 ->Verification of elements in the queue?
 *
 *
 *Important Points to Rememeber
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
 * ANS: PriorityQueue is used for the FIFO.
 * 
 *
 *
 */

