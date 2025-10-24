package feb20.com;

class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
    }

    public double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius + ", Area: " + area());
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Width: " + width + ", Height: " + height + ", Area: " + area());
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Red", 5);
        circle1.displayInfo();

        Rectangle rectangle1 = new Rectangle("Blue", 4, 6);
        rectangle1.displayInfo();
    }
}
