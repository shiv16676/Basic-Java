package com.tcs.traf.advanced;


class Human{
	private int id;
	private String name;
	
	public Human(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class EqualsAndHashCode {
	public static void main(String[] args) {
		Human human1 = new Human(1,"Shiv");
		Human human2 = new Human(1,"Shiv");
		
		System.out.println(human1.equals(human2));
		
		Double value1 = 1.2;
		Double value2 = 1.2;
		System.out.println(value1.equals(value2));
		
		String name1 = new String ("Shiv");
		String name2 = new String ("Shiv");
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1 == name2);
		
		
	}
}

//Only use "==" to check if two references pointing to the same object or not otherwise use "equals"
