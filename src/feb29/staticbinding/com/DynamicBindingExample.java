package feb29.staticbinding.com;

class Fruits {
    void eat() {
        System.out.println("Eating a fruit...");
    }
}

class Apples extends Fruits{
    void eat() {
        System.out.println("Eating an apple...");
    }
}

public class DynamicBindingExample {
    public static void main(String[] args) {
        Fruits fruit = new Apples(); // Fruit reference to Apple object
        fruit.eat(); // Dynamic binding - JVM binds eat() to Apple class at runtime
    }
}
