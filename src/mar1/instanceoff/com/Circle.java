package mar1.instanceoff.com;

class Shape{
	
}
public class Circle extends Shape{
	static void draw(Shape s) {
		Circle c = (Circle)s;//downcasting
		System.out.println("Downcasting is performed");
	}
	public static void main(String[] args) {
		    Shape s = new Circle();
		    Circle.draw(s);
		
		

	}

}
