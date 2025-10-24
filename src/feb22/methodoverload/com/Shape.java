package feb22.methodoverload.com;

public class Shape {
    // Method to calculate area of square
    public int area(int side) {
        return side * side;
    }

    // Method to calculate area of rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of square with side 4: " + shape.area(4));
        System.out.println("Area of rectangle with length 3 and width 5: " + shape.area(3, 5));
        System.out.println("Area of circle with radius 2.5: " + shape.area(2.5));
    }
}
