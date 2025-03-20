package com.TypeCasting;

public class DataTypesExample {
    public static void main(String[] args) {
        // Integer types
        byte byteValue = 10;          // 1 byte
        short shortValue = 200;       // 2 bytes
        int intValue = 50000;         // 4 bytes
        long longValue = 10000000000L; // 8 bytes (use 'L' for long)

        // Floating-point types
        float floatValue = 5.75f;     // 4 bytes (use 'f' for float)
        double doubleValue = 19.99;   // 8 bytes

        // Character type
        char charValue = 'A';         // 2 bytes (stores a single character)

        // Boolean type
        boolean boolValue = true;     // 1 bit (true/false)

        // Printing primitive data types
        System.out.println("===== Primitive Data Types =====");
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Boolean Value: " + boolValue);

        // Type Casting Demonstration
        System.out.println("\n===== Type Casting Examples =====");

        // Implicit (Widening) Casting: small → large
        int widenInt = byteValue;  // byte → int (automatic)
        double widenDouble = intValue; // int → double (automatic)
        System.out.println("Widening Casting (byte to int): " + widenInt);
        System.out.println("Widening Casting (int to double): " + widenDouble);

        // Explicit (Narrowing) Casting: large → small
        int narrowInt = (int) longValue;  // long → int (manual)
        byte narrowByte = (byte) intValue; // int → byte (manual, may lose data)
        System.out.println("Narrowing Casting (long to int): " + narrowInt);
        System.out.println("Narrowing Casting (int to byte - possible data loss): " + narrowByte);

        // Casting char to int
        int asciiValue = charValue;  // char → int (ASCII value)
        System.out.println("Character to Integer (ASCII value of 'A'): " + asciiValue);

        // Wrapper Classes (Autoboxing & Unboxing)
        Integer wrappedInt = intValue; // Autoboxing (int → Integer)
        int unwrappedInt = wrappedInt; // Unboxing (Integer → int)
        System.out.println("\n===== Wrapper Classes (Autoboxing & Unboxing) =====");
        System.out.println("Autoboxed Integer: " + wrappedInt);
        System.out.println("Unboxed int: " + unwrappedInt);
    }
}
