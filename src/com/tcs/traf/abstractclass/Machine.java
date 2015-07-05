package com.tcs.traf.abstractclass;

//Abstract class can have both abstract and non-abstract methods but interface can have only abstract methods
public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract void start();
	public abstract void shutdown();
	
	public void run(){
		start();
		shutdown();
	}
}

/*
 * Abstract class	                                               Interface
 * ***************												   ************
1) Abstract class can have abstract and non-abstract methods.	   Interface can have only abstract methods.
2) Abstract class doesn't support multiple inheritance.	           Interface supports multiple inheritance.
3) Abstract class can have final, non-final, 
   static and non-static variables.	                               Interface has only static and final variables.
4) Abstract class can have static methods, 
   main method and constructor.	                                   Interface can't have static methods, main method or constructor.
5) Abstract class can provide the implementation of interface.	   Interface can't provide the implementation of abstract class.
6) The abstract keyword is used to declare abstract class.	       interface keyword is used to declare interface.
 * 
 */