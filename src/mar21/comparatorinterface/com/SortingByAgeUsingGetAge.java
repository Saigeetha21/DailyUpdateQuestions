package mar21.comparatorinterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2{
	int age;
	String name;
	int rollNo;
	public Student2(int age, String name, int rollNo) {
		super();  
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}

public class SortingByAgeUsingGetAge {

	public static void main(String[] args) {
		ArrayList<Student2> al = new ArrayList<Student2>();
		al.add(new Student2(1,"geetha",10));
		al.add(new Student2(3,"teja",19));
		al.add(new Student2(2,"sahasra",8));
		System.out.println("Sorting by age");
		
		Comparator<Student2> cm = Comparator.comparing(Student2::getAge);
		Collections.sort(al,cm);
		for(Student2 s:al) {
			System.out.println(s.age+" "+s.name+" "+s.rollNo);
		}
	}
  
	
	
}
