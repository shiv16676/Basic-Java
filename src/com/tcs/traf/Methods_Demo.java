package com.tcs.traf;
class Person{
	String name;
	int age;
	String emailId; 
	
	public void speak(){
		System.out.println("My name is" +" "+ name + " "+"and i am " +" "+ age + " "+"years old" + " "+ "My EmailId is:" + " " + emailId);
	}
}

public class Methods_Demo {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name="Shiv Kumar Napit";
		person1.age=26;
		person1.emailId="shiv16676@gmail.com";
		person1.speak();
		
		Person person2 = new Person();
		person2.name="Ashish Singhal";
		person2.age=26;
		person2.emailId="ashish.singhal@gmail.com";
		person2.speak();
		
	}
}
