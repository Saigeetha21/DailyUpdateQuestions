package com.cg.day1;

import java.util.Scanner;

public class Courses {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no.of courses");
		int courseNo = sc.nextInt();
		int cid;
		String cname;
		double cfees;
		Course[] c = new Course[courseNo];
		int k=1;
		for(int i=0;i<courseNo;i++) {
			System.out.println("enter course"+ k++ +"details");
			cid = sc.nextInt();
			cname = sc.next();
			cfees = sc.nextDouble();
		c[i] = new Course(cid,cname,cfees);
		}     
		int j=1;
		double total =0;
		for(int i=0;i<c.length;i++) {
			System.out.println("c"+ j++ + " "+ c[i]);
			total+= c[i].getCfees();
		}
		System.out.println(total);
	}

}
