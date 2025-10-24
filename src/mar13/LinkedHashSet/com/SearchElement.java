package mar13.LinkedHashSet.com;

import java.util.LinkedHashSet;

public class SearchElement {

	public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        
        // Adding elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        
        // Checking if an element exists
        boolean exists = linkedHashSet.contains("Banana");
        System.out.println("Does Banana exist in the set? " + exists);
	}

}
