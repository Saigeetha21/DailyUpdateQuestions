package com.cg.day7;

public class Triangle extends Figure{
	public Triangle(double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	public void area() {
		System.out.println("the area of triangle is" +(dim1*dim2)/2);
	}

}
