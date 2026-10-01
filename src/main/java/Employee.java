import java.util.Scanner;

public class Employee {

    /*
    Salary is protected so Manager have access to it.
    calculateRaise is private because it'll only be use in giveRaise()
    I replace getSalary with salary in manager since it has access to it now.
     */

    public static void main(String[] args) {
        Employee e = new Employee("Ali", 50000);
        e.giveRaise(2000);
        System.out.println(e.getSalary());
    }

    private String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public String toString() {
        return "Employee Name: " + name + ", Salary: " + salary;
    }

    private double calculateRaise(double percent) {
        return salary * percent / 100;
    }
    public void giveRaise(double amount) {
        if (amount > 0) {
            salary += calculateRaise(amount);
        }   else {
            System.out.println("Amount must be positive");
        }
    }
}
