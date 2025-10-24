package mar8.LinkedList.com;

import java.util.Iterator;
import java.util.LinkedList;

public class ForEachRemainingAdd {

	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("pen");
		lst.add("book");
		lst.add("pencil");
		Iterator<String> itr = lst.iterator();
		lst.forEach(a ->System.out.println(a));
	}

}
