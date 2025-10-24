package feb9.com;

import java.util.Arrays;
import java.util.List;

public class StreamCount {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,2,9);
		long num = numbers.stream().count();
		System.out.println(num);

	}

}
