package mar7.ArrayList.com;

import java.util.ArrayList;

public class SizeAndCapacity {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		//the size of the array is 0
		System.out.println(a.size());
		
		ArrayList <Integer> b = new ArrayList<Integer>(10);
		//if we give array size is 10 even though it's showing 0 because we cannot add the elements
		System.out.println(b.size());
		
		ArrayList <Integer> c = new ArrayList<Integer>(10);
		c.add(1);
		c.add(2);
		//here the size of the list is 2
		System.out.println(c.size());
				
				
		
	}

}
