package com.cg.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest extends CustomerDb{

	public static void main(String[] args) {
		CustomerDb db = new CustomerDb();
		int choice, cid1;
		String cAddress, cName;
		boolean b;
		Customer c1;
		Scanner sc=new Scanner(System.in);
		int i = 1;
		while(i>=1) {
		System.out.println("1.Add customer \n  2.List customers \n 3.search customers \n 4.Modify customer \n 5. Delete customers \n 6.Search customer by address  \n 7. Sort it by customers Ids \n 8.sort it by Customer Names \n 9.exit");
		System.out.println("enter your option");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter cid");
			int cid = sc.nextInt();
			System.out.println("Enter Name");
			cName = sc.next();
			System.out.println("Enter Address");
			cAddress = sc.next();
			
			b = db.addCustomer(new Customer(cid, cName, cAddress));
			if(b==true)
				System.out.println("Customer added successfully");
			else
				System.out.println("Something went wrong");
			break;
		case 2:
			ArrayList<Customer> custDetails;
			custDetails = db.getAllCustomer();
			for(Customer c: custDetails) {
				System.out.println(c);
			}
			break;
		case 3:
			System.out.println("Enter customer id to search");
			cid1 = sc.nextInt();
			c1 = db.getCustomer(cid1);
			if(c1==null)
				System.out.println("Customer not found");
			else
			System.out.println(c1);
			break;
			
		case 4:
			System.out.println("Enter id of the customer to update details");
			cid1 = sc.nextInt();
			System.out.println("Enter updated Name");
			cName = sc.next();
			System.out.println("Enter updated Age");
			cAddress = sc.next();
			c1 = db.getCustomer(cid1);
			b = db.updateCustomer(new Customer (cid1, cName, cAddress));
			System.out.println("Customer details updated");
			break;
	   
		case 5:
			System.out.println("Enter customer id to remove user");
			cid = sc.nextInt();
			b = db.removeCustomer(cid);
			System.out.println("customer removed sucesfully");
			break;
		case 6:
			System.out.println("Enter the address to get the customers");
			cAddress = sc.next();
			ArrayList<String> custNames;
			custNames = db.getCustomerByAddress(cAddress);
			for(String s : custNames)
				System.out.println(s);
			break;
			
		case 7:
			System.out.println("sorted list of customers as per their ids");
			db.SortByIds();
			break;
		case 8:
			System.out.println("Soretd list of Customers as per their names");
			db.SortByNames();
		default:
			System.out.println("Enter only listed choices");
			
			
		}
		}
		

	}

}
