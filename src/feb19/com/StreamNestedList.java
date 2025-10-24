package feb19.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNestedList {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        List<Integer> flattenedList = nestedList.stream()
                                                .flatMap(List::stream)
                                                .collect(Collectors.toList());

        System.out.println(flattenedList);  // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
