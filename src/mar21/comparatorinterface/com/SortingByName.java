package mar21.comparatorinterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        super();
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class SortingByName {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>(); // Specify the type using generics
        al.add(new Student(12, "geetha", 20));
        al.add(new Student(13, "teja", 10));
        al.add(new Student(10, "sahasra", 15));

        System.out.println("Sorting by ages");
        Collections.sort(al, new NameComparator());
        Iterator<Student> itr = al.iterator();
      while (itr.hasNext()) {
         Student st = itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
    }
    }
}

