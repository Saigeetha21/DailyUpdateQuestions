package mar15.HashMap.com;

import java.util.HashMap;
import java.util.Map;
//The compute method is used to update the value associated with the key "A".

public class ComputeExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        String key = "A"; 
        //If the value is null, it assigns 1 as the new value for the key.
        //If the value is not null, it increments the existing value by 1.
        map.compute(key, (k, v) -> v == null ? 1 : v + 1);

        System.out.println("Updated value for key " + key + ": " + map.get(key));
	}

}

