package apr22.FunctionalInterface.com;

@FunctionalInterface
interface NumberChecker {
    boolean check(int number);
}

public class Checkifanumberiseven {
	 public static void main(String[] args) {
	        // Defining a lambda expression to check if a number is even
	        NumberChecker isEven = number -> number % 2 == 0;

	        // Using the isEven operation
	        System.out.println("Is 6 even? " + isEven.check(6)); // Should print true
	        System.out.println("Is 7 even? " + isEven.check(7)); // Should print false
	    }   

}
