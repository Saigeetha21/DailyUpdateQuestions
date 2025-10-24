package mar13.LinkedHashSet.com;

import java.util.LinkedHashSet;

public class CopyElements {

	public static void main(String[] args) {
		LinkedHashSet<String> sourceSet = new LinkedHashSet<>();
        sourceSet.add("Apple");
        sourceSet.add("Banana");
        sourceSet.add("Orange");
        
        // Creating a new LinkedHashSet and copying elements from the source set
        LinkedHashSet<String> targetSet = new LinkedHashSet<>(sourceSet);
        
        // Displaying elements of the target set
        System.out.println("Elements in the target set:");
        for (String fruit : targetSet) {
            System.out.println(fruit);
        }
	}

}
