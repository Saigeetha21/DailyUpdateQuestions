package com.cg.day11;

import java.util.Scanner;

public class ExperienceValidator {
	public static boolean getvalues(String s, String s1) {
		int y1= Integer.parseInt(s);
		int y2 = 2015;
		int y = Math.abs(y1-y2);
		int e = Integer.parseInt(s1);
		
		if(y>=e)
			return true;
		else
			return false;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		
		System.out.println(ExperienceValidator.getvalues(s, s1));
	}

}
