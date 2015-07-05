package com.tcs.traf.generics;

import java.util.ArrayList;

class Machine{
	@Override
	public String toString() {
		return " I am a machine";
	}
}

class Camera extends Machine {
	@Override
	public String toString() {
		return " I am a Camera";
	}
}

public class UsingWildCards {
	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());
		showList(list1);
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());
		showList(list2);
	}
	public static void showList(ArrayList<?> list){
		for(Object value : list){
			System.out.println(value);
		}
	}
}
