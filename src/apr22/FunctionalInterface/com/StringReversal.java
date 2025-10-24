package apr22.FunctionalInterface.com;

@FunctionalInterface
interface StringReverser {
    String reverse(String input);
}
public class StringReversal {
	public static void main(String[] args) {
        // Defining a lambda expression to reverse a string
        StringReverser reverser = input -> {
            StringBuilder reversed = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed.append(input.charAt(i));
            }
            return reversed.toString();
        }; 

        // Using the reverser operation
        System.out.println("Reversed 'hello': " + reverser.reverse("hello")); // Should print "olleh"
        System.out.println("Reversed 'Java': " + reverser.reverse("Java")); // Should print "avaJ"
    }

}
