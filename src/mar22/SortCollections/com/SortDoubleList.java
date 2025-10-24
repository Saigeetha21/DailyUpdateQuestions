package mar22.SortCollections.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDoubleList {

	public static void main(String[] args) {
		List<Double> doubles = new ArrayList<>();
        doubles.add(5.6);
        doubles.add(2.3);
        doubles.add(8.1);
        doubles.add(3.9);

        System.out.println("Before sorting: " + doubles);
        
        Collections.sort(doubles); // Sorts the list of doubles in natural order

        System.out.println("After sorting: " + doubles);

	}

}
