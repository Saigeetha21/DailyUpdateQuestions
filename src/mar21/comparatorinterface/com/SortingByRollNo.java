package mar21.comparatorinterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Students{
	int age;
	String name;
	int rollNo;
	public Students(int age, String name, int rollNo) {
		super();
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
	}
	
}
class RollComparator implements Comparator<Students>{
	public int compare(Students s1 ,Students s2) {
		if(s1.rollNo== s2.rollNo) {
			return 0;
		}
		else if(s1.rollNo>s2.rollNo)
			return 1;
		else
			return -1;
	}
	
}
public class SortingByRollNo {

	public static void main(String[] args) {
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(new Students(10,"geetha",1));
		al.add(new Students(12,"teja",3));
		al.add(new Students(9,"sahasra",2));
		System.out.println("sorting by rollno");
		Collections.sort(al,new RollComparator());
		Iterator<Students> itr = al.iterator();
		while(itr.hasNext()) {
			Students st = itr.next();
			System.out.println(st.age+" "+st.name+" "+st.rollNo);
		}
		
	}

}
