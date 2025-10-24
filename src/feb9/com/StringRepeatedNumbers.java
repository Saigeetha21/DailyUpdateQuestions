package feb9.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringRepeatedNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,34,5,5,4,3,3,3);
		
		//count occurences using collectors.groupingBY
		Map<Integer,Long> numberCount = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		//Print the numbers that are repeated along with their counts
		numberCount.forEach((number,count) ->{
			System.out.println(number + "_"+count);
			
		});

	}

}
