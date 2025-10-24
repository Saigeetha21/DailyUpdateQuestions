package com.cg.day1;

import java.util.Scanner;

public class LibraryTest {
	
	public static void main(String[] args) {
		KidsUser a;
		a=new KidsUser();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age of kids");
		int age= sc.nextInt();
		System.out.println("enter the kids/fiction");
		String bname=sc.next();
		a.registerAccount(age);
		a.requestBook(bname);
		
		
	}    

}
