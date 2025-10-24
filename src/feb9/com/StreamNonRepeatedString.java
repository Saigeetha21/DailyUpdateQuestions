package feb9.com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class StreamNonRepeatedString {

	public static void main(String[] args) {
		String str ="geethuteju";
		HashSet<Character> Characters = new HashSet<>();
		HashSet<Character> rch = new HashSet<>();
		char firstnrch = str.chars().mapToObj(c ->(char)c).filter(ch->{
			if(Characters.contains(ch))
				rch.add(ch);
			else
				Characters.add(ch);
			return true;
		}).filter(ch ->rch.contains(ch)).findFirst().orElse('\0');
		if(firstnrch!='\0')
			System.out.println("the first repeated character is:"+firstnrch);
		else
			System.out.println("not a value");
		
		//Using LinkedHashSet
		String input ="geethuteju";
		LinkedHashSet<Character> seenCharacters = new LinkedHashSet<>();
	
		char firstRepeatedChar = input.chars()
				.mapToObj(c -> (char) c)
				.filter(ch -> !seenCharacters.add(ch))
				.findFirst()
				.orElse('\0');
		
		if (firstRepeatedChar != '\0') {
			System.out.println("The first repeated character is:"+ firstRepeatedChar);
		}
		else {
			System.out.println("There are no repeated characters in the String.");
		}
		
	}

}
