package mar18.LinkedHashMap.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class ElementContains {

	public static void main(String[] args) {
		// Creating a LinkedHashMap with access order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        // Adding elements
        linkedHashMap.put("John", 25);
        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 28);

        // Accessing elements
        linkedHashMap.get("Alice");

        // Iterating over the map
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
