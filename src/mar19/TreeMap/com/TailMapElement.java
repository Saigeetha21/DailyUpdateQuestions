package mar19.TreeMap.com;

import java.util.TreeMap;

public class TailMapElement {

	public static void main(String[] args) {
		TreeMap<Integer,String>tm = new TreeMap<Integer,String>();
		tm.put(1,"geetha");
		tm.put(2,"teja");
		tm.put(3,"nari");
		tm.put(4,"sanvi");
		System.out.println("TailMap"+tm.tailMap(2,false));

	}

}
