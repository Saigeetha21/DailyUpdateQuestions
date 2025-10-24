package com.cg.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ElementsException {
	
	
	public static void main (String[] args) {
		 // Creating a Scanner object to read input from the user
		Scanner sc= new Scanner(System.in);
		// Prompting the user to input the size of the array
		System.out.println("enter the no of elements in the array");
		// Reading the size of the array from user input
		int n =sc.nextInt();
		// Creating an integer array with size equal to input value
		int[] arr = new int[n];
		System.out.println("enter the elements in the array");
		try {
			// Looping to read each element of the array
			for(int i=0;i<n;i++)
				// Reading each element and storing it in the array
				arr[i] = sc.nextInt();
			// Prompting the user to input the index of the array element they want to access
			System.out.println("enter the index of the array element you want to accaess");
			// Reading the index of the array element from user input
			int index =sc.nextInt();
			// Accessing and printing the array element at the specified index
			System.out.println("the array element at index "+index+"="+arr[index]);
			System.out.println("the array element successfully accessed");
			 // Handling the ArrayIndexOutOfBoundsException if the index is out of bounds
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			// Handling the InputMismatchException if the input type is not an integer
		}catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		sc.close(); // Closing the Scanner object to release system resources
	}

}
