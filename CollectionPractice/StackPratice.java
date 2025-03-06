package com.CollectionPractice;

import java.util.Stack;

public class StackPratice 
{
	public static void main(String[] args) 
	{

		Stack<String> books = new Stack<String>();

		books.push("Red");
		books.push("Blue");
		books.push("Black");

		System.out.println(books.peek());
		System.out.println(books);
		System.out.println(books.search("Black"));
		System.out.println(books.pop());
		System.out.println(books);
		System.out.println(books.empty());	

	}
}


/*
 * LIFO - Last in first out  [Stack is LIFO]
 * FIFO - First in first out [Queue is FIFO]
 * 
 * stack is relesed in 1.0 version. 
 * 
 * stack iS a class in java which implements the list interface and extends the vector class 
   and also represents the LIFO principle.
 * vector size will be increased 100 % like (Fist will have 10 after that 20 after 40 after 80 ....).

   stack methods will follow
   1) PUSH  means add
   2)POP  means remove in LIFO
   3)PEEK means last element want to see 
   4)SEARCH top to bottom will search the element
 *
 *
 *
 *Important Points to Rememeber
 * 
 * what is the default capacity? 10
 * what is the initial capacity? 10
 * Does it allows duplicate elements? Yes
 * Does it allows null values? Yes
 * Does it maintain the insertion order? Yes
 * Does it maintain the sorted order? No
 * Does it offer the random access of element? Yes, It allow by vector because of extend by vector,
   But we should not use it.
 * Is it synchronised? 
 * ANS:YES
 * 
 * what is it good at?
 * ANS: LIFO application like [<-undo(back) , redo ->(fornt), brower lo back ward and farward , recursion ]
 *
 */







