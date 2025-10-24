package com.cg.day5;

import java.util.Scanner;

public class MultiplexTest {
	
	public static void main(String[] args) {
		Multiplex m= new Multiplex();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of tickets");
		int tno=sc.nextInt();
		if(tno < 5 || tno > 40)
			System.out.println("minimum of 5 and maximum of 40 tickets");
		else {
			System.out.println("do you want refreshment");
			String r=sc.next();
			System.out.println("do you have coupon code");
			String c=sc.next();
			System.out.println("enter the circle");
			String cir=sc.next();
			   if(cir.equals("k")|| cir.equals("q")) {
				   if(cir.equals("k"))
					   m.addTotal(tno*75);
				   else
					   m.addTotal(tno*150);
				   if(tno>=20) {
					   m.addDiscount(10);
				   }
				   if(c.equals("y"))
					   m.addDiscount(2);
				   if(r.equals("y"))
					   m.addTotal(tno*50);
				   m.displayTotal();
				   
			   }
			   else
				   System.out.println("Invalid input");
		}
	}

}
