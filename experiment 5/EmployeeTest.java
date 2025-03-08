class Employee {
    protected String name;
    protected int empid;
    protected double salary;

    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }
    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("tanmay", 101, 50000);
        System.out.println("Before Salary Increase:");
        emp1.displayInfo();

        emp1.increaseSalary(10);
        System.out.println("\nAfter 10% Salary Increase:");
        emp1.displayInfo();

        System.out.println("\n---------------------------\n");

        Manager mgr1 = new Manager("Bob", 102, 80000, "IT");
        System.out.println("Before Salary Increase:");
        mgr1.displayInfo();

        mgr1.increaseSalary(15);
        System.out.println("\nAfter 15% Salary Increase:");
        mgr1.displayInfo();
    }
}
