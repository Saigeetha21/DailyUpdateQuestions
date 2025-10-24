package feb23.methodoverride.com;

class Vehicle1 {
    public void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle1 {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}

class Bike1 extends Vehicle1 {
    @Override
    public void start() {
        System.out.println("Bike started");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle1 c = new Car();
        Vehicle1 bike = new Bike1();

        c.start(); // Output: Car started
        bike.start(); // Output: Bike started
    }
}
