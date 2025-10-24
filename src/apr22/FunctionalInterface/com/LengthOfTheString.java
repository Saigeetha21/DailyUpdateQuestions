package apr22.FunctionalInterface.com;

@FunctionalInterface
interface StringLengthCalculator {
    int calculateLength(String str);
}

public class LengthOfTheString {
	public static void main(String[] args) {
        // Defining a lambda expression to calculate the length of a string
        StringLengthCalculator lengthCalculator = str -> str.length();

        // Using the lengthCalculator operation
        System.out.println("Length of 'Hello': " + lengthCalculator.calculateLength("Hello")); // Should print 5
        System.out.println("Length of 'Java Programming': " + lengthCalculator.calculateLength("Java Programming")); // Should print 17
    }
   
}
