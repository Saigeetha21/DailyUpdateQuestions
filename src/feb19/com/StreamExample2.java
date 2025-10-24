package feb19.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Kiwi");

        List<Integer> lengths = fruits.stream()
                                     .map(String::length)
                                     .collect(Collectors.toList());

        System.out.println(lengths);  // Output: [5, 6, 6, 5, 4]
    }
}

