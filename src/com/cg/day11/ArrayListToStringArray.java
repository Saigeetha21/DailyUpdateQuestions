package com.cg.day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListToStringArray {
	public static String[] convertToStringArray(ArrayList<String>l1, int n) {
		String a[] = new String[n];
		int i=0;
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			a[i] = it.next();
			++i;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.nextLine());
		ArrayList<String>l1 = new ArrayList<String>();
		for(int i =0;i<k;i++) {
			l1.add(sc.next());
			
		}
		String[] s = ArrayListToStringArray.convertToStringArray(l1,k);
		for(String s1:s)
		{
			System.out.println(s1);
		}
	}

}
