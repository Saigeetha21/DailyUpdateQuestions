package com.cg.day13;

import java.util.Scanner;

public class PhoneValidate {
	public static int validatePhn(String s1) {
		int l=0;
		int i;
		for( i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(Character.isDigit(c)) {
				++l;
			}
			else if(c!='-')
				break;
		}
		if(l==10 && i==s1.length())
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(PhoneValidate.validatePhn(s1));
		sc.close();
		
	}

}
