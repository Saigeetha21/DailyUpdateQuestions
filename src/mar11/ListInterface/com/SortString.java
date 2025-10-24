package mar11.ListInterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {

	public static void main(String[] args) {
		 //Creating a list of fruits  
		  List<String> list1=new ArrayList<String>();  
		  list1.add("Mango");  
		  list1.add("Apple");  
		  list1.add("Banana");  
		  list1.add("Grapes");  
		  //Sorting the list  
		  Collections.sort(list1);  
		   //Traversing list through the for-each loop  
		  for(String fruit:list1)  
		    System.out.println(fruit);  
		      
		 
	}

}
