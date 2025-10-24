package mar14.TreeSet.com;

import java.util.TreeSet;

public class TreeSubSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Create a subset from 20 to 40
        TreeSet<Integer> subset = new TreeSet<>(treeSet.subSet(20, true, 40, true));

        System.out.println(subset); // Output: [20, 30, 40]
    }
}  
