package com.cg.day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VowelsArrays {
	
	public static ArrayList<String>vowelCheck(String a[]){
		ArrayList<String> al = new ArrayList<String>();
		for(int i =0; i<a.length;i++) {
			if(a[i].matches("[a||e||i||o||u]{1}.*[a||e||i||o||u]{1}")) {
				al.add(a[i]);
			}
		}
		return al;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		String[] a = new String[n];
		for(int i=0;i<n;i++) {
			a[i]=s.next();
		}
		
		ArrayList<String> arr= VowelsArrays.vowelCheck(a);
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
