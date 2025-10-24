package mar20.comparableinterface.com;

import java.util.Arrays;

public class StringSortingExample {

	public static void main(String[] args) {
		String[] names = {"John", "Alice", "Bob", "Charlie"};

        Arrays.sort(names);

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }  
	}

	
}
