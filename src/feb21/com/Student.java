package feb21.com;

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    // Other methods and attributes
}

class Student {
    private String name;
    private int id;
    private Department department;

    public Student(String name, int id, Department department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Other methods and attributes
}
