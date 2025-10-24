package feb23.methodoverride.com;

class Parent {
    Number getNumber() {
        return 10;
    }
}

class Child extends Parent {
    @Override
    Integer getNumber() {
        return 20;
    }
}

public class ParentMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.getNumber()); // Output: 10
        
        Child child = new Child();
        System.out.println(child.getNumber()); // Output: 20
    }
}

