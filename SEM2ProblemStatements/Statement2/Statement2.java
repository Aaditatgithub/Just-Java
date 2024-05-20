package Statement2;
import java.util.*;

abstract class Employee{
    protected String name;
    protected int employeeId;
    protected int hourlyRate;

    public Employee(String name, int employeeId, int hourlyRate){
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
    }
    abstract int calculateSalary();
}

class FullTimeEmployee extends Employee{
    int salary;
    List<String> benefits;

    public FullTimeEmployee(String name, int employeeId, int hourlyRate, int salary, String... benefits){
        super(name, employeeId, hourlyRate);
        this.salary = salary;
        this.benefits = List.of(benefits);
    }

    int calculateSalary(){
        return salary;
    }
}

class PartTimeEmployee extends Employee{
    int numHoursWorked;
    int overtimeRate;

    public PartTimeEmployee(String name, int employeeId, int hourlyRate, int numHoursWorked, int overtimeRate) {
        super(name, employeeId, hourlyRate);
        this.numHoursWorked = numHoursWorked;
        this.overtimeRate = overtimeRate;
    }

    int calculateSalary(){
        int regularPay = hourlyRate*numHoursWorked;
        int extraPay = Math.max(0,(numHoursWorked - 40))*overtimeRate;
        return regularPay + extraPay;
    }
}


public class Statement2 {
    public static void main(String[] args){
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("bhargav", 0, 120, 150000, "Insurance", 
        "Mediclaim","Club Membership");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("ganraj", 1, 12, 50, 0);

        System.out.println("Monthly salary of " + fullTimeEmployee.name + " (Full-Time Employee): $" + fullTimeEmployee.salary);
        System.out.println(partTimeEmployee.calculateSalary());
    }
}
