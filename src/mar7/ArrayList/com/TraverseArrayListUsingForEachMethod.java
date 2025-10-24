package mar7.ArrayList.com;

import java.util.ArrayList;

public class TraverseArrayListUsingForEachMethod {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("geetha");
		al.add("teja");
		al.add("kavya");
		al.add("siri");
		al.add("jenni");
		al.forEach(a->System.out.println(a));
		

	}

}
