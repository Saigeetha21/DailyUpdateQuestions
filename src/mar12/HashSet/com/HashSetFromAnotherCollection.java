package mar12.HashSet.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetFromAnotherCollection {

	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("geetha");
		lst.add("teja");
		lst.add("sahasra");
		
		HashSet<String> set = new HashSet<String>(lst);
		set.add("kavitha");
	    Iterator<String>itr = set.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	}

}
 