package feb19.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapping {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado", "blueberry");

        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                                                                 .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(groupedByFirstLetter);
        // Output: {a=[apple, avocado], b=[banana, blueberry], c=[cherry]}
    }
}
