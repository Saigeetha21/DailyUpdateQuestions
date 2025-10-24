package com.cg.day1;

import java.util.Scanner;

public class Dowhile {
	
	public static void main(String[] args) {
		//Initialize variables to store factorial and control loop iteration
		int fact =1; // factorial of the number
		int i=1; //counter for loop iteration
		// Create Scanner object to read user input
		Scanner sc = new Scanner(System.in);
		// Prompt user to enter a number for factorial calculation
		System.out.println("enter a number whose factorial is to be found:");
		// Read the input number from the user
		int num = sc.nextInt();
		// Perform factorial calculation using a do-while loop
		do {
			fact = fact*i; // multiply the current factorial by the current iteration value
			i++; // increment the iteration counter
		}while(i<=num); // continue loop until the iteration counter reaches the input number
		// Output the result to the user
		System.out.println("\nfactorial of"+num+" is:"+fact);
	}

}
