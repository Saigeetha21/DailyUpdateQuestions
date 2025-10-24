package mar12.HashSet.com;

import java.util.HashSet;

public class IntergerHashSet {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Adding a duplicate element - will not be added
        numbers.add(10);

        System.out.println("Numbers: " + numbers);

	}

}
