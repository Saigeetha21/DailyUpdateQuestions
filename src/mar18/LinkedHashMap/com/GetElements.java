package mar18.LinkedHashMap.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetElements {

	public static void main(String[] args) {
		// Creating a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding elements
        linkedHashMap.put("John", 25);
        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 28);

        // Iterating over the map
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
