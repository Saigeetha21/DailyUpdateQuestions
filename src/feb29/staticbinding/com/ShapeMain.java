package feb29.staticbinding.com;

class Shape{
	void draw() {
		System.out.println("Drawing the shape");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing the circle");
	}
}

public class ShapeMain {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw(); //static binding 
		
		Shape c = new Circle();
		c.draw();
	}

}
