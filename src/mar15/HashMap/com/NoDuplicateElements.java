package mar15.HashMap.com;

import java.util.HashMap;
import java.util.Map;

public class NoDuplicateElements {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "apple");
		hm.put(2,"banana");
		hm.put(3, "kiwi");
		hm.put(1,"sapota");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
			
		}  
	}   
  
}
