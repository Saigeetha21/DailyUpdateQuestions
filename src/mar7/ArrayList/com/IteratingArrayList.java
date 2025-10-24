package mar7.ArrayList.com;

import java.util.ArrayList;

public class IteratingArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Banana");
		list.add("Kiwi");
		  //Traversing list through for-each loop  
		for(String fruit:list)
			System.out.println(fruit);

	}

}
