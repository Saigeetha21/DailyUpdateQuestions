package com.cg.day11;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class IntegerFactorial {
	
	public static LinkedHashMap<Integer,Integer>display(int n[]){
		LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<n.length;i++) {
			int fact =1;
			for(int j=1;j<=n[i];j++) {
				fact=fact*j;
			}
			hm.put(n[i], fact);
		}
		return hm;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = Integer.parseInt(sc.nextLine());
		int []a = new int[s];
		for(int i=0;i<s;i++) {
			a[i]=sc.nextInt();
		}
		
		LinkedHashMap<Integer,Integer> hm2=new LinkedHashMap<Integer,Integer>();
		hm2=IntegerFactorial.display(a);
		Iterator<Integer> it =  hm2.keySet().iterator();
		while(it.hasNext()) {
			int n =it.next();
			int fact =hm2.get(n);
			System.out.println(n+":"+fact);
		}
	}

}
