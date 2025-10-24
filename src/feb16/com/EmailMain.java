package feb16.com;

import java.util.regex.Pattern;

public class EmailMain {

	public static void main(String[] args) {
		String email = "example@example.com";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        boolean isValidEmail = Pattern.matches(regex, email);
        System.out.println("Is valid email? " + isValidEmail);

	}

}
