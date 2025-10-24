package mar19.TreeMap.com;

import java.util.TreeMap;

public class SortedElements {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1,"geetha");
		tm.put(2,"teja");
		tm.put(3,"sai");
		tm.put(4, "santhi");
		tm.put(5, "sam");
		
		System.out.println("headMap"+tm.headMap(4,true));
		System.out.println("tailMap"+tm.tailMap(1,false));
		System.out.println("subMap"+tm.subMap(1,true,5,false));
		
		
	}

}
