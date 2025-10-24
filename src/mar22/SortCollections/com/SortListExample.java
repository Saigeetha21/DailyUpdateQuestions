package mar22.SortCollections.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("David");

        System.out.println("Before sorting: " + names);
        
        Collections.sort(names); // Sorts the list in natural order

        System.out.println("After sorting: " + names);

	}

}
