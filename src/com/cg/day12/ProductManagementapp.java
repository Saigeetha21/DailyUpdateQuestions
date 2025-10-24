package com.cg.day12;

import java.util.Scanner;

public class ProductManagementapp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ProductName = scanner.next();
		int MRP =scanner.nextInt();
		int SellingPrice = scanner.nextInt();
		int Discount = scanner.nextInt();
		scanner.close();
		System.out.println("Sr# \t ProductName\t MRP\tSellingPrice\tdiscount");
		System.out.println("------------------------------------------------");
		System.out.println("1\t"+ProductName+"\t\t"+MRP+"\t\t"+SellingPrice+"\t\t\t"+Discount);
	}

	
}
