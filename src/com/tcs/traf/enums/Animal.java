package com.tcs.traf.enums;

public enum Animal {
	CAT("cat1"), DOG("dog1"), MOUSE("mouse1");
	
	private String name;
	
	Animal (String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString(){
		return "This animal is called:" + name;
	}
}




// CAT, DOG.. these are objects of animal class and not the constants/var ...

/*  1. enum improves type safety
    2. enum can be easily used in switch
    3. enum can be traversed
    4. enum can have fields, constructors and methods
    5. enum may implement many interfaces but cannot extend any class because it internally extends Enum class
*/