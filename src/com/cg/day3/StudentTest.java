package com.cg.day3;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		int []m=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("UnderGraduate Student");
		String name=sc.next();
		Student u;
		u=new Undergraduate(name);
		System.out.println("scores");
		for(int i=0;i<4;i++) {
			int n=sc.nextInt();
			u.setTestScore(i, n);
		}
		u.generateResult();
		
		System.out.println("Graduate Student");
		Student g;
		name=sc.next();
		g=new Graduate(name);
		System.out.println("scores");
		for(int i=0;i<4;i++) {
			int n=sc.nextInt();
			g.setTestScore(i, n);
		}
	}

}
