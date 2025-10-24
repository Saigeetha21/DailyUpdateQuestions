package mar12.HashSet.com;

import java.util.HashSet;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters, setters, and equals() & hashCode() methods are overridden

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class PersonTest {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Alice", 25)); // Adding a duplicate element - will not be added

        System.out.println("People: " + people);
    }
}
