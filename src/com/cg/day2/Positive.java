package com.cg.day2;

public class Positive {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if(num>0) {
			System.out.println("the number is positive");
		}
		else if(num<0) {
			System.out.println("the number is negative");
		}
		else {
			System.out.println("the number is zero");
			
		}
	}


}