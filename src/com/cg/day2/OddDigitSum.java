package com.cg.day2;

import java.util.Scanner;

public class OddDigitSum {
	public static int oddDigit(String s1[], int k)
	{
		int sum=0;
	for(int i=0;i<k;i++)
	{
		for(int j=0;j<s1[i].length();j++)
		{
			char c=s1[i].charAt(j);
			
			if(c>='0'&&c<='9')
				
			{
				int x=Integer.parseInt(c+ " ");
				if(x%2!=0)
					sum=sum+x;
			} 
		}
		
	}
	return sum;
		
	}

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		int l=Integer.parseInt(sc.nextLine());
		String s1[]=new String[l];
		for(int i=0;i<l;i++)
			s1[i]=sc.nextLine();
		System.out.println(OddDigitSum.oddDigit(s1,l));
		sc.close();
		// TODO Auto-generated method stub

	}

}
