package com.tcs.traf;

//Encapsulation means that we should not be allowed to use instance variables outside of the class and in order to supply values to the 
//class variables , we should use setter methods. Hiding of instance var can be achieved by defining instance variables as private

class Dog{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		//this.name refers to the class instance variable whereas name refers to the parameter name
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setInfo(String name, int age){
		setName(name);
		setAge(age);
	}
}


public class SettersAndThis {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.setAge(20);
		dog1.setName("Entertainment");
	}
}
