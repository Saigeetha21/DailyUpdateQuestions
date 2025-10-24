package feb26.superkeyword.com;

class Fruit {
    String name;

    Fruit(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name of the fruit: " + name);
    }
}

class Apple extends Fruit {
    String type;

    Apple(String name, String type) {
        super(name); // calling parent class constructor with parameter
        this.type = type;
    }

    void display() {
        super.display(); // calling parent class method
        System.out.println("Type of apple: " + type);
    }
}

public class FruitMain {
    public static void main(String[] args) {
        Apple apple = new Apple("Red Delicious", "Sweet");
        apple.display();
    }
}
