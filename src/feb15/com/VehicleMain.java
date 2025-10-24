package feb15.com;

abstract class Vehicles {
    abstract double calculateSpeed(double distance, double time);

     static void displayInfo(Vehicles vehicle) {
        System.out.println("Vehicle speed: " + vehicle.calculateSpeed(100, 2));
    }
}

class Scooty extends Vehicles {
    double calculateSpeed(double distance, double time) {
        return distance / time;
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Scooty c= new Scooty();
        Vehicles.displayInfo(c);
    }
}


