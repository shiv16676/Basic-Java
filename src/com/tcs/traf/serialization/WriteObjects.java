package com.tcs.traf.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writting Objects.!!");

		Person mike = new Person(1, "Mike");
		Person shiv = new Person(2, "Shiv");
		
		Person.setCount(52);
		
		System.out.println(mike);
		System.out.println(shiv);
		
		//Now, let's Implement Serialization(Writting objects to a file)
		try (FileOutputStream fs = new FileOutputStream("person.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(mike);
			os.writeObject(shiv);
			
			os.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found..!!");
		} catch (IOException e) {
			System.out.println("I/O Exception occured..!!");
			e.printStackTrace();
		}
	}
}
