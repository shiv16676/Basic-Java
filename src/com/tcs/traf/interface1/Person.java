package com.tcs.traf.interface1;

public class Person implements Nature{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void displayName(){
		System.out.println("My name is" +" "+ name);
	}

	@Override
	public void natureType() {
		System.out.println("Person nature are not good:)");
		
	}

	@Override
	public void natureCauses() {
		System.out.println("If good then it brings happiness to the society");
		
	}
}
