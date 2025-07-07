package AcessModifiers;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public void showEmployee() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

