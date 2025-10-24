package feb26.superkeyword.com;

class Parent {
    int num;

    Parent(int num) {
        this.num = num;
    }

    void display() {
        System.out.println("Number in Parent class: " + num);
    }
}

class Child extends Parent {
    int num;

    Child(int num1, int num2) {
        super(num1); // calling parent class constructor
        this.num = num2;
    }

    void display() {
        super.display(); // calling parent class method
        System.out.println("Number in Child class: " + num);
    }
}

public class ParentTest{
    public static void main(String[] args) {
        Child obj = new Child(10, 20);
        obj.display();
    }
}

