package com.cg.day11;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateCharacters {
	public static String nameFormatter(String s1) {
		String temp;
		StringBuffer sb = new StringBuffer();
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++) {
			hs.add(s1.charAt(i));
		}
		Iterator<Character> itr = hs.iterator();
		while(itr.hasNext()) {
			char o = itr.next();
			sb.append(o);
		}
		return sb.toString();
	}
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		System.out.println(DuplicateCharacters.nameFormatter(s1));
		in.close();
	}

}
