package feb9.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDescending {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,34,23,1,2,6);
		//Ascending order
		List<Integer> number1 = numbers.stream().sorted((num1,num2) ->num1.compareTo(num2))
				.collect(Collectors.toList());
		System.out.println(number1);
		
		//descending order num2.compareTo(num1)

	}

}
