package com.tcs.traf.enums;

public class Test {
	public static void main(String[] args) {
		
		Animal animal = Animal.MOUSE;
		
		//Using Switch statement
		switch(animal){
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		}
		System.out.println(Animal.CAT.getName());
		
		//These name() methods are derived from a java.lang.enum class
		System.out.println("Enum name as a String:" + Animal.CAT.name());
		
		System.out.println(Animal.DOG instanceof Enum);
		
		//Using For loop
		for (Animal a : Animal.values()){
				System.out.println("For Loop " + "--> "+a);
		 }
	}
}
