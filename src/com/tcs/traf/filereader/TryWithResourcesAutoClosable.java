package com.tcs.traf.filereader;

class Temp implements AutoCloseable{
	@Override
	public void close() throws Exception {
		System.out.println("Closing Resources..!!!");
	}
}

public class TryWithResourcesAutoClosable {
	public static void main(String[] args) {
		
		//New feature of Java-7 AutoCloseable interface that has only one abstract method
		try(Temp temp = new Temp()){
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
