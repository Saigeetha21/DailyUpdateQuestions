package feb23.methodoverride.com;

class Shape {
    Shape draw() {
        System.out.println("Drawing a shape");
        return this;
    }
}

class Circle extends Shape {
    @Override
    Circle draw() {
        System.out.println("Drawing a circle");
        return this;
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.draw(); // Output: Drawing a shape

        Circle circle = new Circle();
        circle.draw(); // Output: Drawing a circle

        Shape shape2 = new Circle();
        shape2.draw(); // Output: Drawing a circle
    }
}

