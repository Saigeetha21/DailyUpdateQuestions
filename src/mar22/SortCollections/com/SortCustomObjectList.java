package mar22.SortCollections.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name); // Sorts by name in natural order
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SortCustomObjectList {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 35));

        System.out.println("Before sorting: " + people);
        
        Collections.sort(people); // Sorts the list using Comparable interface implementation in Person class

        System.out.println("After sorting: " + people);
	}

}
