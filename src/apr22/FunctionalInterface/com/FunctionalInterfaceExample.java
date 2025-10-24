package apr22.FunctionalInterface.com;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Defining addition operation using lambda expression
        MathOperation addition = (a, b) -> a + b;

        // Using the addition operation
        int result = addition.operate(5, 3);
        System.out.println("Result of addition: " + result); 
    }
}

