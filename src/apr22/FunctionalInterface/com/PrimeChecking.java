package apr22.FunctionalInterface.com;

@FunctionalInterface
interface PrimeChecker {
    boolean check(int number);
}

public class PrimeChecking {
	public static void main(String[] args) {
        // Defining a lambda expression to check if a number is prime
        PrimeChecker isPrime = number -> {
            if (number <= 1) return false;
            if (number <= 3) return true;
            if (number % 2 == 0 || number % 3 == 0) return false;
            for (int i = 5; i * i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) return false;
            }
            return true;
        };

        // Using the isPrime operation
        System.out.println("Is 7 prime? " + isPrime.check(7)); // Should print true
        System.out.println("Is 10 prime? " + isPrime.check(10)); // Should print false
    }

   
}
