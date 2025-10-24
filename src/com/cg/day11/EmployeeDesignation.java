package com.cg.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class EmployeeDesignation {
	public static ArrayList<String> obtainDesignation(HashMap<String,String>hm,String s1){
		ArrayList<String> al = new ArrayList<String>();
		HashMap<String, String> h1;
		for(Map.Entry<String,String>map:h1.entrySet()) {
			if(n.equals(map.getValue())) {
				al.add(map.getKey());
			}
		}
		Collections.sort(al);
		return al;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String,String>hm = new HashMap<String,String>();
		for(int i =0; i<n; i++) {
			hm.put(in.next(), in.next());
		}
		String s = in.next();
	ArrayList<String> l1= new ArrayList<String>();
	l1=EmployeeDesignation.obtainDesignation(hm,s);
	Iterator<String> it = l1.iterator();
	while(it.hasNext())
	{
		String s2 = it.next();
		System.out.println(s2);
	}
	
	}

}
