package feb5.com;

import java.util.Scanner;

public class StringEncryption {
	
	// Method to check characters and perform encryption
	static void checkCharacters(String s1) {
		 // Get the length of the input string
		int k = s1.length();
		// Create a StringBuffer to store the encrypted string
		StringBuffer sb1 = new StringBuffer();
		// Loop through each character in the input string
		for(int i=0;i<k;i++) {
			// Get the character at the current position
			char d = s1.charAt(i);
			// Check if the position is odd (using (i+1)%2)
			if((i+1)%2!=0) {
				   // If the character is 'z', replace it with 'a'
				if(d=='z') {
					sb1.append('a');
				}
				// If the character is 'Z', replace it with 'A
				else if(d=='Z') {
					sb1.append('A');
				}
				 // If the character is neither 'z' nor 'Z', increment its ASCII value by 1
				else {
					int c =(int)d;
					++c;
					sb1.append((char)c);
				}
			}
			// If the position is even, append the character as it is
			else {
				sb1.append(d);
			}
		}
		System.out.println(sb1);
	}
	public static void main(String[] args) {
		//take the input from the user
		Scanner in = new Scanner(System.in);
		//read the input from the user
		String n1 = in.nextLine();
		// Call the checkCharacters method to perform encryption on the input string
		StringEncryption.checkCharacters(n1);
		
	}

}
