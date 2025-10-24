package mar14.TreeSet.com;

import java.util.TreeSet;

public class SortedOperations {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("geetha");
		set.add("teja");
		set.add("sahasra");
		set.add("saketh");
		set.add("divya");
		
		System.out.println("Initial Set"+set);
		System.out.println("Headset"+set.headSet("teja"));
		System.out.println("subset"+set.subSet("divya",false,"teja",true));
		System.out.println("TailSet"+set.tailSet("sahasra",true));
		
	}
  
}
