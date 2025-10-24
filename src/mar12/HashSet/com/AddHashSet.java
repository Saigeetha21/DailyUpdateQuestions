package mar12.HashSet.com;

import java.util.HashSet;
import java.util.Iterator;

public class AddHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("geetha");
		set.add("teja");
		set.add("Sahasra");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
