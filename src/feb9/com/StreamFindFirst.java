package feb9.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirst {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,4,24);
		Optional<Integer> firstElement = numbers.stream().findFirst();
		if(firstElement.isPresent()) {
			System.out.println("The first element is:"+ firstElement.get());
		}
		else {
			System.out.println("The list is empty.");
		}
		
		//Without using Optional class
		Integer firstelement = numbers.stream().findFirst().orElse(null);
		if(firstElement!=null)
			System.out.println("The first element is:"+firstElement);
		else 
			System.out.println("The first element is empty");

	}

}
