package com.cg;

import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		int c;
		Account a = new Account(121,"geetha",9000);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Main menu");
			System.out.println("1.print balance");
			System.out.println("2.with draw");
			System.out.println("3.deposit");
			System.out.println("4.exit");
			System.out.println("enter your choice");
			c=sc.nextInt();
			switch(c) {
			case 1:a.printBal();
			break;
			case 2: System.out.println("enter amount");
			        int w = sc.nextInt();
			        a.withDraw(w);
			        break;
			case 3 : System.out.println("enter amount");
			         int d = sc.nextInt();
			         a.deposit(d);
			         break;
			case 4 : System.exit(0);
			         break;
			default :System.out.println("Invalid option");
			         c++;
			}
		}while(c!=0);
	}

}
