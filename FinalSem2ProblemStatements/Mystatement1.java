import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    String name;
    Integer age;

    Person() {}

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String designation;
    Double salary;

    Employee() {}

    Employee(String name, Integer age, String designation, Double salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee\n    Name: %s\n    Age: %d\n    Designation: %s\n    Salary: %.2f\n",
                             name, age, designation, salary);
    }

    static void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            if (employee.salary > 5000) {
                System.out.print(employee.toString());
            }
        }
    }
}

public class Mystatement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Employees: ");
        int numEmployees = Integer.parseInt(sc.nextLine());

        List<Employee> employees = new ArrayList<>(numEmployees);

        for (int i = 0; i < numEmployees; i++) {
            Employee emp = new Employee();
            System.out.println("Enter details of Employee " + (i + 1) + ":");
            
            // Employee Details
            System.out.print("Name: ");
            emp.name = sc.nextLine();
            System.out.print("Age: ");
            emp.age = Integer.parseInt(sc.nextLine());
            System.out.print("Designation: ");
            emp.designation = sc.nextLine();
            System.out.print("Salary: ");
            emp.salary = Double.parseDouble(sc.nextLine());

            employees.add(emp);
        }
        
        Employee.displayEmployees(employees);
    }
}
