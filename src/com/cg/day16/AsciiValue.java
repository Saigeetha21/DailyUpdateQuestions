package com.cg.day16;

public class AsciiValue {
	
	public static void main(String args[]) {
		char ch = 's';
		int ascii = ch;
		// you can also cast char to int
		
		int castAscii =(int)ch;
		System.out.println("The ascii value of " + ch + "is :" +ascii );
		//System.out.println("The ascii value of " + ch + "is :" +castAscii);
	}

}

