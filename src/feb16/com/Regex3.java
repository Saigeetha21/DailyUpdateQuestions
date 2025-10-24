package feb16.com;

import java.util.regex.Pattern;

public class Regex3 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n) //it prints true when it will have only n or m or a
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)
	}

}
