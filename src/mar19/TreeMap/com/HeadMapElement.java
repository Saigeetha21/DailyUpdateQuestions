package mar19.TreeMap.com;

import java.util.TreeMap;

public class HeadMapElement {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1, "geetha");
		tm.put(2,"smriti");
		tm.put(3,"srusti");
		tm.put(4,"sanju");
		tm.remove(2);
		System.out.println("HeadMap"+tm.headMap(3,true));
	}
 
}
