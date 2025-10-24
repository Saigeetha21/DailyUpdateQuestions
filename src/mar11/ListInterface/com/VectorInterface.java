package mar11.ListInterface.com;

import java.util.List;
import java.util.Vector;

public class VectorInterface {

	public static void main(String[] args) {
		List<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Accessing elements
        System.out.println("Third fruit: " + vector.get(2));

        // Iterating through elements
        for (String fruit : vector) {
            System.out.println(fruit);

	}
	}

}
