package mar12.HashSet.com;

import java.util.HashSet;

public class SearchElement {

	public static void main(String[] args) {
		HashSet<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");

        // Checking if an element exists
        String searchElement = "Cat";
        System.out.println("Does the HashSet contain " + searchElement + "? " + animals.contains(searchElement));
	}

}
