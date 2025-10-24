package feb21.com;

import java.util.ArrayList;

class Departments {
    private String name;
    private Faculty faculty;

    public Departments(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    // Other methods and attributes
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    // Other methods and attributes
}

class University {
    private String name;
    private ArrayList<Departments> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Departments department) {
        departments.add(department);
    }

    // Other methods for managing university
}
