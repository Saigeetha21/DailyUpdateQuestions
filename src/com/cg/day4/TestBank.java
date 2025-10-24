package com.cg.day4;

public class TestBank {
	public static void main(String args[]) {
		Bank b;
		b=new SBI();
		System.out.println("Rate of interest is:"+b.getRateOfInterest()+"%");
		b=new PNB();
		System.out.println("Rate of interest is:"+b.getRateOfInterest()+"%");
		

		
	}

}
