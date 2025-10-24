package com.cg.day8;

public class ColorCircleTest {

	public static void main(String[] args) {
		ColorCircle c = new ColorCircle();
		
		System.out.println(c);
		
		ColorCircle c1 = new ColorCircle(20);
		
		System.out.println(c1);
		
		ColorCircle c2 = new ColorCircle(30,40,50);
		
		System.out.println(c2);
		
		
		System.out.println(c);
		c.setColor(100);
		c.display();
		
		

	}

}
