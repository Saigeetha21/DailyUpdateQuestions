package feb16.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberMain {

	public static void main(String[] args) {
		
		 String text = "Call me at 123-456-7890 or 987-654-3210";
	        String regex = "(\\d{3})-(\\d{3})-(\\d{4})";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(text);
	        while (matcher.find()) {
	            System.out.println("Phone number: " + matcher.group(0));
	        }

	}

}
