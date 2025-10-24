package mar22.SortCollections.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AddElements {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("geetha");
		al.add("teja");
		al.add("sahasra");
		al.add("sanju");
		
		Collections.sort(al);
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
