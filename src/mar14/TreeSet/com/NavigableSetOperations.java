package mar14.TreeSet.com;

import java.util.TreeSet;

public class NavigableSetOperations {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		System.out.println("Initial Set"+set);
		System.out.println("Descending order"+set.descendingSet());
		//if we mention true the output starts from that letter or upto that letter
		System.out.println("head set"+set.headSet("C",true));
		System.out.println("subset"+set.subSet("B", false,"E",true));
		//if we mention false the output starts from next letter
		System.out.println("tailset"+set.tailSet("C",false));

	} 

}
