package com.tcs.traf.advanced;

public class CastingNumericalValues {
	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 520;
		int intValue = 3201;
		long longValue = 522335;
		
		float floatValue = 55.02f;
		double doubleValue = 54.022;
		
		System.out.println(Long.MAX_VALUE);
		
		
		//Casting from Long to int
		intValue = (int)longValue;
		System.out.println(intValue);
		
		//This is allowed since double has enough capacity to hold the fload data
		doubleValue = floatValue;
		System.out.println(doubleValue);
		
		//Value is too long for a byte to store since it 's max value is 127 and any bigger value than that goes to round -128.
		//So you will get unexpected results from it
		byteValue = (byte)128;
		System.out.println(byteValue);
	}
}

//Note:- 1. Donot try to cast a completely different class to another like from String to int...that would not work
// 2. Also, by casting you are trying to change the default data type capacity , so be very careful