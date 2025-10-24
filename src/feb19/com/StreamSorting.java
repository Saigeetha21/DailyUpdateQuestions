package feb19.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting{
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Kiwi");

        List<String> sortedFruits = fruits.stream()
                                         .sorted()
                                         .collect(Collectors.toList());

        System.out.println(sortedFruits);  // Output: [Apple, Banana, Kiwi, Mango, Orange]
    }
}
