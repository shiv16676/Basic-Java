package com.tcs.traf.advanced;

class Employee{
	private int employeeId;
	private String employeeName;
	private String gender;
	private String type;
	private String emailId;
	
	public double getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	//Let's Override toString method to represent Objects as String
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(employeeId).append("-->").append(employeeName).append("-->").append(gender).append("-->").append(type).append("-->").append(emailId);
		return sb.toString();
	}
}

public class ToStringPractice2 {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmployeeId(667038);
		emp1.setEmployeeName("Shiv Kumar Napit");
		emp1.setGender("Male");
		emp1.setType("permanent");
		emp1.setEmailId("shiv16676@gmail.com");
		
		Employee emp2 = new Employee();
		emp2.setEmployeeId(666038);
		emp2.setEmployeeName("Ashutosh Sharma");
		emp2.setGender("Male");
		emp2.setType("permanent");
		emp2.setEmailId("ashutosh.sharma@gmail.com");
		
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
