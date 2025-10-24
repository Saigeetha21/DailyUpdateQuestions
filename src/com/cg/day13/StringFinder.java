package com.cg.day13;

import java.util.Scanner;

public class StringFinder {
	public static int finder(String s1, String s2, String s3) {
		int l=0;
		if(s1.contains(s2)&&s1.contains(s3)) {
			if(s1.indexOf(s2)<s1.lastIndexOf(s3)) {
				l=1;
			}
			else
				l=2;
		}
		return l;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		int ans = StringFinder.finder(s1, s2, s3);
		if(ans == 1)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
	}

}
