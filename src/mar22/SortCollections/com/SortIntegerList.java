package mar22.SortCollections.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntegerList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);

        System.out.println("Before sorting: " + numbers);
        
        Collections.sort(numbers); // Sorts the list in natural order

        System.out.println("After sorting: " + numbers);
	}

}
