package mar13.LinkedHashSet.com;

import java.util.LinkedHashSet;

public class CustomObjectExample {

	public static void main(String[] args) {
		// Define a custom class
        class Person {
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        LinkedHashSet<Person> personSet = new LinkedHashSet<>();
        // Add custom objects
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        personSet.add(new Person("Charlie", 40));

        // Iterate over custom objects
        for (Person person : personSet) {
            System.out.println(person);
        }

	}

}
