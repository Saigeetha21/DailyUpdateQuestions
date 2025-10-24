package feb5.com;

import java.util.Scanner;

public class FetchingMiddleCharacters {
	

    // Method to get the middle characters of a string
	static void getMiddleChars(String s1) {
		// Get the length of the input string
		int k = s1.length();
		//calculate the index value of the middle character
		int mid =k/2;
		//here we are using string buffer to store the data(means middle character)
		StringBuffer sb1 = new StringBuffer();
		//here we are check the condition that if the length of the string is even
		if(k%2==0) {
			// If even, append the two middle characters to the StringBuffer
			sb1.append(s1.charAt(mid-1));
			sb1.append(s1.charAt(mid));
		}
		System.out.println(sb1);
	}
	
	public static void main(String[] args) {
		//taking input from the user
		Scanner in = new Scanner(System.in);
		// Read a line of input from the user
		String n1 = in.nextLine();
		// Call the getMiddleChars method with the input string
		FetchingMiddleCharacters.getMiddleChars(n1);
	}

}
