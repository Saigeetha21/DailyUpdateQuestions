package mar22.SortCollections.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseOrder {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("mango");
		al.add("sapota");
		al.add("kiwi");
		al.add("custord");
		
		Collections.sort(al,Collections.reverseOrder());
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}



