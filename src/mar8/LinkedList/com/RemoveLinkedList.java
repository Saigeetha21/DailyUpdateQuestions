package mar8.LinkedList.com;

import java.util.LinkedList;

public class RemoveLinkedList {

	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("sharara");
		lst.add("jeans");
		lst.add("chudidhar");
		lst.add("kurti");
		lst.remove("jeans");
		System.out.println(lst);
		
	}

}
