package com.tcs.traf.throwingexceptions;

import java.io.IOException;

public class ExceptionGenerator{
	
	public void run() throws CustomException{
		
		//Some kind of return value from some complex process!
		//0 = success
		//anythingelse = error code
		int code = 1;
		
		if(code != 0){
			//Something's wrong
			//throw new IOException("Could not connect to the server");
			//throw new ServerException("Could not connect to the server");
			throw new CustomException("Could not connect to the server");
		}
		
		System.out.println("Running Successfully");
	}
}
