package mar20.comparableinterface.com;

import java.util.Arrays;

class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age.compareTo(other.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }  
}

public class PersonSortingExample {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 20)
        };

        Arrays.sort(people);

        System.out.println("Sorted People by Age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

