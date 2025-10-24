package mar18.LinkedHashMap.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class CopyFromAnotherMap {

	public static void main(String[] args) {
		// Creating a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding elements
        linkedHashMap.put("John", 25);
        linkedHashMap.put("Alia", 30);
        linkedHashMap.put("Bob", 28);

        // Creating another map
        Map<String, Integer> anotherMap = new LinkedHashMap<>();
        anotherMap.put("geethu", 35);
        anotherMap.put("Tommy", 40);

        // Copying content from another map
        linkedHashMap.putAll(anotherMap);

        // Iterating over the updated map
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
