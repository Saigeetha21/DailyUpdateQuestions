package com.cg.day2;

import java.util.Scanner;

public class ValidatingInputPassword {
	public static int validatePassword(String s1) {
		int k =s1.length();
		if(k>=8&&s1.matches(".*[@_#]{1}.*")&&s1.matches("^[^@_#0-9].*")&&s1.matches(".*[^@_#]$")) {
			return 1;
		}
		else
			return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int k = ValidatingInputPassword.validatePassword(s1);
		
		
		if(k==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		sc.close();
	}
	

}
