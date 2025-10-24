package feb21.com;

import java.util.ArrayList;

class Employees {
    private String name;
    private int id;
    private double salary;

    public Employees(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Other methods and attributes
}

class Company {
    private String name;
    private ArrayList<Employees> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employees employee) {
        employees.add(employee);
    }

    // Other methods for managing company
}

