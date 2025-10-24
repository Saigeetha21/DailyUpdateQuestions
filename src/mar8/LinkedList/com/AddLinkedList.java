package mar8.LinkedList.com;

import java.util.Iterator;
import java.util.LinkedList;

public class AddLinkedList {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("geetha");
		l.add("teja");
		l.add("sahasra");
		Iterator<String> itr = l.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
	}

}
