package feb15.com;

abstract class Vehicle {
    String color;

    Vehicle(String color) {
        this.color = color;
    }

    abstract void display();
}

class Car extends Vehicle {
    Car(String color) {
        super(color);
    }

    void display() {
        System.out.println("Car color: " + color);
    }
}

public class CarMain {
    public static void main(String[] args) {
        Vehicle car = new Car("Red");
        car.display();
    }
}
