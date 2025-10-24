package mar12.HashSet.com;

import java.util.HashSet;

public class IsEmptyElement {

	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();

        // Checking if the HashSet is empty
        System.out.println("Is the HashSet empty? " + fruits.isEmpty());

        fruits.add("Apple");
        fruits.add("Banana");

        // Checking again after adding elements
        System.out.println("Is the HashSet empty? " + fruits.isEmpty());

	}

}
