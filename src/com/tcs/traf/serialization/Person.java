package com.tcs.traf.serialization;

import java.io.Serializable;

public class Person implements Serializable{
	
	//Means of checking that you are reading files with the same class that you have wrote with..!!
	//And If the receiver has loaded a class for the object that has a different serialVersionUID than that of the corresponding 
	//  sender's class, then deserialization will result in an "InvalidClassException"
	private static final long serialVersionUID = 6630724311704878981L;
	
	
	//transient keyword is used to prevent fields from being serialized(So, value of id will be 0 when u read the object)
	private transient int id;
	private String name;
	
	//Static field is also not serializable
	private static int count;
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Person.count = count;
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]"+ "[count=" + count + "]";
	}

}
