package mar7.ArrayList.com;

import java.util.ArrayList;
import java.util.ListIterator;

public class TraverseArrayListUsingListIterator {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("geetha");
		al.add("Sahasra");
		al.add("kavitha");
		al.add("teja");
		
		System.out.println("Traversing list through List Iterator:");  
        //Here, element iterates in reverse order  
		ListIterator<String> list = al.listIterator(al.size());
		while(list.hasPrevious()) {
			String str = list.previous();
			System.out.println(str);
		}



	}

}
