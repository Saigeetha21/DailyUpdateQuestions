package mar19.TreeMap.com;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());

        // Adding elements to the TreeMap
        treeMap.put("Alice", 25);
        treeMap.put("Bob", 30);
        treeMap.put("Charlie", 20);
        treeMap.put("David", 35);

        // Displaying the TreeMap
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());

	}
	}

}
