package com.cg;

public class Trendy {
	public static void main(String[] args) {
		int n = 29778;
		String str = String.valueOf(n);
		if(str.length()==3) {
			int s = str.charAt(1);
			s=s%3;
			if(s==0) {
				System.out.println("its a trendy number");
			}else {
				System.out.println("its not trendy number");
			}
		}else {
			System.out.println("its a not a trendy number");
		}
	}

}
