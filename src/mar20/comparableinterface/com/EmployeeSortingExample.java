package mar20.comparableinterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    

    public String getName() {
        return name;
    }  

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee other) {
        // First, compare by age
        int ageComparison = Integer.compare(this.age, other.age);
        if (ageComparison != 0) {
            return ageComparison;
        }
        // If ages are the same, compare by name
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class EmployeeSortingExample {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jimmy", 25));
        employees.add(new Employee("jenni", 30));
        employees.add(new Employee("jacky", 25));

        Collections.sort(employees);

        System.out.println("Sorted Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
