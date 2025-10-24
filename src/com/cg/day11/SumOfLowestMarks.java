package com.cg.day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class SumOfLowestMarks {
	public static int sizeOfResultandHashMap(HashMap<Integer,Integer>hm) {
		int k=0;
		int a[] = new int[hm.size()];
		Iterator<Integer> it =hm.values().iterator();
		while(it.hasNext()) {
			int I = it.next();
			a[k] = I;
			++k;
		}
		Arrays.sort(a);
		return a[0]+a[1]+a[2];
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			hm.put(in.nextInt(),in.nextInt());
		}
		System.out.println(SumOfLowestMarks.sizeOfResultandHashMap(hm));
	}

}
