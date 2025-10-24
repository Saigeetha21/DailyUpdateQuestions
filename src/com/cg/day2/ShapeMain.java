package com.cg.day2;

public class ShapeMain {
	public static void main(String[] args) {
		Geometry.display(new Car());
		Shape s = Geometry.getShape(2);
		if(s==null)
			System.out.println("there is not shape");
		else
		{
			s.area();
			
			
			s.draw();
		}
	}
	

}
