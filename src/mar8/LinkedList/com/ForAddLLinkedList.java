package mar8.LinkedList.com;

import java.util.LinkedList;

public class ForAddLLinkedList {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Mango");
		l.add("Sapota");
		l.add("Banana");
		for(String s :l)
			System.out.println(s);

	}

}
