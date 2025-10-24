package mar7.ArrayList.com;

import java.util.ArrayList;
import java.util.Iterator;
//an iterator is used to iterate through the elements of the ArrayList list 
//and print them one by one
public class FruitArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("sapota");
		list.add("custard");
		  //Traversing list through Iterator  
		Iterator itr = list.iterator();//getting the Iterator
		while(itr.hasNext())//check if iterator has the elements 
			System.out.println(itr.next());//printing the element and move to next 
	}

}
