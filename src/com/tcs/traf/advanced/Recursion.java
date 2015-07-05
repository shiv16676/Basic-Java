package com.tcs.traf.advanced;

public class Recursion {
	public static void main(String[] args) {
		
		// E.g 4! = 4*3*2*1  (Factorial 4)
		System.out.println(factorial(5));
	}
	
	/**
	 * This method is used to calculate the Factorial of any given no.
	 * @param value
	 * @return int
	 */
	private static int factorial(int value){
		if(value ==1){
			return 1;
		}
		
		int values = value-1;
		return factorial(values) * value;
	}
}






/*
 Note:- There are two types of memories in java-
 1. Heap Memory:- Where object'e memories are allocated.
 2. Stack :- where local variables and functions values are stored
 
 So, in this case if we call calculate()  recursively , then we will get below error-
 Exception in thread "main" java.lang.StackOverflowError
 
 */