package apr22.FunctionalInterface.com;

@FunctionalInterface
interface Square {
    int calculate(int number);
} 

public class SquareNumber {
	public static void main(String[] args) {
        // Defining a lambda expression to calculate the square of a number
        Square square = number -> number * number; 

        // Using the square operation
        System.out.println("Square of 5: " + square.calculate(5)); // Should print 25
        System.out.println("Square of -3: " + square.calculate(-3)); // Should print 9
    }  

}  
