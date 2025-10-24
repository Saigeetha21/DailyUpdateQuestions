package mar18.LinkedHashMap.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccessValues {

	public static void main(String[] args) {
		// Creating a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding elements
        linkedHashMap.put("Jessi", 25);
        linkedHashMap.put("smitha", 30);
        linkedHashMap.put("vami", 28);

        // Accessing values by key
        int jessiAge = linkedHashMap.get("Jessi");
        System.out.println("Jessi's age: " + jessiAge);
	}

}
