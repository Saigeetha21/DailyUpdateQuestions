package mar21.comparatorinterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student3{
	int age;
	String name;
	int rollno;
	public Student3(int age, String name, int rollno) {
		super();
		this.age = age;
		this.name = name;
		this.rollno = rollno;
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
public class SortingByRollNoUsingGetRoll {

	public static void main(String[] args) {
		ArrayList<Student3> al = new ArrayList<Student3>();
		al.add(new Student3(1,"geetha",10));
		al.add(new Student3(2,"teja",5));
		al.add(new Student3(3,"sahasra",3));
		System.out.println("Sorting by rollno");
		
		Comparator<Student3> cm = Comparator.comparing(Student3::getRollno);
		Collections.sort(al,cm);
		for(Student3 s :al) {
			System.out.println(s.age+" "+s.name+" "+s.rollno);
		}
		

	}

}
