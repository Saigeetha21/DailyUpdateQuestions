package feb5.com;

import java.util.Scanner;

public class NumberValidation {

		//The program defines a public class named NumberValidation.
	    //There is a static method named validateNumber that takes a string s1 as 
	    //input and returns an integer.
		static int validateNumber(String s1) {
			//here we are using regular expression that should match below expression.
			if(s1.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
			{
				return 1;
			}
			else
				return -1;
		}

	
    public static void main(String[] args) {
    	//we are taking input from the user and take input phone number as string.
    	Scanner in = new Scanner(System.in);
    	String n1 = in.nextLine(); //it store in n1 variable
    	//It calls the validateNumber method with the entered phone number and
    	//stores the result in variable c.
    	int c = NumberValidation.validateNumber(n1);
    	if(c==1)
    		System.out.println("Valid");
    	else
    		System.out.println("Invalid");
    	
    }
}


