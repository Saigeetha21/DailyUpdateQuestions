package feb9.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUppercase {

	public static void main(String[] args) {
	    //converting all characters into upper to lower
		List<String> countries = Arrays.asList("USA","Japan","France","Germany","Italy","UK","Canada");
		String result = countries.stream().map(String::toLowerCase).collect(Collectors.joining(","));
		System.out.println(result);
	}

}
