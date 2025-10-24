package com.cg.day17;

import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollection2 {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("geetha");
		al.add("sai");
		al.add("anjali");
		al.add("jyothi");
		
		//System.out.println(al);
		Iterator itr= al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
