package mar12.HashSet.com;

import java.util.HashSet;

public class RemoveElements {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("geetha");
		set.add("teja");
		set.add("sahasra");
		System.out.println(set);
		
		//removing specific elements from list
		set.remove("geetha");
		System.out.println(set);
		
		//Adding elements from one to another
		HashSet<String> set1 = new HashSet<String>();
		set1.add("geetha");
		set1.add("keechu");
		set.addAll(set1);
		System.out.println(set);
		
		//Removing all the new elements from HashSet 
		set.removeAll(set1);
		System.out.println(set);
		
		//Removing elements on the basis of specified condition 
		set.removeIf(str->str.contains("sahasra"));
		{
			System.out.println(set);
		}
		//Removing all the elements available in the set 
		set.clear();
		System.out.println(set);
	}

}
