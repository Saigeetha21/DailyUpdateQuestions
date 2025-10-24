package feb5.com;

//This program is check whether the first character and last character is same or not.
import java.util.Scanner;

public class CheckCharactersInAString {
	///there is static method named checkCharacters that takes input as string
	static void checkCharacters(String s1) {
	// Get the length of the input string
	int k = s1.length();
	//get the first character of the string
	char c =s1.charAt(0);
	//get the last character of the string
	char d = s1.charAt(k-1);
	//here we check the condition if first string and last string is equal
	if(c==d) {
		System.out.println("Valid");
		
	}
	else
		System.out.println("Invalid");
	

}
	public static void main(String[] args) {
		//take the input from the user
		Scanner in = new Scanner(System.in);
		String n1 = in.nextLine();
		// Call the checkCharacters method with the input string
		CheckCharactersInAString.checkCharacters(n1);
		
	}
}
