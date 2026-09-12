import java.util.Scanner;

class Employee {

    String empId;
    double salary;

    // Constructor
    Employee(String empId, double salary) {

        this.empId = empId;
        this.salary = salary;
    }

    // Raise salary
    void raiseSalary(double salary) {

        this.salary = this.salary + salary;
    }

    // Print final salary
    void printSalary() {

        System.out.println(
            empId + " | Final Salary: Rs " + salary
        );
    }
}

public class PayrollBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] employees = {
            new Employee("E-101", 40000),
            new Employee("E-102", 55000),
            new Employee("E-103", 62000),
            new Employee("E-104", 48000)
        };

        System.out.print("Enter bonus amount: ");
        double bonus = sc.nextDouble();

        // Single pass
        for (int i = 0; i < employees.length; i++) {

            employees[i].raiseSalary(bonus);
            employees[i].printSalary();
        }

        sc.close();
    }
}
