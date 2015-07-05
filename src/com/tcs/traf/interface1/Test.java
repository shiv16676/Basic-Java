package com.tcs.traf.interface1;

public class Test {
	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle();
		vehicle1.displayName();

		Person person1 = new Person();
		person1.setName("Shiv");
		person1.displayName();
		System.out.println(person1.getName());
		
		
		////   Play with Interface now  //////////
		
		Nature nature1 = new Person();
		nature1.natureType();
		nature1.natureCauses();
		
		Nature nature2 = new Vehicle();
		nature2.natureType();
		nature2.natureCauses();
	}
}
