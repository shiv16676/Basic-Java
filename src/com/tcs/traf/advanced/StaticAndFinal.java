package com.tcs.traf.advanced;

class Thing{
	public String name;
	//Static var belongs to class not the objects. So you need to call them by Class name
	//Also if you try to assign multiple values to static var , last assigned value will override the other ones.
	//Constant var in java is always written in uppercase letters
	//Final is a constant means u cannot assign any value to it once u have defined a variable(So you need to initialize the var at the time of declaration)
	//If u make a method as final, then you cannot override it.
	//If you make a class as final, then u cannot extend it.
	//Note:- We can initialize a blank final variable , but only in constructor.
	//Note:-  A static final variable that is not initialized at the time of declaration is known as static blank final variable. 
	//It can be initialized only in static block.
	//We cannot declare a constructor as final because constructor is never inherited...!!
	public static String description;
	
	//Static final variable
	public static final int LUCKY_NUMER = 16;
	
	public void showName(){
		System.out.println(name);
	}
	public static void showInfo(){
		System.out.println(description);
	}
}

public class StaticAndFinal {
	public static void main(String[] args) {
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name ="Shiv";
		thing2.name = "Ashish";
		thing1.showName();
		thing2.showName();
		
		thing1.description = "I am a description";
		thing1.showInfo();
		
		System.out.println(Math.PI);
		
		//Custom constant created by me
		System.out.println(Thing.LUCKY_NUMER);
		
	}
}

//Theory about static and final
// Question- Can you give few examples of final classes defined in Java API?
//Answer:- java.lang.String, java.lang.Math

// Question - How is final different from finally and finalize()?
//Answer:- 
//final is a modifier which can be applied to a class or a method or a variable. final class can't be inherited, final method can't be overridden and final variable can't be changed.
//finally is an exception handling code section which gets executed whether an exception is raised or not by the try block code segment.
//finalize() is a method of Object class which will be executed by the JVM just before garbage collecting object to give a final chance for resource releasing activity.

//Question - Can a class be declared as static?
//Answer:-   We can not declare top level class as static, but only inner class can be declared static.

//Question:- When will you define a method as static?
//Answer:-   When a method needs to be accessed even before the creation of the object of the class.

//Question:-  I want to print "Hello" even before main() is executed. How will you achieve that?
//Answer:-    Print the statement inside a static block of code. Static blocks get executed when the class gets loaded into the memory and even before the creation of an object. 
//            Hence it will be executed before the main() method. And it will be executed only once.