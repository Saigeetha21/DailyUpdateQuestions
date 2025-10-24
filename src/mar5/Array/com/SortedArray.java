package mar5.Array.com;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		int num[]= {1,9,3,2,8};
		Arrays.sort(num);
		System.out.println("Sorted array:");
		for(int numbers:num)
			System.out.print(numbers);
	}

}
