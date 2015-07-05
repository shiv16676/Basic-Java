package com.tcs.traf.advanced;

class Plant{
	
	//If you wanted to declare any var as public then make it final so that noone can change it outside of the class and make it static so that it can only be accessed by classname.
	public static final int ID =6;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getId() {
		return ID;
	}
	
	public String getData(){
		String data = "Hello there" + calculateGrowthForecast();
		return data;
	}
	
	private int calculateGrowthForecast(){
		return 8;
	}
}

public class Encapsulation {

}

//Encapsulation is one of the four fundamental OOP concepts.Encapsulation is the technique of making the fields in a class private and 
//providing access to the fields via public methods. If a field is declared private, it cannot be accessed by anyone outside the class,thereby hiding the fields within the class.

//Encapsulation also referred to as Data Hiding

//The main benefit of encapsulation is the ability to modify our implemented code without breaking the code of others who use our code. 
//With this feature Encapsulation gives maintainability, flexibility and extensibility to our code.