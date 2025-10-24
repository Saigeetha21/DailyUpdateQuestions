package mar13.LinkedHashSet.com;

import java.util.LinkedHashSet;

public class PrimitiveTypeExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> numberSet = new LinkedHashSet<>();
        // Add primitive data types
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(30);
        
        // Iterate over primitive data types
        for (int num : numberSet) {
            System.out.println(num);
        }

	}

}
