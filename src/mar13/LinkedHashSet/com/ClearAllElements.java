package mar13.LinkedHashSet.com;

import java.util.LinkedHashSet;

public class ClearAllElements {

	public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        
        // Adding elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        
        // Clearing all elements
        linkedHashSet.clear();
        
        // Checking if the set is empty
        System.out.println("Is the set empty? " + linkedHashSet.isEmpty());
	}

}
