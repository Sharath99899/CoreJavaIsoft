package com.ExceptionHandlingPractice;

public class ExceptionHandling 
{
	public static void main(String[] args) //throws ArithmeticException
	{
		System.out.println("Program Execution Start");

		//      int fNumber = 8;
		//      int sNumber = 2;
		//      int result;

		int fNumber = 9;
		int sNumber = 0;
		int result=0;
		/*
		 * StackTrace
           -> Exception Name - java.lang.ArithmeticException
           -> Exception Message - / by zero
           ->Which Line - ExceptionHandling.java:23
           -> Methods Info
		 */
		try 
		{
			result = fNumber/sNumber;
		}
		catch(ArithmeticException ae) 
		{
			//System.out.println(ae.toString());
			System.out.println(ae.getMessage());
			//throw ae;
		}
		finally 
		{
			System.out.println("Finally");
		}
		System.out.println("Output is :"+result);
		System.out.println("Program Execution End");
	}	
}


/*
 * What is an Exception?
 -> Exception is an event that occurs during the exception of a program 
    that disrupts the normal flow of instructions is called exception.
 * 
 *What is an ExceptionHandling? 
 ->When user want to Handling the Exception  that process is the Exception Handling.
 * 
 * 
 * What do we need ExceptionHandling? 
 -> To take the control of Exceptions from java.
 * 
 * 
 * Different types of Exception?
 
 ->Two types of Exception
  1)Checked Exception(Compile-time Exception)
   ->IOException
   ->SQLException
   ->FileNotFoundException
   ->ClassNotFoundException
   ->InterruptedException
   ->InstantiationException
   
  2)Unchecked Exception(Runtime Exception)
   ->ArithmeticException
   ->NullPointerException
   ->ArrayIndexOutBoundsException
   ->InputMismatchException
   ->StringIndexOutOfBoundException
   ->IndexOutOfBoundException
   ->NumberFormatException
   ->IllegalArgumentsException
  
 * 
 * How to use try,catch and finally block?
 -> Try - Code that might throw an exception is written here.
 ->Catch - Catch and handles the exception if it occurs.
 -> Finally - Always executes, whether an exception occurred or not.

 * 
 *How to use throw and throws keywords?
 -> Throw
     1)Throw is a Keyword through which we can throw an Exception inside the method.
     2)We can throw only one Exception at a time Using throw Keyword.
     
->Throws
    1)Throws is a keyword through which we can declare the Exception in method level.
    2)we can throw more than one Exception at a time using throws keyword.     
 * 
 * 
 * Hierarchy of Exception in java?
 *-> Object
        -> Throwable
             ->Exception
                 -> RuntimeException
                         *IndexOutBoundsException
                         *NullPointerException
                         *ArithmeticException
                      ->IO Exception
                               *FileNotFoundException
                      ->SQLException


 */
