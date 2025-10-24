package feb19.com;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamAll {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
		
		//count 
		long count = numbers.stream().count();
		
		//sum
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		
		//Min
		OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();
		
		//Max
		OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
		
		//Average
		OptionalDouble avg = numbers.stream().mapToDouble(Integer::doubleValue).average();
		
		//Print the results
		System.out.println("count"+count);
		System.out.println("sum"+sum);
		System.out.println("Min"+min);
		System.out.println("Max"+max);
		System.out.println("Avg"+avg);

	}

}
