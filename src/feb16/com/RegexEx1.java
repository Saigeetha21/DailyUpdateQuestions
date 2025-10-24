package feb16.com;

import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {
		
		//.dot represents single character
		//..dot represents two characters
		System.out.println(Pattern.matches(".e","ge")); //It should be one character before e-true and last charcter should be e
		System.out.println(Pattern.matches(".e", "gee"));//one dot means have only one character
		System.out.println(Pattern.matches(".ee", "gee"));
		System.out.println(Pattern.matches("..e", "gee"));
		

	}

}
