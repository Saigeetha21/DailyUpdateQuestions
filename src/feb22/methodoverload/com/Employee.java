package feb22.methodoverload.com;


public class Employee {
    // Method to calculate monthly salary
    public double calculateSalary(double hourlyRate, int hoursWorked) {
        return hourlyRate * hoursWorked * 4; // Assuming 4 weeks in a month
    }

    // Method to calculate yearly salary with bonus
    public double calculateSalary(double hourlyRate, int hoursWorked, double bonusPercentage) {
        double monthlySalary = hourlyRate * hoursWorked * 4;
        double bonus = (monthlySalary * bonusPercentage) / 100;
        return (monthlySalary * 12) + bonus;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Monthly Salary: $" + employee.calculateSalary(25, 160));
        System.out.println("Yearly Salary with 10% bonus: $" + employee.calculateSalary(25, 160, 10));
    }
}
