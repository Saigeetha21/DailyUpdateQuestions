package feb27.finalkeyword.com;

public class FinalConstructorExample {
    final int x;

    // Constructor with a final parameter
    public FinalConstructorExample(final int value) {
        x = value;
    }

    public static void main(String[] args) {
        FinalConstructorExample obj = new FinalConstructorExample(100);
        System.out.println("Value of x: " + obj.x);
    }
}
