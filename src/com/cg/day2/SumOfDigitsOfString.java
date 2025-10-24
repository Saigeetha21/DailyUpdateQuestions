package com.cg.day2;

import java.util.Scanner;

public class SumOfDigitsOfString {
	static int sumOfDigits(String str)
	{
		int k=str.length();
		int sum=0,i;
		for(i=0;i<k;i++) {
			if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				sum=sum+Integer.parseInt(str.charAt(i)+ " ");
			}
		}
		if(sum>=0)
		return sum;
		else
			return -1;
	}
	
	
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int ans=SumOfDigitsOfString.sumOfDigits(s);
		System.out.println(ans);
	}

}
