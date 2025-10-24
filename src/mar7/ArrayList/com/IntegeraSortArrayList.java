package mar7.ArrayList.com;

import java.util.ArrayList;
import java.util.Collections;

public class IntegeraSortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(10);
		i.add(21);
		i.add(12);
		i.add(17);
		i.add(5);
		Collections.sort(i);
		for (int inte:i)
			System.out.println(inte);
	}

}
