package feb23.methodoverride.com;

class Base {
    void display() {
        System.out.println("Base's display");
    }
}

class Derived extends Base {
    @Override
    void display() {
        super.display(); // Invoking superclass method
        System.out.println("Derived's display");
    }

    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.display();
    }
}
