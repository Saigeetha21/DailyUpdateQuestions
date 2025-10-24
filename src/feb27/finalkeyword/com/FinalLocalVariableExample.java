package feb27.finalkeyword.com;

public class FinalLocalVariableExample {
    public static void main(String[] args) {
        // Final local variable
        final int finalValue = 50;

        // Attempting to reassign the value of final local variable will result in a compile-time error
        // finalValue = 100; // Error: cannot assign a value to final variable 'finalValue'

        System.out.println("Final Value: " + finalValue);
    }
}
