package feb20.com;

class ElectronicDevice {
    String brand;
    String model;
    double price;

    public ElectronicDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}

class Laptop extends ElectronicDevice {
    String processor;

    public Laptop(String brand, String model, double price, String processor) {
        super(brand, model, price);
        this.processor = processor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Processor: " + processor);
    }
}

class Smartphone extends ElectronicDevice {
    String os;

    public Smartphone(String brand, String model, double price, String os) {
        super(brand, model, price);
        this.os = os;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Operating System: " + os);
    }
}

public class ElectronicTest{
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "Inspiron", 1200, "Intel i5");
        laptop.displayInfo();

        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S20", 999, "Android");
        smartphone.displayInfo();
    }
}

