class Employee {
    // Instance variables
    private int employeeId;
    private String name;
    private double salary;

    // Static variable (class variable)
    private static int employeeCount;

    // Static block
    static {
        System.out.println("Static block - Executed when the class is loaded");
        employeeCount = 0;
    }

    // Instance block
    {
        System.out.println("Instance block - Executed when an object is created");
        // You can perform instance-specific initialization here if needed
    }

    // Non-parameterized constructor
    public Employee() {
        System.out.println("Non-parameterized constructor - Employee created");
        employeeCount++;
        employeeId = employeeCount;
    }

    // Parameterized constructor
    public Employee(String name, double salary) {
        System.out.println("Parameterized constructor - Employee created");
        employeeCount++;
        employeeId = employeeCount;
        this.name = name;
        this.salary = salary;
    }

    // Copy constructor
    public Employee(Employee other) {
        System.out.println("Copy constructor - Employee copied");
        this.employeeId = other.employeeId;
        this.name = other.name;
        this.salary = other.salary;
    }

    // Instance method
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    // Static method
    public static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }

}

public class Assignment1{
    public static void main(String[] args) {
    
        // Creating instances using different constructors
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("John Doe", 50000.0);
        Employee emp3 = new Employee(emp2); // Using copy constructor

        // Displaying information using instance method
        System.out.println("\nEmployee 1 Information:");
        emp1.displayInfo();

        System.out.println("\nEmployee 2 Information:");
        emp2.displayInfo();

        System.out.println("\nEmployee 3 Information (Copied from Employee 2):");
        emp3.displayInfo();

        // Displaying total employee count using static method
        Employee.displayEmployeeCount();

    }
}