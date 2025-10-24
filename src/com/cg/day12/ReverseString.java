package com.cg.day12;

public class ReverseString {
	public static void reverseit(String input) {
		char[] temparray = input.toCharArray();
		int left,right =0;
		right = temparray.length-1;
		for(left =0;left<right;left++,right--) {
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right]=temp;
		}
		for (char c:(temparray))
			System.out.println(c);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		String input ="Able was I era I saw";
		ReverseString.reverseit(input);
	}

}
