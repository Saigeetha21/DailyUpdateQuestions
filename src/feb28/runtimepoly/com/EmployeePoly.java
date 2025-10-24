package feb28.runtimepoly.com;

class Employee {
    void work() {
        System.out.println("Employee works");
    }
}

class Engineer extends Employee {
    void work() {
        System.out.println("Engineer designs and develops");
    }
}

class Manager extends Employee {
    void work() {
        System.out.println("Manager plans and supervises");
    }
}

public class EmployeePoly {
    public static void main(String[] args) {
        Employee emp1 = new Engineer();
        Employee emp2 = new Manager();

        emp1.work(); // Output: Engineer designs and develops
        emp2.work(); // Output: Manager plans and supervises
    }
}
