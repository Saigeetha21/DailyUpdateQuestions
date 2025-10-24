package feb15.com;

//Abstract Class with Data Member and Methods
abstract class Food {
    String name;
    double price;

    Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void cook();

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

class Pizza extends Food {
    Pizza(String name, double price) {
        super(name, price);
    }

    void cook() {
        System.out.println("Preparing " + name);
        System.out.println("Baking pizza in the oven");
    }
}

class Salad extends Food {
    Salad(String name, double price) {
        super(name, price);
    }

    void cook() {
        System.out.println("Preparing " + name);
        System.out.println("Mixing vegetables for the salad");
    }
}

public class FoodMain {
    public static void main(String[] args) {
        Food pizza = new Pizza("Pepperoni Pizza", 12.99);
        pizza.displayInfo();
        pizza.cook();

        System.out.println();

        Food salad = new Salad("Indian Salad", 7.99);
        salad.displayInfo();
        salad.cook();
    }
}
