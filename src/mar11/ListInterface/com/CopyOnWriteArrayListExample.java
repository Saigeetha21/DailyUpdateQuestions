package mar11.ListInterface.com;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//CopyonwriteArrayList useful in scenarios where there are many reads and few writes.
//
public class CopyOnWriteArrayListExample {

	public static void main(String[] args) {
		List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        // Adding elements
        copyOnWriteArrayList.add("Apple");
        copyOnWriteArrayList.add("Banana");
        copyOnWriteArrayList.add("Orange");

        // Accessing elements
        System.out.println("Fourth fruit: " + copyOnWriteArrayList.get(2));

        // Iterating through elements
        for (String fruit : copyOnWriteArrayList) {
            System.out.println(fruit);
        }
	}

}
