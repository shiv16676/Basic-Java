package com.tcs.traf;

public class Primitive_Data_types {
	public static void main(String[] args) {
	
		/*
		 * Following are the 8 Primitive data types in the Java
		 * */
		
		int myInt = 20;      // 32 bit value
		short myShort = 1447;  // 16 bit value
		long myLong = 54542;  // 64 bit value
		
		double myDouble = 7.25557;//For extra precision; there is no long version of double but there is short version called float(64bit) 
		float myFloat = 2.3334f;  //we need to mention f here since by default decimal value is double.(32 bit)
		
		char myChar = 's';  // 16 bit Unicode values ; means it can accept whole bunch of crazy characters or all keys in keyboard.
		boolean myBoolean = true; // 1 bit (true/false) - default is false
		
		byte myByte =127;  // can hold 8 bits of data (max value = 2^7 -1 and default value=0)
		//use of byte:-used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an int.
		
		System.out.println(myInt);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myByte);
		
	}
}
