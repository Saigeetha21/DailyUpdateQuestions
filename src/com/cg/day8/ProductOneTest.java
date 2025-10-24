package com.cg.day8;

import java.util.Scanner;

public class ProductOneTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of products");
		int productNo = sc.nextInt();
		ProductOne[] p = new ProductOne[productNo];
		String str;
		for(int i=0; i<productNo;i++) {
			System.out.println("enter product" +(i+1) + "details");
			str = sc.next();
			String []split = str.split(";");
			int pid=Integer.parseInt(split[0]);
			String pname = split[1];
			int prate = Integer.parseInt(split[2]);
			
			p[i] = new ProductOne(pid,pname,prate);
			
		}
		
		for(int i=0;i<productNo;i++) {
			System.out.println(p[i]);
		}
		
		

	}

}
;
