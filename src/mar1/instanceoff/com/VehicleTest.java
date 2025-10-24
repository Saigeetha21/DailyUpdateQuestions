package mar1.instanceoff.com;

class Vehicle {
    public void drive() {
        System.out.println("Vehicle is being driven");
    }
}

class Sedan extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Sedan is being driven");
    }
}

class SUV extends Vehicle {
    @Override
    public void drive() {
        System.out.println("SUV is being driven");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        // Create instances of Sedan and SUV
        Vehicle vehicle1 = new Sedan();
        Vehicle vehicle2 = new SUV();

        // Check if vehicle1 is an instance of Sedan
        if (vehicle1 instanceof Sedan) {
            // If yes, cast it to Sedan and invoke its drive() method
            Sedan sedan = (Sedan) vehicle1;
            sedan.drive(); // Output: Sedan is being driven
        }

        // Check if vehicle2 is an instance of SUV
        if (vehicle2 instanceof SUV) {
            // If yes, cast it to SUV and invoke its drive() method
            SUV suv = (SUV) vehicle2;
            suv.drive(); // Output: SUV is being driven
        }
    }
}
