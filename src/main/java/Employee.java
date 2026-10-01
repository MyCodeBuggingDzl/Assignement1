import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        Employee e = new Employee("Ali", 50000);
        e.giveRaise(2000);
        System.out.println(e.getSalary());
    }

    private String name;
    private double salary;

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
    public void giveRaise(double amount) {
        salary += amount;
    }
}
