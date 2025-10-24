package com.cg.day5;

public class Multiplex {
	private double total=0;
	public void addTotal(int amt) {
		total += amt;
		
	}
	public void addDiscount(int dis) {
		double less=(total*dis)/100;
		total=total-less;
		
	}
	public void displayTotal() {
		System.out.println("Ticket cost:" +total);
	}

}
