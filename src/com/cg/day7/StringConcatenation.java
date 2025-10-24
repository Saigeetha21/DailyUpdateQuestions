package com.cg.day7;

import java.util.Scanner;

public class StringConcatenation {
	static String concatString(String s1, String s2) {
		int k=s1.length();
		int a=s2.length();
		String s3="0";
		if(k==a)
		{
			s3=s1.concat(s2);
		}
		if(k>a)
		{
			s3=(s1.substring(k-a).concat(s2));
		}
		if(k<a)
		{
			s3=(s1.concat(s2.substring(a-k)));
		}
		return s3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1 = sc.nextLine();
		String n2 = sc.nextLine();
		String n3 = StringConcatenation.concatString(n1, n2);
		System.out.println(n3);
	}

}
