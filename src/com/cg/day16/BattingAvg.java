package com.cg.day16;

import java.util.Scanner;

//using scanner class(taking input from the user)
public class BattingAvg {
	public static void main(String arg[]) {
		long matches;
		long runs;
		long innings;
		long notout;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of matches played");
		matches=sc.nextLong();
		while(true) {
			System.out.println("enter the  number innings batted");
			innings=sc.nextLong();
		
			if(innings<=matches)
			break;
			
			System.out.println("enter the number innings batted correctly<=matches");
		}
		
		while(true) {
			System.out.println("enter number of times notout");
			notout = sc.nextLong();
			if(notout<=innings)
			break;
			System.out.println("enter the number times became notout correctly<=innings");
			
		}
		System.out.println("enter runs scored");
		runs=sc.nextLong();
		if(innings==notout)
			avg=runs;
		else
			avg=runs/(innings-notout);
		System.out.println("batting avg ="+avg);
		}

}
