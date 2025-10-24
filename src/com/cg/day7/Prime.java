package com.cg.day7;

public class Prime {
	public static void main(String[] args) {
		int i,m=0,flag=0;
		int n=Integer.parseInt(args[0]);
		m=n/2;
		if(n==0 || n==1) {
			System.out.println("is a prime number " +n);
		}else {
			System.out.println("number is not a prime" +n);
		}
	}

}
