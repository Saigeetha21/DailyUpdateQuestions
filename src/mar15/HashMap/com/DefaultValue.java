package mar15.HashMap.com;

import java.util.HashMap;
import java.util.Map;

public class DefaultValue {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        String key = "C"; 
        int defaultValue = 0;
        int value = map.getOrDefault(key, defaultValue);

        System.out.println("Value for key " + key + ": " + value);
	}

}

