package com.cg.day11;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class StateIdGenerator {
	public static LinkedHashMap<String,String>calculateElectricityBill(String a[]){
		String s1="";
		LinkedHashMap<String,String>hm = new LinkedHashMap<String,String>();
		for(int i=0;i<a.length;i++) {
			s1 = a[i].toUpperCase();
			hm.put(s1.substring(0,3),a[i]);
		}
	return hm;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a[] = new String[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.next();
		}
		LinkedHashMap<String,String> ans = StateIdGenerator.calculateElectricityBill(a);
		Iterator<String> it = ans.keySet().iterator();
		while(it.hasNext()) {
			String s2 = it.next();
			String s3 = ans.get(s2);
			System.out.println(s2+","+s3);
		}
	}

}
