package feb19.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNumberSquare {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,56,7);
		List<Integer> square = numbers.stream().distinct().map(n->n*n).collect(Collectors.toList());
		System.out.println(square);

	}

}
