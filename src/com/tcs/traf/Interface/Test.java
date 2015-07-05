package com.tcs.traf.Interface;

public class Test {
	public static void main(String[] args) {
		
		Person person1 = new Person("Shiv");
		person1.showInfo();
		person1.greet();
		
		Machine machine1 = new Machine();
		machine1.showInfo();
		machine1.start();
		
		//We can invoke interfaces like this
		Information info1 = new Machine();
		info1.showInfo();
		
		Information info2 = new Person("Ashish");
		info2.showInfo();
	}
}
