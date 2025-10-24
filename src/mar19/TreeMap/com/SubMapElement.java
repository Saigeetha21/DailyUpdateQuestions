package mar19.TreeMap.com;

import java.util.TreeMap;

public class SubMapElement {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1,"apple");
		tm.put(2,"mango");
		tm.put(3,"sapota");
		tm.put(4,"kiwi");
		System.out.println("subMap"+tm.subMap(1,true,4,false));
	}

}
