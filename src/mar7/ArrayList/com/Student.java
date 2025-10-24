package mar7.ArrayList.com;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int id;
	private int age;
	public Student(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public static void main(String args[] ){
		List<Student> s= new ArrayList<Student>();
		Student s1 = new Student("geetha",1,10);
		Student s2 = new Student("teja",2,20);
		Student s3 = new Student("sahasra",3,30);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		for(Student stu:s)
			System.out.println(stu.name+" "+stu.id+" "+stu.age);
		
		
	}

}
