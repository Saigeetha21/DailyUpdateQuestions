package feb20.com;

class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

class Car extends Vehicle {
    int doors;

    public Car(String make, String model, int year, int doors) {
        super(make, model, year);
        this.doors = doors;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}

class Motorcycle extends Vehicle {
    int cc;

    public Motorcycle(String make, String model, int year, int cc) {
        super(make, model, year);
        this.cc = cc;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("CC: " + cc);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020, 4);
        car1.displayInfo();

        Motorcycle bike1 = new Motorcycle("Honda", "CBR", 2019, 600);
        bike1.displayInfo();
    }
}

