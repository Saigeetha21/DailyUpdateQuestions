package feb27.finalkeyword.com;

public class FinalArrayExample {
    public static void main(String[] args) {
        final int[] numbers = {1, 2, 3, 4, 5};

        // Attempting to modify elements of the final array will result in a compile-time error
        // numbers[0] = 10; // Error: cannot assign a value to final variable 'numbers'

        // However, elements can be accessed and used
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
