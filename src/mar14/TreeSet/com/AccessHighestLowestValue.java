package mar14.TreeSet.com;

import java.util.Iterator;
import java.util.TreeSet;

public class AccessHighestLowestValue {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(12);
		set.add(21);
		set.add(17);
		
		System.out.println("Highest Element"+set.pollFirst());
		System.out.println("Lowest Element"+set.pollLast());
		 

	}

}
