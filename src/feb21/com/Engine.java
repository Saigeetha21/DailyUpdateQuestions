package feb21.com;
class Engine {
    private String type;
    private double horsepower;

    public Engine(String type, double horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    // Other methods and attributes
}

class Car {
    private String model;
    private String make;
    private Engine engine;

    public Car(String model, String make, Engine engine) {
        this.model = model;
        this.make = make;
        this.engine = engine;
    }

    // Other methods and attributes
}

