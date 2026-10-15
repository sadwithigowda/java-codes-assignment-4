class EmployeeInfo {
    int empId;
    String name;
    double salary;

    EmployeeInfo(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Emp ID : " + empId);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class Employee {
    public static void main(String[] args) {
        EmployeeInfo emp = new EmployeeInfo(1001, "Anita", 45000.50);
        System.out.println("Employee Details");
        emp.display();
    }
}
