package com.tcs.traf;

class Human{
	String name;
	int age;
	
	//Now we can use this returned value wherever we want in the application like storing them in database...
	String getName(){
		return name;
	}
	
	int getAge(){
		return age;
	}
}

public class GettersAndReturnValues {
	public static void main(String[] args) {
		Human human1 = new Human();
		human1.name="Shiv";
		human1.age=26;
		
		int age = human1.getAge();
		String name = human1.getName();
		System.out.println("My age is" + " "+ age);
		System.out.println("My name is:" + name);
	}
}
