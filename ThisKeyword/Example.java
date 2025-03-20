package com.ThisKeyword;

class Example {
    int x;  // Instance variable

    Example(int x) {
        this.x = x;  
    }

    void display() {
        System.out.println("Value of x: " + this.x);
    }

    public static void main(String[] args) 
    {
        Example obj = new Example(10);
        obj.display();
    }
}
