package com.tcs.traf.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading Objects..!!");
		
		try(FileInputStream fi = new FileInputStream("person.bin")){
			
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Person person1 = (Person) os.readObject();
			Person person2 = (Person) os.readObject();
			
			os.close();
			
			System.out.println("Reading Person1" + "-->"+ person1);
			System.out.println("Reading Person2" + "-->"+ person2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
