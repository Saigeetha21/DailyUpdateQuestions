package mar22.SortCollections.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListCaseInsensitive {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        names.add("john");
        names.add("alice");
        names.add("Bob");
        names.add("David");

        System.out.println("Before sorting case-insensitively: " + names);
        
        Collections.sort(names, String.CASE_INSENSITIVE_ORDER); 
        System.out.println("After sorting case-insensitively: " + names);

	}

}
