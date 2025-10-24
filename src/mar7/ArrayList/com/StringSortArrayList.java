package mar7.ArrayList.com;

import java.util.ArrayList;
import java.util.Collections;

public class StringSortArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("pen");
		al.add("book");
		al.add("chair");
		al.add("scale");
		Collections.sort(al);
		for(String thing:al)
			System.out.println(thing);
	}

}
