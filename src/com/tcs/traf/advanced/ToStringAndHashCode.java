package com.tcs.traf.advanced;

class Frog{
	private int id;
	private String name;
	
	public Frog(int id, String name){
		this.id =id;
		this.name=name;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" : ").append(name);
		return sb.toString();
	}
}

public class ToStringAndHashCode {
	public static void main(String[] args) {
		Frog frog1 = new Frog(5, "FirstFrog");
		Frog frog2 = new Frog(8, "Secondfrog");
		
		System.out.println(frog1);
		System.out.println(frog2);
	}
}
