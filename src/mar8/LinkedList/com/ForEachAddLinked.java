package mar8.LinkedList.com;

import java.util.LinkedList;
//using for loop
public class ForEachAddLinked {

	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("lilly");
		lst.add("rose");
		lst.add("jasmine");
		for(int i =0;i<lst.size();i++)
			System.out.println(lst.get(i));
	}

}
