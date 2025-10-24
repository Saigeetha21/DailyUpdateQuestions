package mar7.ArrayList.com;

import java.util.ArrayList;

//Retain all method prints the common elements in both the lists
public class RetainAll {
	public static void main(String args[]) {
	ArrayList<String> list1 = new ArrayList<>();
    list1.add("apple");
    list1.add("banana");
    list1.add("orange");

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("banana");
    list2.add("grape");
    list2.add("kiwi");

    // Retain only print the elements present in both lists
    list1.retainAll(list2);

    System.out.println("Elements retained in list1: " + list1); // Output: [banana]
	}
}
