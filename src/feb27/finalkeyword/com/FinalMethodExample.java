package feb27.finalkeyword.com;

class Parent {
    // Declaring a final method
    public final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
	
	
    // Attempting to override a final method will result in a compile-time error
    // public void display() {} // Error: cannot override final method from Parent
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
