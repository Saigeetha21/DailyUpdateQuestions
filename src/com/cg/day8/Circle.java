package com.cg.day8;

public class Circle {
	private int x;
	private int y;
	private int r;
	
	public Circle() {
		System.out.println("Parent Constructor");
	}
	
	public Circle(int r) {
		this.r=r;
	}
	
	public Circle(int x, int y, int r) {
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	public void area() {
		System.out.println(3.142*r*r);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y=y;
	}

	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r=r;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", r=" + r + "]";
	}
	
	public void display() {
		System.out.println("X:- "+x);
		System.out.println("Y:- "+y);
		System.out.println("R:- "+r);
	}
}
