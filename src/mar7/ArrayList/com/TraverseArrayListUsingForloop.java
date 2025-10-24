package mar7.ArrayList.com;

import java.util.ArrayList;

public class TraverseArrayListUsingForloop {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("geetha");
		al.add("teja");
		al.add("sahasra");
		al.add("chaitra");
		System.out.println("Traversing ArrayList using ForLoop");
		for(int i =0;i<al.size();i++)
			System.out.println(al.get(i));

	}

}
