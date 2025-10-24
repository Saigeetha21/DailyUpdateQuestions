package com.cg.day8;

public class ColorCircle extends Circle {
	int color;
	
	public ColorCircle() {
		System.out.println("Child Constructor");
	}
	
	public ColorCircle(int r) {
		super(r);
	}
	
	public ColorCircle(int x, int y, int r) {
		super(x,y,r);
	}
	
	public void setColor(int color) {
		this.color=color;
	}
	
	public void display() {
		super.display();
		
	System.out.println("Color "+color);
	}

}
