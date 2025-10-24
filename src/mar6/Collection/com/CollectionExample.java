package mar6.Collection.com;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter integers
        System.out.println("Enter integers (enter -1 to stop):");

        // Read integers from the user until -1 is entered
        int num;
        while ((num = scanner.nextInt()) != -1) {
            // Add the entered number to the ArrayList
            numbers.add(num);
        }

        // Close the scanner
        scanner.close();

        // Display the elements of the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }   
}
