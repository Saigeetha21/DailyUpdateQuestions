package com.cg.day12;

import java.util.Scanner;

public class NaturalNumberSumDemo {
	static int gcd(int n1, int n2) {
		if(n1==0)
			return n2;
		return gcd(n2%n1,n1);
	}
	static int lcm(int n1,int n2) {
		return (n1/gcd(n1,n2))*n2;
	}
	
	static int calculateSum(int n, int a , int b) {
		int s1,s2,s3;
		s1=((n/a))*(2*a+(n/a-1)*a)/2;
		s2 = ((n/b))*(2*b+(n/b-1)*b)/2;
		s3=((n/(lcm(a,b))))*(2*(lcm(a,b))+(n/(lcm(a,b))-1)*(lcm(a,b)))/2;
		return s1+s2-s3;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int a =3,b=5;
		System.out.println(calculateSum(n,a,b));
	}

}
