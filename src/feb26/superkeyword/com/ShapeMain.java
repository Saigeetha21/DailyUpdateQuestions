package feb26.superkeyword.com;

class Shape {
    String color = "Red";
}

class Rectangle extends Shape {
    String color = "Blue";

    void display() {
        System.out.println("Rectangle color: " + color);
        System.out.println("Shape color: " + super.color); // accessing parent class variable
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.display();
    }
}
