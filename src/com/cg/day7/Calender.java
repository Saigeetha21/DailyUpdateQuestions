package com.cg.day7;

import java.util.Scanner;

public class Calender {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter months number");
		int monthno=Integer.parseInt(args[0]);
		monthno=in.nextInt();
		switch(monthno) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("august");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("december");
			break;
		default:
			System.out.println("Invalid month");
			break;
		}
	}

}
