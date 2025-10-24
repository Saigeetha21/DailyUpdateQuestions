package feb19.com;

import java.util.stream.IntStream;

public class StreamLimitingSkipping {
    public static void main(String[] args) {
        IntStream.range(1, 11)
                 .skip(3) // Skip the first 3 elements
                 .limit(5) // Limit to the next 5 elements
                 .forEach(System.out::println);
        // Output: 4, 5, 6, 7, 8
    }
}
