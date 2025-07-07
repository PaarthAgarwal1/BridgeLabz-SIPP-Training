package AcessModifiers;

public class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 7;
        m.department = "IT";
        m.setSalary(85000);

        m.showEmployee();
        System.out.println("Salary: " + m.getSalary());
    }
}
