package mar15.HashMap.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValueExistence {

	public static void main(String[] args) {
		/* Map<String, Integer> map = new HashMap<>();
	        map.put("A", 1);
	        map.put("B", 2);
	        map.put("C", 3);

	        int valueToCheck = 2;
	        boolean exists = map.containsValue(valueToCheck);

	        System.out.println("Value " + valueToCheck + " exists: " + exists);*/
		//converting set to map
		Set<String> set = new HashSet<>();
	       set.add("geetha");
	       set.add("teja");
	       set.add("sahu");
	       
	       Map<String,Integer> map = new HashMap<>();
	       for(String key :set){
	           map.put(key,key.length());
	       }
	       System.out.println(map);
	}
   
} 
