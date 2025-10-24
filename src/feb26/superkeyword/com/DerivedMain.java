package feb26.superkeyword.com;

class BaseClass {
    void display() {
        System.out.println("Base class method");
    }
}

class DerivedClass extends BaseClass {
    void display() {
        super.display(); // calling parent class method
        System.out.println("Derived class method");
    }
}

public class DerivedMain {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.display();
    }
    
    
}
