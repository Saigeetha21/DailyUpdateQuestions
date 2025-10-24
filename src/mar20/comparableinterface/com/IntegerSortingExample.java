package mar20.comparableinterface.com;

import java.util.Arrays;

public class IntegerSortingExample {
	public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 1};

        Arrays.sort(numbers);

        System.out.println("Sorted Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
 
	    
}
