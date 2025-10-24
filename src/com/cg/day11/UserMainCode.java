package com.cg.day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;



public class UserMainCode {
	public static int sizeOfResultandHashMap(HashMap<Integer, String >hm) {
		int k, count =0;
		Iterator<Integer> it = hm.keySet().iterator();
		while(it.hasNext()) {
			k=it.next();
			if(k%4!=0)
				count++;
		}
		return count;
	}
	
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		HashMap<Integer,String>hm = new HashMap<Integer,String>();
		for(int i =0; i<n; i++) {
			hm.put(in.nextInt(), in.next());
		}
		System.out.println(UserMainCode.sizeOfResultandHashMap(hm));
		
	}
	

}
