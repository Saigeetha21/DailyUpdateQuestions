package feb16.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlMain {

	public static void main(String[] args) {
		String text = "Visit us at https://www.example.com or http://example.org";
        String regex = "https?://(?:www\\.)?[\\w\\.-]+(?:\\.[\\w\\.-]+)+[\\w\\-\\._~:/?#[\\]@!$&'\\(\\)\\*\\+,;=\\.]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("URL: " + matcher.group(0));
        }

	}

}
