package mar14.TreeSet.com;

import java.util.TreeSet;

public class RemoveElements {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);

        // Removing an element
        treeSet.remove(20);

        System.out.println(treeSet);

	} 

}
