package feb9.com;

import java.util.Arrays;
import java.util.List;

public class StreamGreaterthan4 {

	public static void main(String[] args) {
		
		List<Integer>  numbers = Arrays.asList(3,3,6,2,4,5,2,2,5,5,2);
		numbers.stream().filter(value ->value>4).forEach(System.out::println);

	}

}
