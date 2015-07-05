package com.tcs.traf.advanced;

class Student{
	private int scholarNo;
	private String name;
	private String branch;
	private String city;
	
	//Let's create a constructor
	public Student(int scholarNo, String name, String branch, String city){
		this.scholarNo = scholarNo;
		this.name = name;
		this.branch = branch;
		this.city = city;
	}
	
	//Override toString() to format object as a String
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(scholarNo).append(".").append(name).append("-->").append(branch).append("-->").append(city);
		return sb.toString();
	}
}

public class ToStringPractice {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Shiv", "cse", "Tikamgarh");
		Student student2 = new Student(1, "Ashish", "ec", "Morena");
		Student student3 = new Student(1, "Aman", "ec", "Bihar");
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}
}
