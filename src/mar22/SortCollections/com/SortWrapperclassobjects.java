package mar22.SortCollections.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortWrapperclassobjects {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(Integer.valueOf(200));
		al.add(Integer.valueOf(203));
		al.add(202);
		Collections.sort(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
