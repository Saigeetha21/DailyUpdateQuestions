package mar21.comparatorinterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	int age;
	String name;
	int rollno;
	public Employee(int age, String name, int rollno) {
		super();
		this.age = age;
		this.name = name;
		this.rollno = rollno;
	}
	
	
}
class AgeComparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		if(e1.age == e2.age) {
			return 0;
		}
		else if(e1.age>e2.age) {
			return 1;
		}
		else
			return -1;
	}
}
public class SortingByAge {

	public static void main(String[] args) {
		ArrayList<Employee> el = new ArrayList<Employee>();
		el.add(new Employee(10,"geetha",10));
		el.add(new Employee(9,"teja",1));
		el.add(new Employee(10,"sanju",3));
		System.out.println("sorting by age");
		Collections.sort(el,new AgeComparator());
		Iterator<Employee> itr = el.iterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e.age+" "+e.name+" "+e.rollno);
		}
		
	} 
  
}

