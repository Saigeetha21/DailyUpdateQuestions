package com.cg.day17;

import java.util.ArrayList;
import java.util.Iterator;

//Array List

public class TestJavaCollection {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("geetha");
		list.add("sai");
		list.add("anjali");
		list.add("jyothi");
		
		System.out.println("the names are :"+list);
		/*Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		

	}

}
