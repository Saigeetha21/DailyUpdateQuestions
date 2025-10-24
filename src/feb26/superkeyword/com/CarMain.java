package feb26.superkeyword.com;

class Vehicle {
    String model;

    Vehicle(String model) {
        this.model = model;
    }

    void display() {
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    String type;

    Car(String model, String type) {
        super(model); // calling parent class constructor with parameter
        this.type = type;
    }

    void display() {
        super.display(); // calling parent class method
        System.out.println("Type: " + type);
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "SUV");
        car.display();
    }
}
