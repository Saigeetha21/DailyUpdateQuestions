package feb29.staticbinding.com;

class Fruit {
    void eat() {
        System.out.println("Eating a fruit...");
    }
}

class Apple extends Fruit {
    void eat() {
        System.out.println("Eating an apple...");
    }
}

public class StaticBindingExample {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(); // Fruit reference to Apple object
        fruit.eat(); // Static binding - Compiler binds eat() to Fruit class at compile-time
    }
}
