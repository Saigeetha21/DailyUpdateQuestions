package feb27.finalkeyword.com;

public class FinalInstanceVariableExample {
    // Final instance variable
    final int finalValue;

    // Constructor to initialize final instance variable
    public FinalInstanceVariableExample(int value) {
        finalValue = value;
    }

    public static void main(String[] args) {
        FinalInstanceVariableExample obj = new FinalInstanceVariableExample(100);
        System.out.println("Final Value: " + obj.finalValue);
    }
}
