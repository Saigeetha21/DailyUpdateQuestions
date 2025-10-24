package com.cg.day13;

import java.util.Scanner;

public class Email {
	static boolean validateEmail(String str) {
		return str.matches("[a-zA-Z0-9]{3}@[a-zA-Z{5}\\.com");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println((validateEmail(s)+"").toUpperCase());
	}

}
