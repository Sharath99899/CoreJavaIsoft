package com.TypeCasting;

public class ImplicitCasting {

	public static void main(String[] args) {
		int num = 19;
		double d = num; // int → double (Automatic)

		System.out.println("Integer value: " + num);
		System.out.println("Double value: " + d);
	}

}


/*
 * 📌 Type Casting is converting one data type into another.
 *📌 They are Two Types:
 *
 *1)️ Implicit (Widening) Casting → Automatic conversion (small type (Int) → large type (Double)).
 *Smaller data type → Larger data type.
 *No data loss.
 *Done automatically by Java.
 *Automatic Conversion
 *
 *
 *2️) Explicit (Narrowing) Casting → Manual conversion (large type (Double) → small type (Int)).
 *Larger data type → Smaller data type.
 *May cause data loss.
 *Requires manual casting using (type).
 * Manual Conversion
 * 
 * 
 */

