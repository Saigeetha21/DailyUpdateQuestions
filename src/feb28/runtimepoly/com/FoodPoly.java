package feb28.runtimepoly.com;

abstract class Food {
    abstract void eat();
}

class Pizza extends Food {
    void eat() {
        System.out.println("Eating Pizza");
    }
}

class Sushi extends Food {
    void eat() {
        System.out.println("Eating Sushi");
    }
}

class IceCream extends Food {
    void eat() {
        System.out.println("Eating Ice Cream");
    }
}

public class FoodPoly{
    public static void main(String[] args) {
        Food pizza = new Pizza();
        Food sushi = new Sushi();
        Food iceCream = new IceCream();

        pizza.eat(); // Output: Eating Pizza
        sushi.eat(); // Output: Eating Sushi
        iceCream.eat(); // Output: Eating Ice Cream
    }
}

