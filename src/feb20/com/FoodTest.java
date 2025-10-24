package feb20.com;

class Food {
    String name;
    int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public void displayInfo() {
        System.out.println("Food: " + name + ", Calories: " + calories);
    }
}

class Fruits extends Food {
    String color;

    public Fruits(String name, int calories, String color) {
        super(name, calories);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}

class Vegetable extends Food {
    boolean isOrganic;

    public Vegetable(String name, int calories, boolean isOrganic) {
        super(name, calories);
        this.isOrganic = isOrganic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Is Organic: " + isOrganic);
    }
}

public class FoodTest {
    public static void main(String[] args) {
        Fruits apple = new Fruits("Apple", 95, "Red");
        apple.displayInfo();

        Vegetable spinach = new Vegetable("Spinach", 23, true);
        spinach.displayInfo();
    }
}
