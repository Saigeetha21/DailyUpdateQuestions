package mar8.LinkedList.com;


import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorAdd {

	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("keechu");
		lst.add("shinchan");
		lst.add("hydi");
		ListIterator<String> itr = lst.listIterator(lst.size());
		while(itr.hasPrevious()) {
			String str = itr.previous();
			System.out.println(str);
		}
	}

}
