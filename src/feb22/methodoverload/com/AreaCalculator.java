package feb22.methodoverload.com;

public class AreaCalculator {

    // Method to calculate the area of a square
    public int calculateArea(int side) {
        return side * side;
       
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Testing different overloaded methods
        System.out.println("Area of square with side 5: " + calculator.calculateArea(5));
        System.out.println("Area of rectangle with length 4 and width 6: " + calculator.calculateArea(4, 6));
        System.out.println("Area of circle with radius 3: " + calculator.calculateArea(3));
    }
}
