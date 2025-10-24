package feb19.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSquare {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,6,4);
		List<Integer> square = numbers.stream().map(num->num*num).collect(Collectors.toList());
		System.out.println(square);
	}

}
