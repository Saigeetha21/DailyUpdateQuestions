package feb5.com;

import java.util.Scanner;

public class PasswordValidation {
	
	static void checkCharacter(String s1) {
		int k = s1.length();
		if((k>=6&&k<=20)&&s1.matches(".*[0-9]{1}.*")&&s1.matches(".*[@$#]{1}.*")) {
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n1 = in.nextLine();
		PasswordValidation.checkCharacter(n1);
	}

}
