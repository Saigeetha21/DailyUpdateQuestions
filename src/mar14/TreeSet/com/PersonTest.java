package mar14.TreeSet.com;

import java.util.Comparator;
import java.util.TreeSet;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
 
    @Override
    public String toString() {
        return name;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>(Comparator.comparing(Person::getName));
        treeSet.add(new Person("Alice"));
        treeSet.add(new Person("Bob"));
        treeSet.add(new Person("Charlie"));

        System.out.println(treeSet); // Output: [Alice, Bob, Charlie]
    }
} 
