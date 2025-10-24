package feb14.com;

//Interface defining methods for shape calculation
interface Shapes {
 double calculateArea();
 double calculatePerimeter();
}

//Class implementing Shape interface for Circle
class Circle1 implements Shapes {
 private double radius;

 public Circle1(double radius) {
     this.radius = radius;
 }

 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}

//Class implementing Shape interface for Rectangle
class Triangle implements Shapes {
 private double length;
 private double width;

 public Triangle (double length, double width) {
     this.length = length;
     this.width = width;
 }

 public double calculateArea() {
     return length * width;
 }

 public double calculatePerimeter() {
     return 2 * (length + width);
     
   
 
 
	
}
	
	
}

public class Circle {
    public static void main(String[] args) {
        // Creating a Circle object with radius 5
        Circle1 circle = new Circle1(5);
        
        // Calculating and printing the area of the circle
        System.out.println("Area of the circle: " + circle.calculateArea());
        
        // Calculating and printing the perimeter of the circle
        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());
        
        // Creating a Triangle object with length 4 and width 6
        Triangle triangle = new Triangle(4, 6);
        
        // Calculating and printing the area of the triangle
        System.out.println("Area of the rectangle: " + triangle.calculateArea());
        
        // Calculating and printing the perimeter of the triangle
        System.out.println("Perimeter of the rectangle: " + triangle.calculatePerimeter());
    }
}

