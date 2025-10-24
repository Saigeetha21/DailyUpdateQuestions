package feb9.com;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(",");
		sj.add("Apple");
		sj.add("Banana");
		sj.add("gova");
		String result = sj.toString();
		System.out.println(result);
		

	}

}
