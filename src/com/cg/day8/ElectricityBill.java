package com.cg.day8;

import java.util.Scanner;

public class ElectricityBill {
	static int calculateElectricityBill(String str1, String str2 , int unit) {
		int e1= Integer.parseInt(str1.substring(5));
		int e2= Integer.parseInt(str2.substring(5));
		int total =(e2-e1)*unit;
		return total;
	}
	
	public static void main(String[] args) {
		String s1,s2;
		int n;
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		n = sc.nextInt();
		int ans = ElectricityBill.calculateElectricityBill(s1, s2, n);
		System.out.println(ans);
		
	}

}
