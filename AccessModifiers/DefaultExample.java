package com.AccessModifiers;

public class DefaultExample 
{
	String message = "Default Access Modifier";

    void displayMessage() 
    {
        System.out.println(message);
    }
}


/*If no access modifier is specified, it is accessible only within the same package.
*Not visible to classes outside the package.
 * 
 */
