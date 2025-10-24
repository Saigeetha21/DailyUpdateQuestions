package mar7.ArrayList.com;

import java.util.ArrayList;

public class IsEmptyArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		//its prints true
		System.out.println(al.isEmpty());
		
		ArrayList<Integer> bl = new ArrayList<Integer>();
		bl.add(12);
		bl.add(15);
		System.out.println(bl.isEmpty());
		
		
	}

}
