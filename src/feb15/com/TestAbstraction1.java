package feb15.com;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Rectangle shape is drawing");
	}
	
}

class Circle extends Shape{
	void draw() {
		System.out.println("circle is drawing");
	}
}

public class TestAbstraction1{
  //In abstraction it doesn't instantiate like shape s= new shape();(It doesn't work)
	public static void main(String[] args) {
		Shape s = new Rectangle();
		Shape s1 = new Circle();
		s.draw();
		s1.draw();

	}

	
}
