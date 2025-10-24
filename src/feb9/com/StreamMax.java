package feb9.com;

import java.util.Arrays;
import java.util.List;

public class StreamMax {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,34,56,67,3,78);
		Integer num = numbers.stream().max(Integer::compare).orElse(null);
		if(num!=null)
			System.out.println("The max number is"+num);
		else
			System.out.println("The list is empty");

	}

}
