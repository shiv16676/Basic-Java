package com.tcs.traf.generics;

import java.util.ArrayList;

class Shiv{
	public void myStory(){
		System.out.println("I love my job");
	}
}

public class GenericsClass {
	public static void main(String[] args) {
		
		/////////  Before Java 5 ///////////////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String) list.get(1);
		System.out.println(fruit);
		
		
		//////////////   Mordern Style  ///////////////
		ArrayList<String> al = new ArrayList<String>();
		al.add("cat");
		al.add("dog");
		al.add("owl");
		
		String animal = al.get(1);
		System.out.println(animal);
		
		///////////  Java-7 Style  //////////////
		
		ArrayList<Shiv> shivList = new ArrayList<>();
		
	}
}
