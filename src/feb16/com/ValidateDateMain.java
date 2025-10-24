package feb16.com;

import java.util.regex.Pattern;

public class ValidateDateMain {

	public static void main(String[] args) {
		String date = "2024-02-16";
        String regex = "(\\d{4})-(\\d{2})-(\\d{2})";
        boolean isValidDate = Pattern.matches(regex, date);
        System.out.println("Is valid date? " + isValidDate);

	}

}
