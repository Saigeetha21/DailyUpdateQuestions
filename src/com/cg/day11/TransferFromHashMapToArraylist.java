package com.cg.day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TransferFromHashMapToArraylist {
	
	public static ArrayList<String> getName(HashMap<Integer,String>hm){
		ArrayList<String> al = new ArrayList<String>();
		Iterator<String> it = hm.values().iterator();
		while(it.hasNext()) {
			String s = it.next();
			if(s.matches("^[a-z].*")&&s.matches(".*[0-9]{1}.*")&&s.matches(".*[A-Z]$"))
				al.add(s);
		}
		return al;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		for(int i =0; i<n; i++) {
			hm.put(in.nextInt(), in.next());
		}
		ArrayList<String>arr = TransferFromHashMapToArraylist.getName(hm);
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(in.next());
		}
	}

}
