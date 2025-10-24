package com.cg.day17;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {
		
		//creating instance of the array,
		//vector and hashtable
		int arr[] = new int[] {1,2,3,4};
		Vector<Integer> v = new Vector();
		Hashtable<Integer,String> h = new Hashtable();
		//adding elements into the vector
		v.addElement(1);
		v.addElement(2);
		
		//adding elements into the hashtable
		h.put(1,"geetha");
		h.put(2, "chandaka");
		
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
		
		//Array instance creation requires[],
		//while vector and hashtable requires()
		//vector element insertion requires addElement(),
		//hashtable element insertion requires put()
		
		//Accessing first element of the array,vector and hashtable.
		
		
		//Array elements are accessed using [],
		//Vector elements using elementAt()
		//hashtable elements using get()
		
		

	}

}
