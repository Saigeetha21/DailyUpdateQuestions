package mar14.TreeSet.com;

import java.util.Iterator;
import java.util.TreeSet;

public class AddElements {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("geetha");
		set.add("teja");
		set.add("sahasra");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
 
}
