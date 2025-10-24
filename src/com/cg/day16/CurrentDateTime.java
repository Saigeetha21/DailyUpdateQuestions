package com.cg.day16;

import java.time.LocalDateTime;

public class CurrentDateTime {

	public static void main(String[] args) {
		//current date is stored in the variable of current,for that we are using in build method LocalDateTime.now
		//It is converted from a LocalDateTime object to a string internally using a toString() method.
		LocalDateTime current = LocalDateTime.now();
		
		System.out.println("the current date:"+ current);

	}
	
	

}
