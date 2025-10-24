package com.cg.day10;

import java.util.Scanner;

public class UniqueCharacterInAString {
	static int uniqueCounter(String s) {
		int i,l=0;
		String temp;
		for(i=0;i<s.length();i++) {
			if(i!=0)
				temp = s.substring(0,i).concat(s.substring(i+1));
			else
				temp=s.substring(i+1);
		    String c=s.charAt(i)+" ";
		    if(!temp.contains(c))
		    {
		    	++l;
		    }
		}
		return l;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(UniqueCharacterInAString.uniqueCounter(str));
		sc.close();
	}

}
