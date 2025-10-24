package mar7.ArrayList.com;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseArrayListUsingForEachRemainingMethod {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("geetha");
		al.add("teja");
		al.add("hemu");
		al.add("venkat");
		
		Iterator<String> list = al.iterator();
		list.forEachRemaining(a ->System.out.println(a));

	}

}
