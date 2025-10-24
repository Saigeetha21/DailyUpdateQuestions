package com.cg.day15;

import java.util.Scanner;

public class StringUtilTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter url here");
		
		String url = sc.nextLine();
		
		String command = StringUtil.getCommand(url);
		System.out.println("Output:");
		System.out.println(command);
	}

}
