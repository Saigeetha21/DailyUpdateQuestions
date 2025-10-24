package mar21.comparatorinterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student4{
	int rollno;
	String name;
	int age;
	public Student4(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	  
  
}
public class NullsLastNullsFirstEx {

	public static void main(String[] args) {
		ArrayList<Student4> al=new ArrayList<Student4>();    
		 al.add(new Student4(101,"Vijay",23));    
		 al.add(new Student4(106,"Ajay",27));    
		 al.add(new Student4(105,null,21));    
		 Comparator<Student4> cm1=Comparator.comparing(Student4::getName,Comparator.nullsFirst(String::compareTo));  
		  Collections.sort(al,cm1);  
		  System.out.println("Considers null to be less than non-null");  
		  for(Student4 st: al){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }  
		  Comparator<Student4> cm2=Comparator.comparing(Student4::getName,Comparator.nullsLast(String::compareTo));  
		  Collections.sort(al,cm2);  
		  System.out.println("Considers null to be greater than non-null");  
		  for(Student4 st: al){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }  
		
	}
	

}

