package mar21.comparatorinterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1{
	int age;
	String name;
	int rollno;
	public Student1(int age, String name, int rollno) {
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
public class SortingByNameUsingGetname {

	public static void main(String[] args) {
		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(new Student1(10,"geetha",21));
		al.add(new Student1(12,"teja",19));
		al.add(new Student1(17,"sahasra",10));
		System.out.println("Sort BY name");
		
		Comparator<Student1> cm= Comparator.comparing(Student1::getName);
		Collections.sort(al,cm);
		for(Student1 s:al) {
			System.out.println(s.age+" "+s.name+" "+s.rollno);
		}
		
				
		

	}

}
