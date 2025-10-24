package mar19.TreeMap.com;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapElements {

	public static void main(String[] args) {
		
		NavigableMap<Integer,String> nm = new TreeMap<Integer,String>();
		nm.put(1, "geetha");
		nm.put(2,"teja");
		nm.put(3, "sahasra");
		nm.put(4,"sai");
		System.out.println("descending order"+ nm.descendingMap());
		System.out.println("headMap"+nm.headMap(3,false));
		System.out.println("tailMap" +nm.tailMap(2,true));
		System.out.println("subMap" +nm.subMap(2,true,4,false));

	} 

}
