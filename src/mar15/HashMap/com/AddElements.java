package mar15.HashMap.com;

import java.util.HashMap;
import java.util.Map;

public class AddElements {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"geetha");
		hm.put(2,"teja");
		hm.put(3, "sahasra");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
		
			 
			
		}
	}

}
