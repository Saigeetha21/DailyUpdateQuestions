package com.cg.day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveMultiples {
	public static ArrayList<Integer> getName(ArrayList<Integer> al){
		ArrayList<Integer> array = new ArrayList<Integer>();
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			array.add(it.next());
			array.add(it.next());
			it.next();
		}
		return array;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			al.add(in.nextInt());
		}
		
		ArrayList<Integer> arr = RemoveMultiples.getName(al);
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
