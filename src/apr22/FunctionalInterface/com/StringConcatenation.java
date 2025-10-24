package apr22.FunctionalInterface.com;

@FunctionalInterface
interface StringConcatenator {
    String concatenate(String str1, String str2);
}

public class StringConcatenation {
	 public static void main(String[] args) {
	        // Defining a lambda expression to concatenate two strings
	        StringConcatenator concatenator = (str1, str2) -> str1 + str2;

	        // Using the concatenator operation
	        System.out.println("Concatenated string: " + concatenator.concatenate("Hello", "World")); // Should print "HelloWorld"
	        System.out.println("Concatenated string: " + concatenator.concatenate("Java", "Programming")); // Should print "JavaProgramming"
	    } 

}
