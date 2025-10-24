package feb22.methodoverload.com;

public class Vehicle {
    // Method to calculate speed based on distance and time
    public double calculateSpeed(double distance, double time) {
        return distance / time;
    }

    // Method to calculate speed based on distance and time with different units
    public double calculateSpeed(double distance, double time, String unit) {
        if (unit.equals("km/h")) {
            return distance / time;
        } else if (unit.equals("m/s")) {
            return distance * 1000 / (time * 3600);
        } else {
            return -1; // Invalid unit
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println("Speed (km/h): " + vehicle.calculateSpeed(100, 2));
        System.out.println("Speed (m/s): " + vehicle.calculateSpeed(100, 2, "m/s"));
    }
}

