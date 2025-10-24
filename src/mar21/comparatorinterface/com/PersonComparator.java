package mar21.comparatorinterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class PersonComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        if (p1.age != p2.age) {
            return Integer.compare(p1.age, p2.age); // Compare by age
        } else {
            return p1.name.compareTo(p2.name); // If age is equal, compare by name
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Alice", 25));
        people.add(new Person("Charlie", 35));

        Collections.sort(people, new PersonComparator());

        System.out.println("Sorted by age, then by name:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
    
    
}

  