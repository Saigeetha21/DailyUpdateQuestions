package mar11.ListInterface.com;

import java.util.Stack;

public class StackInterface {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        // Popping elements from the stack
        System.out.println("Top fruit: " + stack.pop());

        // Iterating through elements
        for (String fruit : stack) {
            System.out.println(fruit);
        }
	}

}
