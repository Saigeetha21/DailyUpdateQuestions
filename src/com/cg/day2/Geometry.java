package com.cg.day2;

public class Geometry {
	public static void display(Shape s) {
		s.area();
		s.draw();
	}
	public static Shape getShape(int n) {
		Shape s = null;
		switch(n) {
		case 1:
			s = new TriangleO();
			break;
		case 2:
			s = new RectangleO();
			break;
		case 3:
			s = new Car();
			break;
			default:
				
				s=null;
		}
		return s;
	}

}
