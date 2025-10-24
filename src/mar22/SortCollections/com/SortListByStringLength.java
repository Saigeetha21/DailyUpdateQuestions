package mar22.SortCollections.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListByStringLength {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("pear");
        words.add("grape");

        System.out.println("Before sorting by length: " + words);
        
        Collections.sort(words, Comparator.comparingInt(String::length)); // Sorts the list by length using Comparator

        System.out.println("After sorting by length: " + words);
	}

}
