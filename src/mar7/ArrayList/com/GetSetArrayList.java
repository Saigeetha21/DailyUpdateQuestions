package mar7.ArrayList.com;

import java.util.ArrayList;

public class GetSetArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Banana");
		al.add("Apple");
		al.add("strawberry");
		//get method is for return the elements based on the index
		System.out.println("Printing the elements " +al.get(1));
		//set method is for changes the element
		//here element banana changed to dates
		al.set(1, "Dates");
		
		for(String fruit:al)
			System.out.println(fruit);

	}

}
