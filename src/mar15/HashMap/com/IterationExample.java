package mar15.HashMap.com;

import java.util.HashMap;
import java.util.Map;

public class IterationExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }   
        
        //another method
        map.forEach((key,value)->{
        	System.out.println("key:"+key+",value"+value);
        });

	}
	
	
	

}
