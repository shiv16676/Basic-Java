package com.tcs.traf;

class Machine{
	private String name;
	private int code;
	//constructor has to be the same as class name and it will have no return type
	//Also it always runs whenever any object of class will be created;Most common use of constructors is initialization of instance variables
	//Last thing to notice is that you can always call one constructor to another using "this" and that has to be the fist line of constructor where you are calling.
	public Machine(){
		this("Bhavna" , 11);
		System.out.println("First Constructor Running..!!");
	}
	public Machine(String name){
		this();
		System.out.println("Second Constructor running");
		this.name = name;
	}
	public Machine(String name , int code){
		System.out.println("Third constructor running..!!");
		this.name=name;
		this.code=code;
	}
}

public class Constructorss {
	public static void main(String[] args) {
		//Machine machine1 = new Machine();
		Machine machine2 = new Machine("Shiv");
		//Machine machine3 = new Machine("Vaishnavi" , 20);
	}
}
