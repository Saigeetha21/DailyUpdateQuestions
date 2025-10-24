package mar19.TreeMap.com;

import java.util.TreeMap;

public class TreeMapFloorCeiling {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");

        // Floor operation
        System.out.println("Floor Entry for 4: " + treeMap.floorEntry(4));
        
        // Ceiling operation
        System.out.println("Ceiling Entry for 4: " + treeMap.ceilingEntry(4));
	}

}
