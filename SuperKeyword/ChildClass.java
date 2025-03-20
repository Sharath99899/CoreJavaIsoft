package com.SuperKeyword;

class ChildClass extends ParentClass {
	
    String name = "Child Class";
    
    public ChildClass() {
    	super();
    	System.out.println("ChildClass Constructor");
    }

    void show() 
    {
        System.out.println(super.name);  // Access parent class variable
        super.display();  // Call parent class method
    }
}