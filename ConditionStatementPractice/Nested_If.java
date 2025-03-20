package com.ConditionStatementPractice;

public class Nested_If 
{
	public static void main(String[] args)
	{
          int a=50;
          int b=30;
          
          if(a==50)
          {
        	  System.out.println("correct answer");
        	  
        	  if(b==20)
        	  {
        		  System.out.println("correct answer");
        	  }
        	  else
        	  {
        		  System.err.println("worng answer");
        	  }
        	  if(b==30)
        	  {
        		  System.out.println("correct answer");
        	  }
        	  else
        	  {
        		  System.err.println("worng answer");
        	  } 
          }
          else
    	  {
    		  System.err.println("worng answer");
    	  } 
	}
}
