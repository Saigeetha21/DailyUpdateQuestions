package com.cg.day7;

public class Rectangle  extends Figure{
	public Rectangle(double dim1, double dim2) {
		super(dim1, dim2);
	}
	public void area() {
		System.out.println("area of rectangle is"+(dim1*dim2));
	}

}
