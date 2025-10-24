package com.cg.day1;

public class ComReal {
	
	public static void main(String[] args) {
		Complex c1 = new Complex(5,2);
		Complex c2 = new Complex(3,4);
		Real r = new Real();
		Complex c = r.add(c1, c2);
		System.out.println(c);
		c.showC();
	}       

}
