package com.tcs.traf.runtimeexceptions;

public class Test {
	public static void main (String [] args){
		
		/*
		 * Exceptions are of two types-  checked and unchecked exceptions
		 * 1. checked/compile time:- which we are forced to handle at compile time
		 * 2. runtime/unchecked:-  	 which we are not forced to handle at compile time. like - Arithmetic exception(divide by zero),
		 *  					     NullPointer exception, ArrayIndexOutOfBoundException ..etc 
		 * */
		
		// Arithmetic Exception
		/* int value =8;
		   value = value/0;
		   System.out.println(value);*/
		
		
		// Null Pointer Exception
		/*  String text = null;
		    System.out.println(text.length());*/
		
		
		//ArrayIndexOutOfBound Exception
		String[] texts = {"one", "two" , "three"};
		try{
		System.out.println(texts[3]);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
