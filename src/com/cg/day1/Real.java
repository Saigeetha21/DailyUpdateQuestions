package com.cg.day1;

public class Real {
	public Complex add(Complex c1, Complex c2) {
		int real = c1.getReal()+c2.getReal();
		int complex =c1.getComplex()+c2.getComplex();
		Complex c = new Complex(real,complex);
		return c;
	}   

}
