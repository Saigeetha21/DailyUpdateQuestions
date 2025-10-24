package mar19.TreeMap.com;


import java.util.Map;
import java.util.TreeMap;

public class RemoveElements {

	public static void main(String[] args) {
		TreeMap<Integer,String>tm = new TreeMap<Integer,String>();
		tm.put(1, "geetha");
		tm.put(2, "teja");
		tm.put(3, "sahasra");
		
		for(Map.Entry m:tm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			 
		}
		tm.remove(2);
		for(Map.Entry m:tm.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
			
		}
	}

}
