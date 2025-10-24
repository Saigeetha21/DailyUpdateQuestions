package feb19.com;
import java.util.Arrays;

public class StreamMatch{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        boolean anyMatch = Arrays.stream(numbers).anyMatch(n -> n % 2 == 0);
        boolean allMatch = Arrays.stream(numbers).allMatch(n -> n % 2 == 0);
        boolean noneMatch = Arrays.stream(numbers).noneMatch(n -> n % 2 == 0);

        System.out.println("Any match: " + anyMatch);   // Output: true
        System.out.println("All match: " + allMatch);   // Output: false
        System.out.println("None match: " + noneMatch); // Output: false
    }
}
