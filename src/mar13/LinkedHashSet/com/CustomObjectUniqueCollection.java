package mar13.LinkedHashSet.com;
import java.util.LinkedHashSet;

public class CustomObjectUniqueCollection {
    public static void main(String[] args) {
        class Animal {
            String name;
            int age;

            public Animal(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Animal animal = (Animal) o;
                return age == animal.age && name.equals(animal.name);
            }

            @Override
            public int hashCode() {
                int result = name.hashCode();
                result = 31 * result + age;
                return result;
            }

            @Override
            public String toString() {
                return "Animal{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        LinkedHashSet<Animal> animalSet = new LinkedHashSet<>();
        animalSet.add(new Animal("Dog", 3));
        animalSet.add(new Animal("Cat", 2));
        animalSet.add(new Animal("Dog", 3)); // Attempt to add duplicate entry

        // Iterating over unique custom objects
        for (Animal animal : animalSet) {
            System.out.println(animal);
        }
    }
}
