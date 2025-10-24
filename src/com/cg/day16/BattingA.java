package com.cg.day16;

import java.util.Scanner;

//by using user define method
public class BattingA {
	public static void main(String arg[]) {
		double matches,runs,innings,notout;
		double avg;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of matches played");
		matches=sc.nextDouble();
		while(true) {
			
			System.out.println("enter the number of innings batted");
			innings=sc.nextDouble();
			if(innings<=matches)
				break;
			System.out.println("enter the number of innings batted correctly<mathes");
			
		}
		while(true) {
			System.out.println("enter the number of times notout");
			notout=sc.nextDouble();
			if(notout<=innings)
				break;
			System.out.println("enter the number of times became notout correctly<innings");
		}
		System.out.println("enter runs scored");
		runs=sc.nextDouble();
		avg=avgCalculation(runs,innings,notout);
		System.out.println("batting average="+avg);
	
	}
	static double avgCalculation(double r,double i,double n) {
		if(i!=n)
		{
			return r/(i-n);
		}
		else {
			return r;
		}
	}

}
