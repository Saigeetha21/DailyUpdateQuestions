package mar21.comparatorinterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DescendingIntegerComparator implements Comparator<Integer> {
    public int compare(Integer num1, Integer num2) {
        return Integer.compare(num2, num1); // Compare in reverse order
    }

    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);

        Collections.sort(numbers, new DescendingIntegerComparator());

        System.out.println("Sorted in descending order:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
  

