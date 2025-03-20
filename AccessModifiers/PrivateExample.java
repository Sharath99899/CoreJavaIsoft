package com.AccessModifiers;

public class PrivateExample 
{
	private String message = "Private Access Modifier";

    private void displayMessage() 
    {
        System.out.println(message);
    }

    public static void main(String[] args) 
    {
        PrivateExample example = new PrivateExample();
        example.displayMessage(); 
    }
}


/*
 * Accessible only within the same class.
 * visible to other classes, even in the same package.
 */
