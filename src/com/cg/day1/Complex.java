package com.cg.day1;

public class Complex {
	int real;
	int complex;
	public Complex(int real,int complex) {
		super();
		this.real = real;
		this.complex = complex;
		
	}  
	public Complex() {
		super();
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getComplex() {
		return complex;
	}
	public void setComplex(int complex) {
		this.complex=complex;
	}
	public void showC() {
		System.out.println(this.real+"+i" +this.complex);
	}
	@Override
	public String toString() {
		return "Complex [real=" + real + ", complex=" + complex + "]";
	}
	

}
