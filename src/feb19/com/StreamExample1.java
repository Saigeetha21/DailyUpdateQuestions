package feb19.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Kiwi");

        List<String> result = fruits.stream()
                                    .filter(fruit -> fruit.startsWith("A"))
                                    .collect(Collectors.toList());

        System.out.println(result);  // Output: [Apple]
    }
}

