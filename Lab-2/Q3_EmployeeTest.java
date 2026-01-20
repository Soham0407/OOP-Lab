public class Q3_EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Mohit", "Patel", 3000.0);
        Employee emp2 = new Employee("Amit", "Mishra", 4000.0);

        System.out.println("Yearly Salary of Employees:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": $" + emp2.getYearlySalary());

        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        System.out.println("\nYearly Salary After 10% Hike:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": $" + emp2.getYearlySalary());
    }
}

class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getFirstName() {
        return firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getLastName() {
        return lastName;
    }

    void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    double getMonthlySalary() {
        return monthlySalary;
    }

    double getYearlySalary() {
        return monthlySalary * 12;
    }
}
