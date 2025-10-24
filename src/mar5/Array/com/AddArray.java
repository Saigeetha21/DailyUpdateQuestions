package mar5.Array.com;

import java.util.ArrayList;

public class AddArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		// Iterating through ArrayList
		for (int num : numbers) {
		    System.out.println("Number: " + num);
		}

		// Adding elements dynamically
		numbers.add(40);
		System.out.println("Updated size: " + numbers.size());

	}

}
