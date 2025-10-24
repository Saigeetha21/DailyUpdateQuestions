package mar18.LinkedHashMap.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveFirstEntry {

	public static void main(String[] args) {
		// Creating a LinkedHashMap with a maximum size of 3
        Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(3, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > 3; // Remove the eldest entry when size exceeds 3
            }
        };

        // Adding elements
        linkedHashMap.put("John", 25);
        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 28);
        linkedHashMap.put("Eve", 35);

        // Iterating over the map
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
